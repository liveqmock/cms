<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="/WEB-INF/tag/gl-tag.tld" prefix="gl"%>

<%
	String path = request.getContextPath();
	String CONTEXT_PATH = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<link rel="stylesheet" type="text/css" href="<%=CONTEXT_PATH%>dhtmlx/dhtmlx.css"/>
<script src="<%=CONTEXT_PATH%>dhtmlx/dhtmlx.js"></script>

	<link rel="stylesheet" type="text/css" href="<%=CONTEXT_PATH%>css/main.css" />

  <script language="javascript" src="<%= CONTEXT_PATH %>js/date_validate.js"></script>	
  <script language="javascript" src="<%= CONTEXT_PATH %>js/ctrl_util.js"></script>	

	<script type="text/javascript">
      var contextpath = "<%=CONTEXT_PATH%>";	
      var fulllink = contextpath + "system/sysUser.do";		

	function goCancel(){
		 parent.closedialog(false,"","");
	}
	
	function goSubmit(){
		  var ids=$NAME('roleId');
		  var str="";
		  var str1="";

		  for(var i=0;i<ids.length;i++){
		  	 if(ids[i].checked) str+=ids[i].value+";";
		  	 if(ids[i].checked) str1+=ids[i].title+";";
		  }
		  parent.closedialog(true,str,str1);
	}
  
	  function init(){
		  showMessage('<s:property value="errorMessage" escape="false"/>')
	  }
	
	</script>
<style type="text/css">
   html, body {width:100%; height:100%; margin:0px; padding:0px; overflow:hidden;}
</style>
</head>

<body onload="init()">
<div id="formDiv" class="formDiv" style="text-align:left!important;background:#d6e8fe;">
  <s:form method="post" action="/system/sysUser.do">
  	 <s:hidden property="record.ids" />
  	 <s:iterator value="query.recordSet" id="item">
  	    <input type="checkbox" <s:property value="CHECKED"/> name="roleId" value="<s:property value='id'/>" 
	   	title="<s:property value='roleName'/>" /><img src="<%=CONTEXT_PATH%>dhtmlx/imgs/icon/people.gif" /> <s:property value="roleName"/><br/>
  	 </s:iterator>
  </s:form>		
</div>
<div id="btnDiv" class="btnDiv">
			      <gl:button name="btnAdd" onClick="goSubmit()">确定</gl:button>
				    &nbsp;
			      <gl:button name="btnCancel" onClick="goCancel()">取消</gl:button>

</div>
<%@include file="/common/resize.jsp" %>
<script type="text/javascript">
</script>  
</body>
</html>
