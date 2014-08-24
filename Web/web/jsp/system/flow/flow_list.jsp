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
		var hyperlink = "../flow/flow.do";
		var fulllink = contextpath + "flow/flow.do";

	
	</script>
	
	
<style type="text/css">
   html, body {width:100%; height:100%;}
</style>


  </head>

<body>
	<div id="div_main" style="background-color:#e8f0f8;height:100%;width:100%;"></div>

	<script type="text/javascript">
  
		var tabbar=new dhtmlXTabBar("div_main","top");
		tabbar.setImagePath("<%=CONTEXT_PATH%>dhtmlx/imgs/");
		 tabbar.setSkin('dhx_skyblue');
		tabbar.setHrefMode("iframes");
		
		tabbar.addTab("claim_task","待认领任务");
		tabbar.addTab("wait_task","待办任务");
		tabbar.addTab("unfinish_task","完成活动任务");
		tabbar.addTab("finish_task","完成结束任务");
		
		
		tabbar.setContentHref("claim_task","<%= CONTEXT_PATH%>flow/flow.do?action=claimTask");
		
		tabbar.setTabActive("claim_task");
		
		var flagTab ="";
		tabbar.attachEvent("onSelect", function(id,last_id){
		
			if(flagTab.indexOf(id)==-1)
			{
			flagTab=flagTab+id;
			if(id=='wait_task')
			tabbar.setContentHref("wait_task","<%= CONTEXT_PATH%>flow/flow.do?action=waitTask");
			else if(id=='finish_task')
				tabbar.setContentHref("finish_task","<%= CONTEXT_PATH%>flow/flow.do?action=finishTask");
			else if(id=='unfinish_task')
				tabbar.setContentHref("unfinish_task","<%= CONTEXT_PATH%>flow/flow.do?action=unfinishTask");
			}
              return true;
          });
		
		
		//tabbar.loadXML("module.xml");
		tabbar.enableAutoReSize(true);

	</script>
</body>
</html>