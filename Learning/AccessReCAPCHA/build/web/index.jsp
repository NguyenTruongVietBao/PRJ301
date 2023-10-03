 <%-- 
    Document   : index
    Created on : 01-10-2023, 00:21:46
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
        <h1>Hello reCAPCHA!</h1>
        <form action="MainController" method="POST" id="formId">
            User ID<input type="text" name="userID"/>
            </br>Password <input type="password" name="password"/>
            <div class="g-recaptcha" data-sitekey="6Ld8kGYoAAAAAIcm3a52MP9i5ceTK-KI76M3wwVT"></div>
            <div id="error" style="color: red"></div>
            </br><input type="submit" name="action" value="Login"/>
        </form>
        
        <script src="https://www.google.com/recaptcha/api.js" async defer></script>
        <script>
            window.onload = function (){
                let isValid = false;
                const form = document.getElementById("formId");
                const error = document.getElementById("error");
                
                form.addEventListener("submit", function(event){
                    event.preventDefault();
                    const response = grecaptcha.getResponse();
                    if(response){
                        form.submit();
                    }else{
                        error.innerHTML = "Chua xac thuc kia ma";
                    }
                });
            }
        </script>
    </body>
</html>
