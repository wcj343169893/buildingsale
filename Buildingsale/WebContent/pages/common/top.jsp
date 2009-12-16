<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="parddu" %>
<html>
<head>
	<parddu:base />
	<title>top</title>
	<link rel="stylesheet" href="style/index.css" />
</head>

<body style="margin:0px;">
<table border="0" cellpadding="0" cellspacing="0" width="100%" height="55" style="background-image:url('images/top_bg.gif');" >
	<tr>
		<td style="background-image:url('images/top_001.jpg'); width:240px; background-repeat:no-repeat;"></td>
		<td>
			<table border="0" cellpadding="0" cellspacing="0" width="100%" height="55">
				<tr>
					<td height="29" valign="bottom">
						<img src="images/index.gif" class="img"/>
						<img src="images/back.gif" class="img" style="cursor:hand;" onClick="javascript:window.parent.main.history.back();"/>
						<img src="images/next.gif" class="img" style="cursor:hand;" onClick="javascript:window.parent.main.history.go(1);"/>
						<img src="images/flush.gif" class="img" style="ursor:hand;" onClick="javascript:window.parent.main.location.reload();"/>
					</td>
				</tr>
				<tr>
					<td height="26" style="padding-top:3px; padding-left:270px;">
						<img src="images/zuxialogo.png" height="20" class="img" />
					</td>
				</tr>
			</table>
		</td>
		<td style="background-image:url('images/top_002.jpg'); width:200px; background-repeat:no-repeat; background-position:right;">
			<table border="0" cellpadding="0" cellspacing="0" width="100%" height="55">
				<tr>
					<td height="29" valign="bottom">
						<img src="images/exit.gif" style="margin-right:80px; float:right;border:0px; cursor:hand;" onClick="if(confirm('确认要退出？')){ javascript:parent.location.href='/house/login.jsp';}"/>
					</td>
				</tr>
				<tr>
					<td height="26">
						<img src="images/user.gif" class="img"/>
						${employe.empName }
					</td>
				</tr>
			</table>
		</td>
	</tr>
</table>
</body>
</html>
