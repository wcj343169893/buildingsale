<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="parddu" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<parddu:base />
	<title>员工特殊权限管理</title>
	<link rel="stylesheet" href="style/common_tab.css" />
	<script type='text/javascript' src='dwr/interface/roleMess.js'></script>
	<script type='text/javascript' src='dwr/engine.js'></script>
	<script type='text/javascript' src='dwr/util.js'></script>
	<script type="text/javascript" src="script/emprole.js" ></script>
</head>

<body>
<form action="/pages/struts/impower" method="post">
<input type="hidden" value="doEmpMenu"/>
<table width="100%" height="97%" align="center" class="tab_tab" cellpadding="0" cellspacing="0">
	<tr>
		<td class="one_1"></td>
		<td class="one_2">
			<table border="0" cellpadding="0" cellspacing="0" width="100%" height="26">
				<tr>
					<td>
						<img src="images/tab/311.gif" width="16" height="16" />
						员工特殊权限管理
					</td>
					<td align="right" style="padding-top:5px;">
						<input type="submit" value="保存" class="tab_but" />
					</td>
				</tr>
			</table>
		</td>
		<td class="one_3"></td>
	</tr>
	<tr>
		<td class="two_1"></td>
		<td>
			<table width="100%" height="100%" border="1" style="border-collapse:collapse;background-color:#ffffff;" bordercolor="#B6D9F6" cellpadding="3">
				<tr>
					<th class="tab_top" width="230">角色</th>	
					<th class="tab_top">菜单</th>
				</tr>
				<tr>
					<td valign="top" style="padding:15px;">
						<c:forEach items="${empmen }" var="e">
						   <input type="checkbox" value="${e.empId }"/>
								${e.empName }__${e.shopInfo.shopName }
							<br><br>
						</c:forEach>
					</td>
					<td valign="top" style="padding:18px;">
					<c:forEach items="${menus }" var="m">
							<div style="background-color:#CCCCCC;">
								<input type="checkbox" value="${m.menuId }" onclick="chooseParent(this)" />
									${m.menuName }
							</div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<c:forEach items="${menuse }" var="cm">
							 <c:if test="${m.menuNo==cm.menuParent}">
								<input type="checkbox" onclick="chooseClient(this)" Id="${cm.menuParent }" value="${cm.menuId }" />
									${cm.menuName }
							 </c:if>
							</c:forEach>
							<br><hr>
					</c:forEach>
					</td>
				</tr>
			</table>
		</td>
		<td class="two_2"></td>
	</tr>
	<tr>
		<td class="three_1"></td>
		<td class="three_2" align="right">
		</td>
		<td class="three_3"></td>
	</tr>
</table>
</form>
</body>
</html>
