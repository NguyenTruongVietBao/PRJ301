<%-- 
    Document   : login
    Created on : 20-09-2023, 20:46:00
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
        <form action="MainController" method="post"> 
            User ID:<input type="text" name="userID" />  </br>
            Password:<input type="password" name="password" />  </br>
            <input type="submit" name="action" value="Login"/> 
            <input type="reset" value="Reset"/>             
        </form>
    </body>
</html>
