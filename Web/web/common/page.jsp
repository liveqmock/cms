<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<table width="100%" height="30" cellpadding="0" cellspacing="0"
	class="pageTurn">
	<tr height="100%">
		<td align="left" width="50%">&nbsp;共&nbsp;10&nbsp;条&nbsp;&nbsp;第&nbsp;1&nbsp;页/共&nbsp;1&nbsp;页&nbsp;&nbsp; <input
			type="text" size=3 align="right" class="pTextStyle"
			name="" value="10" onKeyPress="">条/页
		</td>
		<td align="right" width="50%">
			<div class="pageTurnWrap">
				<a href="#" class="greyleftPageMore" title="第一页">第一页</a> 
				<a href="#" class="greyleftPage" title="上一页">上一页</a> 
				<a href="#"	class="greyrightPage" title="下一页">下一页</a> 
				<a href="#"	class="greyrightPageMore" title="最后一页">最后一页</a>
			</div>
		</td>
	</tr>
</table>