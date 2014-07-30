package org.apache.jsp.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;

public final class error_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
 String CONTEXT_PATH = request.getContextPath(); 
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write("body {\r\n");
      out.write("\tfont: 100% 宋体, 新宋体;\r\n");
      out.write("\tbackground: #f2f2f2;\r\n");
      out.write("\tmargin: 0; \r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("\ttext-align: center; \r\n");
      out.write("\tcolor: #000000;\r\n");
      out.write("}\r\n");
      out.write(".oneColFixCtr #container {\r\n");
      out.write("\twidth: 400px;  \r\n");
      out.write("\theight:250px;\r\n");
      out.write("\tbackground: #FFFFFF;\r\n");
      out.write("\tmargin: 10px auto; \r\n");
      out.write("\tborder: 1px solid #000000;\r\n");
      out.write("\ttext-align: left;\r\n");
      out.write("}\r\n");
      out.write(".oneColFixCtr #mainContent {\r\n");
      out.write("\tpadding: 5px; \r\n");
      out.write("}\r\n");
      out.write("#mainContent h1{\r\n");
      out.write("\tbackground:url(");
      out.print( CONTEXT_PATH);
      out.write("/common/images/warning.gif) no-repeat left center;\r\n");
      out.write("\theight:48px;\r\n");
      out.write("\ttext-indent:2em;\r\n");
      out.write("\tline-height:48px;\r\n");
      out.write("\t\r\n");
      out.write("\t}\r\n");
      out.write("#mainContent p{\r\n");
      out.write("\tborder:1px dashed #bcccda;\r\n");
      out.write("\tpadding:10px;\r\n");
      out.write("\tbackground:#fcfcfc;\r\n");
      out.write("\tline-height:1.5em;\r\n");
      out.write("\t\r\n");
      out.write("\t}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function showPage(){\r\n");
      out.write("\tif(parent.showPage){\r\n");
      out.write("\t\tparent.showPage();\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"oneColFixCtr\" onload=\"showPage()\">\r\n");
      out.write("\r\n");
      out.write("<div id=\"container\">\r\n");
      out.write("  <div id=\"mainContent\">\r\n");
      out.write("\t<h1>错误提示信息</h1>\r\n");
      out.write("    <p>\r\n");
      out.write("    <logic:present name=\"errMsg\">\r\n");
      out.write("    <bean:write name=\"errMsg\" filter=\"true\"/>\r\n");
      out.write("    </logic:present>\r\n");
      out.write("   <logic:notPresent name=\"errMsg\">\r\n");
      out.write("    系统繁忙，请稍后再试\r\n");
      out.write("    </logic:notPresent>\r\n");
      out.write("    </p>\r\n");
      out.write("\t<!-- end #mainContent --></div>\r\n");
      out.write("<!-- end #container --></div>\r\n");
      out.write("\t<div style=\"visibility: hidden\">\r\n");
      out.write("\t \r\n");
      out.write("\t ");
 Exception e=(Exception)request.getAttribute("err");
	 if(e!=null) 
	 {
	 	StringWriter writer = new StringWriter();
		e.printStackTrace(new PrintWriter(writer));		
		out.println(writer.getBuffer());
	 }
	 
      out.write("\r\n");
      out.write("\t \r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
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
