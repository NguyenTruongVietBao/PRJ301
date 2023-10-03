<%-- 
    Document   : input
    Created on : 29-08-2023, 15:53:36
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
        <form action="CalculatorServlet" method="post">
            Enter number 1: <input type="text" name="num1" value="${aa}"> <br>
            Enter number 2: <input type="text" name="num2" value="${bb}"> <br>
            Operator:       <select name="operator">
                                <option ${cong}>+</option>
                                <option ${tru}>-</option>
                                <option ${nhan}>x</option>
                                <option ${chia}>:</option>
                            </select>   <br>
            <button type="submit" >OK</button>  <br>               
            Result: <input type="text" value="${rs}">
        </form>
    </body>
</html>
