<%-- 
    Document   : SearchResult
    Created on : 25-09-2023, 22:59:02
    Author     : VietBao
--%>

<%@page import="java.util.List"%>
<%@page import="sample.user.UserDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <center>
            <%
                String error = (String) request.getAttribute("ERROR");
                if (error == null) error="";
                
                UserDTO loginUser = (UserDTO) session.getAttribute("LOGIN_USER");
                if (loginUser == null) {
                    loginUser = new UserDTO();
                }
                String search = request.getParameter("search");
                if (search == null) search = "";
            %>
            <h1 style="color: red">ADMIN Page </h1> 
            <h2>List of User </h2> 
            <h3><a href="add.jsp">Add new</a> </h3> 
            <form action="MainController">
                Search:<input type="text" name="search" value="<%= search %>" required="">
                 <input type="submit" name="action" value="Search">
            </form>
            </br>
            <%
                List<UserDTO> listUser = (List<UserDTO>) request.getAttribute("LIST_USER");
                if (listUser != null && !listUser.isEmpty()) {
            %>
            <table border="1px" width="40%">
                <tr>
                    <th>userID</th>
                    <th>fullName</th>
                    <th>roleID</th>
                    <th>Action</th>
                </tr>
                <%
                    for (UserDTO user : listUser) {
                %>
                <tr>
                    <td class="px-3"><%= user.getUserID()%></td>
                    <td class="px-1"><%= user.getFullName()%></td>
                    <td class="px-5"><%= user.getRoleID()%></td>
                    <td>                        
                        <a href="#" onclick="doDelete('<%= user.getUserID() %>')" style="margin-left: 30px">Delete</a>
                        <a href="#" onclick="doUpdate('<%= user.getUserID() %>')" style="margin-left: 30px" >Update</a>
                    </td>
                </tr>
                <% } %>
            </table>
            <%
                }
            %>       
        </center>
      
        <script type="text/javascript">
            <!--confirm to delete-->
            function doDelete(id){
                if(confirm("are you sure to delete '"+id+"' ?")){
                    window.location = "deleteServlet?id="+id;
                }
            }
            <!--confirm to update-->
            function doUpdate(id){
                if(confirm("are you sure to update '"+id+"' ?")){
                    window.location = "updateServlet?id="+id;
                }
            }
        </script>
    
    </body>
</html>
