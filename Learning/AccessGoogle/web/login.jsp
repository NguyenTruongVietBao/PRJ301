<%-- 
    Document   : login
    Created on : 30-09-2023, 22:11:07
    Author     : VietBao
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
        <style>
            * {box-sizing: border-box}

            /* style the container */
            .container {
                position: relative;
                border-radius: 5px;
                background-color: #f2f2f2;
                padding: 20px 0 30px 0;
            }

            /* style inputs and link buttons */
            input,
            .btn {
                width: 100%;
                padding: 12px;
                border: none;
                border-radius: 4px;
                margin: 5px 0;
                opacity: 0.85;
                display: inline-block;
                font-size: 17px;
                line-height: 20px;
                text-decoration: none; /* remove underline from anchors */
            }

            input:hover,
            .btn:hover {
                opacity: 1;
            }

            /* add appropriate colors to fb, twitter, and google buttons */
            .fb {
                background-color: #3B5998;
                color: white;
            }

            .twitter {
                background-color: #55ACEE;
                color: white;
            }

            .google {
                background-color: #dd4b39;
                color: white;
            }

            /* style the submit button */
            input[type=submit] {
                background-color: #04AA6D;
                color: white;
                cursor: pointer;
            }

            input[type=submit]:hover {
                background-color: #45a049;
            }

            /* Two-column layout */
            .col {
                float: left;
                width: 50%;
                margin: auto;
                padding: 0 50px;
                margin-top: 6px;
            }

            /* Clear floats after the columns */
            .row:after {
                content: "";
                display: table;
                clear: both;
            }

            /* vertical line */
            .vl {
                position: absolute;
                left: 50%;
                transform: translate(-50%);
                border: 2px solid #ddd;
                height: 175px;
            }

            /* text inside the vertical line */
            .inner {
                position: absolute;
                top: 50%;
                transform: translate(-50%, -50%);
                background-color: #f1f1f1;
                border: 1px solid #ccc;
                border-radius: 50%;
                padding: 8px 10px;
            }

            /* hide some text on medium and large screens */
            .hide-md-lg {
                display: none;
            }

            /* bottom container */
            .bottom-container {
                text-align: center;
                background-color: #666;
                border-radius: 0px 0px 4px 4px;
            }

            /* Responsive layout - when the screen is less than 650px wide, make the two columns stack on top of each other instead of next to each other */
            @media screen and (max-width: 650px) {
                .col {
                    width: 100%;
                    margin-top: 0;
                }
                /* hide the vertical line */
                .vl {
                    display: none;
                }
                /* show the hidden text on small screens */
                .hide-md-lg {
                    display: block;
                    text-align: justify;
                }
            }
        </style>
    </head>
    <body>
        <div class="container">
            <form action="/action_page.php">
                <div class="row">
                    <h2 style="text-align:center">Login with Social Media or Manually</h2>
                    <div class="vl">
                        <span class="vl-innertext">or</span>
                    </div>

                    <div class="col">
                        <a href="#" class="fb btn">
                            <i class="fa fa-facebook fa-fw"></i> Login with Facebook
                        </a>
                        <a href="#" class="twitter btn">
                            <i class="fa fa-twitter fa-fw"></i> Login with Twitter
                        </a>
                        <a href="https://accounts.google.com/o/oauth2/auth?scope=email&redirect_uri=http://localhost:8084/AccessGoogle/login-google&response_type=code
                           &client_id=438251236115-0jbn7rma3f913c9ktjv989s4d6vdlhk3.apps.googleusercontent.com&approval_prompt=force" class="google btn">
                            <i class="fa fa-google fa-fw"></i> Login with Google+
                        </a>
                    </div>

                    <div class="col">
                        <div class="hide-md-lg">
                            <p>Or sign in manually:</p>
                        </div>

                        <input type="text" name="username" placeholder="Username" required>
                        <input type="password" name="password" placeholder="Password" required>
                        <input type="submit" value="Login">
                    </div>

                </div>
            </form>
        </div>

        <div class="bottom-container">
            <div class="row">
                <div class="col">
                    <a href="#" style="color:white" class="btn">Sign up</a>
                </div>
                <div class="col">
                    <a href="#" style="color:white" class="btn">Forgot password?</a>
                </div>
            </div>
        </div>
    </body>
</html>
