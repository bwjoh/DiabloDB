/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.35
 * Generated at: 2016-06-14 02:21:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class comments_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <link rel=\"icon\" href=\"../../favicon.ico\">\n");
      out.write("\n");
      out.write("    <title>DiabloDB: the forum for nothing</title>\n");
      out.write("\n");
      out.write("    <!-- Custom styles for this template -->\n");
      out.write("    <link href=\"../css/comments_list.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body role=\"document\">\n");
      out.write("\n");
      out.write("    <!-- Fixed navbar -->\n");
      out.write("    <nav class=\"navbar navbar-default navbar-fixed-top\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("          <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("          </button>\n");
      out.write("          <a class=\"navbar-brand\" href=\"../index.jsp\">DiabloDB <span class=\"glyphicon glyphicon-fire\" aria-hidden=\"true\"></a>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("          <ul class=\"nav navbar-nav\">\n");
      out.write("            <li><a href=\"/jsp/pages_list.jsp\">Your Pages</a></li>\n");
      out.write("            <li><a href=\"/jsp/threads_list.jsp\">Your Threads</a></li>\n");
      out.write("            <li class=\"active\"><a href=\"/jsp/comments_list.jsp\">Your Comments</a></li>\n");
      out.write("\n");
      out.write("          </ul>\n");
      out.write("                      <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("            <li><a href=\"/jsp/user.jsp\">Profile</a></li>\n");
      out.write("            <li><a id=\"login\" href=\"/jsp/sign_in.jsp\">Log in</a></li>\n");
      out.write("            <!-- <li><a id=\"logout\" href=\"/jsp/sign_in.jsp\">Log out</a></li> -->\n");
      out.write("            <!-- <li class=\"dropdown\">\n");
      out.write("              <a href=\"/jsp/#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Dropdown <span class=\"caret\"></span></a>\n");
      out.write("              <ul class=\"dropdown-menu\">\n");
      out.write("                <li><a href=\"/jsp/#\">Action</a></li>\n");
      out.write("                <li><a href=\"/jsp/#\">Another action</a></li>\n");
      out.write("                <li><a href=\"/jsp/#\">Something else here</a></li>\n");
      out.write("                <li role=\"separator\" class=\"divider\"></li>\n");
      out.write("                <li class=\"dropdown-header\">Nav header</li>\n");
      out.write("                <li><a href=\"/jsp/#\">Separated link</a></li>\n");
      out.write("                <li><a href=\"/jsp/#\">One more separated link</a></li>\n");
      out.write("              </ul>\n");
      out.write("            </li> -->\n");
      out.write("          </ul>\n");
      out.write("          </ul>\n");
      out.write("        </div><!--/.nav-collapse -->\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <div class=\"container theme-showcase\" role=\"main\">\n");
      out.write("      <div class=\"page-header text-center\">\n");
      out.write("        <h3>Comments</h3>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-md-12\">\n");
      out.write("          <table class=\"table table-striped\">\n");
      out.write("            <thead>\n");
      out.write("              <tr>\n");
      out.write("                <th class=\"col-sm-1 col-lg-1\">Status</th>\n");
      out.write("                <!-- make these links to threads -->\n");
      out.write("                <th>Comment text</th>\n");
      out.write("              </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("              <tr>\n");
      out.write("                <td class=\"col-sm-1 col-lg-1\"><span class=\"label label-success\">Rising</span></td>\n");
      out.write("                <td><a href=\"/jsp/thread.jsp\">What stuff do you have in your closet?</a></td>\n");
      out.write("              </tr>\n");
      out.write("            </tbody>\n");
      out.write("          </table>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("    </div> <!-- /container -->\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <nav>\n");
      out.write("      <ul class=\"pagination\">\n");
      out.write("        <li>\n");
      out.write("          <a href=\"/jsp/#\" aria-label=\"Previous\">\n");
      out.write("            <span aria-hidden=\"true\">&laquo;</span>\n");
      out.write("          </a>\n");
      out.write("        </li>\n");
      out.write("        <li><a href=\"/jsp/#\">1</a></li>\n");
      out.write("        <li><a href=\"/jsp/#\">2</a></li>\n");
      out.write("        <li><a href=\"/jsp/#\">3</a></li>\n");
      out.write("        <li><a href=\"/jsp/#\">4</a></li>\n");
      out.write("        <li><a href=\"/jsp/#\">5</a></li>\n");
      out.write("        <li>\n");
      out.write("          <a href=\"/jsp/#\" aria-label=\"Next\">\n");
      out.write("            <span aria-hidden=\"true\">&raquo;</span>\n");
      out.write("          </a>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("    </nav>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core JavaScript\n");
      out.write("    ================================================== -->\n");
      out.write("    <!-- Placed at the end of the document so the pages load faster -->\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\n");
      out.write("    <!-- Latest compiled and minified CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\" integrity=\"sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("    <!-- Optional theme -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css\" integrity=\"sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("    <!-- Latest compiled and minified JavaScript -->\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\" integrity=\"sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS\" crossorigin=\"anonymous\"></script>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
