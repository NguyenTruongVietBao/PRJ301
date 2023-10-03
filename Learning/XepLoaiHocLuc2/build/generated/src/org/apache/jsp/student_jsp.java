package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Student;

public final class student_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>A Student</h1>\n");
      out.write("        \n");
      out.write("        <form action=\"XepLoaiHocLuc2Servlet\" method=\"post\">\n");
      out.write("            ID: <input type=\"text\" name=\"id\"/>  </br>\n");
      out.write("            Name: <input type=\"text\" name=\"name\"/>  </br>\n");
      out.write("            Gender: <input type=\"radio\" checked=\"\" name=\"gender\" value=\"1\"/> Male\n");
      out.write("                    <input type=\"radio\" name=\"gender\" value=\"0\"/> Female </br>\n");
      out.write("            Mark: <input type=\"text\" name=\"mark\"/>\n");
      out.write("            <input  type=\"submit\" value=\"Submit\" />\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        <table border=\"1px\" width=\"40%\">\n");
      out.write("            <tr>\n");
      out.write("                <th>Id</th>\n");
      out.write("                <th>Name</th>\n");
      out.write("                <th>Gender</th>\n");
      out.write("                <th>Pass / Fail</th>\n");
      out.write("            </tr>\n");
      out.write("            ");

                if(request.getAttribute("st") !=  null){
                    Student s = (Student) request.getAttribute("st");               
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print( s.getId() );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( s.getName() );
      out.write("</td>\n");
      out.write("                ");

                    if(s.isGender()){
                
      out.write("\n");
      out.write("                <td> <img src=\"Male_Female/Male-icon.png\" width=\"20px\"> </td>\n");
      out.write("                ");

                    }else{            
                
      out.write("\n");
      out.write("                        <td> <img src=\"Male_Female/vector-female-sign-icon-illustration.jpg\" width=\"20px\"> </td>\n");
      out.write("                ");

                    }
                
      out.write("        \n");
      out.write("                <td>");
      out.print( s.getStatus() );
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("        </table>\n");
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
