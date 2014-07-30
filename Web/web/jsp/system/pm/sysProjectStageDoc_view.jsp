<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="/WEB-INF/tag/gl-tag.tld" prefix="gl"%>
<%
   String path = request.getContextPath();
			String CONTEXT_PATH = request.getScheme() + "://"
					+ request.getServerName() + ":" + request.getServerPort()
					+ path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="x-ua-compatible" content="ie=7" />
<link rel="stylesheet" type="text/css"	href="<%=CONTEXT_PATH%>dhtmlx/dhtmlx.css" />
<script src="<%=CONTEXT_PATH%>dhtmlx/dhtmlx.js"></script>
<title></title>
<link rel="stylesheet" type="text/css"	href="<%=CONTEXT_PATH%>css/main.css" />
<script language="javascript"	src="<%=CONTEXT_PATH%>/js/date_validate.js"></script>
<script language="javascript" src="<%=CONTEXT_PATH%>/js/ctrl_util.js"></script>

<script type="text/javascript">
      var contextpath = "<%=CONTEXT_PATH%>";
	var fulllink = contextpath + "system/sysStage.do";
	var hyperlink = "../system/sysStage.do";

	function goCancel() {
		parent.closedialog1();
	}

	function returnData(){
		var docTypeId=mygrid.getSelectedRowId();
		var docTypeName;
		if(docTypeId==null)
			return ;
		for(i=0;i<data.rows.length;i++){
			if(data.rows[i].id==docTypeId){
				docTypeName=data.rows[i].data[1];
				break;
			}
		}
		parent.closedialog2(docTypeId,docTypeName);
	}
</script>
<style type="text/css">
html,body {
	width: 100%;
	height: 100%;
	margin: 0px;
	padding: 0px;
	overflow: hidden;
}
tr.locktop{
  position:relative;
  top:expression((this.offsetParent.scrollTop>this.parentElement.parentElement.offsetTop?this.offsetParent.scrollTop-this.parentElement.parentElement.offsetTop-1:0)-1);
}
.title{width:100%;}
.content{width:100%;sborder:1px solid black; border-top:0px; height:335px; overflow-y:scroll; overflow-x:hidden;}
</style>
</head>

<body>
	<div id="formDiv" class="formDiv">
		<s:form action="sysStage" id="stageDocForm" method="post" namespace="/system">
			<s:hidden name="record.stageId"></s:hidden>
			<s:hidden name="query.order" />
			<s:hidden name="query.orderDirection" />
			<s:hidden name="query.pageNumber" />
			<s:hidden name="query.recordCount" />
			<s:hidden name="query.pageCount" />
			<table id="btn" width="99%" cellspacing="1" cellpadding="1" class="controlTable">
				<tr>
					<td align="left">
					   <gl:button styleClass="sbuBtnStyle" icon="addIcon" onClick="returnData()">确定</gl:button> 
					   <gl:button styleClass="sbuBtnStyle" icon="addIcon" onClick="goCancel()">取消</gl:button> 
					</td>   
				</tr>
			</table>
                 <div id="gridbox" style="background-color: white; "></div>
		</s:form>
	</div>
<script type="text/javascript">
    if(window.addEventListener) {
 	     window.addEventListener("resize",goResize,false); 
    }
    else {
 	     window.attachEvent('onresize',goResize);
    }
    
	var mDiv=window.document.getElementById('formDiv'); 
	var btn=window.document.getElementById('btn');
	var gDiv=window.document.getElementById('gridbox');
    function goResize(){
		 mDiv.style.height=window.document.body.offsetHeight-5+"px";
		 gDiv.style.height=mDiv.offsetHeight-btn.offsetHeight-btn.offsetTop+"px";
		 gDiv.style.width=mDiv.offsetWidth-2+"px";
    }
    goResize();   
</script> 
<script type="text/javascript">
    var mygrid = new dhtmlXGridObject('gridbox');
	mygrid.setImagePath("<%=CONTEXT_PATH%>dhtmlx/imgs/");
	var headAlign=[tLeft,tLeft];
	mygrid.setHeader("文档编号,文档名称",null,headAlign);
	mygrid.setInitWidthsP("30,70");
	mygrid.setColAlign("left,left");
	mygrid.setColTypes("ed,ed,ch,ch");
	mygrid.setColSorting("str,str");
	mygrid.setSkin("dhx_skyblue");

	mygrid.init();
	var data = {rows: ${gridInfo}};
	mygrid.parse(data,"json");
	mygrid.setEditable(false);
	
	mygrid.attachEvent("onRowDblClicked",returnData);

</script>
</body>
</html>
