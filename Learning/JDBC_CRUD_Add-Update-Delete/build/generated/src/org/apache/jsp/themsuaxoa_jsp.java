package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.user;
import java.util.List;

public final class themsuaxoa_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <center>\n");
      out.write("            <h1>List of User </h1> \n");
      out.write("            <h3><a href=\"add.jsp\">Add new</a> </h3>\n");
      out.write("            <table border=\"1px\" width=\"40%\">\n");
      out.write("                <tr>\n");
      out.write("                    <th>userID</th>\n");
      out.write("                    <th>fullName</th>\n");
      out.write("                    <th>password</th>\n");
      out.write("                    <th>roleID</th>\n");
      out.write("                    <th>status</th>\n");
      out.write("                    <th>Action</th>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    List<user> list = (List<user>)request.getAttribute("data");
                    for (user i : list) {
                        String id = i.getUserID();                                             
                
      out.write("\n");
      out.write("                    <tr> \n");
      out.write("                        <td> ");
      out.print( id );
      out.write(" </td>\n");
      out.write("                        <td> ");
      out.print( i.getFullName());
      out.write(" </td>\n");
      out.write("                        <td> ");
      out.print( i.getPassword());
      out.write(" </td>\n");
      out.write("                        <td> ");
      out.print( i.getRoleID());
      out.write(" </td>\n");
      out.write("                        <td> ");
      out.print( i.isStatus());
      out.write(" </td>\n");
      out.write("                        <td> \n");
      out.write("                            <a href=\"#\" onclick=\"doDelete('");
      out.print( id );
      out.write("')\">Delete</a>\n");
      out.write("                            <a href=\"updateServlet?id=");
      out.print( id );
      out.write("\" style=\"margin-left: 30px\" >Update</a>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>                    \n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("            </table>            \n");
      out.write("        </center> \n");
      out.write("                \n");
      out.write("        <!--confirm to delete-->\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function doDelete(id){\n");
      out.write("                if(confirm(\"are you sure to delete '\"+id+\"' ?\")){\n");
      out.write("                    window.location = \"deleteServlet?id=\"+id;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("                \n");
      out.write("    </body> \n");
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
