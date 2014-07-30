<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="/WEB-INF/tag/gl-tag.tld" prefix="gl"%>
<%
   String path = request.getContextPath();
	String CONTEXT_PATH = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="<%=CONTEXT_PATH%>dhtmlx/dhtmlx.css" />
<link rel="stylesheet" type="text/css" src="<%=CONTEXT_PATH%>css/dhtmlx_skin/dhtmlx_custom.css"/>
<script src="<%=CONTEXT_PATH%>dhtmlx/dhtmlx.js"></script>

<link rel="stylesheet" type="text/css" href="<%=CONTEXT_PATH%>css/main.css" />
<script language="javascript" src="<%=CONTEXT_PATH%>js/ctrl_util.js"></script>
<script language="javascript" src="<%=CONTEXT_PATH%>js/date_validate.js"></script>

<script language="javascript">  
var contextpath = "<%=CONTEXT_PATH%>";	
var hyperlink = "../system/sysUser.do";	
var fulllink = contextpath + "system/sysUser.do";		
      
function view(id) {
	 var eBtn=$$('editUser');
	 if(eBtn!=null) {
		 modify(id);
	 } 
	 else {
       var url_link=fulllink+'?action=view&ids='+id;
       editMode="VIEW";
       openWindow("查看用户",url_link,700,370);
	 }
}

function goDel()  {
	  var id = findMultiSelected("删除",mygrid);
	  if(id == "") return;
	  var res = confirm("是否真的要删除?");
	  if(res == true) {
      document.forms[0].action = hyperlink + "?action=delete&ids=" + id;
      document.forms[0].target = "_self";
      document.forms[0].submit();
    }
}

function goChangePwd()  {
	  var id = findSelected("重置密码",mygrid);
	  if(id == "") return;
    var url_link=fulllink+'?action=PWD&ids='+id;
    editMode="PWD";
    openWindow("修改密码",url_link,300,150);	  
}

function goRights()  {
	  var id = findSelected("分配",mygrid);
	  if(id == "") return;
	  var loader = dhtmlxAjax.postSync(fulllink+'?action=CheckUser&ids='+id, "");
	  rights(loader,id);
}

function rights(loader,id)  {
   if (loader.xmlDoc.responseXML != null && loader.xmlDoc.responseText.length>0) {
      alert(loader.xmlDoc.responseText);
   	return;
   }
      
   var url_link=contextpath+'system/sysReource.do?action=userrights&id='+id;
   editMode="RIGHTS";
   openWindow("分配用户权限",url_link,300,500);	  
}

function goModify()  {
	 var id = findSelected("修改",mygrid);
	 if(id == "") return;
	 modify(id);
}

function modify(id)  {
    var url_link=fulllink+'?action=edit&ids='+id;
    editMode="EDIT";
    openWindow("修改用户",url_link,700,370);	  
}

function goStart()  {
	  var id = findMultiSelected("启用",mygrid);
	  if(id == "") return;
    document.forms[0].action = hyperlink + "?action=start&ids=" + id;
    document.forms[0].target = "_self";
    document.forms[0].submit();
}

function goStop()  {
	  var id = findMultiSelected("暂停",mygrid);
	  if(id == "") return;
    document.forms[0].action = hyperlink + "?action=stop&ids=" + id;
    document.forms[0].target = "_self";
    document.forms[0].submit();
}

function goAdd()  {
   editMode="ADD";
   var url_link=fulllink+'?action=add';
   openWindow("添加用户",url_link,700,400);
}
function goResource(){
	var id = findSelected("分配资源",mygrid);
	if(id == "") return;
	var url_link=fulllink+'?action=resource&userId='+id;
	openWindow("选择资源",url_link,700,400);
}
function renew()  {
	  var order = getElement("query.order");                   order.value="";
	  var desc =  getElement("query.orderDirection");          desc.value="";
	  var pn =    getElement("query.pageNumber");              pn.value="1";
	  var ps =    getElement("query.pageSize");                ps.value="10";
	  var v0 =    getElement("query.parameters.userAccount"); v0.value="";
	  var v1 =    getElement("query.parameters.userName");    v1.value="";
	  var v2 =    getElement("query.parameters.deptId");      v2.value="";
	  var v3 =    getElement("query.parameters.userStatus");  v3.value="";
     gosearch();
}

function goQuery()  {
	  var pn = getElement("query.pageNumber");             
	  pn.value="1";
    gosearch();
}
function close(){
	dhxWins.window(winName).close();
}

function closedialog(ret){
	 editMode="";
	 if(!ret) {
   	dhxWins.window(winName).close();
   	return;
	 }
   if(ret=='true') {
   	  if(editMode=="PWD") alert("密码已经被修改。");
   	  else if(editMode=="RIGHTS")  alert("用户权限已经被修改。");
   }	
  
   gosearch();
}
function init(){
	  showMessage('<s:property value="errorMessage" escape="false"/>')
} 
</script>

<style type="text/css">
html,body {
	width: 100%;
	height: 100%;
}
</style>
</head>

<body onload="init()" >
	<div class="special-padding" id="mainDiv" >
		<s:form action="sysUser" id="userForm" method="post" namespace="/system">
			<s:hidden name="query.order" />
			<s:hidden name="query.orderDirection" />
			<s:hidden name="query.pageNumber" />
			<s:hidden name="query.recordCount" />
			<s:hidden name="query.pageCount" />
			<table width="99%" id="tbl" cellpadding="0" cellspacing="0" class="formTable">
				<tbody>
					<tr>
						<td width=10% class="textR">账号：</td>
						<td width=15%><s:textfield name="query.parameters.userAccount" /></td>
						<td width=10% class="textR">用户名：</td>
						<td width=15%><s:textfield name="query.parameters.userName" />
						</td>
						<td width=10% class="textR">部门：</td>
						<td width=20% class="sel">
						   <s:select list="codeSets.depts" listKey="value" listValue="codeName" name="query.parameters.deptId"></s:select>
						</td>
						<td width=10% class="textR">状态：</td>
						<td width=10% class="sel">
						   <s:select list="codeSets.USER_STATUS" listKey="value" listValue="codeName" name="query.parameters.userStatus"></s:select>
						</td>
					</tr>
					<tr class="btnTr">
						<td class="textC" colspan="8">
						   <gl:button name="btnQuery" onClick="goQuery()">查询</gl:button> &nbsp; 
						   <gl:button name="btnRefresh" onClick="renew()">重置</gl:button>
						</td>
					</tr>
				</tbody>
			</table>
			<div class="gap8">&nbsp;</div>
			<table id="btn" width="99%" cellspacing="1" cellpadding="1" class="controlTable">
				<tr>
					<td>
					   <gl:button styleClass="sbuBtnStyle" icon="addIcon" onClick="goAdd()">增加</gl:button> 
					   <gl:button styleClass="sbuBtnStyle" id="editUser" icon="subIcon" onClick="goModify()" >修改</gl:button> 
					   <gl:button styleClass="sbuBtnStyle" icon="delIcon" onClick="goDel()">删除</gl:button> 
					   <gl:button styleClass="sbuBtnStyle" icon="resetIcon" onClick="goChangePwd()">重置密码</gl:button> 
					   <gl:button styleClass="sbuBtnStyle" icon="stopIcon" onClick="goStop()">暂停</gl:button>
					   <gl:button styleClass="sbuBtnStyle" icon="playIcon" onClick="goStart()">启用</gl:button> 
					   <gl:button styleClass="sbuBtnStyle" icon="assigningPermissions" onClick="goRights()">分配权限</gl:button>
					 </td>
				</tr>
			</table>
			
<div id="gridbox" style="background-color: white;"></div>
<gl:pager styleClass="pageTurn" id="pager" action="list" property="query" cellPadding="0" cellSpacing="0" />
</s:form>
</div>
<%@include file="/common/dialog.jsp"%>
<%@include file="/common/resizeList.jsp" %>
<script type="text/javascript">
   var o = getElement("query.order");
   var od = getElement("query.orderDirection");
   var pn = getElement("query.pageNumber");

   var mygrid = new dhtmlXGridObject('gridbox');
	mygrid.setImagePath("<%=CONTEXT_PATH%>dhtmlx/imgs/");
	var headAlign=[tLeft,tCenter,tCenter,tLeft,tLeft,tCenter,tLeft];
	mygrid.setHeader("#master_checkbox,姓名,帐号,单位,部门,状态,说明",null,headAlign);
	mygrid.setInitWidthsP("3,10,10,20,20,5,32");
	mygrid.setColAlign("center,center,center,left,left,center,left");
	mygrid.setColTypes("ch,link,ro,ro,ro,ro,ro");
	mygrid.setColSorting("na,str,str,str,str,str,str");
	mygrid.setSkin("dhx_skyblue");
	mygrid.attachEvent("onBeforeSorting",function(ind,type,direction){
		if(ind!=1&&ind!=2&&ind!=5) return;  
		if(o.value == ind) {
			  if(od.value=='asc') od.value='desc';else od.value='asc'; 
		  }
		  else{
			  o.value = ind;
			  od.value='asc';
		  }
		  pn.value='1';
        gosearch('list');  
    });
	mygrid.init();
	var data = {rows: ${userList}};
	mygrid.parse(data,"json");
	mygrid.checkAll(false);
	
	if(o.value!='' && od.value!='') {
	   mygrid.setSortImgState(true,o.value,od.value);        
	}
</script>
</body>
</html>