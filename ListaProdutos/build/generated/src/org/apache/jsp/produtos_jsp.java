package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class produtos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            table {  \n");
      out.write("                color: #333;\n");
      out.write("                font-family: Helvetica, Arial, sans-serif;\n");
      out.write("                width: 640px; \n");
      out.write("                border-collapse: \n");
      out.write("                collapse; border-spacing: 0; \n");
      out.write("            }\n");
      out.write("\n");
      out.write("            td, th {  \n");
      out.write("                border: 1px solid transparent; /* No more visible border */\n");
      out.write("                height: 30px; \n");
      out.write("                transition: all 0.3s;  /* Simple transition for hover effect */\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            th {  \n");
      out.write("                background: #DFDFDF;  /* Darken header a bit */\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            td {  \n");
      out.write("                background: #FAFAFA;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Cells in even rows (2,4,6...) are one color */        \n");
      out.write("            tr:nth-child(even) td { background: #F1F1F1; }   \n");
      out.write("\n");
      out.write("            /* Cells in odd rows (1,3,5...) are another (excludes header cells)  */        \n");
      out.write("            tr:nth-child(odd) td { background: #FEFEFE; }  \n");
      out.write("\n");
      out.write("            tr td:hover { background: #666; color: #FFF; }  \n");
      out.write("            /* Hover cell effect! */\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("        \n");
      out.write("    <body>\n");
      out.write("        <h1>Lista de produtos</h1>\n");
      out.write("        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.prods}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("p");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("            <table>  \n");
          out.write("                <tr>  \n");
          out.write("                    <th>One</th>\n");
          out.write("                    <th>Two</th>\n");
          out.write("                    <th>Three</th>\n");
          out.write("                </tr>  \n");
          out.write("                <tr>  \n");
          out.write("                    <td>Apples</td>\n");
          out.write("                    <td>Carrots</td>\n");
          out.write("                    <td>Steak</td>\n");
          out.write("                </tr>  \n");
          out.write("                <tr>  \n");
          out.write("                    <td>Oranges</td>\n");
          out.write("                    <td>Potato</td>\n");
          out.write("                    <td>Pork</td>\n");
          out.write("                </tr>  \n");
          out.write("                <tr>  \n");
          out.write("                    <td>Pears</td>\n");
          out.write("                    <td>Peas</td>\n");
          out.write("                    <td>Chicken</td>\n");
          out.write("                </tr>  \n");
          out.write("            </table> \n");
          out.write("        ");
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
