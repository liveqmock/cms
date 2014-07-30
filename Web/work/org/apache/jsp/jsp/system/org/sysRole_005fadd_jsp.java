package org.apache.jsp.jsp.system.org;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sysRole_005fadd_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/common/dialog.jsp");
    _jspx_dependants.add("/common/resize.jsp");
    _jspx_dependants.add("/WEB-INF/tag/gl-tag.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fescape_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fform_0026_005fnamespace_005fmethod_005fid_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftextarea_0026_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fgl_005fbutton_0026_005fonClick_005fname;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fescape_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fform_0026_005fnamespace_005fmethod_005fid_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ftextarea_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fgl_005fbutton_0026_005fonClick_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fescape_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fform_0026_005fnamespace_005fmethod_005fid_005faction.release();
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005ftextarea_0026_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fgl_005fbutton_0026_005fonClick_005fname.release();
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
      out.write("\r\n");

	String path = request.getContextPath();
	String CONTEXT_PATH = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta http-equiv=\"x-ua-compatible\" content=\"ie=7\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(CONTEXT_PATH);
      out.write("dhtmlx/dhtmlx.css\"/>\r\n");
      out.write("<script src=\"");
      out.print(CONTEXT_PATH);
      out.write("dhtmlx/dhtmlx.js\"></script>\r\n");
      out.write("\t<title></title>\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(CONTEXT_PATH);
      out.write("css/main.css\" />\r\n");
      out.write("\r\n");
      out.write("  <script language=\"javascript\" src=\"");
      out.print( CONTEXT_PATH );
      out.write("/js/date_validate.js\"></script>\t\r\n");
      out.write("  <script language=\"javascript\" src=\"");
      out.print( CONTEXT_PATH );
      out.write("/js/ctrl_util.js\"></script>\t\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tvar contextpath = \"");
      out.print(CONTEXT_PATH);
      out.write("\";\r\n");
      out.write("\t\tvar fulllink = contextpath + \"system/sysRole.do\";\r\n");
      out.write("\r\n");
      out.write("\t\tfunction goCancel() {\r\n");
      out.write("\t\t\tparent.closedialog(false);\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction goSubmit() {\r\n");
      out.write("\t\t  if(!checkString(getElement('form.record.roleCode'),\"角色标识\",30,true)) return;\r\n");
      out.write("\t\t  if(!checkString(getElement('form.record.roleName'),\"角色名称\",30,true)) return;\r\n");
      out.write("\t\t  if(!checkString(getElement('form.record.remark'),\"备注\",200,false)) return;\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tdocument.forms[0].action=fulllink+\"?action=SAVE\";\r\n");
      out.write("    \tdocument.forms[0].submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t  function init(){\r\n");
      out.write("\t\t\t  showMessage('");
      if (_jspx_meth_s_005fproperty_005f0(_jspx_page_context))
        return;
      out.write("');\r\n");
      out.write("\t\t  }\r\n");
      out.write("\t</script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("   html, body {width:100%; height:100%; margin:0px; padding:0px; overflow:hidden;}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body onload=\"init()\">\r\n");
      out.write("\t<div id=\"formDiv\" class=\"formDiv\">\r\n");
      out.write("  ");
      if (_jspx_meth_s_005fform_005f0(_jspx_page_context))
        return;
      out.write("\t\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"btnDiv\" class=\"btnDiv\">\r\n");
      out.write("\t\t");
      if (_jspx_meth_gl_005fbutton_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t&nbsp;\r\n");
      out.write("\t    ");
      if (_jspx_meth_gl_005fbutton_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t    &nbsp;\r\n");
      out.write("\t    ");
      if (_jspx_meth_gl_005fbutton_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</div>\t  \r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t var dhxWins = new dhtmlXWindows();\r\n");
      out.write("    dhxWins.enableAutoViewport(true);\r\n");
      out.write("    dhxWins.setImagePath(\"");
      out.print(CONTEXT_PATH);
      out.write("dhtmlx/imgs/\");\r\n");
      out.write("    \r\n");
      out.write("    var winName=\"win\";  \r\n");
      out.write("    var editMode;       \r\n");
      out.write("    \r\n");
      out.write("    function openWindow(title,urlink,width,height){\r\n");
      out.write("    \t var w = dhxWins.createWindow(winName, 0, 0, width,height);\r\n");
      out.write("       w.setText(title);\r\n");
      out.write("       w.keepInViewport(true);\r\n");
      out.write("       w.setModal(true);\r\n");
      out.write("       w.centerOnScreen();\r\n");
      out.write("       w.button(\"park\").hide();\r\n");
      out.write("       w.attachURL(urlink);\r\n");
      out.write("       return w;    \r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function openSingleWindow(title,divhtml,width,height){\r\n");
      out.write("       if(height==null || height=='') height=250;\r\n");
      out.write("       if(width==null || width=='') width=350;\r\n");
      out.write("   \t \r\n");
      out.write("       var win2 = dhxWins.createWindow(winName, 0, 0, width, height);\r\n");
      out.write("       win2.setText(title);\r\n");
      out.write("       win2.keepInViewport(true);\r\n");
      out.write("       win2.setModal(true);\r\n");
      out.write("       win2.centerOnScreen();\r\n");
      out.write("       win2.button(\"park\").hide();\r\n");
      out.write("       win2.attachHTMLString(divhtml);\r\n");
      out.write("       return win2;    \r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function openWindowById(title,objId,width,height){\r\n");
      out.write("\t       if(height==null || height=='') height=250;\r\n");
      out.write("\t       if(width==null || width=='') width=350;\r\n");
      out.write("\t   \t \r\n");
      out.write("\t       var win2 = dhxWins.createWindow(winName, 0, 0, width, height);\r\n");
      out.write("\t   \t win2.button(\"close\").attachEvent(\"onClick\", function(){\r\n");
      out.write("\t   \t\tdhxWins.window(winName).close();\r\n");
      out.write("\t\t    });\r\n");
      out.write("\t   \t win2.maximize();\r\n");
      out.write("\t       win2.setText(title);\r\n");
      out.write("\t       win2.keepInViewport(true);\r\n");
      out.write("\t       win2.setModal(true);\r\n");
      out.write("\t       win2.centerOnScreen();\r\n");
      out.write("\t       win2.button(\"minmax1\").hide();\r\n");
      out.write("\t       win2.button(\"minmax2\").hide();\r\n");
      out.write("\t       win2.button(\"park\").hide();\r\n");
      out.write("\t       win2.attachObject(objId);;\r\n");
      out.write("\t       return win2;    \r\n");
      out.write("\t    }\r\n");
      out.write("   \r\n");
      out.write("</script> \r\n");
      out.write('\r');
      out.write('\n');
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t var mainbody=window.document.body;\r\n");
      out.write("    if(window.addEventListener) {\r\n");
      out.write(" \t     window.addEventListener(\"resize\",goResize,false); \r\n");
      out.write("    }\r\n");
      out.write("    else {\r\n");
      out.write(" \t     window.attachEvent('onresize',goResize);\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    var fDiv=window.document.getElementById('formDiv');\r\n");
      out.write("    var bDiv=window.document.getElementById('btnDiv');\r\n");
      out.write("    var btbl=window.document.getElementById('tblForm');\r\n");
      out.write("    \r\n");
      out.write("    function goResize(){\r\n");
      out.write("       fDiv.style.width=mainbody.offsetWidth-fDiv.offsetLeft*2+\"px\";\r\n");
      out.write("       bDiv.style.width=mainbody.offsetWidth-bDiv.offsetLeft*2+\"px\";\r\n");
      out.write("       fDiv.style.height=mainbody.offsetHeight-bDiv.offsetHeight-fDiv.offsetTop*2+\"px\";\r\n");
      out.write("       bDiv.style.top=fDiv.offsetHeight+fDiv.offsetTop*2+\"px\";\r\n");
      out.write("       if(btbl)btbl.style.width=fDiv.clientWidth-fDiv.offsetLeft+\"px\";\r\n");
      out.write("    }\r\n");
      out.write("    goResize();   \r\n");
      out.write("</script> \r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
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

  private boolean _jspx_meth_s_005fproperty_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f0 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fescape_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f0.setParent(null);
    // /jsp/system/org/sysRole_add.jsp(40,18) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f0.setValue("errorMessage");
    // /jsp/system/org/sysRole_add.jsp(40,18) name = escape type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f0.setEscape(false);
    int _jspx_eval_s_005fproperty_005f0 = _jspx_th_s_005fproperty_005f0.doStartTag();
    if (_jspx_th_s_005fproperty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fescape_005fnobody.reuse(_jspx_th_s_005fproperty_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fescape_005fnobody.reuse(_jspx_th_s_005fproperty_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fform_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_005fform_005f0 = (org.apache.struts2.views.jsp.ui.FormTag) _005fjspx_005ftagPool_005fs_005fform_0026_005fnamespace_005fmethod_005fid_005faction.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fform_005f0.setParent(null);
    // /jsp/system/org/sysRole_add.jsp(50,2) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setAction("sysRole");
    // /jsp/system/org/sysRole_add.jsp(50,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setId("roleForm");
    // /jsp/system/org/sysRole_add.jsp(50,2) name = method type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setMethod("post");
    // /jsp/system/org/sysRole_add.jsp(50,2) name = namespace type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setNamespace("/system");
    int _jspx_eval_s_005fform_005f0 = _jspx_th_s_005fform_005f0.doStartTag();
    if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fform_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fform_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t<table cellpadding=\"0\" cellspacing=\"0\" width=\"99%\" class=\"formTable\">\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t\t\t\t\t<td class=\"textR\"><font color=\"red\">*</font>角色标识：</td>\r\n");
        out.write("\t\t\t\t  \t<td >\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t  \t</td>\r\n");
        out.write("\t\t\t\t\t<td class=\"textR\"><font color=\"red\">*</font>状态：</td>\r\n");
        out.write("\t\t\t\t\t<td  class=\"sel\">\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_s_005fselect_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("  \t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t\t\t\t  \t<td class=\"textR\"><font color=\"red\">*</font>角色名称：</td>\r\n");
        out.write("\t\t\t\t\t<td colspan=\"3\">\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f1(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t \t</tr>\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t\t\t    \t<td class=\"textR\">描述：</td>\r\n");
        out.write("\t\t\t\t \t<td colspan=\"3\" valign=\"top\">\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_s_005ftextarea_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t \t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t \t\t</table>\r\n");
        out.write(" ");
        int evalDoAfterBody = _jspx_th_s_005fform_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fform_0026_005fnamespace_005fmethod_005fid_005faction.reuse(_jspx_th_s_005fform_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fform_0026_005fnamespace_005fmethod_005fid_005faction.reuse(_jspx_th_s_005fform_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f0 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /jsp/system/org/sysRole_add.jsp(55,6) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setName("form.record.roleCode");
    int _jspx_eval_s_005ftextfield_005f0 = _jspx_th_s_005ftextfield_005f0.doStartTag();
    if (_jspx_th_s_005ftextfield_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftextfield_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftextfield_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fselect_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:select
    org.apache.struts2.views.jsp.ui.SelectTag _jspx_th_s_005fselect_005f0 = (org.apache.struts2.views.jsp.ui.SelectTag) _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005fnobody.get(org.apache.struts2.views.jsp.ui.SelectTag.class);
    _jspx_th_s_005fselect_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fselect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /jsp/system/org/sysRole_add.jsp(59,5) name = list type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setList("codeSets.ROLE_STATUS");
    // /jsp/system/org/sysRole_add.jsp(59,5) name = listKey type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setListKey("value");
    // /jsp/system/org/sysRole_add.jsp(59,5) name = listValue type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setListValue("codeName");
    // /jsp/system/org/sysRole_add.jsp(59,5) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setName("form.record.roleStatus");
    int _jspx_eval_s_005fselect_005f0 = _jspx_th_s_005fselect_005f0.doStartTag();
    if (_jspx_th_s_005fselect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005fnobody.reuse(_jspx_th_s_005fselect_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005fnobody.reuse(_jspx_th_s_005fselect_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f1 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /jsp/system/org/sysRole_add.jsp(65,6) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f1.setName("form.record.roleName");
    int _jspx_eval_s_005ftextfield_005f1 = _jspx_th_s_005ftextfield_005f1.doStartTag();
    if (_jspx_th_s_005ftextfield_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftextfield_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftextfield_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005ftextarea_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textarea
    org.apache.struts2.views.jsp.ui.TextareaTag _jspx_th_s_005ftextarea_005f0 = (org.apache.struts2.views.jsp.ui.TextareaTag) _005fjspx_005ftagPool_005fs_005ftextarea_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.ui.TextareaTag.class);
    _jspx_th_s_005ftextarea_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextarea_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /jsp/system/org/sysRole_add.jsp(71,6) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextarea_005f0.setName("form.record.remark");
    int _jspx_eval_s_005ftextarea_005f0 = _jspx_th_s_005ftextarea_005f0.doStartTag();
    if (_jspx_th_s_005ftextarea_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextarea_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftextarea_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextarea_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftextarea_005f0);
    return false;
  }

  private boolean _jspx_meth_gl_005fbutton_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  gl:button
    com.liusy.core.web.tag.ButtonTag _jspx_th_gl_005fbutton_005f0 = (com.liusy.core.web.tag.ButtonTag) _005fjspx_005ftagPool_005fgl_005fbutton_0026_005fonClick_005fname.get(com.liusy.core.web.tag.ButtonTag.class);
    _jspx_th_gl_005fbutton_005f0.setPageContext(_jspx_page_context);
    _jspx_th_gl_005fbutton_005f0.setParent(null);
    // /jsp/system/org/sysRole_add.jsp(78,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fbutton_005f0.setName("btnAdd");
    // /jsp/system/org/sysRole_add.jsp(78,2) name = onClick type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fbutton_005f0.setOnClick("goSubmit()");
    int _jspx_eval_gl_005fbutton_005f0 = _jspx_th_gl_005fbutton_005f0.doStartTag();
    if (_jspx_eval_gl_005fbutton_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_gl_005fbutton_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_gl_005fbutton_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_gl_005fbutton_005f0.doInitBody();
      }
      do {
        out.write('保');
        out.write('存');
        int evalDoAfterBody = _jspx_th_gl_005fbutton_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_gl_005fbutton_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_gl_005fbutton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fgl_005fbutton_0026_005fonClick_005fname.reuse(_jspx_th_gl_005fbutton_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fgl_005fbutton_0026_005fonClick_005fname.reuse(_jspx_th_gl_005fbutton_005f0);
    return false;
  }

  private boolean _jspx_meth_gl_005fbutton_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  gl:button
    com.liusy.core.web.tag.ButtonTag _jspx_th_gl_005fbutton_005f1 = (com.liusy.core.web.tag.ButtonTag) _005fjspx_005ftagPool_005fgl_005fbutton_0026_005fonClick_005fname.get(com.liusy.core.web.tag.ButtonTag.class);
    _jspx_th_gl_005fbutton_005f1.setPageContext(_jspx_page_context);
    _jspx_th_gl_005fbutton_005f1.setParent(null);
    // /jsp/system/org/sysRole_add.jsp(80,5) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fbutton_005f1.setName("btnCancel");
    // /jsp/system/org/sysRole_add.jsp(80,5) name = onClick type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fbutton_005f1.setOnClick("goCancel()");
    int _jspx_eval_gl_005fbutton_005f1 = _jspx_th_gl_005fbutton_005f1.doStartTag();
    if (_jspx_eval_gl_005fbutton_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_gl_005fbutton_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_gl_005fbutton_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_gl_005fbutton_005f1.doInitBody();
      }
      do {
        out.write('取');
        out.write('消');
        int evalDoAfterBody = _jspx_th_gl_005fbutton_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_gl_005fbutton_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_gl_005fbutton_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fgl_005fbutton_0026_005fonClick_005fname.reuse(_jspx_th_gl_005fbutton_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fgl_005fbutton_0026_005fonClick_005fname.reuse(_jspx_th_gl_005fbutton_005f1);
    return false;
  }

  private boolean _jspx_meth_gl_005fbutton_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  gl:button
    com.liusy.core.web.tag.ButtonTag _jspx_th_gl_005fbutton_005f2 = (com.liusy.core.web.tag.ButtonTag) _005fjspx_005ftagPool_005fgl_005fbutton_0026_005fonClick_005fname.get(com.liusy.core.web.tag.ButtonTag.class);
    _jspx_th_gl_005fbutton_005f2.setPageContext(_jspx_page_context);
    _jspx_th_gl_005fbutton_005f2.setParent(null);
    // /jsp/system/org/sysRole_add.jsp(82,5) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fbutton_005f2.setName("btnReset");
    // /jsp/system/org/sysRole_add.jsp(82,5) name = onClick type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fbutton_005f2.setOnClick("goReset()");
    int _jspx_eval_gl_005fbutton_005f2 = _jspx_th_gl_005fbutton_005f2.doStartTag();
    if (_jspx_eval_gl_005fbutton_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_gl_005fbutton_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_gl_005fbutton_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_gl_005fbutton_005f2.doInitBody();
      }
      do {
        out.write('重');
        out.write('置');
        int evalDoAfterBody = _jspx_th_gl_005fbutton_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_gl_005fbutton_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_gl_005fbutton_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fgl_005fbutton_0026_005fonClick_005fname.reuse(_jspx_th_gl_005fbutton_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fgl_005fbutton_0026_005fonClick_005fname.reuse(_jspx_th_gl_005fbutton_005f2);
    return false;
  }
}
