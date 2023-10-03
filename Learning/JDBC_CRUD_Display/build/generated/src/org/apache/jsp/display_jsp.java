package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.user;
import java.util.List;

public final class display_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <title>User grid - Bootdey.com</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            body{\n");
      out.write("                margin-top:20px;\n");
      out.write("                color: #1a202c;\n");
      out.write("                text-align: left;\n");
      out.write("                background-color: #e2e8f0;    \n");
      out.write("            }\n");
      out.write("            .main-body {\n");
      out.write("                padding: 15px;\n");
      out.write("            }\n");
      out.write("            .card {\n");
      out.write("                box-shadow: 0 1px 3px 0 rgba(0,0,0,.1), 0 1px 2px 0 rgba(0,0,0,.06);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .card {\n");
      out.write("                position: relative;\n");
      out.write("                display: flex;\n");
      out.write("                flex-direction: column;\n");
      out.write("                min-width: 0;\n");
      out.write("                word-wrap: break-word;\n");
      out.write("                background-color: #fff;\n");
      out.write("                background-clip: border-box;\n");
      out.write("                border: 0 solid rgba(0,0,0,.125);\n");
      out.write("                border-radius: .25rem;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .card-body {\n");
      out.write("                flex: 1 1 auto;\n");
      out.write("                min-height: 1px;\n");
      out.write("                padding: 1rem;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .gutters-sm {\n");
      out.write("                margin-right: -8px;\n");
      out.write("                margin-left: -8px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .gutters-sm>.col, .gutters-sm>[class*=col-] {\n");
      out.write("                padding-right: 8px;\n");
      out.write("                padding-left: 8px;\n");
      out.write("            }\n");
      out.write("            .mb-3, .my-3 {\n");
      out.write("                margin-bottom: 1rem!important;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .bg-gray-300 {\n");
      out.write("                background-color: #e2e8f0;\n");
      out.write("            }\n");
      out.write("            .h-100 {\n");
      out.write("                height: 100%!important;\n");
      out.write("            }\n");
      out.write("            .shadow-none {\n");
      out.write("                box-shadow: none!important;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .bg-white {\n");
      out.write("                background-color: #fff!important;\n");
      out.write("            }\n");
      out.write("            .btn-light {\n");
      out.write("                color: #1a202c;\n");
      out.write("                background-color: #fff;\n");
      out.write("                border-color: #cbd5e0;\n");
      out.write("            }\n");
      out.write("            .ml-2, .mx-2 {\n");
      out.write("                margin-left: .5rem!important;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .card-footer:last-child {\n");
      out.write("                border-radius: 0 0 .25rem .25rem;\n");
      out.write("            }\n");
      out.write("            .card-footer, .card-header {\n");
      out.write("                display: flex;\n");
      out.write("                align-items: center;\n");
      out.write("            }\n");
      out.write("            .card-footer {\n");
      out.write("                padding: .5rem 1rem;\n");
      out.write("                background-color: #fff;\n");
      out.write("                border-top: 0 solid rgba(0,0,0,.125);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"main-body\">\n");
      out.write("\n");
      out.write("                <nav aria-label=\"breadcrumb\" class=\"main-breadcrumb\">\n");
      out.write("                    <ol class=\"breadcrumb\">\n");
      out.write("                        <li class=\"breadcrumb-item\"><a href=\"index.html\">Home</a></li>\n");
      out.write("                        <li class=\"breadcrumb-item\"><a href=\"javascript:void(0)\">User</a></li>\n");
      out.write("                        <li class=\"breadcrumb-item active\" aria-current=\"page\">User Grid</li>\n");
      out.write("                    </ol>\n");
      out.write("                </nav>\n");
      out.write("\n");
      out.write("                <div class=\"row row-cols-1 row-cols-sm-2 row-cols-md-3 row-cols-xl-4 gutters-sm\">\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-1.10.2.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("        </script>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.data}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("i");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <div class=\"col mb-3\">\n");
          out.write("                        <div class=\"card\">\n");
          out.write("                            <img src=\"https://www.bootdey.com/image/340x120/FFB6C1/000000\" alt=\"Cover\" class=\"card-img-top\">\n");
          out.write("                            <div class=\"card-body text-center\">\n");
          out.write("                                <img src=\"https://bootdey.com/img/Content/avatar/avatar7.png\" style=\"width:100px;margin-top:-65px\" alt=\"User\" class=\"img-fluid img-thumbnail rounded-circle border-0 mb-3\">\n");
          out.write("                                <h5 class=\"card-title\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.fullName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h5>\n");
          out.write("                                <p class=\"text-secondary mb-1\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.userID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                <p class=\"text-muted font-size-sm\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.roleID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                            </div>\n");
          out.write("                            <div class=\"card-footer\">\n");
          out.write("                                <button class=\"btn btn-light btn-sm bg-white has-icon btn-block\" type=\"button\"><i class=\"material-icons\">add</i>Follow</button>\n");
          out.write("                                <button class=\"btn btn-light btn-sm bg-white has-icon ml-2\" type=\"button\"><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\" class=\"feather feather-message-circle\"><path d=\"M21 11.5a8.38 8.38 0 0 1-.9 3.8 8.5 8.5 0 0 1-7.6 4.7 8.38 8.38 0 0 1-3.8-.9L3 21l1.9-5.7a8.38 8.38 0 0 1-.9-3.8 8.5 8.5 0 0 1 4.7-7.6 8.38 8.38 0 0 1 3.8-.9h.5a8.48 8.48 0 0 1 8 8v.5z\"></path></svg></button>\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                    </div>  \n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
