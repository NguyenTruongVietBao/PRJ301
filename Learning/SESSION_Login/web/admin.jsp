
<%-- 
    Document   : welcome
    Created on : 27-09-2023, 21:25:55
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
        <c:set  value="${sessionScope.account}" var="a"/>
        <h1>Day la trang admin 
            </br> Name: ${a.username}
            </br> Role: ${a.role}        
        </h1>
    </body>
</html>
