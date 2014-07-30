<%@ page language="java" contentType="text/html;charset=UTF-8"
   import="com.liusy.core.util.Const,com.liusy.core.web.UserSession"%>
   <%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ taglib uri="/WEB-INF/tag/gl-tag.tld" prefix="gl"%>
<%
   String path = request.getContextPath();
	String CONTEXT_PATH = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="x-ua-compatible" content="ie=7" />
<link rel="stylesheet" type="text/css" href="<%=CONTEXT_PATH%>dhtmlx/dhtmlx.css" />
<script src="<%=CONTEXT_PATH%>dhtmlx/dhtmlx.js"></script>


<script language="javascript" src="<%=CONTEXT_PATH%>js/ctrl_util.js"></script>
<style type="text/css">
html,body {
   width: 100%;
   height: 100%;
   border: none;
   overflow: hidden;
}
/* --------------以下为新增css---------------- */
#sysName {
   background: url(<%=CONTEXT_PATH%>images/top1.jpg) no-repeat 0px 1px;
   height: 57px;
   text-indent:5px;
   font-size: 28px;
   color:#ffffff;
   font-weight:bold;
}

#topBanner {
   background: url(<%=CONTEXT_PATH%>images/headerBg.jpg) repeat-x center top;
   height: 64px;
   position: relative;
}

#header {
   width: 100%;
   zoom: 1;
}

#hInput {
   position: absolute;
   right: 0;
   top: 0;
   background: url(<%=CONTEXT_PATH%>images/headerRBg.jpg) no-repeat right top;
   height: 64px;
   width: 366px;
   text-align: right;
   line-height: 64px;
}

#logSate {
   position: absolute;
   left: 1px;
   bottom: 0px;
   _top: 44px;
   padding: 2px 0 0 42px;
   color: #ecfaff;
   background: url(<%=CONTEXT_PATH%>images/loginIFBg.jpg) no-repeat left top;
   width: 100%;
}

#header .headerBtn {
   cursor: pointer;
   background: url(<%=CONTEXT_PATH%>images/icon_list.gif) no-repeat right;
   width: 50px;
   height: 18px;
   line-height: 18px;
   border: none;
   margin-right: 3px;
   margin-top: 44px;
   font-size: 12px;
   color: #fff;
   padding: 2px 0 0 0px;
   text-align: right;
}

#header #topHome {
   background-position: -90px -151px;
}

#header #topHelp {
   background-position: -90px -100px;
}

#header #topExit {
   background-position: -90px 2px;
}

#header .headerBtn:hover {
   color: #e3f3f8
}

.memuNavDivWrap {
   position: relative;
   top: 0;
   left: 0;
   width: 100%;
   height: 100%;
   background: #f0f7ff url(<%=CONTEXT_PATH%>images/nav_bottom_bg.jpg) repeat-y 1px center;
   /* 滚动条代码S */
   overflow: auto; /* 滚动条 */
   scrollbar-face-color: #cae1fc; /* 滚动条颜色 */
   scrollbar-track-color: #e9f2fe; /* 底色 */
   scrollbar-arrow-color: #2b5589; /* 箭头颜色 */
   scrollbar-highlight-color: #f6faff; /* 左次阴影 */
   scrollbar-3dlight-color: #acc9e9; /* 左外阴影 */
   scrollbar-shadow-color: #b0cbe8; /* 右次阴影 */
   scrollbar-darkshadow-color: #e6f0fa; /* 右外阴影 */ /* 滚动条代码E */
}

.memuNav {
   list-style: none;
   margin: 0;
   padding: 0;
   border: 1px solid #fff;
   border-bottom: 1px solid #fff;
   border-top: none;
}

.memuNav li {
   text-align: center;
   height: 26px;
   line-height: 26px;
}

.memuNav li a {
   color: #093978;
   text-decoration: none;
   display: block;
   height: 26px;
   line-height: 26px;
   background: #e4f0fe url(<%=CONTEXT_PATH%>images/leftNavSBg.gif) repeat-x center top;
}

.memuNav li a:hover {
   background: #fff0c8 url(<%=CONTEXT_PATH%>images/leftNavSBg_hover.gif) repeat-x center bottom;
   color: #9e5e2a;
   letter-spacing: -1px;
   font-weight: bold;
   border-top: 1px solid #fff;
   text-indent: 2px;
   _height: 25px;
   _line-height: 25px;
}

#container {
   width: 100%;
   height: 100%;
   zoom: 1;
   overflow: hidden;
   position: absolute;
}
</style>
<script type="text/javascript">
	 var contextpath = "<%=CONTEXT_PATH%>";	
	 var imgPath="<%=CONTEXT_PATH%>dhtmlx/imgs/icon/";
   function go(link,title,fName){
   	  var f="leaf.gif";
   	  if(fName) f=fName;
      var img="&lt;img src='"+imgPath+f+"' /&gt;";  

      var t="&lt;font style='font-size:12px; font-weight:bold'&gt;"+title+"&lt;/font&gt;";
      dhxToolbar.removeItem("img");
      dhxToolbar.removeItem("title");
   	  dhxToolbar.addText("img", 0,img);
   	  dhxToolbar.addText("title", 1,t);
   	  centerPanel.showToolbar();
      var cont=window.document.getElementById('container');
      cont.src=contextpath+link;
   }
   function changetitle(title){
   	  var t="&lt;font style='font-size:12px; font-weight:bold'&gt;"+title+"&lt;/font&gt;";
      dhxToolbar.removeItem("title");
   	  dhxToolbar.addText("title", 0,t);
   }
   function showmain(){
   		window.location.href='<%=CONTEXT_PATH%>main.jsp';
   }
   function logout(){
   	if(confirm('是否真的要注销并重新登录?')==true)
   		window.location.href='<%=CONTEXT_PATH%>login.do?action=logout';
   }
   function checklogin(){
   		var url='<%=CONTEXT_PATH%>login.do?action=checklogin';
   		var loader=dhtmlxAjax.postSync(url,'');
   		var value = loader.xmlDoc.responseText;
   		if(value!='OK'){
   			alert('您还未登录系统');
   			window.location.href='login.jsp';
   		}
   }
   
   function closedialog(ret){
	   dhxWins.window(winName).close();
	   if(ret=='true') {
	   	  if(editMode=="PWD") alert("密码已经被修改。");
	   }	
	   editMode="";
	}
   
   function goChangePwd()  {
       var url_link=contextpath+'/system/sysUser.do?action=MYPWD';
       editMode=="PWD";
       openWindow("修改密码",url_link,300,170);	  
   }
   
   function docConfig(){
       var url_link=contextpath+'jsp/system/pm/archConfig.jsp';
       openWindow("案卷配置",url_link,600,400);	  
   }

</script>
</head>
<body onload="go('cms/catalog.do','内容管理','code_mod.gif')">
<!-- 
  <body onload="checklogin()"> 
-->


   <div id="topBanner" style="display: none;">
      <div style="height:8px;"></div>
      <div id="sysName">CMS管理系统</div>
      <div id="header">
         <div id="logSate" style="font-size: 12px;">
            <%
               UserSession userSession = (UserSession) request.getSession().getAttribute(Const.SESSION);
               String userString="当前用户： "+userSession.getUserName()+"("+userSession.getAccountName()+")";
            %>
            <%=userString%> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <span id="showTime"></span>
         </div>
         <div id="hInput">
            <button name="topPage" id="topHome" type="button" onClick="go('blank.jsp','首页','code_child.gif')" class="headerBtn">首页</button>
            <button id="topHelp" type="button" onClick="" class="headerBtn">帮助</button>
            <button id="topExit" type="button" onClick="logout()" class="headerBtn">退出</button>
         </div>
      </div>
      <div id="sysMenu" backgroundcolor="red">菜单</div>
   </div>
   <script type="text/javascript">
   var serverTime='<%out.print(new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss-SSS").format(new Date()));%>';
	var teptime=serverTime.split('-');
    date = new Date();   
    date.setYear(teptime[0]);
    date.setMonth(teptime[1]);
    date.setDate(teptime[2]);
    date.setHours(teptime[3],teptime[4],teptime[5],teptime[6]);
    
	setTimeout('updateCurrentDate('+'<% out.print(new java.util.Date().getTime());%>'+')', 100);     
	updateCurrentDate = function(time) {   
	    date.setTime(parseInt(time) + 1000);   
	    //alert(date.toLocaleString());
	    //alert(teptime);
	    document.getElementById('showTime').innerHTML=date.toLocaleString()+' 星期'+'日一二三四五六'.charAt(new Date().getDay());
	    setTimeout('updateCurrentDate('+date.getTime()+')', 1000);   
	} 
	
	 var dhxLayout = new dhtmlXLayoutObject(document.body, "2E");
	 dhxLayout.setSkin("dhx_skyblue");
	 var topPanel=dhxLayout.cells("a");
	 var centerPanel=dhxLayout.cells("b");

	 topPanel.setHeight(91);
	 topPanel.hideHeader();
	 topPanel.fixSize(true,true);
	 topPanel.attachObject("topBanner");
	 
	 var menu = new dhtmlXMenuObject("sysMenu","dhx_skyblue");
  	 var menustr="<menu>";
  	 
  	 
  	<gl:menu code="" id="div5" title="CMS管理" img="css/navImg/data.gif">
   		<item code="" onclick="go('cms/catalog.do','内容管理','code_mod.gif')" enabled="false" text="内容管理" img="css/navImg/7-7.gif" />
    </gl:menu>
    
    
	<gl:menu code="" id="div5" title="系统代码管理" img="css/navImg/data.gif">
   <item code="A9904" onclick="go('system/sysCode.do','系统代码管理','code_mod.gif')" enabled="false" text="系统代码管理" img="css/navImg/7-7.gif" />
    </gl:menu>
   
    <gl:menu code="A99" id="div9" title="系统管理" img="css/navImg/set.gif">
            <item code="A9901" onclick="go('system/sysOrg.do','组织机构管理','house_big.gif')" text="组织机构管理" img="css/navImg/7-1.gif" />
            <item code="A9902" onclick="go('system/sysRole.do','角色权限管理','people.gif')" text="角色权限管理" img="css/navImg/7-2.gif" />
            <item code="A9903" onclick="go('system/sysUser.do','用户管理','men.gif')" text="用户管理" img="css/navImg/7-3.gif" />
            <item code="A9905" type="separator"/>
            <item code="" onclick="goChangePwd()" text="修改密码" img="css/navImg/7-4.gif" />
    </gl:menu>

   
   menustr+="</menu>";
   menu.loadXMLString(menustr);
   menu.attachEvent("onClick", menuclick);
   
   function menuclick(id){
   	eval(menu.getUserData(id,"onclick"));
   } 

</script>
   <div id="mainFrame">
      <iframe id="container" style="overflow-y: auto; overflow-x: hidden !important; width: 100%; height: 100%;" frameborder="no" src=""></iframe>
   </div>
   <script type="text/javascript">
	 centerPanel.hideHeader();
	 centerPanel.attachObject("mainFrame");
   var dhxToolbar = centerPanel.attachToolbar();
   dhxToolbar.addText("title", 0,"");
   centerPanel.hideToolbar();
</script>
<%@include file="/common/dialog.jsp"%>
</body>
</html>