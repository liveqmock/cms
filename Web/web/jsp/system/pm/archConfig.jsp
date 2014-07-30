<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
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
	<link rel="stylesheet" type="text/css" href="<%=CONTEXT_PATH%>css/main.css" />

	<script language="javascript" src="<%= CONTEXT_PATH %>js/ctrl_util.js"></script>
	<script language="javascript" src="<%= CONTEXT_PATH %>js/date_validate.js"></script>
	<script language="javascript">
		var contextpath = "<%=CONTEXT_PATH%>";
		var imagePath="<%=CONTEXT_PATH%>dhtmlx/imgs/";

		function renew() {
			
		}	
		function goCancel(){
			window.close();
		}
   </script>


<style type="text/css">
   html, body {width:100%; height:100%;}
</style>
</head>

<body onload="">

<div class="special-padding"  id="mainDiv" style="text-align:center">  
       <table id="tblQuery" width="100%" id="tbl" cellpadding="0" cellspacing="0" class="formTable" >
			<tr>
			  <td class="textR" width="30%;">全宗名称： </td>
			  <td class="textL" width="70%">
                 <input type="text" id="q11" value="政法网建设" />
			  </td>
			</tr>
			<tr>
			  <td class="textR" width="30%;">全宗号： </td>
			  <td class="textL" width="70%">
                 <input type="text" id="q1" value="GZ01" />
			  </td>
			</tr>
			<tr>
			  <td class="textR" width="30%;">案卷编号： </td>
			  <td class="textL" width="70%">
		         <select name="s1" id="orgName1">
		          <option value=" "> </option>
		          <option value="2010"  selected="selected">年份</option>
		          <option value="02">保管年限</option>
		          <option value="3.2">文档分类</option>
		          <option value="ZF.0003.002">项目编号</option>
		         </select><br>
		         <select name="s2" id="orgName2">
		          <option value=" "> </option>
		          <option value="2010">年份</option>
		          <option value="02">保管年限</option>
		          <option value="3.2"  selected="selected">文档分类</option>
		          <option value="ZF.0003.002">项目编号</option>
		         </select><br>
		         <select name="s3" id="orgName3">
		          <option value=" "> </option>
		          <option value="2010">年份</option>
		          <option value="02"  selected="selected">保管年限</option>
		          <option value="3.2">文档分类</option>
		          <option value="ZF.0003.002">项目编号</option>
		         </select><br>
		         <select name="s4" id="orgName4">
		          <option value=" "> </option>
		          <option value="2010">年份</option>
		          <option value="02">保管年限</option>
		          <option value="3.2">文档分类</option>
		          <option value="ZF.0003.002"  selected="selected">项目编号</option>
		         </select>
			  </td>
			</tr>
			<tr>
			  <td class="textR">文档顺序：</td>
			  <td class="textL">
		         <select name="s5" id="orgName5">
		          <option value="1">按文档日期排序</option>
		          <option value="2">按归档日期排序</option>
		          <option value="3">按文档标题排序</option>
		          <option value="4" selected>按自定义顺序号排序</option>
		         </select>
			  </td>
			</tr>
			<tr>
			  <td class="textR">用例：</td>
			  <td class="textL">
		         <span id="d1">GZ01</span><span id="d2">-2010</span><span id="d3">-3.2</span><span id="d4">-2</span><span id="d5">-ZF.0002.001</span>-003
			  </td>
			</tr>
			<tr style="height:110px;">
			  <td class="textL" colspan="2" width="*">&nbsp;
			  </td>
			</tr>
	    </table>
       <table id="tblReport" width="100%" cellpadding="0" cellspacing="0" >
			<tr >
			   <td class="textC" style="height:30px;">
                   <gl:button name="btnChart" onClick="goCancel()" >确定</gl:button>&nbsp;
			          <gl:button name="btnCancel" onClick="goCancel()">关闭</gl:button>
			   </td>
			</tr>
	    </table>
</div>	    

</body>
</html>









