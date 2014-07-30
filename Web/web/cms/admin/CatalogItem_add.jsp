<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
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
      var fulllink =contextpath + "cms/catalog.do";	


	function goCancel(){
		parent.closedialog(false);
	}
	
	function goSubmit(){
		  if(!checkString(getElement('record.subject'),"主题",60,true)) return;
		  if(!checkNumeric(getElement('record.status'),"状态",6,true,true)) return;
		  if(!checkString(getElement('record.remark'),"备注",200,false)) return;
		getElement('record.centent').value=UE.getEditor('editor').getContent();
		if(getElement('record.id')!='')
		document.forms[0].action=fulllink+"?action=updateCatalogItem";
		else
		document.forms[0].action=fulllink+"?action=saveCatalogItem";
    	document.forms[0].submit();
	}

  function closedialog(ret,str,str1){
     dhxWins.window(winName).close();
     if(ret==true) {
        $$('roleIds').value=str;
        $$('roleNames').value=str1;
     }	
  }	
  
  function init(){
	  showMessage('<s:property value="errorMessage" escape="false"/>')
	   UE.getEditor('editor').setContent(getElement('record.centent').value);
  }
  
  function imgChange(){
//  alert(getElement('image').value);
 // getElement('record.img').src = getElement('image').value;
  }
	
	</script>
<style type="text/css">
   html, body {width:100%; height:100%; margin:0px; padding:0px; overflow:hidden;}
</style>
</head>

<body onload="init()">
<div id="formDiv" class="formDiv">
  <s:form action="sysCode" id="codeForm" enctype="multipart/form-data" method="post" namespace="/system">
  	<s:hidden name="record.id" />
   	<s:hidden name="record.catalogId" />
   	<s:hidden name="record.centent" />
			<table id="tblForm" cellpadding="0" cellspacing="0" width="100%" class="formTable">
			 <tr>
				<td width="5%"  class="textR">主题：</td>
				<td width="20%">
				<s:textfield name="record.subject"/>
				</td>
				<td width="100%"  rowspan="6">
					<%@include file="../ueditor/ueditor.jsp" %>
				</td>
			</tr>
			<tr>
				<td class="textR" colspan="2"><s:file label="图片" theme="simple" name="image" onChange="imgChange();"/></td>
			</tr>
			<tr>
				<td class="textR" colspan="2"><img name="record.img" src="<%= CONTEXT_PATH %>/cms/images/${record.img}"/></td>
			</tr>
			<tr>
				<td class="textR">状态：</td>
				<td >
					 <s:select list="codeSets.CODE_STATUS" listKey="value" listValue="codeName" name="record.status" value="record.status"></s:select>
				</td>
			</tr>
					<tr>
				<td class="textR" valign="top">类型：</td>
				<td >
					 <s:select list="codeSets.CATALOGITEM_ITEM" listKey="value" listValue="codeName" name="record.type" value="record.type"></s:select>
				</td>
			</tr>
			<tr>
				<td class="textR" valign="top">备注：</td>
				<td>
					<s:textarea rows="5" name="record.remark" />
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
<script type="text/javascript">
</script>
</body>
</html>
