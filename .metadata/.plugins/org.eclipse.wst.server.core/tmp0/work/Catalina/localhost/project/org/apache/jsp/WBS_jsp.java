/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.36
 * Generated at: 2016-09-15 02:27:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class WBS_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1473319915784L));
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1473319895137L));
    _jspx_dependants.put("jar:file:/F:/wxl/大学/大四上/project/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/project/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425949870000L));
    _jspx_dependants.put("/header.jsp", Long.valueOf(1473839805651L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html >\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<meta name=\"generator\" content=\"Xinglan Wang (bxmn4728@163.com) \">\r\n");
      out.write("<!--pageMeta-->\r\n");
      out.write("\r\n");
      out.write("<!-- Loading Bootstrap -->\r\n");
      out.write("<link href=\"bootstrap/css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Loading Flat UI -->\r\n");
      out.write("<link href=\"css/flat-ui.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- load page css -->\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/style.complete.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/myStyle.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- HTML5 shim, for IE6-8 support of HTML5 elements. All other JS at the end of file. -->\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("\t\t\t  <script src=\"js/html5shiv.js\"></script>\r\n");
      out.write("\t\t\t  <script src=\"js/respond.min.js\"></script>\r\n");
      out.write("\t\t\t<![endif]-->\r\n");
      out.write("\r\n");
      out.write("<!--headerIncludes-->\r\n");
      out.write("\r\n");
      out.write("<title>火星在线项目管理网</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- SITE HEADER -->\r\n");
      out.write("<header id=\"site-header\">\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("\t<nav class=\"navbar navbar-inverse\" role=\"navigation\">\r\n");
      out.write("\t\t<div class=\"container-fluid navbar-collapse\" >\r\n");
      out.write("\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t<a class=\"navbar-brand\" href=\"index.jsp\"><img src=\"images/hexagon.png \"\r\n");
      out.write("\t\t\t\t\tstyle=\"width: 24px\"></a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"collapse navbar-collapse\" >\r\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"User?action=show&id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">账户管理</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"Work?action=show&id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">项目管理</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#fakelink\">解决方案</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"workSpace.jsp\">工作平台</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<form class=\"navbar-form pull-left\" action=\"#\" role=\"search\">\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<input class=\"form-control\" id=\"searchThing\" type=\"search\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"Search\"> <span class=\"input-group-btn\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span><img src=\"images/searchIcon.png\" style=\"height:21px\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=#>欢迎");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"User?action=logout\">注销</a></li>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("</div>\r\n");
      out.write("\t<!-- HEADER TOP -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
/*
	
		 <div class="navbar">

				<!-- SITE LOGO -->
				<div class="logo-wrapper">
					<a herf=“index.jsp”><img src="/images/hexagon.png" ></a>
					
				</div>
				<!-- // SITE LOGO -->
				<!-- SITE NAVIGATION MENU -->
				<nav id="site-menu" role="navigation">
					<ul class="main-menu  hidden-xs">
						<c:choose>
							<c:when test="${empty loginName}">
								<li class="active"><a href="Login.jsp" onClick="login()">我的悦书</a>
								</li>
								<li><a href="Product?action=listNew">新书</a></li>
								<li><a href="Product?action=listOld">二手书</a></li>
								<li><a href="aboutUs.jsp">About Us</a></li>


								<li><a href="Login.jsp">&nbsp;&nbsp;>>>登陆</a></li>
								<li><a href="Register.jsp">注册</a></li>
							</c:when>

							<c:otherwise>
								<li class="active"><a href="User?action=show&id=${userId}">我的悦书</a>
								</li>
								<li><a href="Product?action=list">新书</a></li>
								<li><a href="Product?action=list">二手书</a></li>
								<li><a href="aboutUs.jsp">About Us</a></li>
								<li><a href=#>欢迎${loginName}</a></li>
								<li><a href="User?action=logout">&nbsp;&nbsp;注销</a></li>
							</c:otherwise>
						</c:choose>
					</ul>

				</nav>
				<!-- // SITE NAVIGATION MENU -->
				*/
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t<!-- // MAIN HEADER -->\r\n");
      out.write("</header>\r\n");
      out.write("<!-- // SITE HEADER -->\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"page wrapper container\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row\" id=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t<h3>您的项目编号为");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${workId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h3>\r\n");
      out.write("\t\t\t\t\t<table class=\"table\">\r\n");
      out.write("\t\t\t\t\t\t<caption>任务</caption>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<th>任务编号</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>任务级别</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>任务名称</th>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<th>任务开始时间</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>任务结束时间</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>前继任务编号</th>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<th>操作</th>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<form action=\"Task?action=add\" method=\"post\" class=\"form-inline\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"controls col-md-2\">\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"control-label \">任务名称:</label>\r\n");
      out.write("\t\t\t\t\t\t\t<input id=\"taskName\"\r\n");
      out.write("\t\t\t\t\t\t\t\tname=\"taskName\" type=\"text\"  />\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- Text input-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"controls  col-md-2\">\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"control-label \">前置任务:</label>\r\n");
      out.write("\t\t\t\t\t\t\t<input id=\"beforeId\"\r\n");
      out.write("\t\t\t\t\t\t\t\tname=\"beforeId\" type=\"number\" />\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"controls  col-md-2\" >\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"control-label \">开始时间:</label><input\r\n");
      out.write("\t\t\t\t\t\t\t\tid=\"taskBeginTime\" name=\"taskBeginTime\" type=\"Date\" />\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"controls  col-md-2\" >\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"control-label \">完成时间:</label><input\r\n");
      out.write("\t\t\t\t\t\t\t\tid=\"taskFinalTime\" name=\"taskFinalTime\" type=\"Date\" />\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"controls  col-md-2\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"control-label \">任务级别:</label><input\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tid=\"level\" name=\"level\" type=\"number\" min=\"1\" max=\"5\" step=\"1\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6 text-center\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-xs-2\"></div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-xs-4\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" value=\"增加任务\" class=\"btn btn-primary\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"margin-top: 35px\"> <input type=\"hidden\"\r\n");
      out.write("\t\t\t\t\t\t\t\tid=\"workId\" name=\"workId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${workId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-6 text-center\" style=\"float:left;margin-top:20px\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-xs-2\"></div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-xs-4\">\r\n");
      out.write("\t\t\t\t\t\t\t<form action=\"Task?action=Gantt\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" class=\"btn btn-primary  btn-wide btn-wider\"\r\n");
      out.write("\t\t\t\t\t\t\tvalue=\"完成创建,查看甘特图\" />\r\n");
      out.write("\t\t\t\t\t\t\t <input type=\"hidden\"\r\n");
      out.write("\t\t\t\t\t\t\t\tid=\"workId\" name=\"workId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${workId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t<div class=\"footerWrapper\" id=\"footer1\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div\r\n");
      out.write("\t\t\t\tclass=\"item footer bottom-menu bottom-menu-large bottom-menu-inverse\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-2 navbar-brand\">\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"\" href=\"#fakelink\"><img alt=\"\"\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"images/brush.svg\"></a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"title\">产品介绍</h5>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"bottom-links\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#fakelink\">火星项目管理是什么</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#fakelink\">为什么选择火星项目管理</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#fakelink\">安全与隐私</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#fakelink\">版本与价格</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#fakelink\">免责声明</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#fakelink\">官方博客</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-2\">\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"title\">帮助中心</h5>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"bottom-links\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#fakelink\">热点问题</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#fakelink\">账号问题</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#fakelink\">交流问题</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#fakelink\">管理问题</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#fakelink\">使用说明</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#fakelink\">其他问题</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"title\">关于我们</h5>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"bottom-links\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#fakelink\">客服：8008208820</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#fakelink\">邮箱：bxmn4728@Mars.com</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#fakelink\">联系我们</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#fakelink\">在线客服</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#fakelink\">公司简介</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#fakelink\">合作伙伴</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-2\">\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"title\">关注我们</h5>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"bottom-links\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#fakelink\">Facebook</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#fakelink\">Twitter</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#fakelink\">Youtube</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#fakelink\">Vimeo</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#fakelink\">Instagram</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>");
      out.write("\r\n");
      out.write("\t<!-- HEADER TOP -->\r\n");
      out.write("\t<!-- Load JS here for greater good =============================-->\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"js/jquery-1.8.3.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/jquery-ui-1.10.3.custom.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/jquery.ui.touch-punch.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/bootstrap-select.js\"></script>\r\n");
      out.write("\t<script src=\"js/bootstrap-switch.js\"></script>\r\n");
      out.write("\t<script src=\"js/flatui-checkbox.js\"></script>\r\n");
      out.write("\t<script src=\"js/flatui-radio.js\"></script>\r\n");
      out.write("\t<script src=\"js/jquery.tagsinput.js\"></script>\r\n");
      out.write("\t<script src=\"js/jquery.placeholder.js\"></script>\r\n");
      out.write("\t<script src=\"js/jquery.nivo.slider.pack.js\"></script>\r\n");
      out.write("\t<script src=\"js/application.js\"></script>\r\n");
      out.write("\t<script src=\"js/over.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WBS.jsp(53,6) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("item");
    // /WBS.jsp(53,6) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WBS.jsp(53,6) '${task}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${task}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t<tr >\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t<td >");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.taskId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t<td >");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.level}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t<td >");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.taskName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.taskBeginTime}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.taskFinalTime}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.beforeId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t<td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<form action=\"Task?action=delete\" method=\"post\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"删除\" /> <input type=\"hidden\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\tname=\"taskId\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.taskId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\" /> <input type=\"hidden\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\tid=\"workId\" name=\"workId\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${workId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</form>\r\n");
          out.write("\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
