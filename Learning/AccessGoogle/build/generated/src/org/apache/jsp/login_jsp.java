package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Document</title>\n");
      out.write("        <style>\n");
      out.write("            * {box-sizing: border-box}\n");
      out.write("\n");
      out.write("            /* style the container */\n");
      out.write("            .container {\n");
      out.write("                position: relative;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                background-color: #f2f2f2;\n");
      out.write("                padding: 20px 0 30px 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* style inputs and link buttons */\n");
      out.write("            input,\n");
      out.write("            .btn {\n");
      out.write("                width: 100%;\n");
      out.write("                padding: 12px;\n");
      out.write("                border: none;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                margin: 5px 0;\n");
      out.write("                opacity: 0.85;\n");
      out.write("                display: inline-block;\n");
      out.write("                font-size: 17px;\n");
      out.write("                line-height: 20px;\n");
      out.write("                text-decoration: none; /* remove underline from anchors */\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input:hover,\n");
      out.write("            .btn:hover {\n");
      out.write("                opacity: 1;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* add appropriate colors to fb, twitter, and google buttons */\n");
      out.write("            .fb {\n");
      out.write("                background-color: #3B5998;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .twitter {\n");
      out.write("                background-color: #55ACEE;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .google {\n");
      out.write("                background-color: #dd4b39;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* style the submit button */\n");
      out.write("            input[type=submit] {\n");
      out.write("                background-color: #04AA6D;\n");
      out.write("                color: white;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input[type=submit]:hover {\n");
      out.write("                background-color: #45a049;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Two-column layout */\n");
      out.write("            .col {\n");
      out.write("                float: left;\n");
      out.write("                width: 50%;\n");
      out.write("                margin: auto;\n");
      out.write("                padding: 0 50px;\n");
      out.write("                margin-top: 6px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Clear floats after the columns */\n");
      out.write("            .row:after {\n");
      out.write("                content: \"\";\n");
      out.write("                display: table;\n");
      out.write("                clear: both;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* vertical line */\n");
      out.write("            .vl {\n");
      out.write("                position: absolute;\n");
      out.write("                left: 50%;\n");
      out.write("                transform: translate(-50%);\n");
      out.write("                border: 2px solid #ddd;\n");
      out.write("                height: 175px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* text inside the vertical line */\n");
      out.write("            .inner {\n");
      out.write("                position: absolute;\n");
      out.write("                top: 50%;\n");
      out.write("                transform: translate(-50%, -50%);\n");
      out.write("                background-color: #f1f1f1;\n");
      out.write("                border: 1px solid #ccc;\n");
      out.write("                border-radius: 50%;\n");
      out.write("                padding: 8px 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* hide some text on medium and large screens */\n");
      out.write("            .hide-md-lg {\n");
      out.write("                display: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* bottom container */\n");
      out.write("            .bottom-container {\n");
      out.write("                text-align: center;\n");
      out.write("                background-color: #666;\n");
      out.write("                border-radius: 0px 0px 4px 4px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Responsive layout - when the screen is less than 650px wide, make the two columns stack on top of each other instead of next to each other */\n");
      out.write("            @media screen and (max-width: 650px) {\n");
      out.write("                .col {\n");
      out.write("                    width: 100%;\n");
      out.write("                    margin-top: 0;\n");
      out.write("                }\n");
      out.write("                /* hide the vertical line */\n");
      out.write("                .vl {\n");
      out.write("                    display: none;\n");
      out.write("                }\n");
      out.write("                /* show the hidden text on small screens */\n");
      out.write("                .hide-md-lg {\n");
      out.write("                    display: block;\n");
      out.write("                    text-align: justify;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <form action=\"/action_page.php\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <h2 style=\"text-align:center\">Login with Social Media or Manually</h2>\n");
      out.write("                    <div class=\"vl\">\n");
      out.write("                        <span class=\"vl-innertext\">or</span>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col\">\n");
      out.write("                        <a href=\"#\" class=\"fb btn\">\n");
      out.write("                            <i class=\"fa fa-facebook fa-fw\"></i> Login with Facebook\n");
      out.write("                        </a>\n");
      out.write("                        <a href=\"#\" class=\"twitter btn\">\n");
      out.write("                            <i class=\"fa fa-twitter fa-fw\"></i> Login with Twitter\n");
      out.write("                        </a>\n");
      out.write("                        <a href=\"https://accounts.google.com/o/oauth2/auth?scope=email&redirect_uri=http://localhost:8084/AccessGoogle/login-google&response_type=code\n");
      out.write("                           &client_id=438251236115-0jbn7rma3f913c9ktjv989s4d6vdlhk3.apps.googleusercontent.com&approval_prompt=force\" class=\"google btn\">\n");
      out.write("                            <i class=\"fa fa-google fa-fw\"></i> Login with Google+\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col\">\n");
      out.write("                        <div class=\"hide-md-lg\">\n");
      out.write("                            <p>Or sign in manually:</p>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <input type=\"text\" name=\"username\" placeholder=\"Username\" required>\n");
      out.write("                        <input type=\"password\" name=\"password\" placeholder=\"Password\" required>\n");
      out.write("                        <input type=\"submit\" value=\"Login\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"bottom-container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col\">\n");
      out.write("                    <a href=\"#\" style=\"color:white\" class=\"btn\">Sign up</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col\">\n");
      out.write("                    <a href=\"#\" style=\"color:white\" class=\"btn\">Forgot password?</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
