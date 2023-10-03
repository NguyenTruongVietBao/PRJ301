<%-- 
    Document   : themsuaxoa
    Created on : 14-09-2023, 20:22:45
    Author     : VietBao
--%>

<%@page import="model.user"%>
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
            <h1>List of User </h1> 
            <h3><a href="checkLoginServlet?action=addServlet">Add new</a> </h3>
            <table border="1px" width="40%">
                <tr>
                    <th>userID</th>
                    <th>fullName</th>
                    <th>password</th>
                    <th>roleID</th>
                    <th>status</th>
                    <th>Action</th>
                </tr>
                <%
                    List<user> list = (List<user>)request.getAttribute("data");
                    for (user i : list) {
                        String id = i.getUserID();                                             
                %>
                    <tr> 
                        <td> <%= id %> </td>
                        <td> <%= i.getFullName()%> </td>
                        <td> <%= i.getPassword()%> </td>
                        <td> <%= i.getRoleID()%> </td>
                        <td> <%= i.isStatus()%> </td>
                        <td> 
                            <a href="#" onclick="doDelete('<%= id %>')">Delete</a>
                            <a href="checkLoginServlet?action=updateServlet&id=<%= id %>" style="margin-left: 30px" >Update</a>
                        </td>
                    </tr>                    
                <%
                    }
                %>
            </table>            
        </center> 
                
        <!--confirm to delete-->
        <script type="text/javascript">
            function doDelete(id){
                if(confirm("are you sure to delete '"+id+"' ?")){
                    window.location = "checkLoginServlet?action=deleteServlet&id="+id;
                }
            }
        </script>
                
    </body> 
</html>
