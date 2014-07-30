package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liusy.core.util.Const;
import com.liusy.core.web.UserSession;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/common/dialog.jsp");
    _jspx_dependants.add("/WEB-INF/tag/gl-tag.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fgl_005fmenu_0026_005ftitle_005fimg_005fid_005fcode;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fgl_005fmenu_0026_005ftitle_005fimg_005fid_005fcode = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fgl_005fmenu_0026_005ftitle_005fimg_005fid_005fcode.release();
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
      out.write("   \r\n");
      out.write("\r\n");
      out.write("\r\n");

   String path = request.getContextPath();
	String CONTEXT_PATH = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<title></title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta http-equiv=\"x-ua-compatible\" content=\"ie=7\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(CONTEXT_PATH);
      out.write("dhtmlx/dhtmlx.css\" />\r\n");
      out.write("<script src=\"");
      out.print(CONTEXT_PATH);
      out.write("dhtmlx/dhtmlx.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script language=\"javascript\" src=\"");
      out.print(CONTEXT_PATH);
      out.write("js/ctrl_util.js\"></script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("html,body {\r\n");
      out.write("   width: 100%;\r\n");
      out.write("   height: 100%;\r\n");
      out.write("   border: none;\r\n");
      out.write("   overflow: hidden;\r\n");
      out.write("}\r\n");
      out.write("/* --------------以下为新增css---------------- */\r\n");
      out.write("#sysName {\r\n");
      out.write("   background: url(");
      out.print(CONTEXT_PATH);
      out.write("images/top1.jpg) no-repeat 0px 1px;\r\n");
      out.write("   height: 57px;\r\n");
      out.write("   text-indent:5px;\r\n");
      out.write("   font-size: 28px;\r\n");
      out.write("   color:#ffffff;\r\n");
      out.write("   font-weight:bold;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#topBanner {\r\n");
      out.write("   background: url(");
      out.print(CONTEXT_PATH);
      out.write("images/headerBg.jpg) repeat-x center top;\r\n");
      out.write("   height: 64px;\r\n");
      out.write("   position: relative;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#header {\r\n");
      out.write("   width: 100%;\r\n");
      out.write("   zoom: 1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#hInput {\r\n");
      out.write("   position: absolute;\r\n");
      out.write("   right: 0;\r\n");
      out.write("   top: 0;\r\n");
      out.write("   background: url(");
      out.print(CONTEXT_PATH);
      out.write("images/headerRBg.jpg) no-repeat right top;\r\n");
      out.write("   height: 64px;\r\n");
      out.write("   width: 366px;\r\n");
      out.write("   text-align: right;\r\n");
      out.write("   line-height: 64px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#logSate {\r\n");
      out.write("   position: absolute;\r\n");
      out.write("   left: 1px;\r\n");
      out.write("   bottom: 0px;\r\n");
      out.write("   _top: 44px;\r\n");
      out.write("   padding: 2px 0 0 42px;\r\n");
      out.write("   color: #ecfaff;\r\n");
      out.write("   background: url(");
      out.print(CONTEXT_PATH);
      out.write("images/loginIFBg.jpg) no-repeat left top;\r\n");
      out.write("   width: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#header .headerBtn {\r\n");
      out.write("   cursor: pointer;\r\n");
      out.write("   background: url(");
      out.print(CONTEXT_PATH);
      out.write("images/icon_list.gif) no-repeat right;\r\n");
      out.write("   width: 50px;\r\n");
      out.write("   height: 18px;\r\n");
      out.write("   line-height: 18px;\r\n");
      out.write("   border: none;\r\n");
      out.write("   margin-right: 3px;\r\n");
      out.write("   margin-top: 44px;\r\n");
      out.write("   font-size: 12px;\r\n");
      out.write("   color: #fff;\r\n");
      out.write("   padding: 2px 0 0 0px;\r\n");
      out.write("   text-align: right;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#header #topHome {\r\n");
      out.write("   background-position: -90px -151px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#header #topHelp {\r\n");
      out.write("   background-position: -90px -100px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#header #topExit {\r\n");
      out.write("   background-position: -90px 2px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#header .headerBtn:hover {\r\n");
      out.write("   color: #e3f3f8\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".memuNavDivWrap {\r\n");
      out.write("   position: relative;\r\n");
      out.write("   top: 0;\r\n");
      out.write("   left: 0;\r\n");
      out.write("   width: 100%;\r\n");
      out.write("   height: 100%;\r\n");
      out.write("   background: #f0f7ff url(");
      out.print(CONTEXT_PATH);
      out.write("images/nav_bottom_bg.jpg) repeat-y 1px center;\r\n");
      out.write("   /* 滚动条代码S */\r\n");
      out.write("   overflow: auto; /* 滚动条 */\r\n");
      out.write("   scrollbar-face-color: #cae1fc; /* 滚动条颜色 */\r\n");
      out.write("   scrollbar-track-color: #e9f2fe; /* 底色 */\r\n");
      out.write("   scrollbar-arrow-color: #2b5589; /* 箭头颜色 */\r\n");
      out.write("   scrollbar-highlight-color: #f6faff; /* 左次阴影 */\r\n");
      out.write("   scrollbar-3dlight-color: #acc9e9; /* 左外阴影 */\r\n");
      out.write("   scrollbar-shadow-color: #b0cbe8; /* 右次阴影 */\r\n");
      out.write("   scrollbar-darkshadow-color: #e6f0fa; /* 右外阴影 */ /* 滚动条代码E */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".memuNav {\r\n");
      out.write("   list-style: none;\r\n");
      out.write("   margin: 0;\r\n");
      out.write("   padding: 0;\r\n");
      out.write("   border: 1px solid #fff;\r\n");
      out.write("   border-bottom: 1px solid #fff;\r\n");
      out.write("   border-top: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".memuNav li {\r\n");
      out.write("   text-align: center;\r\n");
      out.write("   height: 26px;\r\n");
      out.write("   line-height: 26px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".memuNav li a {\r\n");
      out.write("   color: #093978;\r\n");
      out.write("   text-decoration: none;\r\n");
      out.write("   display: block;\r\n");
      out.write("   height: 26px;\r\n");
      out.write("   line-height: 26px;\r\n");
      out.write("   background: #e4f0fe url(");
      out.print(CONTEXT_PATH);
      out.write("images/leftNavSBg.gif) repeat-x center top;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".memuNav li a:hover {\r\n");
      out.write("   background: #fff0c8 url(");
      out.print(CONTEXT_PATH);
      out.write("images/leftNavSBg_hover.gif) repeat-x center bottom;\r\n");
      out.write("   color: #9e5e2a;\r\n");
      out.write("   letter-spacing: -1px;\r\n");
      out.write("   font-weight: bold;\r\n");
      out.write("   border-top: 1px solid #fff;\r\n");
      out.write("   text-indent: 2px;\r\n");
      out.write("   _height: 25px;\r\n");
      out.write("   _line-height: 25px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#container {\r\n");
      out.write("   width: 100%;\r\n");
      out.write("   height: 100%;\r\n");
      out.write("   zoom: 1;\r\n");
      out.write("   overflow: hidden;\r\n");
      out.write("   position: absolute;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t var contextpath = \"");
      out.print(CONTEXT_PATH);
      out.write("\";\t\r\n");
      out.write("\t var imgPath=\"");
      out.print(CONTEXT_PATH);
      out.write("dhtmlx/imgs/icon/\";\r\n");
      out.write("   function go(link,title,fName){\r\n");
      out.write("   \t  var f=\"leaf.gif\";\r\n");
      out.write("   \t  if(fName) f=fName;\r\n");
      out.write("      var img=\"&lt;img src='\"+imgPath+f+\"' /&gt;\";  \r\n");
      out.write("\r\n");
      out.write("      var t=\"&lt;font style='font-size:12px; font-weight:bold'&gt;\"+title+\"&lt;/font&gt;\";\r\n");
      out.write("      dhxToolbar.removeItem(\"img\");\r\n");
      out.write("      dhxToolbar.removeItem(\"title\");\r\n");
      out.write("   \t  dhxToolbar.addText(\"img\", 0,img);\r\n");
      out.write("   \t  dhxToolbar.addText(\"title\", 1,t);\r\n");
      out.write("   \t  centerPanel.showToolbar();\r\n");
      out.write("      var cont=window.document.getElementById('container');\r\n");
      out.write("      cont.src=contextpath+link;\r\n");
      out.write("   }\r\n");
      out.write("   function changetitle(title){\r\n");
      out.write("   \t  var t=\"&lt;font style='font-size:12px; font-weight:bold'&gt;\"+title+\"&lt;/font&gt;\";\r\n");
      out.write("      dhxToolbar.removeItem(\"title\");\r\n");
      out.write("   \t  dhxToolbar.addText(\"title\", 0,t);\r\n");
      out.write("   }\r\n");
      out.write("   function showmain(){\r\n");
      out.write("   \t\twindow.location.href='");
      out.print(CONTEXT_PATH);
      out.write("main.jsp';\r\n");
      out.write("   }\r\n");
      out.write("   function logout(){\r\n");
      out.write("   \tif(confirm('是否真的要注销并重新登录?')==true)\r\n");
      out.write("   \t\twindow.location.href='");
      out.print(CONTEXT_PATH);
      out.write("login.do?action=logout';\r\n");
      out.write("   }\r\n");
      out.write("   function checklogin(){\r\n");
      out.write("   \t\tvar url='");
      out.print(CONTEXT_PATH);
      out.write("login.do?action=checklogin';\r\n");
      out.write("   \t\tvar loader=dhtmlxAjax.postSync(url,'');\r\n");
      out.write("   \t\tvar value = loader.xmlDoc.responseText;\r\n");
      out.write("   \t\tif(value!='OK'){\r\n");
      out.write("   \t\t\talert('您还未登录系统');\r\n");
      out.write("   \t\t\twindow.location.href='login.jsp';\r\n");
      out.write("   \t\t}\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   function closedialog(ret){\r\n");
      out.write("\t   dhxWins.window(winName).close();\r\n");
      out.write("\t   if(ret=='true') {\r\n");
      out.write("\t   \t  if(editMode==\"PWD\") alert(\"密码已经被修改。\");\r\n");
      out.write("\t   }\t\r\n");
      out.write("\t   editMode=\"\";\r\n");
      out.write("\t}\r\n");
      out.write("   \r\n");
      out.write("   function goChangePwd()  {\r\n");
      out.write("       var url_link=contextpath+'/system/sysUser.do?action=MYPWD';\r\n");
      out.write("       editMode==\"PWD\";\r\n");
      out.write("       openWindow(\"修改密码\",url_link,300,170);\t  \r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   function docConfig(){\r\n");
      out.write("       var url_link=contextpath+'jsp/system/pm/archConfig.jsp';\r\n");
      out.write("       openWindow(\"案卷配置\",url_link,600,400);\t  \r\n");
      out.write("   }\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body onload=\"go('cms/catalog.do','内容管理','code_mod.gif')\">\r\n");
      out.write("<!-- \r\n");
      out.write("  <body onload=\"checklogin()\"> \r\n");
      out.write("-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("   <div id=\"topBanner\" style=\"display: none;\">\r\n");
      out.write("      <div style=\"height:8px;\"></div>\r\n");
      out.write("      <div id=\"sysName\">CMS管理系统</div>\r\n");
      out.write("      <div id=\"header\">\r\n");
      out.write("         <div id=\"logSate\" style=\"font-size: 12px;\">\r\n");
      out.write("            ");

               UserSession userSession = (UserSession) request.getSession().getAttribute(Const.SESSION);
               String userString="当前用户： "+userSession.getUserName()+"("+userSession.getAccountName()+")";
            
      out.write("\r\n");
      out.write("            ");
      out.print(userString);
      out.write(" &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <span id=\"showTime\"></span>\r\n");
      out.write("         </div>\r\n");
      out.write("         <div id=\"hInput\">\r\n");
      out.write("            <button name=\"topPage\" id=\"topHome\" type=\"button\" onClick=\"go('blank.jsp','首页','code_child.gif')\" class=\"headerBtn\">首页</button>\r\n");
      out.write("            <button id=\"topHelp\" type=\"button\" onClick=\"\" class=\"headerBtn\">帮助</button>\r\n");
      out.write("            <button id=\"topExit\" type=\"button\" onClick=\"logout()\" class=\"headerBtn\">退出</button>\r\n");
      out.write("         </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div id=\"sysMenu\" backgroundcolor=\"red\">菜单</div>\r\n");
      out.write("   </div>\r\n");
      out.write("   <script type=\"text/javascript\">\r\n");
      out.write("   var serverTime='");
out.print(new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss-SSS").format(new Date()));
      out.write("';\r\n");
      out.write("\tvar teptime=serverTime.split('-');\r\n");
      out.write("    date = new Date();   \r\n");
      out.write("    date.setYear(teptime[0]);\r\n");
      out.write("    date.setMonth(teptime[1]);\r\n");
      out.write("    date.setDate(teptime[2]);\r\n");
      out.write("    date.setHours(teptime[3],teptime[4],teptime[5],teptime[6]);\r\n");
      out.write("    \r\n");
      out.write("\tsetTimeout('updateCurrentDate('+'");
 out.print(new java.util.Date().getTime());
      out.write("'+')', 100);     \r\n");
      out.write("\tupdateCurrentDate = function(time) {   \r\n");
      out.write("\t    date.setTime(parseInt(time) + 1000);   \r\n");
      out.write("\t    //alert(date.toLocaleString());\r\n");
      out.write("\t    //alert(teptime);\r\n");
      out.write("\t    document.getElementById('showTime').innerHTML=date.toLocaleString()+' 星期'+'日一二三四五六'.charAt(new Date().getDay());\r\n");
      out.write("\t    setTimeout('updateCurrentDate('+date.getTime()+')', 1000);   \r\n");
      out.write("\t} \r\n");
      out.write("\t\r\n");
      out.write("\t var dhxLayout = new dhtmlXLayoutObject(document.body, \"2E\");\r\n");
      out.write("\t dhxLayout.setSkin(\"dhx_skyblue\");\r\n");
      out.write("\t var topPanel=dhxLayout.cells(\"a\");\r\n");
      out.write("\t var centerPanel=dhxLayout.cells(\"b\");\r\n");
      out.write("\r\n");
      out.write("\t topPanel.setHeight(91);\r\n");
      out.write("\t topPanel.hideHeader();\r\n");
      out.write("\t topPanel.fixSize(true,true);\r\n");
      out.write("\t topPanel.attachObject(\"topBanner\");\r\n");
      out.write("\t \r\n");
      out.write("\t var menu = new dhtmlXMenuObject(\"sysMenu\",\"dhx_skyblue\");\r\n");
      out.write("  \t var menustr=\"<menu>\";\r\n");
      out.write("  \t \r\n");
      out.write("  \t \r\n");
      out.write("  \t");
      if (_jspx_meth_gl_005fmenu_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("\t");
      if (_jspx_meth_gl_005fmenu_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("   \r\n");
      out.write("    ");
      if (_jspx_meth_gl_005fmenu_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("   menustr+=\"</menu>\";\r\n");
      out.write("   menu.loadXMLString(menustr);\r\n");
      out.write("   menu.attachEvent(\"onClick\", menuclick);\r\n");
      out.write("   \r\n");
      out.write("   function menuclick(id){\r\n");
      out.write("   \teval(menu.getUserData(id,\"onclick\"));\r\n");
      out.write("   } \r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("   <div id=\"mainFrame\">\r\n");
      out.write("      <iframe id=\"container\" style=\"overflow-y: auto; overflow-x: hidden !important; width: 100%; height: 100%;\" frameborder=\"no\" src=\"\"></iframe>\r\n");
      out.write("   </div>\r\n");
      out.write("   <script type=\"text/javascript\">\r\n");
      out.write("\t centerPanel.hideHeader();\r\n");
      out.write("\t centerPanel.attachObject(\"mainFrame\");\r\n");
      out.write("   var dhxToolbar = centerPanel.attachToolbar();\r\n");
      out.write("   dhxToolbar.addText(\"title\", 0,\"\");\r\n");
      out.write("   centerPanel.hideToolbar();\r\n");
      out.write("</script>\r\n");
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

  private boolean _jspx_meth_gl_005fmenu_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  gl:menu
    com.liusy.core.web.tag.MenuTag _jspx_th_gl_005fmenu_005f0 = (com.liusy.core.web.tag.MenuTag) _005fjspx_005ftagPool_005fgl_005fmenu_0026_005ftitle_005fimg_005fid_005fcode.get(com.liusy.core.web.tag.MenuTag.class);
    _jspx_th_gl_005fmenu_005f0.setPageContext(_jspx_page_context);
    _jspx_th_gl_005fmenu_005f0.setParent(null);
    // /main.jsp(280,3) name = code type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fmenu_005f0.setCode("");
    // /main.jsp(280,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fmenu_005f0.setId("div5");
    // /main.jsp(280,3) name = title type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fmenu_005f0.setTitle("CMS管理");
    // /main.jsp(280,3) name = img type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fmenu_005f0.setImg("css/navImg/data.gif");
    int _jspx_eval_gl_005fmenu_005f0 = _jspx_th_gl_005fmenu_005f0.doStartTag();
    if (_jspx_eval_gl_005fmenu_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_gl_005fmenu_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_gl_005fmenu_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_gl_005fmenu_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("   \t\t<item code=\"\" onclick=\"go('cms/catalog.do','内容管理','code_mod.gif')\" enabled=\"false\" text=\"内容管理\" img=\"css/navImg/7-7.gif\" />\r\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_gl_005fmenu_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_gl_005fmenu_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_gl_005fmenu_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fgl_005fmenu_0026_005ftitle_005fimg_005fid_005fcode.reuse(_jspx_th_gl_005fmenu_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fgl_005fmenu_0026_005ftitle_005fimg_005fid_005fcode.reuse(_jspx_th_gl_005fmenu_005f0);
    return false;
  }

  private boolean _jspx_meth_gl_005fmenu_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  gl:menu
    com.liusy.core.web.tag.MenuTag _jspx_th_gl_005fmenu_005f1 = (com.liusy.core.web.tag.MenuTag) _005fjspx_005ftagPool_005fgl_005fmenu_0026_005ftitle_005fimg_005fid_005fcode.get(com.liusy.core.web.tag.MenuTag.class);
    _jspx_th_gl_005fmenu_005f1.setPageContext(_jspx_page_context);
    _jspx_th_gl_005fmenu_005f1.setParent(null);
    // /main.jsp(285,1) name = code type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fmenu_005f1.setCode("");
    // /main.jsp(285,1) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fmenu_005f1.setId("div5");
    // /main.jsp(285,1) name = title type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fmenu_005f1.setTitle("系统代码管理");
    // /main.jsp(285,1) name = img type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fmenu_005f1.setImg("css/navImg/data.gif");
    int _jspx_eval_gl_005fmenu_005f1 = _jspx_th_gl_005fmenu_005f1.doStartTag();
    if (_jspx_eval_gl_005fmenu_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_gl_005fmenu_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_gl_005fmenu_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_gl_005fmenu_005f1.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("   <item code=\"A9904\" onclick=\"go('system/sysCode.do','系统代码管理','code_mod.gif')\" enabled=\"false\" text=\"系统代码管理\" img=\"css/navImg/7-7.gif\" />\r\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_gl_005fmenu_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_gl_005fmenu_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_gl_005fmenu_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fgl_005fmenu_0026_005ftitle_005fimg_005fid_005fcode.reuse(_jspx_th_gl_005fmenu_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fgl_005fmenu_0026_005ftitle_005fimg_005fid_005fcode.reuse(_jspx_th_gl_005fmenu_005f1);
    return false;
  }

  private boolean _jspx_meth_gl_005fmenu_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  gl:menu
    com.liusy.core.web.tag.MenuTag _jspx_th_gl_005fmenu_005f2 = (com.liusy.core.web.tag.MenuTag) _005fjspx_005ftagPool_005fgl_005fmenu_0026_005ftitle_005fimg_005fid_005fcode.get(com.liusy.core.web.tag.MenuTag.class);
    _jspx_th_gl_005fmenu_005f2.setPageContext(_jspx_page_context);
    _jspx_th_gl_005fmenu_005f2.setParent(null);
    // /main.jsp(289,4) name = code type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fmenu_005f2.setCode("A99");
    // /main.jsp(289,4) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fmenu_005f2.setId("div9");
    // /main.jsp(289,4) name = title type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fmenu_005f2.setTitle("系统管理");
    // /main.jsp(289,4) name = img type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fmenu_005f2.setImg("css/navImg/set.gif");
    int _jspx_eval_gl_005fmenu_005f2 = _jspx_th_gl_005fmenu_005f2.doStartTag();
    if (_jspx_eval_gl_005fmenu_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_gl_005fmenu_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_gl_005fmenu_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_gl_005fmenu_005f2.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("            <item code=\"A9901\" onclick=\"go('system/sysOrg.do','组织机构管理','house_big.gif')\" text=\"组织机构管理\" img=\"css/navImg/7-1.gif\" />\r\n");
        out.write("            <item code=\"A9902\" onclick=\"go('system/sysRole.do','角色权限管理','people.gif')\" text=\"角色权限管理\" img=\"css/navImg/7-2.gif\" />\r\n");
        out.write("            <item code=\"A9903\" onclick=\"go('system/sysUser.do','用户管理','men.gif')\" text=\"用户管理\" img=\"css/navImg/7-3.gif\" />\r\n");
        out.write("            <item code=\"A9905\" type=\"separator\"/>\r\n");
        out.write("            <item code=\"\" onclick=\"goChangePwd()\" text=\"修改密码\" img=\"css/navImg/7-4.gif\" />\r\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_gl_005fmenu_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_gl_005fmenu_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_gl_005fmenu_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fgl_005fmenu_0026_005ftitle_005fimg_005fid_005fcode.reuse(_jspx_th_gl_005fmenu_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fgl_005fmenu_0026_005ftitle_005fimg_005fid_005fcode.reuse(_jspx_th_gl_005fmenu_005f2);
    return false;
  }
}
