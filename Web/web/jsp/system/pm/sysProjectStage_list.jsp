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
		var hyperlink = "../system/sysStage.do";
		var fulllink = contextpath + "system/sysStage.do";
        var ids="";
		function addStage(id) {
			openWindow('档案设置', fulllink+'?action=ADD&stageId='+id, 700, 450);
		}

		function viewstageGrid(id){
    	      var cont=$$('container');
      		if(id==null||id==""||id=="root") {
      	   cont.src="<%= CONTEXT_PATH%>dhtmlx/imgs/blank.html";
        		toolbar.disableItem("set_doc");
    		 }	
    		else {
         	 cont.src="<%= CONTEXT_PATH%>system/sysStage.do?action=ADD&stageId="+id;
        		 toolbar.enableItem("set_doc");
    		}   
		}
		function closedialog(ret){
  	      var cont=$$('container');
      	
			   dhxWins.window(winName).close();
			   if(ret=='true') { }	
			   editMode="";
		}
	</script>
<style type="text/css">
   html, body {width:100%; height:100%;}
</style>
  </head>

<body>
	<div id="div_left" style="background-color:#e8f0f8;height:100%;display: none;"></div>
   <div id="mainFrame" style="height:100%;display: none;">
      <iframe id="container" style="overflow-y: auto; overflow-x: hidden !important; width: 100%; height: 100%;" frameborder="no" src=""></iframe>
   </div>
	<script type="text/javascript">

		var dhxLayout = new dhtmlXLayoutObject(document.body, "2U");
    	dhxLayout.setSkin("dhx_skyblue");
    	dhxLayout.setImagePath("<%= CONTEXT_PATH%>dhtmlx/imgs/dhxlayout_dhx_blue/");
    	var leftPanel=dhxLayout.cells("a");
    	var rightPanel=dhxLayout.cells("b");
    	leftPanel.hideHeader();
    	leftPanel.attachObject("div_left");
    	leftPanel.setWidth(250);
    	rightPanel.hideHeader();

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
			viewstageGrid(id);
		});
    	tree.setSkin('dhx_blue');
	
		tree.loadXML("<%= CONTEXT_PATH%>system/sysStage.do?action=getTree");

		rightPanel.attachObject("mainFrame");
	</script>
	<%@include file="/common/dialog.jsp" %>
	
</body>
</html>