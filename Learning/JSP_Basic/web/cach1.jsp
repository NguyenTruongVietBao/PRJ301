<%-- 
    Document   : cach1
    Created on : 13-09-2023, 03:06:36
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
        <h1>Cach 1</h1>
            <form>         <!-- Form -->
                Enter darius:  <input type="text" name="r">
                <input type="submit" name="Tinh toan">
            </form>
            <%             //BackEnd
                if(request.getParameter("r") != null){
                    String r_raw = request.getParameter("r");
                    double ra;
                    try{ 
                        ra = Double.parseDouble(r_raw);
                        double s = Math.PI*ra*ra;
            %>
            <h2>Dien tich la: <%= s %>   </h2>
            <%
                    }catch(Exception e){
                        System.out.println(e);
                    }
                }
            %>  
    </body>
</html>
