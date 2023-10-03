<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
    <head>
        <title>index</title>
    </head>
    <body>
        <h1>Hallo, cai nay dang nhap bang gg ne</h1>
        <%
            String id = (request.getAttribute("id") != null) ? request.getAttribute("id").toString() : "";
            String name = (request.getAttribute("name") != null) ? request.getAttribute("name").toString() : "";
            String email = (request.getAttribute("email") != null) ? request.getAttribute("email").toString() : "";
            out.print("Id: " + id);
            out.print("<br/>Name: " + name);
            out.print("<br/>Email: " + email);
        %>
    </body>
</html>