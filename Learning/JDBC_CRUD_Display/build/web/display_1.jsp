<%-- 
    Document   : display
    Created on : 21-09-2023, 20:11:29
    Author     : VietBao
--%>

<%@page import="model.user"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
            <table border="1px" width="40%">
                <tr>
                    <th>userID</th>
                    <th>fullName</th>
                    <th>password</th>
                    <th>roleID</th>
                    <th>status</th>
                </tr>            
                <c:forEach items="${requestScope.data}" var="i">
                    <tr> 
                        <td> ${i.userID}</td>
                        <td> ${i.fullName}</td>
                        <td> ${i.password}</td>
                        <td> ${i.roleID}</td>
                        <td> ${i.status}</td>
                    </tr>  
                </c:forEach>
            </table>   
        </center>                      
    </body> 
</html>
