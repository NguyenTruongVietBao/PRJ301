<%-- 
    Document   : Student
    Created on : 14-09-2023, 01:51:42
    Author     : VietBao
--%>

<%@page import="model.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>A Student</h1>
        
        <form action="XepLoaiHocLuc2Servlet" method="post">
            ID: <input type="text" name="id"/>  </br>
            Name: <input type="text" name="name"/>  </br>
            Gender: <input type="radio" checked="" name="gender" value="1"/> Male
                    <input type="radio" name="gender" value="0"/> Female </br>
            Mark: <input type="text" name="mark"/>
            <input  type="submit" value="Submit" />
        </form>
        
        <table border="1px" width="40%">
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Gender</th>
                <th>Pass / Fail</th>
            </tr>
            <%
                if(request.getAttribute("st") !=  null){
                    Student s = (Student) request.getAttribute("st");               
            %>
            <tr>
                <td><%= s.getId() %></td>
                <td><%= s.getName() %></td>
                <%
                    if(s.isGender()){
                %>
                <td> <img src="Male_Female/Male-icon.png" width="20px"> </td>
                <%
                    }else{            
                %>
                        <td> <img src="Male_Female/vector-female-sign-icon-illustration.jpg" width="20px"> </td>
                <%
                    }
                %>        
                <td><%= s.getStatus() %></td>
            </tr>
            <%
                }
            %>
        </table>
    </body>
</html>
