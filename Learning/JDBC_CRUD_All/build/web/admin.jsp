<%-- 
    Document   : admin
    Created on : 26-09-2023, 23:28:18
    Author     : VietBao
--%>

<%@page import="sample.user.UserDTO"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <center>
            <h1 style="color: red">ADMIN Page </h1> 
            <h2>List of User </h2> 
            <h3><a href="checkLoginServlet?action=addServlet">Add new</a> </h3>
            <form action="searchServlet">
                Search:<input type="text" name="search"/>
                <input type="submit" name="action" value="Search"/>
            </form>
            </br>
            <table border="1px" width="40%">
                <tr>
                    <th>userID</th>
                    <th>fullName</th>
                    <th>roleID</th>                  
                    <th>Action</th>
                </tr>
                <%
                    List<UserDTO> list = (List<UserDTO>)request.getAttribute("listUser");
                    for (UserDTO i : list) {
                        String id = i.getUserID();                                             
                %>
                    <tr> 
                        <td> <%= id %> </td>
                        <td> <%= i.getFullName()%> </td>  
                        <td> <%= i.getRoleID()%> </td>                                            
                        <td> 
                            <a href="#" onclick="doDelete('<%=  i.getUserID() %>')" style="margin-left: 30px">Delete</a>
                            <a href="#" onclick="doUpdate('<%=  i.getUserID() %>')" style="margin-left: 30px" >Update</a>
                        </td>
                    </tr>                    
                <%
                    }
                %>
               
            </table>            
        </center> 
                        
        <script type="text/javascript">
            <!--confirm to delete-->
            function doDelete(id){
                if(confirm("are you sure to delete '"+id+"' ?")){
                    window.location = "checkLoginServlet?action=deleteServlet&id="+id;
                }
            }
            <!--confirm to update-->
            function doUpdate(id){
                if(confirm("are you sure to update '"+id+"' ?")){
                    window.location = "checkLoginServlet?action=updateServlet&id="+id;
                }
            }
        </script>
    </body>
</html>
