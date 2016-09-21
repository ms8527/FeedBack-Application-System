package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class feednext_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("   \r\n");

     String userEmail = (String)session.getAttribute("userEmail");
    if (userEmail == null || userEmail == "") {

      out.write("\r\n");
      out.write("You are not logged in<br/>\r\n");
      out.write("<a href=\"login.jsp\">Please Login</a>\r\n");
} else {

      out.write("\r\n");
      out.write("<html><p style=\"color:#FFF;\">Welcome ");
      out.print((String)session.getAttribute("userName"));
      out.write('\r');
      out.write('\n');
String userName=(String)session.getAttribute("userName");
      out.write("\r\n");
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("<a class=\"round medium green button\"  href='feednext.jsp'>Home</a>\r\n");
      out.write("<a class=\"round medium green button \"style=\"margin-left:1220; margin-top:-53\"  href='login.jsp'>Log out</a>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"./css/buttons.css\">\r\n");
      out.write("<style>\r\n");
      out.write("body\r\n");
      out.write("{background: url(./css/bg.jpg) no-repeat center center fixed; \r\n");
      out.write("  -webkit-background-size: cover;\r\n");
      out.write("  -moz-background-size: cover;\r\n");
      out.write("  -o-background-size: cover;\r\n");
      out.write("  background-size: cover;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write(".center{\r\n");
      out.write("text-align:center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("\r\n");
      out.write("   <div class=\"center\">\r\n");
      out.write("       <form  name=\"ViewFeed\" action=\"viewFeed.jsp\" method=\"GET\" >\r\n");
      out.write("       <input class=\"styled-button-green\" type=\"submit\"  value=\"View Feedback\">\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("<form name=\"GiveFeed\" action=\"giveFeed.jsp\" method=\"GET\" >\r\n");
      out.write("    <input class=\"styled-button-green\" type=\"submit\" value=\"Give Feedback\">\r\n");
      out.write(" \r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");

    } 

      out.write("\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
