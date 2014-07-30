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
<link rel="stylesheet" type="text/css" href="<%=CONTEXT_PATH%>dhtmlx/dhtmlx.css"/>
<script src="<%=CONTEXT_PATH%>dhtmlx/dhtmlx.js"></script>

	<link rel="stylesheet" type="text/css" href="<%=CONTEXT_PATH%>css/main.css" />

  <script language="javascript" src="<%= CONTEXT_PATH %>/js/date_validate.js"></script>	
  <script language="javascript" src="<%= CONTEXT_PATH %>/js/ctrl_util.js"></script>	

	<script type="text/javascript">
      var contextpath = "<%=CONTEXT_PATH%>";	
      var fulllink = contextpath + "system/sysUser.do";		

	function goCancel(){
		 parent.closedialog(false);
	}
	
	function goSubmit(){
		  getElement("record.rights").value=tree.getAllChecked();
		  document.forms[0].action=fulllink+"?action=saveRights";
    	document.forms[0].submit();
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
  <s:form action="sysUser" id="userForm" method="post" namespace="/system">
  	<s:hidden name="record.id" />
  	<s:hidden name="record.rights" />
  </s:form>		
<div id="formDiv" class="formDiv" style="border:1px solid #b1b1b1;background:#d6e8fe;text-align:left!important;">
</div>
<div id="btnDiv" class="btnDiv">
			      <gl:button name="btnAdd" onClick="goSubmit()">保存</gl:button>
				    &nbsp;
			      <gl:button name="btnCancel" onClick="goCancel()">取消</gl:button>
</div>
<script type="text/javascript">
	  var mainbody=window.document.body;
    if(window.addEventListener) {
 	     window.addEventListener("resize",goResize,false); 
    }
    else {
 	     window.attachEvent('onresize',goResize);
    }
    
    var fDiv=window.document.getElementById('formDiv');
    var bDiv=window.document.getElementById('btnDiv');
    
    function goResize(){
       fDiv.style.width=mainbody.offsetWidth-fDiv.offsetLeft*3+"px";
       bDiv.style.width=mainbody.offsetWidth-bDiv.offsetLeft*3+"px";
       fDiv.style.height=mainbody.offsetHeight-bDiv.offsetHeight-fDiv.offsetTop*3+"px";
       bDiv.style.top=fDiv.offsetHeight+fDiv.offsetTop*3+"px";
    }
    goResize();   
</script> 
<script type="text/javascript">

    var tree = new dhtmlXTreeObject("formDiv","100%","100%",0);
    tree.setImagePath("<%=CONTEXT_PATH%>dhtmlx/imgs/");
    tree.setSkin('dhx_blue');
    tree.enableCheckBoxes(true, true);
    tree.enableThreeStateCheckboxes(1);
    <s:iterator value="sysReources">
      tree.insertNewChild(<s:if test="#parentId!=0">'</s:if><s:property value="parentId"/><s:if test="#parentId!=0">'</s:if>,'<s:property value="id"/>','<s:property value="resName"/>',0,0,0,0,"","1");
    </s:iterator>
    tree.openAllItems(0);
<s:iterator value="rights">
   tree.setCheck('<s:property value="id"/>',1);
</s:iterator>
</script>  
</body>
</html>
