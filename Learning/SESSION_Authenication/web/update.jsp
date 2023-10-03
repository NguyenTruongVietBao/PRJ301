<%-- 
    Document   : new
    Created on : 16-09-2023, 02:53:07
    Author     : VietBao
--%>

<%@page import="model.user"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <center>
            <h1>Update user!</h1>
            <% 
                if(request.getAttribute("user") != null){
                    user u = (user)request.getAttribute("user");
            %>
            <form action="updateServlet" method="post"> 
                enter userID: <input type="text" readonly name="id" value="<%= u.getUserID() %>" />  </br>
                enter fullName: <input type="text" name="name" value="<%= u.getFullName()%>"/>  </br>
                enter password: <input type="text" name="pass" value="<%= u.getPassword()%>"/>  </br>
                enter roleID: <input type="text" name="role" value="<%= u.getRoleID()%>"/> </br>
                <input type="submit" name="Save" />
            </form>                        
            <%
                }
            %>
        </center>
    </body>
</html>
