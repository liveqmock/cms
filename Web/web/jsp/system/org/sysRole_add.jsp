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
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="x-ua-compatible" content="ie=7" />
<link rel="stylesheet" type="text/css" href="<%=CONTEXT_PATH%>dhtmlx/dhtmlx.css"/>
<script src="<%=CONTEXT_PATH%>dhtmlx/dhtmlx.js"></script>
	<title></title>
	<link rel="stylesheet" type="text/css" href="<%=CONTEXT_PATH%>css/main.css" />

  <script language="javascript" src="<%= CONTEXT_PATH %>/js/date_validate.js"></script>	
  <script language="javascript" src="<%= CONTEXT_PATH %>/js/ctrl_util.js"></script>	

	<script type="text/javascript">
		var contextpath = "<%=CONTEXT_PATH%>";
		var fulllink = contextpath + "system/sysRole.do";

		function goCancel() {
			parent.closedialog(false);
		}

		function goSubmit() {
		  if(!checkString(getElement('form.record.roleCode'),"角色标识",30,true)) return;
		  if(!checkString(getElement('form.record.roleName'),"角色名称",30,true)) return;
		  if(!checkString(getElement('form.record.remark'),"备注",200,false)) return;			
			
			document.forms[0].action=fulllink+"?action=SAVE";
    	document.forms[0].submit();
		}
		
		  function init(){
			  showMessage('<s:property value="errorMessage" escape="false" />');
		  }
	</script>
<style type="text/css">
   html, body {width:100%; height:100%; margin:0px; padding:0px; overflow:hidden;}
</style>
</head>

<body onload="init()">
	<div id="formDiv" class="formDiv">
  <s:form action="sysRole" id="roleForm" method="post" namespace="/system">
			<table cellpadding="0" cellspacing="0" width="99%" class="formTable">
				<tr>
					<td class="textR"><font color="red">*</font>角色标识：</td>
				  	<td >
						<s:textfield name="form.record.roleCode" />
				  	</td>
					<td class="textR"><font color="red">*</font>状态：</td>
					<td  class="sel">
					<s:select list="codeSets.ROLE_STATUS" listKey="value" listValue="codeName" name="form.record.roleStatus"></s:select>
  					</td>
				</tr>
				<tr>
				  	<td class="textR"><font color="red">*</font>角色名称：</td>
					<td colspan="3">
						<s:textfield name="form.record.roleName" />
					</td>
			 	</tr>
				<tr>
			    	<td class="textR">描述：</td>
				 	<td colspan="3" valign="top">
						<s:textarea name="form.record.remark" ></s:textarea>
				 	</td>
				</tr>
	 		</table>
 </s:form>	
</div>
<div id="btnDiv" class="btnDiv">
		<gl:button name="btnAdd" onClick="goSubmit()">保存</gl:button>
		&nbsp;
	    <gl:button name="btnCancel" onClick="goCancel()">取消</gl:button>
	    &nbsp;
	    <gl:button name="btnReset" onClick="goReset()">重置</gl:button>
</div>	  
<%@include file="/common/dialog.jsp" %>
<%@include file="/common/resize.jsp" %>
<script type="text/javascript">

</script>
</body>
</html>