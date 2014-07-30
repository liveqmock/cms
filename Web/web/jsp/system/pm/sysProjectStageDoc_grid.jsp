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
		var hyperlink = "../system/sysStage.do";
		var fulllink = contextpath + "system/sysStage.do";
		var imagePath="<%=CONTEXT_PATH%>dhtmlx/imgs/";

		function renew() {
			var order = getElement("query.order");                  order.value="";
			var desc =  getElement("query.orderDirection");         desc.value="";
			var pn =    getElement("query.pageNumber");             pn.value="1";
			var ps =    getElement("query.pageSize");               ps.value="5";
			var v0 =    getElement("query.parameters.stageid");
			goSearch();
		}
		
		  function init(){
			  renew();
		  }
			function goSearch(){ gostageDocGridSearch(); }
</script>


<style type="text/css">
   html, body {width:100%; height:100%;}
</style>
</head>

<body onload="init()">
<div class="special-padding"  id="mainDiv">  
<s:form action="sysStage" id="stageDocForm" method="post" namespace="/system">
				<s:hidden name="query.order" />
				<s:hidden name="query.orderDirection" />
				<s:hidden name="query.pageNumber" />
				<s:hidden name="query.recordCount" />
				<s:hidden name="query.pageCount" />
				<s:textfield name="query.parameters.stageid" style="display:none;"/>

<gl:grid styleClass="pageTurn" id="stageDoc" form="stageDocForm"  property="query" cellPadding="0" cellSpacing="0" >
   var grid = new dhtmlXGridObject();
   grid.setImagePath(imagePath);
   var headAlign=[tLeft,tLeft,tCenter,tCenter];
   grid.setHeader("#master_checkbox,文档名称,状态,文档状态",null,headAlign);
   grid.setInitWidthsP("5,75,10,10");
   grid.setColAlign("center,left,center,center");
   grid.setColTypes("ch,ro,ro,ro");
   grid.setColSorting("na,str,str,str");
   gridSort("true,true,false,true");
   grid.init();
   grid.setSkin("dhx_skyblue");

</gl:grid>
</s:form>

</div>
<script type="text/javascript">
    if(window.addEventListener) {
 	     window.addEventListener("resize",goResize,false); 
    }
    else {
 	     window.attachEvent('onresize',goResize);
    }
    
	var mDiv=$$('mainDiv'); 
	
    function goResize(){
    	 var he;
    	 if(isIE()) he=window.document.body.offsetHeight; else he=window.innerHeight;
		 mDiv.style.height=he-36+"px";
		 gDiv.style.height=mDiv.offsetHeight-5+"px";
		 gDiv.style.width=mDiv.offsetWidth-6+"px";
    }
    goResize();   
</script> 
<%@include file="/common/dialog.jsp" %>
</body>
</html>