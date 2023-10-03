<%-- 
    Document   : JSTL
    Created on : 22-09-2023, 23:18:39
    Author     : VietBao
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>       
        <table border="1">
            <thead>
                <tr>
                    <th>name</th>
                    <th>id</th>
                    <th>mark</th>
                    <th>gender</th>
                    <th>rank</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${requestScope.listUser}" var="i">
                <tr>                           
                    <td>${i.name}</td      
                    <td>  </td>
                    <td>${i.id}</td>
                    <td>${i.mark}</td>
                    <td>${(i.gender)}</td>
                    <td> 
                        <h3>
                            <c:choose>
                                <c:when test="${i.mark < 5}">
                                    tb
                                </c:when>
                                <c:when test="${i.mark >= 5 && i.mark < 8 }">
                                    kha
                                </c:when>
                                <c:when test="${i.mark >= 8}">
                                    Gioi
                                </c:when>
                            </c:choose>
                        </h3>
                    </td>
                </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
