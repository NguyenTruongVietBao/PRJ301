<%-- 
    Document   : input
    Created on : 27-09-2023, 00:45:07
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
        <h1>Nhap vao</h1>
        <form action="inputServlet"> 
            Input:<input type="text" name="name" />
            <input type="submit" name="Save"/> 
        </form>
        <h2>Danh sach hien tai</h2>
        <h3>${sessionScope.data}</h3>
        <h3>
            <c:set var="i" value="0" />
            <c:forEach items="${sessionScope.names}" var="c">
                <c:set var="i" value="${(i+1)}"/>
                ${i}.${c}   </br>
            </c:forEach>
        </h3>
    </body>
</html>
