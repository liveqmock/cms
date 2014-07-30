<%@page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%@taglib uri="/WEB-INF/tag/gl-tag.tld" prefix="gl"%>
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
      var fulllink = contextpath + "system/sysUser.do";		
      
	function goRoles(){
    var url_link=contextpath+'system/sysRole.do?action=SelectRoles&ids='+getElement('record.roleIds').value;
    openWindow("选择角色",url_link,200,300);	  
	}
	
	function goCancel(){
		parent.closedialog(false);
	}
	
	function goSubmit(){
		
		  //checkString参数：对象名、标题、长度、是否检测空值
		  if(!checkString(getElement('record.userName'),"姓名",30,true)) return;

		  if(!checkString(getElement('record.userAccount'),"帐号",30,true)) return;

		  //checkNumeric参数：对象名、标题、长度、是否检测空值,是否检测大于0
		  if(!checkNumeric(getElement('record.orderNo'),"顺序号",6,true,true)) return;

		  //checkEmpty参数：对象名、标题
		  if(!checkEmpty(getElement('record.deptId'),"部门")) return;
	  
		  if(!checkDate(getElement('record.hireDate'),"入职时间",false)) return;	
		  
		  var pwd=getElement('record.userPassword');
		  var compwd=getElement('record.confirmPassword');
		  if(!checkString(pwd,"密码",30,true)) return;
		  if(!checkString(compwd,"确认密码",30,true)) return;
		  if(pwd.value!=compwd.value){
		     alert("密码和确认密码不相同！");
		     pwd.focus();
		     return;
		  }
		  if(pwd.value.length<8){
		     alert("密码长度不能小于8位！");
		     pwd.focus();
		     return;
		  }
		  
		  //if(!checkEmpty(getElement('record.adminLevel'),"行政等级")) return;

		  if(!checkString(getElement('record.remark'),"备注",200,false)) return;
		  
		  document.forms[0].action=fulllink+"?action=SAVE";
    	document.forms[0].submit();
	}
	
  function closedialog(ret,str,str1){
     dhxWins.window(winName).close();
     if(ret==true) {
      //  $$('record.roleIds').value=str;
       // $$('record.roleNames').value=str1;
     }	
  }	
  function init(){
	  showMessage('<s:property value="errorMessage" escape="false"/>');
  }
	</script>
<style type="text/css">
   html, body {width:100%; height:100%; margin:0px; padding:0px; overflow:hidden;}
</style>
</head>

<body >
<div id="formDiv" class="formDiv">
  <s:form action="sysUser" id="userForm" method="post" namespace="/system">
  	<s:hidden name="record.orgId" />

		<table id="tblForm" cellpadding="0" cellspacing="0" width="99%" class="formTable">
			 <tr >
				  <td width="15%" class="textR"><font color="red">*</font>姓名：</td>
				  <td width="35%">
					   <s:textfield name="record.userName" />
				  </td>
				  <td width="15%" class="textR"><font color="red">*</font>顺序号：</td>
					<td width="35%">
					   <s:textfield name="record.orderNo" />
					</td>
			 </tr>
			 <tr>
				  <td  class="textR"><font color="red">*</font>账号：</td>
				  <td >
					   <s:textfield name="record.userAccount" />
				  </td>
				  <td  class="textR"><font color="red">*</font>部门：</td>
				  <td class="sel">
				  	<s:select list="codeSets.depts" listKey="value" listValue="codeName" name="record.deptId"></s:select>
				  </td>
			 </tr>
			 <tr>
				  <td class="textR"><font color="red">*</font>密码：</td>
				  <td >
					   <s:password name="record.userPassword" />
				  </td>
				  <td class="textR"><font color="red">*</font>确认密码：</td>
					<td>
					   <s:password name="record.confirmPassword" />
					</td>
			 </tr>
			 <tr>
				  <td>入职时间：</td>
				  <td >
					   <s:textfield name="record.hireDate" />
				  </td>
				  <td >年龄：</td>
				  <td >
					   <s:textfield name="record.age" />
              </td>
			</tr>
			 <tr>
				  <td><font color="red">*</font>用户状态：</td>
				  <td class="sel">
					 <s:select list="codeSets.USER_STATUS" name="record.userStatus" listKey="value" listValue="codeName"></s:select> 
				  </td>
				  <td colspan="2">&nbsp;</td>
			 </tr>
			 <tr>
				  <td  class="textR">角色：</td>
				  <td colspan="3" class="sel">
				  	 <table cellspacing="0" width="100%" >
				  	 	  <tr>
		   	           <td>
		   	           	   <s:textfield readonly="true" name="record.roleNames" />
  	                        <s:hidden name="record.roleIds" />
		   	           	</td>
		   	           <td width="67px"><gl:button name="btnRoles" onClick="goRoles()">角色</gl:button></td>
			          </tr>
			       </table>
			    </td>      
			</tr>
			<tr>
			   <td class="textR" valign="top">备注：</td>
				 <td colspan="3">
					  <s:textarea rows="10" name="record.remark" ></s:textarea>
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