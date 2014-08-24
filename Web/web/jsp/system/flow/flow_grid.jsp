<%@ page language="java" contentType="text/html;charset=UTF-8" %>
<%@taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="/WEB-INF/tag/gl-tag.tld" prefix="gl"%>
<%
	String path = request.getContextPath();
	String CONTEXT_PATH = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="x-ua-compatible" content="ie=7" />
	<link rel="stylesheet" type="text/css" href="<%=CONTEXT_PATH%>dhtmlx/dhtmlx.css"/>
	 <link rel="stylesheet" type="text/css" href="<%=CONTEXT_PATH%>css/main.css" />
	 <script src="<%=CONTEXT_PATH%>dhtmlx/dhtmlx.js"></script>
	 <script language="javascript" src="<%= CONTEXT_PATH %>js/ctrl_util.js"></script>
	 <script language="javascript" src="<%= CONTEXT_PATH %>js/date_validate.js"></script>
	<script language="javascript">
		var contextpath = "<%=CONTEXT_PATH%>";
		var hyperlink = "../flow/flow.do";
		
		
		

		function goClaimTask() {
			var id = findSelected("认领任务",mygrid);
			if(id == "") return;
			var urllink = contextpath+"flow/flow.do"+"?action=taskEdit&record.waitWorkFlowTaskId="+id;
			parent.openWindow('认领任务',  urllink, 800, 450);
		}

		function goWaitTask() {
			var id = findSelected("处理任务",mygrid);
			if(id == "") return;
			var urllink = contextpath+"flow/flow.do"+"?action=taskEdit&record.waitWorkFlowTaskId="+id;
			parent.openWindow('处理任务',  urllink, 800, 450);
		}

		function viewTask(id) {
			var id = findSelected("查看任务",mygrid);
			if(id == "") return;
			var urllink = contextpath+"flow/flow.do"+"?action=taskView&record.waitWorkFlowTaskId="+id;
			parent.openWindow('查看任务',  urllink, 800, 450);
		}
		
		function goFlowNodeView(id) {
			alert('未实现！');
		}
		
		




		function renew(id)  {
			/* var order = getElement("query.order");                  order.value="";
			var desc =  getElement("query.orderDirection");         desc.value="";
			var pn =    getElement("query.pageNumber");             pn.value="1";
			var ps =    getElement("query.pageSize");               ps.value="10";
			*/
			gosearch("CODELIST&codesetid="+id);
		}
		
		  function init(){
			  showMessage('<s:property value="errorMessage" escape="false"/>')
		  }

</script>


<style type="text/css">
   html, body {width:100%; height:100%;}
</style>
</head>

<body onload="init()" >
<s:form action="sysCode" id="codeForm" method="post" namespace="/system">
				<s:hidden name="query.order" />
				<s:hidden name="query.orderDirection" />
				<s:hidden name="query.pageNumber" />
				<s:hidden name="query.recordCount" />
				<s:hidden name="query.pageCount" />
		
		<table width="99%" id="tbl" cellpadding="0" cellspacing="0" class="formTable">
				<tbody>
					<tr>
						<td width=10% class="textR">主题：</td>
						<td width=15%><s:textfield name="query.parameters.waitWorkSubject" /></td>
						<td width=10% class="textR">业务类型：</td>
						<td width=15%><s:textfield name="query.parameters.waitWorkType" /></td>
					</tr>
					<tr class="btnTr">
						<td class="textC" colspan="4">
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
					<s:if test="action eq 'claimTask'">
					   <gl:button styleClass="sbuBtnStyle" icon="addIcon" onClick="goClaimTask()">认领</gl:button>
					</s:if>
					<s:if test="action eq 'waitTask'">
					   <gl:button styleClass="sbuBtnStyle" icon="addIcon" onClick="goWaitTask()">处理</gl:button>
					</s:if> 
					<s:if test="action neq 'finishTask'">
					    <gl:button styleClass="sbuBtnStyle" icon="addIcon" onClick="goFlowNodeView()">跟踪</gl:button>
					</s:if> 
					 <gl:button styleClass="sbuBtnStyle" icon="addIcon" onClick="viewTask()">查看</gl:button> 
					 </td>
				</tr>
			</table>
			
<div id="gridbox" style="background-color: white;"></div>
<gl:pager styleClass="pageTurn" id="pager" property="query" cellPadding="0" cellSpacing="0" />

</s:form>
<script type="text/javascript">
   gridbox.style.height=(window.document.body.offsetHeight-130)+"px";
   gridbox.style.width=(window.document.body.offsetWidth-2)+"px";
	
   mygrid = new dhtmlXGridObject('gridbox');
	mygrid.setImagePath("<%=CONTEXT_PATH%>dhtmlx/imgs/");
	var headAlign=[tCenter,tCenter,tCenter,tCenter,tCenter];
	mygrid.setHeader(" ,主题,申请人,申请部门,业务类型",null,headAlign);
	mygrid.setInitWidthsP("3,50,15,15,15");
	mygrid.setColAlign("center,center,center,center,center");
	mygrid.setColTypes("ch,ro,ro,ro,ro");
	mygrid.setColSorting("na,str,str,str,str");
	mygrid.init();
	mygrid.setSkin("dhx_skyblue");
	data = {rows: ${query.recordSet}};
	mygrid.parse(data,"json");
	mygrid.checkAll(false);
	
</script>
</body>
</html>