<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="/WEB-INF/tag/gl-tag.tld" prefix="gl" %>
<%
	String path = request.getContextPath();
	String CONTEXT_PATH = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title></title>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	
	<link rel="stylesheet" type="text/css" href="<%=CONTEXT_PATH%>css/main.css" />

  <script language="javascript" src="<%= CONTEXT_PATH %>js/date_validate.js"></script>	
  <script language="javascript" src="<%= CONTEXT_PATH %>js/ctrl_util.js"></script>	

	<script type="text/javascript">
      var contextpath = "<%=CONTEXT_PATH%>";	
      var fulllink = contextpath + "system/sysDoc.do";		

	function goCancel(){
		parent.closedialog(false);
	}
	
	function goSubmit(){
		if(!checkString(getElement('form.record.docName'),"文档名称",60,true)) return;
		if(!checkString(getElement('form.record.docNo'),"文档编号",20,true)) return;
		if(!checkString(getElement('form.record.duration'),"保管期限",60,false)) return;
		document.forms[0].action=fulllink+"?action=UPDATE";
    	document.forms[0].submit();
	}
  
  function init(){
  }
	
	</script>
<style type="text/css">
   html, body {width:100%; height:100%; margin:0px; padding:0px; overflow:hidden;}
</style>
</head>

<body onload="init()">
	<div id="formDiv" class="formDiv">
  <s:form action="sysDoc" id="docForm" method="post" namespace="/system">
  	<s:hidden name="form.record.id" />
		<table id="tblForm" cellpadding="0" cellspacing="0" width="98%" class="formTable">
			 <tr >
				  <td width="20%"><font color="red">*</font>文档名称：</td>
				  <td width="30%">
					   <s:textfield name="form.record.docName" />
				  </td>
				  <td width="20%"><font color="red">*</font>文档编号：</td>
					<td width="30%">
					   <s:textfield name="form.record.docNo" />
					</td>
			 </tr>
			 <tr>
				  <td >保管期限：</td>
				  <td >
					  <s:select label="" name="form.record.duration" list="{' ','10年','30年','永久'}"/>
				  </td>
				  <td >状态：</td>
				  <td>
					   <s:textfield name="form.record.docStatus" />
				  </td>
			 </tr>
			<tr>
			   <td>备注：</td>
				 <td colspan="3">
					  <s:textarea rows="5" name="form.record.remark" ></s:textarea>
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
<%@include file="/common/resize.jsp" %>
</body>
</html>
