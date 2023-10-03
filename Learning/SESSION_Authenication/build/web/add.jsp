<%-- 
    Document   : new
    Created on : 16-09-2023, 02:53:07
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
        <center>
            <h1>Add user!</h1>
            <h3 style="color: red"> ${requestScope.error} </h3>
            <form action="addServlet"> 
                enter userID: <input type="text" name="id" />  </br>
                enter fullName: <input type="text" name="name" />  </br>
                enter password: <input type="text" name="pass" />  </br>
                enter roleID: <input type="text" name="role" /> </br>
                enter status <input type="text" name="status" /> </br>
                <input type="submit" name="Save" />
            </form>
        </center>
    </body>
</html>
