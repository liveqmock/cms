package org.apache.jsp.cms.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CatalogItem_005fadd_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/cms/admin/../ueditor/ueditor.jsp");
    _jspx_dependants.add("/common/resize.jsp");
    _jspx_dependants.add("/WEB-INF/tag/gl-tag.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fescape_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fform_0026_005fnamespace_005fmethod_005fid_005fenctype_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ffile_0026_005ftheme_005fonChange_005fname_005flabel_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fselect_0026_005fvalue_005fname_005flistValue_005flistKey_005flist_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftextarea_0026_005frows_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fgl_005fbutton_0026_005fonClick_005fname;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fescape_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fform_0026_005fnamespace_005fmethod_005fid_005fenctype_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ffile_0026_005ftheme_005fonChange_005fname_005flabel_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fvalue_005fname_005flistValue_005flistKey_005flist_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ftextarea_0026_005frows_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fgl_005fbutton_0026_005fonClick_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fescape_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fform_0026_005fnamespace_005fmethod_005fid_005fenctype_005faction.release();
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005ffile_0026_005ftheme_005fonChange_005fname_005flabel_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fvalue_005fname_005flistValue_005flistKey_005flist_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005ftextarea_0026_005frows_005fname_005fnobody.release();
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
      out.write("      var contextpath = \"");
      out.print(CONTEXT_PATH);
      out.write("\";\t\r\n");
      out.write("      var fulllink =contextpath + \"cms/catalog.do\";\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\tfunction goCancel(){\r\n");
      out.write("\t\tparent.closedialog(false);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction goSubmit(){\r\n");
      out.write("\t\t  if(!checkString(getElement('record.subject'),\"主题\",60,true)) return;\r\n");
      out.write("\t\t  if(!checkNumeric(getElement('record.status'),\"状态\",6,true,true)) return;\r\n");
      out.write("\t\t  if(!checkString(getElement('record.remark'),\"备注\",200,false)) return;\r\n");
      out.write("\t\tgetElement('record.centent').value=UE.getEditor('editor').getContent();\r\n");
      out.write("\t\tif(getElement('record.id')!='')\r\n");
      out.write("\t\tdocument.forms[0].action=fulllink+\"?action=updateCatalogItem\";\r\n");
      out.write("\t\telse\r\n");
      out.write("\t\tdocument.forms[0].action=fulllink+\"?action=saveCatalogItem\";\r\n");
      out.write("    \tdocument.forms[0].submit();\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("  function closedialog(ret,str,str1){\r\n");
      out.write("     dhxWins.window(winName).close();\r\n");
      out.write("     if(ret==true) {\r\n");
      out.write("        $$('roleIds').value=str;\r\n");
      out.write("        $$('roleNames').value=str1;\r\n");
      out.write("     }\t\r\n");
      out.write("  }\t\r\n");
      out.write("  \r\n");
      out.write("  function init(){\r\n");
      out.write("\t  showMessage('");
      if (_jspx_meth_s_005fproperty_005f0(_jspx_page_context))
        return;
      out.write("')\r\n");
      out.write("\t   UE.getEditor('editor').setContent(getElement('record.centent').value);\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  function imgChange(){\r\n");
      out.write("//  alert(getElement('image').value);\r\n");
      out.write(" // getElement('record.img').src = getElement('image').value;\r\n");
      out.write("  }\r\n");
      out.write("\t\r\n");
      out.write("\t</script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("   html, body {width:100%; height:100%; margin:0px; padding:0px; overflow:hidden;}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body onload=\"init()\">\r\n");
      out.write("<div id=\"formDiv\" class=\"formDiv\">\r\n");
      out.write("  ");
      //  s:form
      org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_005fform_005f0 = (org.apache.struts2.views.jsp.ui.FormTag) _005fjspx_005ftagPool_005fs_005fform_0026_005fnamespace_005fmethod_005fid_005fenctype_005faction.get(org.apache.struts2.views.jsp.ui.FormTag.class);
      _jspx_th_s_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_s_005fform_005f0.setParent(null);
      // /cms/admin/CatalogItem_add.jsp(69,2) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fform_005f0.setAction("sysCode");
      // /cms/admin/CatalogItem_add.jsp(69,2) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fform_005f0.setId("codeForm");
      // /cms/admin/CatalogItem_add.jsp(69,2) name = enctype type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fform_005f0.setEnctype("multipart/form-data");
      // /cms/admin/CatalogItem_add.jsp(69,2) name = method type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fform_005f0.setMethod("post");
      // /cms/admin/CatalogItem_add.jsp(69,2) name = namespace type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
          out.write("  \t");
          if (_jspx_meth_s_005fhidden_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("   \t");
          if (_jspx_meth_s_005fhidden_005f1(_jspx_th_s_005fform_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("   \t");
          if (_jspx_meth_s_005fhidden_005f2(_jspx_th_s_005fform_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t<table id=\"tblForm\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"formTable\">\r\n");
          out.write("\t\t\t <tr>\r\n");
          out.write("\t\t\t\t<td width=\"5%\"  class=\"textR\">主题：</td>\r\n");
          out.write("\t\t\t\t<td width=\"20%\">\r\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_s_005ftextfield_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<td width=\"100%\"  rowspan=\"6\">\r\n");
          out.write("\t\t\t\t\t");
          out.write("    <script type=\"text/javascript\" charset=\"utf-8\" src=\"");
          out.print(CONTEXT_PATH);
          out.write("/cms/ueditor/ueditor.config.js\"></script>\r\n");
          out.write("    <script type=\"text/javascript\" charset=\"utf-8\" src=\"");
          out.print(CONTEXT_PATH);
          out.write("/cms/ueditor/ueditor.all.min.js\"> </script>\r\n");
          out.write("    <!--å»ºè®®æå¨å å¨è¯­è¨ï¼é¿åå¨ieä¸ææ¶å ä¸ºå è½½è¯­è¨å¤±è´¥å¯¼è´ç¼è¾å¨å è½½å¤±è´¥-->\r\n");
          out.write("    <!--è¿éå è½½çè¯­è¨æä»¶ä¼è¦çä½ å¨éç½®é¡¹ç®éæ·»å çè¯­è¨ç±»åï¼æ¯å¦ä½ å¨éç½®é¡¹ç®ééç½®çæ¯è±æï¼è¿éå è½½çä¸­æï¼é£æåå°±æ¯ä¸­æ-->\r\n");
          out.write("    <script type=\"text/javascript\" charset=\"utf-8\" src=\"");
          out.print(CONTEXT_PATH);
          out.write("/cms/ueditor/lang/zh-cn/zh-cn.js\"></script>\r\n");
          out.write("\r\n");
          out.write("    <style type=\"text/css\">\r\n");
          out.write("        div{\r\n");
          out.write("            width:100%;\r\n");
          out.write("        }\r\n");
          out.write("    </style>\r\n");
          out.write("<div>\r\n");
          out.write("    <script id=\"editor\" type=\"text/plain\" style=\"width:800px;height:400px;\"></script>\r\n");
          out.write("</div>\r\n");
          out.write("<script type=\"text/javascript\">\r\n");
          out.write("\r\n");
          out.write("    //å®ä¾åç¼è¾å¨\r\n");
          out.write("    //å»ºè®®ä½¿ç¨å·¥åæ¹æ³getEditoråå»ºåå¼ç¨ç¼è¾å¨å®ä¾ï¼å¦æå¨æä¸ªé­åä¸å¼ç¨è¯¥ç¼è¾å¨ï¼ç´æ¥è°ç¨UE.getEditor('editor')å°±è½æ¿å°ç¸å³çå®ä¾\r\n");
          out.write("    var ue = UE.getEditor('editor');\r\n");
          out.write("\r\n");
          out.write("    function isFocus(e){\r\n");
          out.write("        alert(UE.getEditor('editor').isFocus());\r\n");
          out.write("        UE.dom.domUtils.preventDefault(e)\r\n");
          out.write("    }\r\n");
          out.write("    function setblur(e){\r\n");
          out.write("        UE.getEditor('editor').blur();\r\n");
          out.write("        UE.dom.domUtils.preventDefault(e)\r\n");
          out.write("    }\r\n");
          out.write("    function insertHtml() {\r\n");
          out.write("        var value = prompt('æå¥htmlä»£ç ', '');\r\n");
          out.write("        UE.getEditor('editor').execCommand('insertHtml', value)\r\n");
          out.write("    }\r\n");
          out.write("    function createEditor() {\r\n");
          out.write("        enableBtn();\r\n");
          out.write("        UE.getEditor('editor');\r\n");
          out.write("    }\r\n");
          out.write("    function getAllHtml() {\r\n");
          out.write("        alert(UE.getEditor('editor').getAllHtml())\r\n");
          out.write("    }\r\n");
          out.write("    function getContent() {\r\n");
          out.write("        var arr = [];\r\n");
          out.write("        arr.push(\"ä½¿ç¨editor.getContent()æ¹æ³å¯ä»¥è·å¾ç¼è¾å¨çåå®¹\");\r\n");
          out.write("        arr.push(\"åå®¹ä¸ºï¼\");\r\n");
          out.write("        arr.push(UE.getEditor('editor').getContent());\r\n");
          out.write("        alert(arr.join(\"\\n\"));\r\n");
          out.write("    }\r\n");
          out.write("    function getPlainTxt() {\r\n");
          out.write("        var arr = [];\r\n");
          out.write("        arr.push(\"ä½¿ç¨editor.getPlainTxt()æ¹æ³å¯ä»¥è·å¾ç¼è¾å¨çå¸¦æ ¼å¼ççº¯ææ¬åå®¹\");\r\n");
          out.write("        arr.push(\"åå®¹ä¸ºï¼\");\r\n");
          out.write("        arr.push(UE.getEditor('editor').getPlainTxt());\r\n");
          out.write("        alert(arr.join('\\n'))\r\n");
          out.write("    }\r\n");
          out.write("    function setContent(isAppendTo) {\r\n");
          out.write("        var arr = [];\r\n");
          out.write("        arr.push(\"ä½¿ç¨editor.setContent('æ¬¢è¿ä½¿ç¨ueditor')æ¹æ³å¯ä»¥è®¾ç½®ç¼è¾å¨çåå®¹\");\r\n");
          out.write("        UE.getEditor('editor').setContent('æ¬¢è¿ä½¿ç¨ueditor', isAppendTo);\r\n");
          out.write("        alert(arr.join(\"\\n\"));\r\n");
          out.write("    }\r\n");
          out.write("    function setDisabled() {\r\n");
          out.write("        UE.getEditor('editor').setDisabled('fullscreen');\r\n");
          out.write("        disableBtn(\"enable\");\r\n");
          out.write("    }\r\n");
          out.write("\r\n");
          out.write("    function setEnabled() {\r\n");
          out.write("        UE.getEditor('editor').setEnabled();\r\n");
          out.write("        enableBtn();\r\n");
          out.write("    }\r\n");
          out.write("\r\n");
          out.write("    function getText() {\r\n");
          out.write("        //å½ä½ ç¹å»æé®æ¶ç¼è¾åºåå·²ç»å¤±å»äºç¦ç¹ï¼å¦æç´æ¥ç¨getTextå°ä¸ä¼å¾å°åå®¹ï¼æä»¥è¦å¨éåæ¥ï¼ç¶ååå¾åå®¹\r\n");
          out.write("        var range = UE.getEditor('editor').selection.getRange();\r\n");
          out.write("        range.select();\r\n");
          out.write("        var txt = UE.getEditor('editor').selection.getText();\r\n");
          out.write("        alert(txt)\r\n");
          out.write("    }\r\n");
          out.write("\r\n");
          out.write("    function getContentTxt() {\r\n");
          out.write("        var arr = [];\r\n");
          out.write("        arr.push(\"ä½¿ç¨editor.getContentTxt()æ¹æ³å¯ä»¥è·å¾ç¼è¾å¨ççº¯ææ¬åå®¹\");\r\n");
          out.write("        arr.push(\"ç¼è¾å¨ççº¯ææ¬åå®¹ä¸ºï¼\");\r\n");
          out.write("        arr.push(UE.getEditor('editor').getContentTxt());\r\n");
          out.write("        alert(arr.join(\"\\n\"));\r\n");
          out.write("    }\r\n");
          out.write("    function hasContent() {\r\n");
          out.write("        var arr = [];\r\n");
          out.write("        arr.push(\"ä½¿ç¨editor.hasContents()æ¹æ³å¤æ­ç¼è¾å¨éæ¯å¦æåå®¹\");\r\n");
          out.write("        arr.push(\"å¤æ­ç»æä¸ºï¼\");\r\n");
          out.write("        arr.push(UE.getEditor('editor').hasContents());\r\n");
          out.write("        alert(arr.join(\"\\n\"));\r\n");
          out.write("    }\r\n");
          out.write("    function setFocus() {\r\n");
          out.write("        UE.getEditor('editor').focus();\r\n");
          out.write("    }\r\n");
          out.write("    function deleteEditor() {\r\n");
          out.write("        disableBtn();\r\n");
          out.write("        UE.getEditor('editor').destroy();\r\n");
          out.write("    }\r\n");
          out.write("    function disableBtn(str) {\r\n");
          out.write("        var div = document.getElementById('btns');\r\n");
          out.write("        var btns = UE.dom.domUtils.getElementsByTagName(div, \"button\");\r\n");
          out.write("        for (var i = 0, btn; btn = btns[i++];) {\r\n");
          out.write("            if (btn.id == str) {\r\n");
          out.write("                UE.dom.domUtils.removeAttributes(btn, [\"disabled\"]);\r\n");
          out.write("            } else {\r\n");
          out.write("                btn.setAttribute(\"disabled\", \"true\");\r\n");
          out.write("            }\r\n");
          out.write("        }\r\n");
          out.write("    }\r\n");
          out.write("    function enableBtn() {\r\n");
          out.write("        var div = document.getElementById('btns');\r\n");
          out.write("        var btns = UE.dom.domUtils.getElementsByTagName(div, \"button\");\r\n");
          out.write("        for (var i = 0, btn; btn = btns[i++];) {\r\n");
          out.write("            UE.dom.domUtils.removeAttributes(btn, [\"disabled\"]);\r\n");
          out.write("        }\r\n");
          out.write("    }\r\n");
          out.write("\r\n");
          out.write("    function getLocalData () {\r\n");
          out.write("        alert(UE.getEditor('editor').execCommand( \"getlocaldata\" ));\r\n");
          out.write("    }\r\n");
          out.write("\r\n");
          out.write("    function clearLocalData () {\r\n");
          out.write("        UE.getEditor('editor').execCommand( \"clearlocaldata\" );\r\n");
          out.write("        alert(\"å·²æ¸ç©ºèç¨¿ç®±\")\r\n");
          out.write("    }\r\n");
          out.write("</script>");
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t</tr>\r\n");
          out.write("\t\t\t<tr>\r\n");
          out.write("\t\t\t\t<td class=\"textR\" colspan=\"2\">");
          if (_jspx_meth_s_005ffile_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("\t\t\t</tr>\r\n");
          out.write("\t\t\t<tr>\r\n");
          out.write("\t\t\t\t<td class=\"textR\" colspan=\"2\"><img name=\"record.img\" src=\"");
          out.print( CONTEXT_PATH );
          out.write("/cms/images/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${record.img}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"/></td>\r\n");
          out.write("\t\t\t</tr>\r\n");
          out.write("\t\t\t<tr>\r\n");
          out.write("\t\t\t\t<td class=\"textR\">状态：</td>\r\n");
          out.write("\t\t\t\t<td >\r\n");
          out.write("\t\t\t\t\t ");
          if (_jspx_meth_s_005fselect_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t<td class=\"textR\" valign=\"top\">类型：</td>\r\n");
          out.write("\t\t\t\t<td >\r\n");
          out.write("\t\t\t\t\t ");
          if (_jspx_meth_s_005fselect_005f1(_jspx_th_s_005fform_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t</tr>\r\n");
          out.write("\t\t\t<tr>\r\n");
          out.write("\t\t\t\t<td class=\"textR\" valign=\"top\">备注：</td>\r\n");
          out.write("\t\t\t\t<td>\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_s_005ftextarea_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t</tr>\r\n");
          out.write("\t \t\t</table>\r\n");
          out.write("\t\t\t\r\n");
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
        _005fjspx_005ftagPool_005fs_005fform_0026_005fnamespace_005fmethod_005fid_005fenctype_005faction.reuse(_jspx_th_s_005fform_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fs_005fform_0026_005fnamespace_005fmethod_005fid_005fenctype_005faction.reuse(_jspx_th_s_005fform_005f0);
      out.write("\t\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"btnDiv\" class=\"btnDiv\">\r\n");
      out.write("\t\t\t      ");
      if (_jspx_meth_gl_005fbutton_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t    &nbsp;\r\n");
      out.write("\t\t\t      ");
      if (_jspx_meth_gl_005fbutton_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t    &nbsp;\r\n");
      out.write("\t\t\t      ");
      if (_jspx_meth_gl_005fbutton_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</div>\t  \r\n");
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
      out.write("</script>\r\n");
      out.write("</body>\r\n");
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

  private boolean _jspx_meth_s_005fproperty_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f0 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fescape_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f0.setParent(null);
    // /cms/admin/CatalogItem_add.jsp(52,16) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f0.setValue("errorMessage");
    // /cms/admin/CatalogItem_add.jsp(52,16) name = escape type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f0.setEscape(false);
    int _jspx_eval_s_005fproperty_005f0 = _jspx_th_s_005fproperty_005f0.doStartTag();
    if (_jspx_th_s_005fproperty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fescape_005fnobody.reuse(_jspx_th_s_005fproperty_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fescape_005fnobody.reuse(_jspx_th_s_005fproperty_005f0);
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
    // /cms/admin/CatalogItem_add.jsp(70,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f0.setName("record.id");
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
    // /cms/admin/CatalogItem_add.jsp(71,4) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f1.setName("record.catalogId");
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
    // /cms/admin/CatalogItem_add.jsp(72,4) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f2.setName("record.centent");
    int _jspx_eval_s_005fhidden_005f2 = _jspx_th_s_005fhidden_005f2.doStartTag();
    if (_jspx_th_s_005fhidden_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fnobody.reuse(_jspx_th_s_005fhidden_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fname_005fnobody.reuse(_jspx_th_s_005fhidden_005f2);
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
    // /cms/admin/CatalogItem_add.jsp(77,4) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setName("record.subject");
    int _jspx_eval_s_005ftextfield_005f0 = _jspx_th_s_005ftextfield_005f0.doStartTag();
    if (_jspx_th_s_005ftextfield_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftextfield_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftextfield_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005ffile_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:file
    org.apache.struts2.views.jsp.ui.FileTag _jspx_th_s_005ffile_005f0 = (org.apache.struts2.views.jsp.ui.FileTag) _005fjspx_005ftagPool_005fs_005ffile_0026_005ftheme_005fonChange_005fname_005flabel_005fnobody.get(org.apache.struts2.views.jsp.ui.FileTag.class);
    _jspx_th_s_005ffile_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005ffile_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /cms/admin/CatalogItem_add.jsp(84,34) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ffile_005f0.setLabel("图片");
    // /cms/admin/CatalogItem_add.jsp(84,34) name = theme type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ffile_005f0.setTheme("simple");
    // /cms/admin/CatalogItem_add.jsp(84,34) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ffile_005f0.setName("image");
    // /cms/admin/CatalogItem_add.jsp(84,34) null
    _jspx_th_s_005ffile_005f0.setDynamicAttribute(null, "onChange", new String("imgChange();"));
    int _jspx_eval_s_005ffile_005f0 = _jspx_th_s_005ffile_005f0.doStartTag();
    if (_jspx_th_s_005ffile_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ffile_0026_005ftheme_005fonChange_005fname_005flabel_005fnobody.reuse(_jspx_th_s_005ffile_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ffile_0026_005ftheme_005fonChange_005fname_005flabel_005fnobody.reuse(_jspx_th_s_005ffile_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fselect_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:select
    org.apache.struts2.views.jsp.ui.SelectTag _jspx_th_s_005fselect_005f0 = (org.apache.struts2.views.jsp.ui.SelectTag) _005fjspx_005ftagPool_005fs_005fselect_0026_005fvalue_005fname_005flistValue_005flistKey_005flist_005fnobody.get(org.apache.struts2.views.jsp.ui.SelectTag.class);
    _jspx_th_s_005fselect_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fselect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /cms/admin/CatalogItem_add.jsp(92,6) name = list type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setList("codeSets.CODE_STATUS");
    // /cms/admin/CatalogItem_add.jsp(92,6) name = listKey type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setListKey("value");
    // /cms/admin/CatalogItem_add.jsp(92,6) name = listValue type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setListValue("codeName");
    // /cms/admin/CatalogItem_add.jsp(92,6) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setName("record.status");
    // /cms/admin/CatalogItem_add.jsp(92,6) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setValue("record.status");
    int _jspx_eval_s_005fselect_005f0 = _jspx_th_s_005fselect_005f0.doStartTag();
    if (_jspx_th_s_005fselect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fselect_0026_005fvalue_005fname_005flistValue_005flistKey_005flist_005fnobody.reuse(_jspx_th_s_005fselect_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fvalue_005fname_005flistValue_005flistKey_005flist_005fnobody.reuse(_jspx_th_s_005fselect_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fselect_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:select
    org.apache.struts2.views.jsp.ui.SelectTag _jspx_th_s_005fselect_005f1 = (org.apache.struts2.views.jsp.ui.SelectTag) _005fjspx_005ftagPool_005fs_005fselect_0026_005fvalue_005fname_005flistValue_005flistKey_005flist_005fnobody.get(org.apache.struts2.views.jsp.ui.SelectTag.class);
    _jspx_th_s_005fselect_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fselect_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /cms/admin/CatalogItem_add.jsp(98,6) name = list type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setList("codeSets.CATALOGITEM_ITEM");
    // /cms/admin/CatalogItem_add.jsp(98,6) name = listKey type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setListKey("value");
    // /cms/admin/CatalogItem_add.jsp(98,6) name = listValue type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setListValue("codeName");
    // /cms/admin/CatalogItem_add.jsp(98,6) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setName("record.type");
    // /cms/admin/CatalogItem_add.jsp(98,6) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setValue("record.type");
    int _jspx_eval_s_005fselect_005f1 = _jspx_th_s_005fselect_005f1.doStartTag();
    if (_jspx_th_s_005fselect_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fselect_0026_005fvalue_005fname_005flistValue_005flistKey_005flist_005fnobody.reuse(_jspx_th_s_005fselect_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fvalue_005fname_005flistValue_005flistKey_005flist_005fnobody.reuse(_jspx_th_s_005fselect_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005ftextarea_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textarea
    org.apache.struts2.views.jsp.ui.TextareaTag _jspx_th_s_005ftextarea_005f0 = (org.apache.struts2.views.jsp.ui.TextareaTag) _005fjspx_005ftagPool_005fs_005ftextarea_0026_005frows_005fname_005fnobody.get(org.apache.struts2.views.jsp.ui.TextareaTag.class);
    _jspx_th_s_005ftextarea_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextarea_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /cms/admin/CatalogItem_add.jsp(104,5) name = rows type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextarea_005f0.setRows("5");
    // /cms/admin/CatalogItem_add.jsp(104,5) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextarea_005f0.setName("record.remark");
    int _jspx_eval_s_005ftextarea_005f0 = _jspx_th_s_005ftextarea_005f0.doStartTag();
    if (_jspx_th_s_005ftextarea_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextarea_0026_005frows_005fname_005fnobody.reuse(_jspx_th_s_005ftextarea_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextarea_0026_005frows_005fname_005fnobody.reuse(_jspx_th_s_005ftextarea_005f0);
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
    // /cms/admin/CatalogItem_add.jsp(112,9) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fbutton_005f0.setName("btnAdd");
    // /cms/admin/CatalogItem_add.jsp(112,9) name = onClick type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /cms/admin/CatalogItem_add.jsp(114,9) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fbutton_005f1.setName("btnCancel");
    // /cms/admin/CatalogItem_add.jsp(114,9) name = onClick type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /cms/admin/CatalogItem_add.jsp(116,9) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_gl_005fbutton_005f2.setName("btnReset");
    // /cms/admin/CatalogItem_add.jsp(116,9) name = onClick type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
