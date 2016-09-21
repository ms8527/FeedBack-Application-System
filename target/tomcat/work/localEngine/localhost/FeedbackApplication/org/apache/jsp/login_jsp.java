package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.springframework.jdbc.core.JdbcTemplate;
import com.feedbackApplication.database.DatabaseService;
import com.feedbackApplication.database.Sample;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" ");

 JdbcTemplate jdbcTemplate = DatabaseService.getJdbcTemplate();
 
 Sample sample = new Sample();
	
 	//int count = 0;
 	
 
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html >\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Sign Up/Login Box</title>\r\n");
      out.write("            <link rel=\"stylesheet\" href=\"css/style.css\">  \r\n");
      out.write("  </head>\r\n");
      out.write("  <style>\r\n");
      out.write("body {\r\n");
      out.write("\tbackground: url(./css/bg.jpg) no-repeat center center fixed;\r\n");
      out.write("\t-webkit-background-size: cover;\r\n");
      out.write("\t-moz-background-size: cover;\r\n");
      out.write("\t-o-background-size: cover;\r\n");
      out.write("\tbackground-size: cover;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write("\r\n");
      out.write(" <link href=\"http://fonts.googleapis.com/css?family=Open+Sans:400,700\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("  <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js\"></script>\r\n");
      out.write("   <div id=\"logmsk\" style=\"display: block;\">\r\n");
      out.write("    <div id='close'>X</div>\r\n");
      out.write("    \t<form class=\"form\" name=\"user\" action=\"LoginServlet\" method=\"post\" >\r\n");
      out.write("    <div id=\"userboxlogin\">\r\n");
      out.write("        <h1 id=\"signup\" style=\"background-color: rgb(118, 171, 219); background-position: initial initial; background-repeat: initial initial;\">Login</h1>\r\n");
      out.write("        <div id=\"sumsk\" style=\"display: none;\">Sending</div>\r\n");
      out.write("        <input id=\"name\" name=\"userEmail\" placeholder=\"ID\" style=\"opacity: 1; background-color: rgb(255, 255, 255); background-position: initial initial; background-repeat: initial initial;\">\r\n");
      out.write("        <input id=\"pass\" name=\"password\" type=\"password\" placeholder=\"Password\" style=\"opacity: 1; background-color: rgb(255, 255, 255); background-position: initial initial; background-repeat: initial initial;\">\r\n");
      out.write("       <!--  <p id=\"logint\" style=\"opacity: 1;\">Login as an existing user</p> -->\r\n");
      out.write("       <p id=\"logint\" style=\"opacity: 1;\"><a href=\"signUp.jsp\">Signup as a new user</a></p>\r\n");
      out.write("       \r\n");
      out.write("        <button id=\"signupb\" style=\"opacity: 1; cursor: default;\">Login</button>\r\n");
      out.write("    </div>\r\n");
      out.write("    </form>\r\n");
      out.write("</div>\r\n");
      out.write("    \r\n");
      out.write("      <!--   <script src=\"js/index.js\"></script> -->\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
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
