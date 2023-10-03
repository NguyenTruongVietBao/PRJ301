<%-- 
    Document   : home
    Created on : 27-09-2023, 00:16:59
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
        <h1>
            Daay la request: ${requestScope.data1}            
        </h1>
        
        <h1>
            Daay la session: ${sessionScope.data2}           
        </h1>
            
    </body>
</html>
