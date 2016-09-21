package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class viewFeed_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<a class=\"round medium green button\"  href='feednext.jsp'>Home</a>\r\n");
      out.write("<a class=\"round medium green button \"style=\"margin-left:1220; margin-top:-53\"  href='login.jsp'>Log out</a>\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html >\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>FeedBack</title>\r\n");
      out.write("            <link rel=\"stylesheet\" href=\"css/style.css\"> \r\n");
      out.write("            <link rel=\"stylesheet\" href=\"./css/buttons.css\"> \r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write("\r\n");
      out.write(" <link href=\"http://fonts.googleapis.com/css?family=Open+Sans:400,700\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write(" <link rel=\"stylesheet\" href=\"http://netdna.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css\">\r\n");
      out.write("\r\n");
      out.write("  <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js\"></script>\r\n");
      out.write("  \r\n");
      out.write("   \r\n");
      out.write("    \t<title>FeedBack Filters</title>\r\n");
      out.write("    \t<div class=\"feedback\">\r\n");
      out.write("\t\t\t<form name=\"ViewFeeds\" method=\"post\" action=\"ViewFeedbackServlet\">\r\n");
      out.write("\t\t\t<div style=\"text-align:center\"></div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<h2>FeedBack Filters</h2>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<label for=\"first_name\">Date<span> *</span></label>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<label for=\"first_name\">From</label> <input type=\"date\" name=\"dateFrom\" placeholder=\"From\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<label for=\"first_name\">To</label><input type=\"date\" name=\"dateTo\" placeholder=\"to\" >\r\n");
      out.write("\t\t     <br>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<label for=\"first_name\">Anonymous<span> *</span>\r\n");
      out.write("\t\t\t\t\t<input  type=\"radio\"  name=\"Anonymous\"  value=\"Yes\">Yes\r\n");
      out.write("\t\t\t\t\t<input  type=\"radio\"  name=\"Anonymous\"  value=\"No\">No\r\n");
      out.write("\t\t    </label>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t <label for=\"rating\">Rating <span> *</span>\r\n");
      out.write("\t\t\t <input type=\"number\" name=\"rating\" min=\"0\" max=\"5\">\r\n");
      out.write("\t\t\t </label>\r\n");
      out.write("\t\t\t   \r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<input class=\"btn\" type=\"submit\" value=\"Submit\" name=\"submit\">   \r\n");
      out.write("\t\t\t<div style=\"clear:both\"></div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("     <!--    <script src=\"js/index.js\"></script> -->\r\n");
      out.write("\r\n");
      out.write("    <style>\r\n");
      out.write("body {\r\n");
      out.write("\tbackground: url(./css/bg.jpg) no-repeat center center fixed;\r\n");
      out.write("\t-webkit-background-size: cover;\r\n");
      out.write("\t-moz-background-size: cover;\r\n");
      out.write("\t-o-background-size: cover;\r\n");
      out.write("\tbackground-size: cover;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("* {\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".feedback {\r\n");
      out.write("\twidth: 500px;\r\n");
      out.write("\tbackground: #C2E8F7;\r\n");
      out.write("\tpadding: 10px;\r\n");
      out.write("\tmargin: 20px auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".feedback form {\r\n");
      out.write("\tbackground: #fff;\r\n");
      out.write("\tborder-radius: 5px;\r\n");
      out.write("\tpadding: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".feedback label {\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tpadding: 5px 0;\r\n");
      out.write("\tcolor: #00546a;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#ema {\r\n");
      out.write("\tborder: 1px solid #ccc;\r\n");
      out.write("\tpadding: 5px;\r\n");
      out.write("\twidth: 99%;\r\n");
      out.write("\tfont-size: 14px;\r\n");
      out.write("\tmargin: 5px 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".feedback textarea {\r\n");
      out.write("\tborder: 1px solid #ccc;\r\n");
      out.write("\tpadding: 5px;\r\n");
      out.write("\twidth: 99%;\r\n");
      out.write("\tfont-size: 14px;\r\n");
      out.write("\tmargin: 5px 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".feedback form h2 {\r\n");
      out.write("\tcolor: hsl(191, 88%, 26%);\r\n");
      out.write("\tmargin-bottom: 13px;\r\n");
      out.write("\tpadding: 6px 0 20px 0;\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".feedback form h2::after {\r\n");
      out.write("\tbackground: #ffffff; /* Old browsers */\r\n");
      out.write("\tbackground: -moz-linear-gradient(left, #ffffff 0%, #08687e 50%, #ffffff 100%);\r\n");
      out.write("\t/* FF3.6+ */\r\n");
      out.write("\tbackground: -webkit-gradient(linear, left top, right top, color-stop(0%, #ffffff),\r\n");
      out.write("\t\tcolor-stop(50%, #08687e), color-stop(100%, #ffffff));\r\n");
      out.write("\t/* Chrome,Safari4+ */\r\n");
      out.write("\tbackground: -webkit-linear-gradient(left, #ffffff 0%, #08687e 50%, #ffffff 100%);\r\n");
      out.write("\t/* Chrome10+,Safari5.1+ */\r\n");
      out.write("\tbackground: -o-linear-gradient(left, #ffffff 0%, #08687e 50%, #ffffff 100%);\r\n");
      out.write("\t/* Opera 11.10+ */\r\n");
      out.write("\tbackground: -ms-linear-gradient(left, #ffffff 0%, #08687e 50%, #ffffff 100%);\r\n");
      out.write("\t/* IE10+ */\r\n");
      out.write("\tbackground: linear-gradient(to right, #ffffff 0%, #08687e 50%, #ffffff 100%);\r\n");
      out.write("\t/* W3C */\r\n");
      out.write("\tfilter: progid:DXImageTransform.Microsoft.gradient(  startColorstr='#ffffff',\r\n");
      out.write("\t\tendColorstr='#ffffff', GradientType=1); /* IE6-9 */\r\n");
      out.write("\tbottom: -3px;\r\n");
      out.write("\tcontent: \".\";\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tfont-size: 0;\r\n");
      out.write("\theight: 1px;\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\tz-index: 2147483647;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".feedback .btn {\r\n");
      out.write("\tbackground: hsl(191, 49%, 47%);\r\n");
      out.write("\tborder: 4px solid hsl(0, 0%, 100%);\r\n");
      out.write("\tbox-shadow: 0 2px 5px hsl(0, 0%, 80%);\r\n");
      out.write("\t-webkit-box-shadow: 0 2px 5px hsl(0, 0%, 80%);\r\n");
      out.write("\tcolor: hsl(0, 0%, 100%);\r\n");
      out.write("\tfloat: right;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tpadding: 10px;\r\n");
      out.write("\t-webkit-appearance: none;\r\n");
      out.write("\twidth: auto;\r\n");
      out.write("}\r\n");
      out.write("/* \tinput{ */\r\n");
      out.write("/* \t\t -webkit-appearance: none; */\r\n");
      out.write("/* \t\t -webkit-border-radius:0; */\r\n");
      out.write("/* \t} */\r\n");
      out.write("@media ( max-width :500px) {\r\n");
      out.write("\t.feedback {\r\n");
      out.write("\t\twidth: 90%;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("div.stars {\r\n");
      out.write("\twidth: 270px;\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input.star {\r\n");
      out.write("\tdisplay: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("label.star {\r\n");
      out.write("\tfloat: right;\r\n");
      out.write("\tpadding: 2px;\r\n");
      out.write("\tfont-size: 26px;\r\n");
      out.write("\tcolor: #444;\r\n");
      out.write("\ttransition: all .2s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input.star:checked ~ label.star:before {\r\n");
      out.write("\tcontent: '\\f005';\r\n");
      out.write("\tcolor: #FD4;\r\n");
      out.write("\ttransition: all .25s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input.star-5:checked ~ label.star:before {\r\n");
      out.write("\tcolor: #FE7;\r\n");
      out.write("\ttext-shadow: 0 0 20px #952;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input.star-1:checked ~ label.star:before {\r\n");
      out.write("\tcolor: #F62;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("label.star:hover {\r\n");
      out.write("\ttransform: rotate(-15deg) scale(1.3);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("label.star:before {\r\n");
      out.write("\tcontent: '\\f006';\r\n");
      out.write("\tfont-family: FontAwesome;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("  </body>\r\n");
      out.write("  ");

    } 

      out.write("\r\n");
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
