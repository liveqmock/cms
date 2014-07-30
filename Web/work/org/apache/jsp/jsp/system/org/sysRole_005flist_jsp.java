package org.apache.jsp.jsp.system.org;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sysRole_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/common/resizeList1.jsp");
    _jspx_dependants.add("/common/dialog.jsp");
    _jspx_dependants.add("/WEB-INF/tag/gl-tag.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fform_0026_005fnamespace_005fmethod_005fid_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fgl_005fbutton_0026_005fonClick_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fgl_005fbutton_0026_005fstyleClass_005fonClick_005ficon;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fgl_005fgrid_0026_005fstyleClass_005fproperty_005fpage_005fid_005fform_005fcellSpacing_005fcellPadding;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fform_0026_005fnamespace_005fmethod_005fid_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fgl_005fbutton_0026_005fonClick_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fgl_005fbutton_0026_005fstyleClass_005fonClick_005ficon = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fgl_005fgrid_0026_005fstyleClass_005fproperty_005fpage_005fid_005fform_005fcellSpacing_005fcellPadding = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fform_0026_005fnamespace_005fmethod_005fid_005faction.release();
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005fnobody.release();
    _005fjspx_005ftagPool_005fgl_005fbutton_0026_005fonClick_005fname.release();
    _005fjspx_005ftagPool_005fgl_005fbutton_0026_005fstyleClass_005fonClick_005ficon.release();
    _005fjspx_005ftagPool_005fgl_005fgrid_0026_005fstyleClass_005fproperty_005fpage_005fid_005fform_005fcellSpacing_005fcellPadding.release();
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
      out.write("\r\n");
      out.write("\r\n");

   String path = request.getContextPath();
	String CONTEXT_PATH = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("   <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(CONTEXT_PATH);
      out.write("dhtmlx/dhtmlx.css\" />\r\n");
      out.write("   <script src=\"");
      out.print(CONTEXT_PATH);
      out.write("dhtmlx/dhtmlx.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(CONTEXT_PATH);
      out.write("css/main.css\" />\r\n");
      out.write("\t <script language=\"javascript\" src=\"");
      out.print( CONTEXT_PATH );
      out.write("js/ctrl_util.js\"></script>\r\n");
      out.write("\t <script language=\"javascript\" src=\"");
      out.print( CONTEXT_PATH );
      out.write("js/date_validate.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<script language=\"javascript\">\r\n");
      out.write("\t\tvar contextpath = \"");
      out.print(CONTEXT_PATH);
      out.write("\";\r\n");
      out.write("\t\tvar hyperlink = \"../system/sysRole.do\";\r\n");
      out.write("\t\tvar fulllink = contextpath + \"system/sysRole.do\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar imagePath=\"");
      out.print(CONTEXT_PATH);
      out.write("dhtmlx/imgs/\";\r\n");
      out.write("\r\n");
      out.write("\t\t// 用于浏览该角色下的用户\r\n");
      out.write("\t\tfunction view(id) {\r\n");
      out.write("\t\t\teditMode=\"VIEW\";\r\n");
      out.write("\t\t\topenWindow(\"查看角色\", fulllink + \"?action=view&ids=\" + id, 600, 400);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t//用于浏览配置给该角色的权限\r\n");
      out.write("\t\tfunction viewRight(id) {\r\n");
      out.write("\t\t\teditMode=\"RIGHT\";\r\n");
      out.write("\t\t\topenWindow(\"查看权限\", fulllink + \"?action=viewRight&ids=\" + id, 500, 300);\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("   function goRights()  {\r\n");
      out.write("\t    var id = findSelected(\"分配\",role_grid);\r\n");
      out.write("\t    if(id == \"\") return;\r\n");
      out.write("\r\n");
      out.write("\t    var loader = dhtmlxAjax.postSync(fulllink+'?action=CheckRole&ids='+id, \"\");\r\n");
      out.write("\t    rights(loader,id);\r\n");
      out.write("   }\r\n");
      out.write("\r\n");
      out.write("   function rights(loader,id)  {\r\n");
      out.write("   \t  var str=\"\";\r\n");
      out.write("   \t  if (loader.xmlDoc.responseXML != null) str = loader.xmlDoc.responseText;\r\n");
      out.write("   \t  if(str==\"ERROR\") {\r\n");
      out.write("   \t  \t alert(\"系统出错。\");\r\n");
      out.write("   \t     return;\r\n");
      out.write("   \t  }\r\n");
      out.write("   \t  else if(str==\"Y\"){\r\n");
      out.write("   \t  \t alert(\"系统角色不能分配权限。\");\r\n");
      out.write("   \t     return;\r\n");
      out.write("   \t  }\r\n");
      out.write("      \r\n");
      out.write("      //var url_link=fulllink+'?action=rights&ids='+id;\r\n");
      out.write("      var url_link=contextpath+'system/sysReource.do?action=roleRights&id='+id;\r\n");
      out.write("\t  editMode=\"RIGHTS\";\r\n");
      out.write("      openWindow(\"分配角色权限\",url_link,300,450);\t\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("\t\tfunction goDel() {\r\n");
      out.write("\t\t\tvar id = findMultiSelected(\"删除\",role_grid);\r\n");
      out.write("\t\t\tif(id == \"\") return;\r\n");
      out.write("\t\t\tvar res = confirm(\"是否真的要删除?\");\r\n");
      out.write("\t\t\tif(res == true) {\r\n");
      out.write("\t\t\t\tvar data=ajaxSubmit(fulllink+\"?action=delete&ids=\" + id,\"roleForm\");\r\n");
      out.write("\t\t \t\tif(data.exit>0){\r\n");
      out.write("\t\t \t\t\t  alert(data.message);\r\n");
      out.write("\t\t \t\t\t  return;\r\n");
      out.write("\t\t \t\t}\r\n");
      out.write("\t\t \t\telse {\t  \r\n");
      out.write("\t\t \t\t\tgoSearch();\r\n");
      out.write("\t\t \t\t} \r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction goModify() {\r\n");
      out.write("\t\t\tvar id = findSelected(\"修改\",role_grid);\r\n");
      out.write("\t\t\tif(id == \"\") return;\r\n");
      out.write("    \t\tvar urlink=fulllink+'?action=EDIT&ids='+id;\r\n");
      out.write("    \t\teditMode=\"EDIT\";\r\n");
      out.write("\t\t\topenWindow(\"修改角色\", urlink, 500, 250);\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction goStart() {\r\n");
      out.write("\t\t\tvar id = findMultiSelected(\"启用\",role_grid);\r\n");
      out.write("\t\t\tif(id == \"\") return;\r\n");
      out.write("\t\t\tvar data=ajaxSubmit(fulllink+\"?action=start&ids=\" + id,\"roleForm\");\r\n");
      out.write("\t \t\tif(data.exit>0){\r\n");
      out.write("\t \t\t\t  alert(data.message);\r\n");
      out.write("\t \t\t\t  return;\r\n");
      out.write("\t \t\t}\r\n");
      out.write("\t \t\telse {\t  \r\n");
      out.write("\t \t\t\tgoSearch();\r\n");
      out.write("\t \t\t}   \r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction goStop() {\r\n");
      out.write("\t\t\tvar id = findMultiSelected(\"暂停\",role_grid);\r\n");
      out.write("\t\t\tif(id == \"\") return;\r\n");
      out.write("\t\t\tvar data=ajaxSubmit(fulllink+\"?action=stop&ids=\" + id,\"roleForm\");\r\n");
      out.write("\t \t\tif(data.exit>0){\r\n");
      out.write("\t \t\t\t  alert(data.message);\r\n");
      out.write("\t \t\t\t  return;\r\n");
      out.write("\t \t\t}\r\n");
      out.write("\t \t\telse {\t  \r\n");
      out.write("\t \t\t\tgoSearch();\r\n");
      out.write("\t \t\t}   \r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction goAdd() {\r\n");
      out.write("\t\t\teditMode=\"ADD\";\r\n");
      out.write("\t\t\topenWindow(\"添加角色\", fulllink+'?action=ADD', 500, 250);\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction renew() {\r\n");
      out.write("\t\t\tvar order = getElement(\"query.order\");                  order.value=\"\";\r\n");
      out.write("\t\t\tvar desc =  getElement(\"query.orderDirection\");         desc.value=\"\";\r\n");
      out.write("\t\t\tvar pn =    getElement(\"query.pageNumber\");             pn.value=\"1\";\r\n");
      out.write("\t\t\tvar ps =    getElement(\"query.pageSize\");               if(ps!=null) ps.value=\"10\";\r\n");
      out.write("\t\t\tvar v0 =    getElement(\"query.parameters.roleCode\");    v0.value=\"\";\r\n");
      out.write("\t\t\tvar v1 =    getElement(\"query.parameters.roleName\");    v1.value=\"\";\r\n");
      out.write("\t\t\tvar v2 =    getElement(\"query.parameters.roleStatus\");  v2.value=\"\";\r\n");
      out.write("\t\t\tgoSearch();\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction closedialog(ret) {\r\n");
      out.write("\t\t\tdhxWins.window(winName).close();\r\n");
      out.write("\t\t\tif(ret=='true') {\r\n");
      out.write("\t\t\t\tif(editMode==\"RIGHTS\") {\r\n");
      out.write("\t\t\t\t\talert(\"角色权限已经被修改。\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\t\r\n");
      out.write("\t\t\teditMode=\"\";\r\n");
      out.write("\t\t\tgoSearch();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction init(){ renew(); }\r\n");
      out.write("\r\n");
      out.write("\t\tfunction goSearch(){ goroleGridSearch(); }\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("   html, body {width:100%; height:100%;}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body onload=\"init()\">\r\n");
      out.write("<div class=\"special-padding\"  id=\"mainDiv\">  \r\n");
      if (_jspx_meth_s_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    if(window.addEventListener) {\r\n");
      out.write(" \t     window.addEventListener(\"resize\",goResize,false); \r\n");
      out.write("    }\r\n");
      out.write("    else {\r\n");
      out.write(" \t     window.attachEvent('onresize',goResize);\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("\t var mDiv=window.document.getElementById('mainDiv');\r\n");
      out.write("\t var tDiv=window.document.getElementById('tbl');\r\n");
      out.write("\t var btn=window.document.getElementById('btn');\r\n");
      out.write("\t    \r\n");
      out.write("    function goResize(){\r\n");
      out.write("   \t var he;\r\n");
      out.write("\t   if(isIE()) he=window.document.body.offsetHeight; else he=window.innerHeight;\r\n");
      out.write("\r\n");
      out.write("\t\t mDiv.style.height=he-36+\"px\";\r\n");
      out.write("\t\t gDiv.style.height=mDiv.offsetHeight-btn.offsetHeight-btn.offsetTop+1+\"px\";\r\n");
      out.write("\t\t tDiv.style.width=mDiv.offsetWidth-4+\"px\";\r\n");
      out.write("\t\t gDiv.style.width=mDiv.offsetWidth-6+\"px\";\r\n");
      out.write("\t    btn.style.width=tDiv.offsetWidth+\"px\";\r\n");
      out.write("    }\r\n");
      out.write("    goResize();   \r\n");
      out.write("</script> \r\n");
      out.write('\r');
      out.write('\n');
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
      out.write("\r\n");
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

  private boolean _jspx_meth_s_005fform_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_005fform_005f0 = (org.apache.struts2.views.jsp.ui.FormTag) _005fjspx_005ftagPool_005fs_005fform_0026_005fnamespace_005fmethod_005fid_005faction.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fform_005f0.setParent(null);
    // /jsp/system/org/sysRole_list.jsp(151,0) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setAction("sysRole");
    // /jsp/system/org/sysRole_list.jsp(151,0) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setId("roleForm");
    // /jsp/system/org/sysRole_list.jsp(151,0) name = method type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setMethod("post");
    // /jsp/system/org/sysRole_list.jsp(151,0) name = namespace type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setNamespace("/system");
    int _jspx_eval_s_005fform_005f0 = _jspx_th_s_005fform_005f0.doStartTag();
    if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fform_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fform_005f0.doInitBody();
      }
      do {
        out.write('\r');
        out.write('\n');
        if (_jspx_meth_s_005fhidden_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        if (_jspx_meth_s_005fhidden_005f1(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        if (_jspx_meth_s_005fhidden_005f2(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        if (_jspx_meth_s_005fhidden_005f3(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        if (_jspx_meth_s_005fhidden_005f4(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t<table width=\"100%\" id=\"tbl\" cellpadding=\"0\" cellspacing=\"0\" class=\"formTable\">\r\n");
        out.write("\t<tbody>\r\n");
        out.write("\t\t<tr>\r\n");
        out.write("\t\t\t<td width=10% class=\"textR\">角色标识：</td>\r\n");
        out.write("\t\t\t<td width=15%>\r\n");
        out.write(" \t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write(" \r\n");
        out.write("\t\t\t</td>\r\n");
        out.write("\t\t\t<td width=10% class=\"textR\">角色名称：</td>\r\n");
        out.write("\t\t\t<td width=23%>\r\n");
        out.write(" \t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f1(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write(" \r\n");
        out.write("\t\t\t</td>\r\n");
        out.write("\t\t\t<td width=10% class=\"textR\">是否启用：</td>\r\n");
        out.write("\t\t\t<td width=15% class=\"sel\">\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_s_005fselect_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t</td>\r\n");
        out.write("\t\t\t<td width=\"*\" class=\"textC\">\r\n");
        out.write("\t\t             ");
        if (_jspx_meth_gl_005fbutton_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t      &nbsp;\r\n");
        out.write("\t\t\t      ");
        if (_jspx_meth_gl_005fbutton_005f1(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t</td>\r\n");
        out.write("\t\t</tr>\r\n");
        out.write("\t</tbody>\r\n");
        out.write("\t</table>\r\n");
        out.write("\t<div class=\"gap8\">&nbsp;</div>  \r\n");
        out.write("<table id=\"btn\" width=\"100%\" cellspacing=\"1\" cellpadding=\"1\" class=\"controlTable\">\r\n");
        out.write("\t<tr>\r\n");
        out.write("\t\t<td>\r\n");
        out.write("\t\t\t\t   ");
        if (_jspx_meth_gl_005fbutton_005f2(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t      ");
        if (_jspx_meth_gl_005fbutton_005f3(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t      ");
        if (_jspx_meth_gl_005fbutton_005f4(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t      ");
        if (_jspx_meth_gl_005fbutton_005f5(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t      ");
        if (_jspx_meth_gl_005fbutton_005f6(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t      ");
        if (_jspx_meth_gl_005fbutton_005f7(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t</td>\r\n");
        out.write("\t</tr>\t\r\n");
        out.write("</table>\r\n");
        if (_jspx_meth_gl_005fgrid_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
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

  private boolean _jspx_meth_s_005fhidden_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f0 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /jsp/system/org/sysRole_list.jsp(152,0) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f0.setName("query.order");
    int _jspx_eval_s_005fhidden_005f0 = _jspx_th_s_005fhidden_005f0.doStartTag();
    if (_jspx_th_s_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fnobody.reuse(_jspx_th_s_005fhidden_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fnobody.reuse(_jspx_th_s_005fhidden_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f1 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /jsp/system/org/sysRole_list.jsp(153,0) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f1.setName("query.orderDirection");
    int _jspx_eval_s_005fhidden_005f1 = _jspx_th_s_005fhidden_005f1.doStartTag();
    if (_jspx_th_s_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fnobody.reuse(_jspx_th_s_005fhidden_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fnobody.reuse(_jspx_th_s_005fhidden_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f2 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /jsp/system/org/sysRole_list.jsp(154,0) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f2.setName("query.pageNumber");
    int _jspx_eval_s_005fhidden_005f2 = _jspx_th_s_005fhidden_005f2.doStartTag();
    if (_jspx_th_s_005fhidden_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fnobody.reuse(_jspx_th_s_005fhidden_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fnobody.reuse(_jspx_th_s_005fhidden_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f3 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f3.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /jsp/system/org/sysRole_list.jsp(155,0) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f3.setName("query.recordCount");
    int _jspx_eval_s_005fhidden_005f3 = _jspx_th_s_005fhidden_005f3.doStartTag();
    if (_jspx_th_s_005fhidden_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fnobody.reuse(_jspx_th_s_005fhidden_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fnobody.reuse(_jspx_th_s_005fhidden_005f3);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f4 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f4.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /jsp/system/org/sysRole_list.jsp(156,0) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f4.setName("query.pageCount");
    int _jspx_eval_s_005fhidden_005f4 = _jspx_th_s_005fhidden_005f4.doStartTag();
    if (_jspx_th_s_005fhidden_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fnobody.reuse(_jspx_th_s_005fhidden_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fnobody.reuse(_jspx_th_s_005fhidden_005f4);
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
    // /jsp/system/org/sysRole_list.jsp(162,5) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setName("query.parameters.roleCode");
    int _jspx_eval_s_005ftextfield_005f0 = _jspx_th_s_005ftextfield_005f0.doStartTag();
    if (_jspx_th_s_005ftextfield_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftextfield_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftextfield_005f0);
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
    // /jsp/system/org/sysRole_list.jsp(166,5) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f1.setName("query.parameters.roleName");
    int _jspx_eval_s_005ftextfield_005f1 = _jspx_th_s_005ftextfield_005f1.doStartTag();
    if (_jspx_th_s_005ftextfield_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftextfield_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftextfield_005f1);
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
    // /jsp/system/org/sysRole_list.jsp(170,4) name = list type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setList("codeSets.ROLE_STATUS");
    // /jsp/system/org/sysRole_list.jsp(170,4) name = listKey type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setListKey("value");
    // /jsp/system/org/sysRole_list.jsp(170,4) name = listValue type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setListValue("codeName");
    // /jsp/system/org/sysRole_list.jsp(170,4) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setName("query.parameters.roleStatus");
    int _jspx_eval_s_005fselect_005f0 = _jspx_th_s_005fselect_005f0.doStartTag();
    if (_jspx_th_s_005fselect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005fnobody.reuse(_jspx_th_s_005fselect_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005fnobody.reuse(_jspx_th_s_005fselect_005f0);
    return false;
  }

  private boolean _jspx_meth_gl_005fbutton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  gl:button
    com.liusy.core.web.tag.ButtonTag _jspx_th_gl_005fbutton_005f0 = (com.liusy.core.web.tag.ButtonTag) _005fjspx_005ftagPool_005fgl_005fbutton_0026_005fonClick_005fname.get(com.liusy.core.web.tag.ButtonTag.class);
    _jspx_th_gl_005fbutton_005f0.setPageContext(_jspx_page_context);
    _jspx_th_gl_005fbutton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /jsp/system/org/sysRole_list.jsp(173,15) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fbutton_005f0.setName("btnQuery");
    // /jsp/system/org/sysRole_list.jsp(173,15) name = onClick type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fbutton_005f0.setOnClick("goSearch()");
    int _jspx_eval_gl_005fbutton_005f0 = _jspx_th_gl_005fbutton_005f0.doStartTag();
    if (_jspx_eval_gl_005fbutton_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_gl_005fbutton_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_gl_005fbutton_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_gl_005fbutton_005f0.doInitBody();
      }
      do {
        out.write('查');
        out.write('询');
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

  private boolean _jspx_meth_gl_005fbutton_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  gl:button
    com.liusy.core.web.tag.ButtonTag _jspx_th_gl_005fbutton_005f1 = (com.liusy.core.web.tag.ButtonTag) _005fjspx_005ftagPool_005fgl_005fbutton_0026_005fonClick_005fname.get(com.liusy.core.web.tag.ButtonTag.class);
    _jspx_th_gl_005fbutton_005f1.setPageContext(_jspx_page_context);
    _jspx_th_gl_005fbutton_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /jsp/system/org/sysRole_list.jsp(175,9) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fbutton_005f1.setName("btnRefresh");
    // /jsp/system/org/sysRole_list.jsp(175,9) name = onClick type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fbutton_005f1.setOnClick("renew()");
    int _jspx_eval_gl_005fbutton_005f1 = _jspx_th_gl_005fbutton_005f1.doStartTag();
    if (_jspx_eval_gl_005fbutton_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_gl_005fbutton_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_gl_005fbutton_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_gl_005fbutton_005f1.doInitBody();
      }
      do {
        out.write('重');
        out.write('置');
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

  private boolean _jspx_meth_gl_005fbutton_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  gl:button
    com.liusy.core.web.tag.ButtonTag _jspx_th_gl_005fbutton_005f2 = (com.liusy.core.web.tag.ButtonTag) _005fjspx_005ftagPool_005fgl_005fbutton_0026_005fstyleClass_005fonClick_005ficon.get(com.liusy.core.web.tag.ButtonTag.class);
    _jspx_th_gl_005fbutton_005f2.setPageContext(_jspx_page_context);
    _jspx_th_gl_005fbutton_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /jsp/system/org/sysRole_list.jsp(184,7) name = styleClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fbutton_005f2.setStyleClass("sbuBtnStyle");
    // /jsp/system/org/sysRole_list.jsp(184,7) name = icon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fbutton_005f2.setIcon("addIcon");
    // /jsp/system/org/sysRole_list.jsp(184,7) name = onClick type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fbutton_005f2.setOnClick("goAdd()");
    int _jspx_eval_gl_005fbutton_005f2 = _jspx_th_gl_005fbutton_005f2.doStartTag();
    if (_jspx_eval_gl_005fbutton_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_gl_005fbutton_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_gl_005fbutton_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_gl_005fbutton_005f2.doInitBody();
      }
      do {
        out.write('增');
        out.write('加');
        int evalDoAfterBody = _jspx_th_gl_005fbutton_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_gl_005fbutton_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_gl_005fbutton_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fgl_005fbutton_0026_005fstyleClass_005fonClick_005ficon.reuse(_jspx_th_gl_005fbutton_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fgl_005fbutton_0026_005fstyleClass_005fonClick_005ficon.reuse(_jspx_th_gl_005fbutton_005f2);
    return false;
  }

  private boolean _jspx_meth_gl_005fbutton_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  gl:button
    com.liusy.core.web.tag.ButtonTag _jspx_th_gl_005fbutton_005f3 = (com.liusy.core.web.tag.ButtonTag) _005fjspx_005ftagPool_005fgl_005fbutton_0026_005fstyleClass_005fonClick_005ficon.get(com.liusy.core.web.tag.ButtonTag.class);
    _jspx_th_gl_005fbutton_005f3.setPageContext(_jspx_page_context);
    _jspx_th_gl_005fbutton_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /jsp/system/org/sysRole_list.jsp(185,9) name = styleClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fbutton_005f3.setStyleClass("sbuBtnStyle");
    // /jsp/system/org/sysRole_list.jsp(185,9) name = icon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fbutton_005f3.setIcon("subIcon");
    // /jsp/system/org/sysRole_list.jsp(185,9) name = onClick type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fbutton_005f3.setOnClick("goModify()");
    int _jspx_eval_gl_005fbutton_005f3 = _jspx_th_gl_005fbutton_005f3.doStartTag();
    if (_jspx_eval_gl_005fbutton_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_gl_005fbutton_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_gl_005fbutton_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_gl_005fbutton_005f3.doInitBody();
      }
      do {
        out.write('修');
        out.write('改');
        int evalDoAfterBody = _jspx_th_gl_005fbutton_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_gl_005fbutton_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_gl_005fbutton_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fgl_005fbutton_0026_005fstyleClass_005fonClick_005ficon.reuse(_jspx_th_gl_005fbutton_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fgl_005fbutton_0026_005fstyleClass_005fonClick_005ficon.reuse(_jspx_th_gl_005fbutton_005f3);
    return false;
  }

  private boolean _jspx_meth_gl_005fbutton_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  gl:button
    com.liusy.core.web.tag.ButtonTag _jspx_th_gl_005fbutton_005f4 = (com.liusy.core.web.tag.ButtonTag) _005fjspx_005ftagPool_005fgl_005fbutton_0026_005fstyleClass_005fonClick_005ficon.get(com.liusy.core.web.tag.ButtonTag.class);
    _jspx_th_gl_005fbutton_005f4.setPageContext(_jspx_page_context);
    _jspx_th_gl_005fbutton_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /jsp/system/org/sysRole_list.jsp(186,9) name = styleClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fbutton_005f4.setStyleClass("sbuBtnStyle");
    // /jsp/system/org/sysRole_list.jsp(186,9) name = icon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fbutton_005f4.setIcon("delIcon");
    // /jsp/system/org/sysRole_list.jsp(186,9) name = onClick type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fbutton_005f4.setOnClick("goDel()");
    int _jspx_eval_gl_005fbutton_005f4 = _jspx_th_gl_005fbutton_005f4.doStartTag();
    if (_jspx_eval_gl_005fbutton_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_gl_005fbutton_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_gl_005fbutton_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_gl_005fbutton_005f4.doInitBody();
      }
      do {
        out.write('删');
        out.write('除');
        int evalDoAfterBody = _jspx_th_gl_005fbutton_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_gl_005fbutton_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_gl_005fbutton_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fgl_005fbutton_0026_005fstyleClass_005fonClick_005ficon.reuse(_jspx_th_gl_005fbutton_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fgl_005fbutton_0026_005fstyleClass_005fonClick_005ficon.reuse(_jspx_th_gl_005fbutton_005f4);
    return false;
  }

  private boolean _jspx_meth_gl_005fbutton_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  gl:button
    com.liusy.core.web.tag.ButtonTag _jspx_th_gl_005fbutton_005f5 = (com.liusy.core.web.tag.ButtonTag) _005fjspx_005ftagPool_005fgl_005fbutton_0026_005fstyleClass_005fonClick_005ficon.get(com.liusy.core.web.tag.ButtonTag.class);
    _jspx_th_gl_005fbutton_005f5.setPageContext(_jspx_page_context);
    _jspx_th_gl_005fbutton_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /jsp/system/org/sysRole_list.jsp(187,9) name = styleClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fbutton_005f5.setStyleClass("sbuBtnStyle");
    // /jsp/system/org/sysRole_list.jsp(187,9) name = icon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fbutton_005f5.setIcon("stopIcon");
    // /jsp/system/org/sysRole_list.jsp(187,9) name = onClick type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fbutton_005f5.setOnClick("goStop()");
    int _jspx_eval_gl_005fbutton_005f5 = _jspx_th_gl_005fbutton_005f5.doStartTag();
    if (_jspx_eval_gl_005fbutton_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_gl_005fbutton_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_gl_005fbutton_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_gl_005fbutton_005f5.doInitBody();
      }
      do {
        out.write('暂');
        out.write('停');
        int evalDoAfterBody = _jspx_th_gl_005fbutton_005f5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_gl_005fbutton_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_gl_005fbutton_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fgl_005fbutton_0026_005fstyleClass_005fonClick_005ficon.reuse(_jspx_th_gl_005fbutton_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fgl_005fbutton_0026_005fstyleClass_005fonClick_005ficon.reuse(_jspx_th_gl_005fbutton_005f5);
    return false;
  }

  private boolean _jspx_meth_gl_005fbutton_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  gl:button
    com.liusy.core.web.tag.ButtonTag _jspx_th_gl_005fbutton_005f6 = (com.liusy.core.web.tag.ButtonTag) _005fjspx_005ftagPool_005fgl_005fbutton_0026_005fstyleClass_005fonClick_005ficon.get(com.liusy.core.web.tag.ButtonTag.class);
    _jspx_th_gl_005fbutton_005f6.setPageContext(_jspx_page_context);
    _jspx_th_gl_005fbutton_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /jsp/system/org/sysRole_list.jsp(188,9) name = styleClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fbutton_005f6.setStyleClass("sbuBtnStyle");
    // /jsp/system/org/sysRole_list.jsp(188,9) name = icon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fbutton_005f6.setIcon("playIcon");
    // /jsp/system/org/sysRole_list.jsp(188,9) name = onClick type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fbutton_005f6.setOnClick("goStart()");
    int _jspx_eval_gl_005fbutton_005f6 = _jspx_th_gl_005fbutton_005f6.doStartTag();
    if (_jspx_eval_gl_005fbutton_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_gl_005fbutton_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_gl_005fbutton_005f6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_gl_005fbutton_005f6.doInitBody();
      }
      do {
        out.write('启');
        out.write('用');
        int evalDoAfterBody = _jspx_th_gl_005fbutton_005f6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_gl_005fbutton_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_gl_005fbutton_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fgl_005fbutton_0026_005fstyleClass_005fonClick_005ficon.reuse(_jspx_th_gl_005fbutton_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fgl_005fbutton_0026_005fstyleClass_005fonClick_005ficon.reuse(_jspx_th_gl_005fbutton_005f6);
    return false;
  }

  private boolean _jspx_meth_gl_005fbutton_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  gl:button
    com.liusy.core.web.tag.ButtonTag _jspx_th_gl_005fbutton_005f7 = (com.liusy.core.web.tag.ButtonTag) _005fjspx_005ftagPool_005fgl_005fbutton_0026_005fstyleClass_005fonClick_005ficon.get(com.liusy.core.web.tag.ButtonTag.class);
    _jspx_th_gl_005fbutton_005f7.setPageContext(_jspx_page_context);
    _jspx_th_gl_005fbutton_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /jsp/system/org/sysRole_list.jsp(189,9) name = styleClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fbutton_005f7.setStyleClass("sbuBtnStyle");
    // /jsp/system/org/sysRole_list.jsp(189,9) name = icon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fbutton_005f7.setIcon("assigningPermissions");
    // /jsp/system/org/sysRole_list.jsp(189,9) name = onClick type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fbutton_005f7.setOnClick("goRights()");
    int _jspx_eval_gl_005fbutton_005f7 = _jspx_th_gl_005fbutton_005f7.doStartTag();
    if (_jspx_eval_gl_005fbutton_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_gl_005fbutton_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_gl_005fbutton_005f7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_gl_005fbutton_005f7.doInitBody();
      }
      do {
        out.write("分配权限");
        int evalDoAfterBody = _jspx_th_gl_005fbutton_005f7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_gl_005fbutton_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_gl_005fbutton_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fgl_005fbutton_0026_005fstyleClass_005fonClick_005ficon.reuse(_jspx_th_gl_005fbutton_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fgl_005fbutton_0026_005fstyleClass_005fonClick_005ficon.reuse(_jspx_th_gl_005fbutton_005f7);
    return false;
  }

  private boolean _jspx_meth_gl_005fgrid_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  gl:grid
    com.liusy.core.web.tag.GridTag _jspx_th_gl_005fgrid_005f0 = (com.liusy.core.web.tag.GridTag) _005fjspx_005ftagPool_005fgl_005fgrid_0026_005fstyleClass_005fproperty_005fpage_005fid_005fform_005fcellSpacing_005fcellPadding.get(com.liusy.core.web.tag.GridTag.class);
    _jspx_th_gl_005fgrid_005f0.setPageContext(_jspx_page_context);
    _jspx_th_gl_005fgrid_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /jsp/system/org/sysRole_list.jsp(193,0) name = styleClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fgrid_005f0.setStyleClass("pageTurn");
    // /jsp/system/org/sysRole_list.jsp(193,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fgrid_005f0.setId("role");
    // /jsp/system/org/sysRole_list.jsp(193,0) name = page type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fgrid_005f0.setPage("true");
    // /jsp/system/org/sysRole_list.jsp(193,0) name = form type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fgrid_005f0.setForm("roleForm");
    // /jsp/system/org/sysRole_list.jsp(193,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fgrid_005f0.setProperty("query");
    // /jsp/system/org/sysRole_list.jsp(193,0) name = cellPadding type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fgrid_005f0.setCellPadding("0");
    // /jsp/system/org/sysRole_list.jsp(193,0) name = cellSpacing type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fgrid_005f0.setCellSpacing("0");
    int _jspx_eval_gl_005fgrid_005f0 = _jspx_th_gl_005fgrid_005f0.doStartTag();
    if (_jspx_eval_gl_005fgrid_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_gl_005fgrid_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_gl_005fgrid_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_gl_005fgrid_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("   var grid = new dhtmlXGridObject();\r\n");
        out.write("   grid.setImagePath(imagePath);\r\n");
        out.write("   var headAlign=[tLeft,tCenter,tCenter,tLeft,tCenter];\r\n");
        out.write("   grid.setHeader(\"#master_checkbox,角色标识,角色名称,描述,是否启用\",null,headAlign);\r\n");
        out.write("   grid.setInitWidthsP(\"3,15,25,47,10\");\r\n");
        out.write("   grid.setColAlign(\"center,center,center,left,center\");\r\n");
        out.write("   grid.setColTypes(\"ch,ro,link,ro,ro\");\r\n");
        out.write("   grid.setColSorting(\"na,str,str,str,str\");\r\n");
        out.write("   gridSort(\"false,true,true,false,true\");\r\n");
        out.write("   grid.init();\r\n");
        out.write("   grid.setSkin(\"dhx_skyblue\");\r\n");
        int evalDoAfterBody = _jspx_th_gl_005fgrid_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_gl_005fgrid_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_gl_005fgrid_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fgl_005fgrid_0026_005fstyleClass_005fproperty_005fpage_005fid_005fform_005fcellSpacing_005fcellPadding.reuse(_jspx_th_gl_005fgrid_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fgl_005fgrid_0026_005fstyleClass_005fproperty_005fpage_005fid_005fform_005fcellSpacing_005fcellPadding.reuse(_jspx_th_gl_005fgrid_005f0);
    return false;
  }
}
