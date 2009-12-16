<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="parddu" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<parddu:base />
	<title>角色菜单管理</title>
	<link rel="stylesheet" href="style/common_tab.css" />
	<script type='text/javascript' src='dwr/interface/roleMess.js'></script>
	<script type='text/javascript' src='dwr/engine.js'></script>
	<script type='text/javascript' src='dwr/util.js'></script>
	<script type="text/javascript" src="script/jquery-1.3.2-vsdoc2.js"></script>
	<script type="text/javascript" src="script/rolemenu.js"></script>
</head>

<body>
<form action="" method="post">
<input type="hidden" value="doRoleMenu" />
<table width="100%" height="97%" align="center" class="tab_tab" cellpadding="0" cellspacing="0">
	<tr>
		<td class="one_1"></td>
		<td class="one_2">
			<table border="0" cellpadding="0" cellspacing="0" width="100%" height="26">
				<tr>
					<td>
						<img src="images/tab/311.gif" width="16" height="16" />
						角色菜单管理
					</td>
					<td align="right" style="padding-top:5px;">
						<input type="button" value="保存" class="tab_but" onclick="checkMenu();" id="savemenu" disabled="disabled"  />
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
					<th class="tab_top" width="150">角色</th>	
					<th class="tab_top">菜单</th>
				</tr>
				<tr>
					<td valign="top" style="padding:15px;">
						<c:forEach items="${roles }" var="r">
						    <input type="radio" name="roeid" id="role" value="${r.roleId}" onclick="doselmenu(${r.roleId});" />
								${r.roleName }<br><br>
						</c:forEach>
					</td>
					<td id="chkTd" valign="top" style="padding:15px;" >
					<c:forEach items="${menus }" var="m">
							<div style="background-color:#CCCCCC;" >
								<input type="checkbox" value="${m.menuId }" onclick="changeCheck(this,true,0);" />
									${m.menuName }
							</div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<div id="div_${m.menuId }">
								<c:forEach items="${menuse }" var="cm">
									<c:if test="${m.menuNo==cm.menuParent}">
									<input type="checkbox" Id="${cm.menuParent }" value="${cm.menuId }" onclick="changeCheck(this,false,${m.menuId });" />
										${cm.menuName }
									</c:if>
					   			 </c:forEach>
				   			 </div>
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
<input id="hidRole" type="hidden">
</form>
</body>
</html>
