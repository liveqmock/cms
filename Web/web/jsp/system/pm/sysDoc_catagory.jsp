<%@ page language="java" contentType="text/html;charset=UTF-8" %>
<%
	String path = request.getContextPath();
	String CONTEXT_PATH = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="x-ua-compatible" content="ie=7" />
<script type="text/javascript" src="<%=CONTEXT_PATH%>dhtmlx/dhtmlx.js"></script>
<link rel="stylesheet" type="text/css" href="<%=CONTEXT_PATH%>dhtmlx/dhtmlx.css" />
<style type="text/css">
   html, body {width:100%; height:100%;overflow:hidden;}
</style>
</head>
<body onload="init()">
<div class="special-padding">   
  <div id="left_div"  style="float:left;background:white;width:100%;height:100%" >
  </div>
    </div>
<script type="text/javascript">
	
	  function init(){
		  var mainbody=window.document.body;
		  left_div.style.width=mainbody.offsetWidth+"px";
		  left_div.style.height=mainbody.offsetHeight+"px";
	  }

    function closedialog(ret){
	     dhxWins.window(winName).close();
	     if(ret=='true') {
	       var nodeId = tree.getSelectedItemId();
	       if(editMode=="EDITCHILDDOC"){
              var parentId = tree.getParentId(nodeId);
	         
	          tree.selectItem(nodeId,false,"");
	          tree.closeItem(nodeId);
	          tree.refreshItem(nodeId);
	       }
	       else if(editMode=="DELETE"){
            var parentId = tree.getParentId(nodeId);
	          tree.refreshItem(parentId);
	       }else if(editMode="ADDCHILDDOC"){
	    	   var nodeId = tree.getSelectedItemId();
		       tree.refreshItem(nodeId);
	       }
	     }
	     editMode="";	
    }
		
    
    function addChildDoc(id){
    	editMode="ADDCHILDDOC";
    	if(id.indexOf("doc")>-1){
    		var url_link="<%=CONTEXT_PATH%>system/sysDoc.do?action="+editMode+"&pid="+id.substring(3);
    	}else {
    		var url_link="<%=CONTEXT_PATH%>system/sysDoc.do?action="+editMode+"&pid="+id.substring(8);
    	}
    	openWindow("增加文档分类",url_link,600,250);
    }
	

    function modifyChildDoc(id){
    	editMode="EDITCHILDDOC";
    	if(id.indexOf("childDoc")>-1){
    		var url_link="<%=CONTEXT_PATH%>system/sysDoc.do?action="+editMode+"&id="+id.substring(8);    	
    	}else{
    		var url_link="<%=CONTEXT_PATH%>system/sysDoc.do?action="+editMode+"&id="+id.substring(3);
    	}
    	openWindow("修改文档分类",url_link,600,250);
    }	
    
    function deleteChildDoc(id){
    	var res=confirm("将要删除该文档分类下的所有文档\r\n        是否真的要删除该文档分类？");
    	if(res==false) return;
    	editMode="DELETE";
    	if(id.indexOf("doc")>-1){
    		var url_link="<%=CONTEXT_PATH%>system/sysDoc.do?action="+editMode+"&id="+id.substring(3);
    	}else{
    		var url_link="<%=CONTEXT_PATH%>system/sysDoc.do?action="+editMode+"&id="+id.substring(8);
    	}
		var loader = dhtmlxAjax.postSync(url_link,"");
		eval("var ret="+loader.xmlDoc.responseText);
		if(ret.exit=="0") tree.deleteItem(id,true); else alert(ret.message);
    	editMode="";
    }

		function showMenuItems(id){
         toolbar.disableItem("new_childDoc");
         toolbar.hideItem("modify_doc");
         toolbar.hideItem("modify_childDoc");
         toolbar.hideItem("del_doc");
         toolbar.hideItem("del_childDoc");
         toolbar.hideItem("sep2");
         toolbar.hideItem("sep3");
    	if(id.indexOf("doc")>-1){
         toolbar.enableItem("new_childDoc");
         toolbar.hideItem("modify_childDoc");
         toolbar.hideItem("del_childDoc");
    	}
    	else if(id.indexOf("childDoc")>-1){
         toolbar.enableItem("new_childDoc");
         toolbar.showItem("modify_childDoc");
         toolbar.showItem("del_childDoc");
         toolbar.showItem("sep2");
         toolbar.showItem("sep3");
		  }
		}


//页面初始化代码
	  var dhxLayout = new dhtmlXLayoutObject(document.body, "1C");
	  dhxLayout.setSkin("dhx_skyblue");

	  var leftPanel=dhxLayout.cells("a");
	  leftPanel.hideHeader();
	  leftPanel.attachObject("left_div");

    var toolbar = dhxLayout.attachToolbar();
    toolbar.setIconsPath("<%=CONTEXT_PATH%>dhtmlx/imgs/icon/");
    toolbar.setSkin("dhx_skyblue");
    toolbar.addButton("new_childDoc", 2, "添加文档分类", "house_big_1.gif", "house_big_1.gif");
    toolbar.addSeparator("sep2", 3);
     toolbar.addButton("modify_doc", 4, "修改", "house_big_2.gif", "house_big_2.gif");
    toolbar.addButton("modify_childDoc", 5, "修改", "house_big_2.gif", "house_big_2.gif");
    toolbar.addSeparator("sep3", 6);
    toolbar.addButton("del_doc", 7, "删除", "house_big_3.gif", "house_big_3.gif");
    toolbar.addButton("del_childDoc", 8, "删除", "house_big_3.gif", "house_big_3.gif");
    toolbar.attachEvent("onClick", function(id){
    	var nodeId=tree.getSelectedItemId();
    	 if(id=="new_childDoc") addChildDoc(nodeId);
    	else if(id=="modify_childDoc") modifyChildDoc(nodeId);
    	else if(id=="del_childDoc") deleteChildDoc(nodeId);
    });
	 
    var tree = new dhtmlXTreeObject("left_div","100%","100%",0);
    tree.setImagePath("<%=CONTEXT_PATH%>dhtmlx/imgs/");
    tree.setSkin('dhx_blue');

    tree.attachEvent("onSelect", function(id){
    	 showMenuItems(id);
    });
    tree.attachEvent("onDblClick", function(id){
       if(id.indexOf("childDoc")>-1) modifyChildDoc(id);
    });
    tree.attachEvent("onMouseIn", function(id){
    	 var str=tree.getUserData(id,"name");
    	 tree.setItemText(id,"<font color='#FF4422'>"+str+"</font>");
    });
    tree.attachEvent("onMouseOut", function(id){
    	 var str=tree.getUserData(id,"name");
    	 tree.setItemText(id,str);
    });
    tree.enableCheckBoxes(0);

    tree.setXMLAutoLoading("<%=CONTEXT_PATH%>system/sysDoc.do?action=getTree");
	 tree.loadXML("<%=CONTEXT_PATH%>system/sysDoc.do?action=getTree&id=0");
    showMenuItems("0");
    
    function refreshItem(id){
	     tree.refreshItem(0);
    }
</script>
<%@include file="/common/dialog.jsp" %>
</body>
</html>