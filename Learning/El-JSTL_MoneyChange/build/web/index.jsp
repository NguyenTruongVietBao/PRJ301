<%-- 
    Document   : index
    Created on : 23-09-2023, 14:10:07
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
        <div>
            <form action="ChangeServlet" > 
            VND <input type="number" name="money" />  </br>
            to USD <input type="radio" name="change" value="0"/>
            to Euro<input type="radio" name="change"/>  </br>
            <input type="submit" name="Change"/> 
        </form>
            <h2>Tien da doi: ${requestScope.tiendadoi}</h2>
        </div>
    </body>
</html>
