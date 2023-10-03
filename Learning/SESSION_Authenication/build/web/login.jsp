<%-- 
    Document   : newjsplogin
    Created on : 21-09-2023, 20:33:16
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
        <h1>Login</h1>
        <form action="loginServlet" method="post"> 
            username: <input type="text" name="username"/>  </br>
            password:<input type="text" name="password"/>  </br>             
            <input type="submit" name="Login"/> 
            <input type="reset" name="Reset"/>
        </form>
    </body>
</html>
