package org.apache.jsp.cms.ueditor;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ueditor_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <script id=\"editor\" type=\"text/plain\" style=\"width:1024px;height:500px;\"></script>\r\n");
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
