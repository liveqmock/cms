<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%
	String path = request.getContextPath();
	String CONTEXT_PATH = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
  <head>
	<title></title>

<link rel="stylesheet" type="text/css" href="<%=CONTEXT_PATH%>dhtmlx/dhtmlx.css"/>
<script src="<%=CONTEXT_PATH%>dhtmlx/dhtmlx.js"></script>

	<link rel="stylesheet" type="text/css" href="<%= CONTEXT_PATH%>css/main.css" />
    <script language="javascript" src="<%= CONTEXT_PATH %>js/ctrl_util.js"></script>
	<script type="text/javascript">
		var contextpath = "<%= CONTEXT_PATH%>";
		var hyperlink = "../cms/catalog.do";
		var fulllink = contextpath + "cms/catalog.do";

	

		function modifycodeset() {
			var mygrid=dhxLayout.cells("b")._frame.contentWindow.mygrid;
			var id = findSelected("修改",mygrid);
			if(id == "") return;
			var rulcodesetedit=fulllink+'?action=editCatalog&ids='+id;
			openWindow("修改代码", rulcodesetedit, 500, 300);
		}

		function deletecodeset(codesetid) {
			var mygrid=dhxLayout.cells("b")._frame.contentWindow.mygrid;
			var id = findMultiSelected("删除",mygrid);
			if(id == "") return;
			var res = confirm("是否真的要删除?");
			if(res == true) {
				var innerDoc;
				if (_isIE) {
					innerDoc = dhxLayout.cells("b")._frame.contentWindow.document;
				} else {
					innerDoc = dhxLayout.cells("b")._frame.contentDocument;
				}
				innerDoc.forms[0].action = hyperlink + "?action=deleteCatalog&ids=" + id+"&catalogId="+codesetid;
				innerDoc.forms[0].target = "_self";
				innerDoc.forms[0].submit();
			}
		}
		
		
		
		function addCatalog(catalogId) {
			openWindow('添加目录', fulllink+'?action=addCatalog&catalogId='+catalogId, 500, 300);
		}
		
		function modifyCatalog(catalogId) {
			if(catalogId == "") return;
			var rulcodesetedit=fulllink+'?action=editCatalog&catalogId='+catalogId;
			openWindow("修改目录", rulcodesetedit, 500, 300);
		}
		
		function deleteCatalog(catalogId) {
			if(catalogId == "") return;
			var res = confirm("是否真的要删除?");
			if(res == true) {
			var data = ajaxSubmit(fulllink + "?action=deleteCatalog&catalogId="+catalogId,null);
			if(data.status=='success')
				reTreeLoad();
			else	
				alert('删除失败！');
			}
		}
		
		
		function view() {
			var id = dhxLayout.cells("b")._frame.contentWindow.getModifyId();
			if(id == "") return;
			var urllink = contextpath+"system/sysCode.do"+"?action=CODELIST&catalogId="+id;
			openWindow('浏览系统代码值',  urllink, 600, 250);
		}

		function viewCodesetGrid(id){
      if(id==null||id==""||id=="root") {
      	rightPanel.attachURL("<%= CONTEXT_PATH%>dhtmlx/imgs/blank.html");
         toolbar.disableItem("new_codeset");
         toolbar.disableItem("modify_codeset");
         toolbar.disableItem("del_codeset");
      }	
    	else {
    	 rightPanel.attachURL("<%= CONTEXT_PATH%>cms/catalog.do?action=catalogItemList&catalogId="+id);
         toolbar.enableItem("new_codeset");
         toolbar.enableItem("modify_codeset");
         toolbar.enableItem("del_codeset");
    	}   
		}
	</script>
<style type="text/css">
   html, body {width:100%; height:100%;}
</style>
  </head>

<body>
	<div id="div_left" style="background-color:#e8f0f8;height:100%;width:100%;"></div>

	<script type="text/javascript">
		var operate='';
		var dhxLayout = new dhtmlXLayoutObject(document.body, "2U");
    	dhxLayout.setSkin("dhx_skyblue");
    	dhxLayout.setImagePath("<%= CONTEXT_PATH%>dhtmlx/imgs/dhxlayout_dhx_blue/");
    	var leftPanel=dhxLayout.cells("a");
    	var rightPanel=dhxLayout.cells("b");
    	leftPanel.hideHeader();
    	leftPanel.attachObject("div_left");
    	leftPanel.setWidth(250);
    	rightPanel.hideHeader();

		var toolbar = dhxLayout.attachToolbar();
		toolbar.setIconsPath("<%= CONTEXT_PATH%>dhtmlx/imgs/icon/");
		toolbar.addButton("new_codeset", 0, "添加目录", "code_add.gif", "code_add.gif");
    	toolbar.addSeparator("sep1", 1);
		toolbar.addButton("modify_codeset", 2, "修改目录", "code_mod.gif", "code_mod.gif");
    	toolbar.addSeparator("sep2", 3);
		toolbar.addButton("del_codeset", 4, "删除目录", "code_del.gif", "code_del.gif");
		toolbar.attachEvent("onClick", function(id){
			if(id=="new_codeset") {
				var nodeId=tree.getSelectedItemId();
				addCatalog(nodeId);
				operate='tree';
			}
			else if(id=="modify_codeset")
			{
				var nodeId=tree.getSelectedItemId();
			 	modifyCatalog(nodeId);
			 	operate='tree';
			}
			else if(id=="del_codeset") {
				var nodeId=tree.getSelectedItemId();
				if(nodeId=='1')return;
				deleteCatalog(nodeId);
					operate='tree';
			}
		});


		var tree = new dhtmlXTreeObject("div_left","100%","100%",0);
		tree.setImagePath("<%=CONTEXT_PATH%>dhtmlx/imgs/");
		tree.attachEvent("onMouseIn", function(id){
			var str=tree.getUserData(id,"name");
			tree.setItemText(id,"<font color='#FF4422'>"+str+"</font>");
		});
		tree.attachEvent("onMouseOut", function(id){
			var str=tree.getUserData(id,"name");
			tree.setItemText(id,str);
		});
		tree.attachEvent("onClick", function(id){
			viewCodesetGrid(id);
		});
    	tree.setSkin('dhx_blue');
		//tree.setXMLAutoLoading("<%= CONTEXT_PATH%>cms/catalog.do?action=getTree");
		//tree.loadXML("<%= CONTEXT_PATH%>cms/catalog.do?action=getTree");

		var dhxWins = dhxLayout.dhxWins;
		var winName="winCodeset";   //打开窗口名称
	   var editMode;       		//页面编辑状态：ADD,EDIT,DELETE
		dhxWins.enableAutoViewport(true);
		dhxWins.setImagePath("<%= CONTEXT_PATH%>dhtmlx/imgs/");

		function openWindow(title,urlink,width,height){
			var w = dhxWins.createWindow(winName, 0, 0, width,height);
			w.setText(title);
			w.keepInViewport(true);
			w.setModal(true);
			w.centerOnScreen();
			w.button("minmax1").hide();
			w.button("minmax2").hide();
			w.button("park").hide();
			w.attachURL(urlink);
			return w;    
	    }

		function closedialog(ret){
			dhxWins.window(winName).close();
			var id = tree.getSelectedItemId();
			if(ret) reSearch(id);
			return id;
		}
		function reTreeLoad()
		{
		    toolbar.disableItem("new_codeset");
    		toolbar.disableItem("modify_codeset");
	   		toolbar.disableItem("del_codeset");
			tree.deleteChildItems('0');
			tree.loadXML("<%= CONTEXT_PATH%>cms/catalog.do?action=getTree");
		}
		function reSearch(id){
			if(operate=='tree') reTreeLoad();
			else dhxLayout.cells("b")._frame.contentWindow.renew(id);
			//rightPanel.attachURL("<%= CONTEXT_PATH%>cms/catalog.do?action=catalogItemList&catalogId="+id);
		}
		reTreeLoad();
	</script>
</body>
</html>