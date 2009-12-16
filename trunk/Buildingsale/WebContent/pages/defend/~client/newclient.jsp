<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="parddu" %>

<html>
<head>
	<parddu:base />
	<title>新客户</title>
	<link rel="stylesheet" href="style/common_tab.css" />
	<script type="text/javascript" src="script/client.js"></script>
</head>

<body onload="onerror('${error }');">
<form action="validate/~client!newClient.action" method="post" onsubmit="return newclient();">
<input type="hidden" name="operate" value="doNewClient"/>
<input type="hidden" name="clientInfo.employee.empId" value="${employe.empId }" />
<input type="hidden" name="clientInfo.dataDict.ddId" value="15" />
<table width="98%" align="center" class="tab_tab" cellpadding="0" cellspacing="0">
	<tr>
		<td class="one_1"></td>
		<td class="one_2">
			<table border="0" cellpadding="0" cellspacing="0" width="100%" height="26">
				<tr>
					<td>
						<img src="images/user.gif" width="16" height="16" />
						新客户
					</td>
					<td align="right" style="padding-top:5px;" width="120">
						<input type="submit" value="保存" class="tab_but" />
						<input type="button" value="返回" class="tab_but" onclick="doback('~client!selAllClient.action');"/>
					</td>
				</tr>
			</table>
		</td>
		<td class="one_3"></td>
	</tr>
	<tr>
		<td class="two_1"></td>
		<td>
			<table width="100%" border="1" style="border-collapse:collapse;background-color:#ffffff;" bordercolor="#B6D9F6" cellpadding="3">
				<tr>
					<td align="right" width="100">姓名：</td>	
					<td>
						<input type="text" name="clientInfo.clientName" id="clientName" style="width:90px;" />
					</td>
					<td align="right" width="100">性别：</td>	
					<td>
						<input type="radio" name="clientInfo.clientSex" value="1" checked="checked" />男 &nbsp;&nbsp;&nbsp;
						<input type="radio" name="clientInfo.clientSex" value="0" />女
					</td>
				</tr>
				<tr>
					<td align="right" width="100">电话：</td>	
					<td>
						<input type="text" name="clientInfo.clientTell" id="clientTell" style="width:90px;" />
					</td>
					<td align="right" width="100">状态：</td>	
					<td>
						新客户
					</td>
				</tr>
				<tr>
					<td align="right" width="100">备注信息：</td>	
					<td colspan="3">
					    <textarea rows="4" cols=""  style="width:100%" name="clientInfo.clientRemark"></textarea>
					</td>
				</tr>
			</table>
			<div style="text-align:center;padding-top:5px;">
				<input type="submit" value="确认保存" class="tab_but"/>
			</div>
		</td>
		<td class="two_2"></td>
	</tr>
	<tr>
		<td class="three_1"></td>
		<td class="three_2" align="right" >
		</td>
		<td class="three_3"></td>
	</tr>
</table>
</form>
</body>
</html>
