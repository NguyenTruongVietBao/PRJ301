<%-- 
    Document   : cach2
    Created on : 27-08-2023, 17:22:12
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
        <h1>Cach 2</h1>
                        <!--Form-->
            <form action="TinhCach2Servlet" method="post">         <!-- Form -->
                Enter darius cach 2:  <input type="text" name="r">
                <input type="submit" name="Tinh toan">
            </form>
                        <!--BackEnd-->
            <%
                 if(request.getAttribute("dt") != null){
                    double s  = (double)request.getAttribute("dt");
            %>
            <h2>Dien tich la: <%= s %>   </h2>
            <%   
                }
            %>
    </body>
</html>
