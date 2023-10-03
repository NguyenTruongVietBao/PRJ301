<%-- 
    Document   : index
    Created on : 27-08-2023, 14:52:13
    Author     : VietBao
--%>

<!--
    JSP: Java Sever Pages
    @page -> xác định là file JSP 
    contentType -> file này có kiểu dạng gì (text -> là document)
    pageEncoding -> xác định chữ viết có font gì
--> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!--
    Có thể khai báo class
<%@page import="java.text.DecimalFormat" %>
-->

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Example of JSP</h1>
        
        <!--Khai báo -->
        <%! 
            double x = 2.5;
            char y = 'B';
        %>

        <!--Viết văn bản-->
        <h2 style="color: blue">
            <% 
                out.println(x +"-"+ y + "<br>");
                String name = "Viet Bao";
                out.println("hello: "+name);
                out.println("<br>So PI: "+Math.PI);
                int r = 2; 
                //DecimalFormat làm tròn 2 chữ số
                DecimalFormat df = new DecimalFormat("##.##");
                
            %>
        </h2>
        
        <!--Viết biết thức-->
        <h2 style="color: red">            
            Diện tích là:    <%= df.format( Math.PI*r*2 ) %>
        </h2>
        
         <!--
            Commnent:   <%-- HTML comment --%>
                        <%--    <%= out.ptintln("Vẫn là chú thích"); %>   --%>
         -->
         
         <hr>
         
         <h1 style="color: red">Exercise: Tính S hình tròn <br></h1>
         <h2 >             
            Cách 1:   Form + BackEnd đều dùng JSP<br>
            Cách 2:   Form -> JSP,  BackEnd -> Servlet           (nên dùng)<br>
            Cách 3:   Form + BackEnd đều dùng Servlet
         </h2>
       
          
    </body>
</html>
