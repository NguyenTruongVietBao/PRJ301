<%-- 
    Document   : login
    Created on : 27-09-2023, 21:18:18
    Author     : VietBao
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login form!</h1>
        <h3 style="color: red">${requestScope.error}</h3>
        <form action="loginServlet" method="post"> 
            username <input type="text" name="user"/>  </br>
            password <input type="text" name="pass"/>  </br>
            <input type="submit" name="Login"/> 
        </form>
    </body>
</html>
