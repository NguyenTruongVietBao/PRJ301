<%-- 
    Document   : student
    Created on : 14-09-2023, 00:57:54
    Author     : VietBao
--%>

<%@page import="model.Student"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>List of Student</h1>
        <table border="1px">
            <tr>
                <th>ID</th>
                <th>NAME</th>
                <th>GENDER</th>
            </tr>
            <%
                List<Student> list = (List<Student>) request.getAttribute("data");
                for (Student i : list) {                                        
            %>
            <tr>
                <td><%= i.getId()%></td>
                <td><%= i.getName()%></td>
            </tr>
            <%
                }
            %>
        </table>
    </body>
</html>
