package org.apache.jsp.cms.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Catalog_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');

	String path = request.getContextPath();
	String CONTEXT_PATH = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("  <head>\r\n");
      out.write("\t<title></title>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(CONTEXT_PATH);
      out.write("dhtmlx/dhtmlx.css\"/>\r\n");
      out.write("<script src=\"");
      out.print(CONTEXT_PATH);
      out.write("dhtmlx/dhtmlx.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print( CONTEXT_PATH);
      out.write("css/main.css\" />\r\n");
      out.write("    <script language=\"javascript\" src=\"");
      out.print( CONTEXT_PATH );
      out.write("js/ctrl_util.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tvar contextpath = \"");
      out.print( CONTEXT_PATH);
      out.write("\";\r\n");
      out.write("\t\tvar hyperlink = \"../cms/catalog.do\";\r\n");
      out.write("\t\tvar fulllink = contextpath + \"cms/catalog.do\";\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t\tfunction modifycodeset() {\r\n");
      out.write("\t\t\tvar mygrid=dhxLayout.cells(\"b\")._frame.contentWindow.mygrid;\r\n");
      out.write("\t\t\tvar id = findSelected(\"修改\",mygrid);\r\n");
      out.write("\t\t\tif(id == \"\") return;\r\n");
      out.write("\t\t\tvar rulcodesetedit=fulllink+'?action=editCatalog&ids='+id;\r\n");
      out.write("\t\t\topenWindow(\"修改代码\", rulcodesetedit, 500, 300);\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction deletecodeset(codesetid) {\r\n");
      out.write("\t\t\tvar mygrid=dhxLayout.cells(\"b\")._frame.contentWindow.mygrid;\r\n");
      out.write("\t\t\tvar id = findMultiSelected(\"删除\",mygrid);\r\n");
      out.write("\t\t\tif(id == \"\") return;\r\n");
      out.write("\t\t\tvar res = confirm(\"是否真的要删除?\");\r\n");
      out.write("\t\t\tif(res == true) {\r\n");
      out.write("\t\t\t\tvar innerDoc;\r\n");
      out.write("\t\t\t\tif (_isIE) {\r\n");
      out.write("\t\t\t\t\tinnerDoc = dhxLayout.cells(\"b\")._frame.contentWindow.document;\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\tinnerDoc = dhxLayout.cells(\"b\")._frame.contentDocument;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tinnerDoc.forms[0].action = hyperlink + \"?action=deleteCatalog&ids=\" + id+\"&catalogId=\"+codesetid;\r\n");
      out.write("\t\t\t\tinnerDoc.forms[0].target = \"_self\";\r\n");
      out.write("\t\t\t\tinnerDoc.forms[0].submit();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction addCatalog(catalogId) {\r\n");
      out.write("\t\t\topenWindow('添加目录', fulllink+'?action=addCatalog&catalogId='+catalogId, 500, 300);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction modifyCatalog(catalogId) {\r\n");
      out.write("\t\t\tif(catalogId == \"\") return;\r\n");
      out.write("\t\t\tvar rulcodesetedit=fulllink+'?action=editCatalog&catalogId='+catalogId;\r\n");
      out.write("\t\t\topenWindow(\"修改目录\", rulcodesetedit, 500, 300);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction deleteCatalog(catalogId) {\r\n");
      out.write("\t\t\tif(catalogId == \"\") return;\r\n");
      out.write("\t\t\tvar res = confirm(\"是否真的要删除?\");\r\n");
      out.write("\t\t\tif(res == true) {\r\n");
      out.write("\t\t\tvar data = ajaxSubmit(fulllink + \"?action=deleteCatalog&catalogId=\"+catalogId,null);\r\n");
      out.write("\t\t\tif(data.status=='success')\r\n");
      out.write("\t\t\t\treTreeLoad();\r\n");
      out.write("\t\t\telse\t\r\n");
      out.write("\t\t\t\talert('删除失败！');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction view() {\r\n");
      out.write("\t\t\tvar id = dhxLayout.cells(\"b\")._frame.contentWindow.getModifyId();\r\n");
      out.write("\t\t\tif(id == \"\") return;\r\n");
      out.write("\t\t\tvar urllink = contextpath+\"system/sysCode.do\"+\"?action=CODELIST&catalogId=\"+id;\r\n");
      out.write("\t\t\topenWindow('浏览系统代码值',  urllink, 600, 250);\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction viewCodesetGrid(id){\r\n");
      out.write("      if(id==null||id==\"\"||id==\"root\") {\r\n");
      out.write("      \trightPanel.attachURL(\"");
      out.print( CONTEXT_PATH);
      out.write("dhtmlx/imgs/blank.html\");\r\n");
      out.write("         toolbar.disableItem(\"new_codeset\");\r\n");
      out.write("         toolbar.disableItem(\"modify_codeset\");\r\n");
      out.write("         toolbar.disableItem(\"del_codeset\");\r\n");
      out.write("      }\t\r\n");
      out.write("    \telse {\r\n");
      out.write("    \t rightPanel.attachURL(\"");
      out.print( CONTEXT_PATH);
      out.write("cms/catalog.do?action=catalogItemList&catalogId=\"+id);\r\n");
      out.write("         toolbar.enableItem(\"new_codeset\");\r\n");
      out.write("         toolbar.enableItem(\"modify_codeset\");\r\n");
      out.write("         toolbar.enableItem(\"del_codeset\");\r\n");
      out.write("    \t}   \r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("   html, body {width:100%; height:100%;}\r\n");
      out.write("</style>\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"div_left\" style=\"background-color:#e8f0f8;height:100%;width:100%;\"></div>\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tvar operate='';\r\n");
      out.write("\t\tvar dhxLayout = new dhtmlXLayoutObject(document.body, \"2U\");\r\n");
      out.write("    \tdhxLayout.setSkin(\"dhx_skyblue\");\r\n");
      out.write("    \tdhxLayout.setImagePath(\"");
      out.print( CONTEXT_PATH);
      out.write("dhtmlx/imgs/dhxlayout_dhx_blue/\");\r\n");
      out.write("    \tvar leftPanel=dhxLayout.cells(\"a\");\r\n");
      out.write("    \tvar rightPanel=dhxLayout.cells(\"b\");\r\n");
      out.write("    \tleftPanel.hideHeader();\r\n");
      out.write("    \tleftPanel.attachObject(\"div_left\");\r\n");
      out.write("    \tleftPanel.setWidth(250);\r\n");
      out.write("    \trightPanel.hideHeader();\r\n");
      out.write("\r\n");
      out.write("\t\tvar toolbar = dhxLayout.attachToolbar();\r\n");
      out.write("\t\ttoolbar.setIconsPath(\"");
      out.print( CONTEXT_PATH);
      out.write("dhtmlx/imgs/icon/\");\r\n");
      out.write("\t\ttoolbar.addButton(\"new_codeset\", 0, \"添加目录\", \"code_add.gif\", \"code_add.gif\");\r\n");
      out.write("    \ttoolbar.addSeparator(\"sep1\", 1);\r\n");
      out.write("\t\ttoolbar.addButton(\"modify_codeset\", 2, \"修改目录\", \"code_mod.gif\", \"code_mod.gif\");\r\n");
      out.write("    \ttoolbar.addSeparator(\"sep2\", 3);\r\n");
      out.write("\t\ttoolbar.addButton(\"del_codeset\", 4, \"删除目录\", \"code_del.gif\", \"code_del.gif\");\r\n");
      out.write("\t\ttoolbar.attachEvent(\"onClick\", function(id){\r\n");
      out.write("\t\t\tif(id==\"new_codeset\") {\r\n");
      out.write("\t\t\t\tvar nodeId=tree.getSelectedItemId();\r\n");
      out.write("\t\t\t\taddCatalog(nodeId);\r\n");
      out.write("\t\t\t\toperate='tree';\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\telse if(id==\"modify_codeset\")\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tvar nodeId=tree.getSelectedItemId();\r\n");
      out.write("\t\t\t \tmodifyCatalog(nodeId);\r\n");
      out.write("\t\t\t \toperate='tree';\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\telse if(id==\"del_codeset\") {\r\n");
      out.write("\t\t\t\tvar nodeId=tree.getSelectedItemId();\r\n");
      out.write("\t\t\t\tif(nodeId=='1')return;\r\n");
      out.write("\t\t\t\tdeleteCatalog(nodeId);\r\n");
      out.write("\t\t\t\t\toperate='tree';\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\tvar tree = new dhtmlXTreeObject(\"div_left\",\"100%\",\"100%\",0);\r\n");
      out.write("\t\ttree.setImagePath(\"");
      out.print(CONTEXT_PATH);
      out.write("dhtmlx/imgs/\");\r\n");
      out.write("\t\ttree.attachEvent(\"onMouseIn\", function(id){\r\n");
      out.write("\t\t\tvar str=tree.getUserData(id,\"name\");\r\n");
      out.write("\t\t\ttree.setItemText(id,\"<font color='#FF4422'>\"+str+\"</font>\");\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\ttree.attachEvent(\"onMouseOut\", function(id){\r\n");
      out.write("\t\t\tvar str=tree.getUserData(id,\"name\");\r\n");
      out.write("\t\t\ttree.setItemText(id,str);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\ttree.attachEvent(\"onClick\", function(id){\r\n");
      out.write("\t\t\tviewCodesetGrid(id);\r\n");
      out.write("\t\t});\r\n");
      out.write("    \ttree.setSkin('dhx_blue');\r\n");
      out.write("\t\t//tree.setXMLAutoLoading(\"");
      out.print( CONTEXT_PATH);
      out.write("cms/catalog.do?action=getTree\");\r\n");
      out.write("\t\t//tree.loadXML(\"");
      out.print( CONTEXT_PATH);
      out.write("cms/catalog.do?action=getTree\");\r\n");
      out.write("\r\n");
      out.write("\t\tvar dhxWins = dhxLayout.dhxWins;\r\n");
      out.write("\t\tvar winName=\"winCodeset\";   //打开窗口名称\r\n");
      out.write("\t   var editMode;       \t\t//页面编辑状态：ADD,EDIT,DELETE\r\n");
      out.write("\t\tdhxWins.enableAutoViewport(true);\r\n");
      out.write("\t\tdhxWins.setImagePath(\"");
      out.print( CONTEXT_PATH);
      out.write("dhtmlx/imgs/\");\r\n");
      out.write("\r\n");
      out.write("\t\tfunction openWindow(title,urlink,width,height){\r\n");
      out.write("\t\t\tvar w = dhxWins.createWindow(winName, 0, 0, width,height);\r\n");
      out.write("\t\t\tw.setText(title);\r\n");
      out.write("\t\t\tw.keepInViewport(true);\r\n");
      out.write("\t\t\tw.setModal(true);\r\n");
      out.write("\t\t\tw.centerOnScreen();\r\n");
      out.write("\t\t\tw.button(\"minmax1\").hide();\r\n");
      out.write("\t\t\tw.button(\"minmax2\").hide();\r\n");
      out.write("\t\t\tw.button(\"park\").hide();\r\n");
      out.write("\t\t\tw.attachURL(urlink);\r\n");
      out.write("\t\t\treturn w;    \r\n");
      out.write("\t    }\r\n");
      out.write("\r\n");
      out.write("\t\tfunction closedialog(ret){\r\n");
      out.write("\t\t\tdhxWins.window(winName).close();\r\n");
      out.write("\t\t\tvar id = tree.getSelectedItemId();\r\n");
      out.write("\t\t\tif(ret) reSearch(id);\r\n");
      out.write("\t\t\treturn id;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction reTreeLoad()\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t    toolbar.disableItem(\"new_codeset\");\r\n");
      out.write("    \t\ttoolbar.disableItem(\"modify_codeset\");\r\n");
      out.write("\t   \t\ttoolbar.disableItem(\"del_codeset\");\r\n");
      out.write("\t\t\ttree.deleteChildItems('0');\r\n");
      out.write("\t\t\ttree.loadXML(\"");
      out.print( CONTEXT_PATH);
      out.write("cms/catalog.do?action=getTree\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction reSearch(id){\r\n");
      out.write("\t\t\tif(operate=='tree') reTreeLoad();\r\n");
      out.write("\t\t\telse dhxLayout.cells(\"b\")._frame.contentWindow.renew(id);\r\n");
      out.write("\t\t\t//rightPanel.attachURL(\"");
      out.print( CONTEXT_PATH);
      out.write("cms/catalog.do?action=catalogItemList&catalogId=\"+id);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\treTreeLoad();\r\n");
      out.write("\t</script>\r\n");
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
