<%-- 
    Document   : newjspel
    Created on : 22-09-2023, 22:33:28
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
        <form> 
            Num 1:<input type="number" name="num1" value="${param.num1}"/>  </br>
            Num 2:<input type="number" name="num2" value="${param.num2}"/>  </br>
            Num 3:<input type="number" name="num3" value="${param.num3}"/>  </br>
            <input type="submit" name="tinh1" value="Tinh"/>  </br>
        </form>            
        <h2>Tong: ${(param.num1 + param.num2 + param.num3)}</h2> 
        <h2>Trung binh: ${(param.num1 + param.num2 + param.num3)/3}</h2> 
        <h3>Du lieu lay tu Server tra ve </br>           
            Hello ${(requestScope.ten)}   </br> 
            Student ${requestScope.hocsinh}
        </h3> 
        
        <hr>
        
        <form> 
            Num 1:<input type="number" name="numb1" value="${param.numb1}"/>  </br>
            Num 2:<input type="number" name="numb2" value="${param.numb2}"/>  </br>
            <input type="submit" name="tinh2" value="Tinh"/>  </br>
        </form>   
            <%
                if(request.getParameter("numb1") != null && request.getParameter("numb2") != null ){
                    double n1, n2, sum, avg;
                    try {
                            n1 = Double.parseDouble(request.getParameter("numb1"));
                            n2 = Double.parseDouble(request.getParameter("numb2"));
                            sum = n1 + n2;
                            avg = (n1 + n2)/2;                                      
            %>
                <h3>    
                    Sum = <%= sum %> </br>
                    Avg = <%= avg %> 
                </h3>
            <%
                    } catch (Exception e) {
                        System.out.println("error");
                    }
                }
            %>
    </body>
</html>
