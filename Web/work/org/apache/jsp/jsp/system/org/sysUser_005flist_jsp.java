package org.apache.jsp.jsp.system.org;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sysUser_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/common/dialog.jsp");
    _jspx_dependants.add("/common/resizeList.jsp");
    _jspx_dependants.add("/WEB-INF/tag/gl-tag.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fescape_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fform_0026_005fnamespace_005fmethod_005fid_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fgl_005fbutton_0026_005fonClick_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fgl_005fbutton_0026_005fstyleClass_005fonClick_005ficon;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fgl_005fbutton_0026_005fstyleClass_005fonClick_005fid_005ficon;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fgl_005fpager_0026_005fstyleClass_005fproperty_005fid_005fcellSpacing_005fcellPadding_005faction_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fescape_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fform_0026_005fnamespace_005fmethod_005fid_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fgl_005fbutton_0026_005fonClick_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fgl_005fbutton_0026_005fstyleClass_005fonClick_005ficon = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fgl_005fbutton_0026_005fstyleClass_005fonClick_005fid_005ficon = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fgl_005fpager_0026_005fstyleClass_005fproperty_005fid_005fcellSpacing_005fcellPadding_005faction_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fescape_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fform_0026_005fnamespace_005fmethod_005fid_005faction.release();
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005fnobody.release();
    _005fjspx_005ftagPool_005fgl_005fbutton_0026_005fonClick_005fname.release();
    _005fjspx_005ftagPool_005fgl_005fbutton_0026_005fstyleClass_005fonClick_005ficon.release();
    _005fjspx_005ftagPool_005fgl_005fbutton_0026_005fstyleClass_005fonClick_005fid_005ficon.release();
    _005fjspx_005ftagPool_005fgl_005fpager_0026_005fstyleClass_005fproperty_005fid_005fcellSpacing_005fcellPadding_005faction_005fnobody.release();
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
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(CONTEXT_PATH);
      out.write("dhtmlx/dhtmlx.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" src=\"");
      out.print(CONTEXT_PATH);
      out.write("css/dhtmlx_skin/dhtmlx_custom.css\"/>\r\n");
      out.write("<script src=\"");
      out.print(CONTEXT_PATH);
      out.write("dhtmlx/dhtmlx.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(CONTEXT_PATH);
      out.write("css/main.css\" />\r\n");
      out.write("<script language=\"javascript\" src=\"");
      out.print(CONTEXT_PATH);
      out.write("js/ctrl_util.js\"></script>\r\n");
      out.write("<script language=\"javascript\" src=\"");
      out.print(CONTEXT_PATH);
      out.write("js/date_validate.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script language=\"javascript\">  \r\n");
      out.write("var contextpath = \"");
      out.print(CONTEXT_PATH);
      out.write("\";\t\r\n");
      out.write("var hyperlink = \"../system/sysUser.do\";\t\r\n");
      out.write("var fulllink = contextpath + \"system/sysUser.do\";\t\t\r\n");
      out.write("      \r\n");
      out.write("function view(id) {\r\n");
      out.write("\t var eBtn=$$('editUser');\r\n");
      out.write("\t if(eBtn!=null) {\r\n");
      out.write("\t\t modify(id);\r\n");
      out.write("\t } \r\n");
      out.write("\t else {\r\n");
      out.write("       var url_link=fulllink+'?action=view&ids='+id;\r\n");
      out.write("       editMode=\"VIEW\";\r\n");
      out.write("       openWindow(\"查看用户\",url_link,700,370);\r\n");
      out.write("\t }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function goDel()  {\r\n");
      out.write("\t  var id = findMultiSelected(\"删除\",mygrid);\r\n");
      out.write("\t  if(id == \"\") return;\r\n");
      out.write("\t  var res = confirm(\"是否真的要删除?\");\r\n");
      out.write("\t  if(res == true) {\r\n");
      out.write("      document.forms[0].action = hyperlink + \"?action=delete&ids=\" + id;\r\n");
      out.write("      document.forms[0].target = \"_self\";\r\n");
      out.write("      document.forms[0].submit();\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function goChangePwd()  {\r\n");
      out.write("\t  var id = findSelected(\"重置密码\",mygrid);\r\n");
      out.write("\t  if(id == \"\") return;\r\n");
      out.write("    var url_link=fulllink+'?action=PWD&ids='+id;\r\n");
      out.write("    editMode=\"PWD\";\r\n");
      out.write("    openWindow(\"修改密码\",url_link,300,150);\t  \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function goRights()  {\r\n");
      out.write("\t  var id = findSelected(\"分配\",mygrid);\r\n");
      out.write("\t  if(id == \"\") return;\r\n");
      out.write("\t  var loader = dhtmlxAjax.postSync(fulllink+'?action=CheckUser&ids='+id, \"\");\r\n");
      out.write("\t  rights(loader,id);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function rights(loader,id)  {\r\n");
      out.write("   if (loader.xmlDoc.responseXML != null && loader.xmlDoc.responseText.length>0) {\r\n");
      out.write("      alert(loader.xmlDoc.responseText);\r\n");
      out.write("   \treturn;\r\n");
      out.write("   }\r\n");
      out.write("      \r\n");
      out.write("   var url_link=contextpath+'system/sysReource.do?action=userrights&id='+id;\r\n");
      out.write("   editMode=\"RIGHTS\";\r\n");
      out.write("   openWindow(\"分配用户权限\",url_link,300,500);\t  \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function goModify()  {\r\n");
      out.write("\t var id = findSelected(\"修改\",mygrid);\r\n");
      out.write("\t if(id == \"\") return;\r\n");
      out.write("\t modify(id);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function modify(id)  {\r\n");
      out.write("    var url_link=fulllink+'?action=edit&ids='+id;\r\n");
      out.write("    editMode=\"EDIT\";\r\n");
      out.write("    openWindow(\"修改用户\",url_link,700,370);\t  \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function goStart()  {\r\n");
      out.write("\t  var id = findMultiSelected(\"启用\",mygrid);\r\n");
      out.write("\t  if(id == \"\") return;\r\n");
      out.write("    document.forms[0].action = hyperlink + \"?action=start&ids=\" + id;\r\n");
      out.write("    document.forms[0].target = \"_self\";\r\n");
      out.write("    document.forms[0].submit();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function goStop()  {\r\n");
      out.write("\t  var id = findMultiSelected(\"暂停\",mygrid);\r\n");
      out.write("\t  if(id == \"\") return;\r\n");
      out.write("    document.forms[0].action = hyperlink + \"?action=stop&ids=\" + id;\r\n");
      out.write("    document.forms[0].target = \"_self\";\r\n");
      out.write("    document.forms[0].submit();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function goAdd()  {\r\n");
      out.write("   editMode=\"ADD\";\r\n");
      out.write("   var url_link=fulllink+'?action=add';\r\n");
      out.write("   openWindow(\"添加用户\",url_link,700,400);\r\n");
      out.write("}\r\n");
      out.write("function goResource(){\r\n");
      out.write("\tvar id = findSelected(\"分配资源\",mygrid);\r\n");
      out.write("\tif(id == \"\") return;\r\n");
      out.write("\tvar url_link=fulllink+'?action=resource&userId='+id;\r\n");
      out.write("\topenWindow(\"选择资源\",url_link,700,400);\r\n");
      out.write("}\r\n");
      out.write("function renew()  {\r\n");
      out.write("\t  var order = getElement(\"query.order\");                   order.value=\"\";\r\n");
      out.write("\t  var desc =  getElement(\"query.orderDirection\");          desc.value=\"\";\r\n");
      out.write("\t  var pn =    getElement(\"query.pageNumber\");              pn.value=\"1\";\r\n");
      out.write("\t  var ps =    getElement(\"query.pageSize\");                ps.value=\"10\";\r\n");
      out.write("\t  var v0 =    getElement(\"query.parameters.userAccount\"); v0.value=\"\";\r\n");
      out.write("\t  var v1 =    getElement(\"query.parameters.userName\");    v1.value=\"\";\r\n");
      out.write("\t  var v2 =    getElement(\"query.parameters.deptId\");      v2.value=\"\";\r\n");
      out.write("\t  var v3 =    getElement(\"query.parameters.userStatus\");  v3.value=\"\";\r\n");
      out.write("     gosearch();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function goQuery()  {\r\n");
      out.write("\t  var pn = getElement(\"query.pageNumber\");             \r\n");
      out.write("\t  pn.value=\"1\";\r\n");
      out.write("    gosearch();\r\n");
      out.write("}\r\n");
      out.write("function close(){\r\n");
      out.write("\tdhxWins.window(winName).close();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function closedialog(ret){\r\n");
      out.write("\t editMode=\"\";\r\n");
      out.write("\t if(!ret) {\r\n");
      out.write("   \tdhxWins.window(winName).close();\r\n");
      out.write("   \treturn;\r\n");
      out.write("\t }\r\n");
      out.write("   if(ret=='true') {\r\n");
      out.write("   \t  if(editMode==\"PWD\") alert(\"密码已经被修改。\");\r\n");
      out.write("   \t  else if(editMode==\"RIGHTS\")  alert(\"用户权限已经被修改。\");\r\n");
      out.write("   }\t\r\n");
      out.write("  \r\n");
      out.write("   gosearch();\r\n");
      out.write("}\r\n");
      out.write("function init(){\r\n");
      out.write("\t  showMessage('");
      if (_jspx_meth_s_005fproperty_005f0(_jspx_page_context))
        return;
      out.write("')\r\n");
      out.write("} \r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("html,body {\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\theight: 100%;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body onload=\"init()\" >\r\n");
      out.write("\t<div class=\"special-padding\" id=\"mainDiv\" >\r\n");
      out.write("\t\t");
      if (_jspx_meth_s_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</div>\r\n");
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
      out.write("    if(window.addEventListener) {\r\n");
      out.write(" \t     window.addEventListener(\"resize\",goResize,false); \r\n");
      out.write("    }\r\n");
      out.write("    else {\r\n");
      out.write(" \t     window.attachEvent('onresize',goResize);\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("\t var gDiv=window.document.getElementById('gridbox');\r\n");
      out.write("\t var mDiv=window.document.getElementById('mainDiv');\r\n");
      out.write("\t var tDiv=window.document.getElementById('tbl');\r\n");
      out.write("\t var btn=window.document.getElementById('btn');\r\n");
      out.write("\t    \r\n");
      out.write("    function goResize(){\r\n");
      out.write("   \t var he;\r\n");
      out.write("\t    if(isIE()) he=window.document.body.offsetHeight; else he=window.innerHeight;\r\n");
      out.write("\r\n");
      out.write("\t\t mDiv.style.height=he-36+\"px\";\r\n");
      out.write("\t\t gDiv.style.height=mDiv.offsetHeight-btn.offsetHeight-btn.offsetTop+1+\"px\";\r\n");
      out.write("\t\t tDiv.style.width=mDiv.offsetWidth-4+\"px\";\r\n");
      out.write("\t\t gDiv.style.width=mDiv.offsetWidth-6+\"px\";\r\n");
      out.write("\t    btn.style.width=tDiv.offsetWidth+\"px\";\r\n");
      out.write("    }\r\n");
      out.write("    goResize();   \r\n");
      out.write("</script> \r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("   var o = getElement(\"query.order\");\r\n");
      out.write("   var od = getElement(\"query.orderDirection\");\r\n");
      out.write("   var pn = getElement(\"query.pageNumber\");\r\n");
      out.write("\r\n");
      out.write("   var mygrid = new dhtmlXGridObject('gridbox');\r\n");
      out.write("\tmygrid.setImagePath(\"");
      out.print(CONTEXT_PATH);
      out.write("dhtmlx/imgs/\");\r\n");
      out.write("\tvar headAlign=[tLeft,tCenter,tCenter,tLeft,tLeft,tCenter,tLeft];\r\n");
      out.write("\tmygrid.setHeader(\"#master_checkbox,姓名,帐号,单位,部门,状态,说明\",null,headAlign);\r\n");
      out.write("\tmygrid.setInitWidthsP(\"3,10,10,20,20,5,32\");\r\n");
      out.write("\tmygrid.setColAlign(\"center,center,center,left,left,center,left\");\r\n");
      out.write("\tmygrid.setColTypes(\"ch,link,ro,ro,ro,ro,ro\");\r\n");
      out.write("\tmygrid.setColSorting(\"na,str,str,str,str,str,str\");\r\n");
      out.write("\tmygrid.setSkin(\"dhx_skyblue\");\r\n");
      out.write("\tmygrid.attachEvent(\"onBeforeSorting\",function(ind,type,direction){\r\n");
      out.write("\t\tif(ind!=1&&ind!=2&&ind!=5) return;  \r\n");
      out.write("\t\tif(o.value == ind) {\r\n");
      out.write("\t\t\t  if(od.value=='asc') od.value='desc';else od.value='asc'; \r\n");
      out.write("\t\t  }\r\n");
      out.write("\t\t  else{\r\n");
      out.write("\t\t\t  o.value = ind;\r\n");
      out.write("\t\t\t  od.value='asc';\r\n");
      out.write("\t\t  }\r\n");
      out.write("\t\t  pn.value='1';\r\n");
      out.write("        gosearch('list');  \r\n");
      out.write("    });\r\n");
      out.write("\tmygrid.init();\r\n");
      out.write("\tvar data = {rows: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userList}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("};\r\n");
      out.write("\tmygrid.parse(data,\"json\");\r\n");
      out.write("\tmygrid.checkAll(false);\r\n");
      out.write("\t\r\n");
      out.write("\tif(o.value!='' && od.value!='') {\r\n");
      out.write("\t   mygrid.setSortImgState(true,o.value,od.value);        \r\n");
      out.write("\t}\r\n");
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
    // /jsp/system/org/sysUser_list.jsp(147,16) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f0.setValue("errorMessage");
    // /jsp/system/org/sysUser_list.jsp(147,16) name = escape type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /jsp/system/org/sysUser_list.jsp(161,2) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setAction("sysUser");
    // /jsp/system/org/sysUser_list.jsp(161,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setId("userForm");
    // /jsp/system/org/sysUser_list.jsp(161,2) name = method type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setMethod("post");
    // /jsp/system/org/sysUser_list.jsp(161,2) name = namespace type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f1(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f2(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f3(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_s_005fhidden_005f4(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t<table width=\"99%\" id=\"tbl\" cellpadding=\"0\" cellspacing=\"0\" class=\"formTable\">\r\n");
        out.write("\t\t\t\t<tbody>\r\n");
        out.write("\t\t\t\t\t<tr>\r\n");
        out.write("\t\t\t\t\t\t<td width=10% class=\"textR\">账号：</td>\r\n");
        out.write("\t\t\t\t\t\t<td width=15%>");
        if (_jspx_meth_s_005ftextfield_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("\t\t\t\t\t\t<td width=10% class=\"textR\">用户名：</td>\r\n");
        out.write("\t\t\t\t\t\t<td width=15%>");
        if (_jspx_meth_s_005ftextfield_005f1(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t\t<td width=10% class=\"textR\">部门：</td>\r\n");
        out.write("\t\t\t\t\t\t<td width=20% class=\"sel\">\r\n");
        out.write("\t\t\t\t\t\t   ");
        if (_jspx_meth_s_005fselect_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t\t<td width=10% class=\"textR\">状态：</td>\r\n");
        out.write("\t\t\t\t\t\t<td width=10% class=\"sel\">\r\n");
        out.write("\t\t\t\t\t\t   ");
        if (_jspx_meth_s_005fselect_005f1(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\t<tr class=\"btnTr\">\r\n");
        out.write("\t\t\t\t\t\t<td class=\"textC\" colspan=\"8\">\r\n");
        out.write("\t\t\t\t\t\t   ");
        if (_jspx_meth_gl_005fbutton_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write(" &nbsp; \r\n");
        out.write("\t\t\t\t\t\t   ");
        if (_jspx_meth_gl_005fbutton_005f1(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t</tbody>\r\n");
        out.write("\t\t\t</table>\r\n");
        out.write("\t\t\t<div class=\"gap8\">&nbsp;</div>\r\n");
        out.write("\t\t\t<table id=\"btn\" width=\"99%\" cellspacing=\"1\" cellpadding=\"1\" class=\"controlTable\">\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t\t\t\t\t<td>\r\n");
        out.write("\t\t\t\t\t   ");
        if (_jspx_meth_gl_005fbutton_005f2(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write(" \r\n");
        out.write("\t\t\t\t\t   ");
        if (_jspx_meth_gl_005fbutton_005f3(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write(" \r\n");
        out.write("\t\t\t\t\t   ");
        if (_jspx_meth_gl_005fbutton_005f4(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write(" \r\n");
        out.write("\t\t\t\t\t   ");
        if (_jspx_meth_gl_005fbutton_005f5(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write(" \r\n");
        out.write("\t\t\t\t\t   ");
        if (_jspx_meth_gl_005fbutton_005f6(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t   ");
        if (_jspx_meth_gl_005fbutton_005f7(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write(" \r\n");
        out.write("\t\t\t\t\t   ");
        if (_jspx_meth_gl_005fbutton_005f8(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t </td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t</table>\r\n");
        out.write("\t\t\t\r\n");
        out.write("<div id=\"gridbox\" style=\"background-color: white;\"></div>\r\n");
        if (_jspx_meth_gl_005fpager_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
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
    // /jsp/system/org/sysUser_list.jsp(162,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /jsp/system/org/sysUser_list.jsp(163,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /jsp/system/org/sysUser_list.jsp(164,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /jsp/system/org/sysUser_list.jsp(165,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /jsp/system/org/sysUser_list.jsp(166,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /jsp/system/org/sysUser_list.jsp(171,20) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setName("query.parameters.userAccount");
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
    // /jsp/system/org/sysUser_list.jsp(173,20) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f1.setName("query.parameters.userName");
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
    // /jsp/system/org/sysUser_list.jsp(177,9) name = list type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setList("codeSets.depts");
    // /jsp/system/org/sysUser_list.jsp(177,9) name = listKey type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setListKey("value");
    // /jsp/system/org/sysUser_list.jsp(177,9) name = listValue type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setListValue("codeName");
    // /jsp/system/org/sysUser_list.jsp(177,9) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setName("query.parameters.deptId");
    int _jspx_eval_s_005fselect_005f0 = _jspx_th_s_005fselect_005f0.doStartTag();
    if (_jspx_th_s_005fselect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005fnobody.reuse(_jspx_th_s_005fselect_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005fnobody.reuse(_jspx_th_s_005fselect_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fselect_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:select
    org.apache.struts2.views.jsp.ui.SelectTag _jspx_th_s_005fselect_005f1 = (org.apache.struts2.views.jsp.ui.SelectTag) _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005fnobody.get(org.apache.struts2.views.jsp.ui.SelectTag.class);
    _jspx_th_s_005fselect_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fselect_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /jsp/system/org/sysUser_list.jsp(181,9) name = list type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setList("codeSets.USER_STATUS");
    // /jsp/system/org/sysUser_list.jsp(181,9) name = listKey type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setListKey("value");
    // /jsp/system/org/sysUser_list.jsp(181,9) name = listValue type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setListValue("codeName");
    // /jsp/system/org/sysUser_list.jsp(181,9) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setName("query.parameters.userStatus");
    int _jspx_eval_s_005fselect_005f1 = _jspx_th_s_005fselect_005f1.doStartTag();
    if (_jspx_th_s_005fselect_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005fnobody.reuse(_jspx_th_s_005fselect_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flistValue_005flistKey_005flist_005fnobody.reuse(_jspx_th_s_005fselect_005f1);
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
    // /jsp/system/org/sysUser_list.jsp(186,9) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fbutton_005f0.setName("btnQuery");
    // /jsp/system/org/sysUser_list.jsp(186,9) name = onClick type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fbutton_005f0.setOnClick("goQuery()");
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
    // /jsp/system/org/sysUser_list.jsp(187,9) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fbutton_005f1.setName("btnRefresh");
    // /jsp/system/org/sysUser_list.jsp(187,9) name = onClick type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /jsp/system/org/sysUser_list.jsp(196,8) name = styleClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fbutton_005f2.setStyleClass("sbuBtnStyle");
    // /jsp/system/org/sysUser_list.jsp(196,8) name = icon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fbutton_005f2.setIcon("addIcon");
    // /jsp/system/org/sysUser_list.jsp(196,8) name = onClick type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    com.liusy.core.web.tag.ButtonTag _jspx_th_gl_005fbutton_005f3 = (com.liusy.core.web.tag.ButtonTag) _005fjspx_005ftagPool_005fgl_005fbutton_0026_005fstyleClass_005fonClick_005fid_005ficon.get(com.liusy.core.web.tag.ButtonTag.class);
    _jspx_th_gl_005fbutton_005f3.setPageContext(_jspx_page_context);
    _jspx_th_gl_005fbutton_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /jsp/system/org/sysUser_list.jsp(197,8) name = styleClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fbutton_005f3.setStyleClass("sbuBtnStyle");
    // /jsp/system/org/sysUser_list.jsp(197,8) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fbutton_005f3.setId("editUser");
    // /jsp/system/org/sysUser_list.jsp(197,8) name = icon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fbutton_005f3.setIcon("subIcon");
    // /jsp/system/org/sysUser_list.jsp(197,8) name = onClick type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
      _005fjspx_005ftagPool_005fgl_005fbutton_0026_005fstyleClass_005fonClick_005fid_005ficon.reuse(_jspx_th_gl_005fbutton_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fgl_005fbutton_0026_005fstyleClass_005fonClick_005fid_005ficon.reuse(_jspx_th_gl_005fbutton_005f3);
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
    // /jsp/system/org/sysUser_list.jsp(198,8) name = styleClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fbutton_005f4.setStyleClass("sbuBtnStyle");
    // /jsp/system/org/sysUser_list.jsp(198,8) name = icon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fbutton_005f4.setIcon("delIcon");
    // /jsp/system/org/sysUser_list.jsp(198,8) name = onClick type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /jsp/system/org/sysUser_list.jsp(199,8) name = styleClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fbutton_005f5.setStyleClass("sbuBtnStyle");
    // /jsp/system/org/sysUser_list.jsp(199,8) name = icon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fbutton_005f5.setIcon("resetIcon");
    // /jsp/system/org/sysUser_list.jsp(199,8) name = onClick type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fbutton_005f5.setOnClick("goChangePwd()");
    int _jspx_eval_gl_005fbutton_005f5 = _jspx_th_gl_005fbutton_005f5.doStartTag();
    if (_jspx_eval_gl_005fbutton_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_gl_005fbutton_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_gl_005fbutton_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_gl_005fbutton_005f5.doInitBody();
      }
      do {
        out.write("重置密码");
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
    // /jsp/system/org/sysUser_list.jsp(200,8) name = styleClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fbutton_005f6.setStyleClass("sbuBtnStyle");
    // /jsp/system/org/sysUser_list.jsp(200,8) name = icon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fbutton_005f6.setIcon("stopIcon");
    // /jsp/system/org/sysUser_list.jsp(200,8) name = onClick type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fbutton_005f6.setOnClick("goStop()");
    int _jspx_eval_gl_005fbutton_005f6 = _jspx_th_gl_005fbutton_005f6.doStartTag();
    if (_jspx_eval_gl_005fbutton_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_gl_005fbutton_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_gl_005fbutton_005f6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_gl_005fbutton_005f6.doInitBody();
      }
      do {
        out.write('暂');
        out.write('停');
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
    // /jsp/system/org/sysUser_list.jsp(201,8) name = styleClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fbutton_005f7.setStyleClass("sbuBtnStyle");
    // /jsp/system/org/sysUser_list.jsp(201,8) name = icon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fbutton_005f7.setIcon("playIcon");
    // /jsp/system/org/sysUser_list.jsp(201,8) name = onClick type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fbutton_005f7.setOnClick("goStart()");
    int _jspx_eval_gl_005fbutton_005f7 = _jspx_th_gl_005fbutton_005f7.doStartTag();
    if (_jspx_eval_gl_005fbutton_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_gl_005fbutton_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_gl_005fbutton_005f7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_gl_005fbutton_005f7.doInitBody();
      }
      do {
        out.write('启');
        out.write('用');
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

  private boolean _jspx_meth_gl_005fbutton_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  gl:button
    com.liusy.core.web.tag.ButtonTag _jspx_th_gl_005fbutton_005f8 = (com.liusy.core.web.tag.ButtonTag) _005fjspx_005ftagPool_005fgl_005fbutton_0026_005fstyleClass_005fonClick_005ficon.get(com.liusy.core.web.tag.ButtonTag.class);
    _jspx_th_gl_005fbutton_005f8.setPageContext(_jspx_page_context);
    _jspx_th_gl_005fbutton_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /jsp/system/org/sysUser_list.jsp(202,8) name = styleClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fbutton_005f8.setStyleClass("sbuBtnStyle");
    // /jsp/system/org/sysUser_list.jsp(202,8) name = icon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fbutton_005f8.setIcon("assigningPermissions");
    // /jsp/system/org/sysUser_list.jsp(202,8) name = onClick type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fbutton_005f8.setOnClick("goRights()");
    int _jspx_eval_gl_005fbutton_005f8 = _jspx_th_gl_005fbutton_005f8.doStartTag();
    if (_jspx_eval_gl_005fbutton_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_gl_005fbutton_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_gl_005fbutton_005f8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_gl_005fbutton_005f8.doInitBody();
      }
      do {
        out.write("分配权限");
        int evalDoAfterBody = _jspx_th_gl_005fbutton_005f8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_gl_005fbutton_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_gl_005fbutton_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fgl_005fbutton_0026_005fstyleClass_005fonClick_005ficon.reuse(_jspx_th_gl_005fbutton_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fgl_005fbutton_0026_005fstyleClass_005fonClick_005ficon.reuse(_jspx_th_gl_005fbutton_005f8);
    return false;
  }

  private boolean _jspx_meth_gl_005fpager_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  gl:pager
    com.liusy.core.web.tag.PagerTag _jspx_th_gl_005fpager_005f0 = (com.liusy.core.web.tag.PagerTag) _005fjspx_005ftagPool_005fgl_005fpager_0026_005fstyleClass_005fproperty_005fid_005fcellSpacing_005fcellPadding_005faction_005fnobody.get(com.liusy.core.web.tag.PagerTag.class);
    _jspx_th_gl_005fpager_005f0.setPageContext(_jspx_page_context);
    _jspx_th_gl_005fpager_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /jsp/system/org/sysUser_list.jsp(208,0) name = styleClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fpager_005f0.setStyleClass("pageTurn");
    // /jsp/system/org/sysUser_list.jsp(208,0) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fpager_005f0.setId("pager");
    // /jsp/system/org/sysUser_list.jsp(208,0) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fpager_005f0.setAction("list");
    // /jsp/system/org/sysUser_list.jsp(208,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fpager_005f0.setProperty("query");
    // /jsp/system/org/sysUser_list.jsp(208,0) name = cellPadding type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fpager_005f0.setCellPadding("0");
    // /jsp/system/org/sysUser_list.jsp(208,0) name = cellSpacing type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fpager_005f0.setCellSpacing("0");
    int _jspx_eval_gl_005fpager_005f0 = _jspx_th_gl_005fpager_005f0.doStartTag();
    if (_jspx_th_gl_005fpager_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fgl_005fpager_0026_005fstyleClass_005fproperty_005fid_005fcellSpacing_005fcellPadding_005faction_005fnobody.reuse(_jspx_th_gl_005fpager_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fgl_005fpager_0026_005fstyleClass_005fproperty_005fid_005fcellSpacing_005fcellPadding_005faction_005fnobody.reuse(_jspx_th_gl_005fpager_005f0);
    return false;
  }
}
