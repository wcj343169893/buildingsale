<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="parddu" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
	<parddu:base />
	<title>指派客户经理</title>
	<link rel="stylesheet" href="style/common_tab.css" />
	<script type="text/javascript" src="dwr/interface/empcheckno.js" ></script>
	<script type="text/javascript" src="dwr/engine.js"></script>
	<script type="text/javascript" src="dwr/util.js"></script>
	<script type="text/javascript" src="script/client.js"></script>
</head>

<body onload="selEmpRole(); er('${error }');">
<form action="validate/~client!lotclient.action" method="post">
<input type="hidden" name="operate" value="doAllotClient"/>
<table width="98%" align="center" class="tab_tab" cellpadding="0" cellspacing="0">
	<tr>
		<td class="one_1"></td>
		<td class="one_2">
			<table border="0" cellpadding="0" cellspacing="0" width="100%" height="26">
				<tr>
					<td>
						<img src="images/user.gif" width="16" height="16" />
						为<font style="color:red;">${clientBean.clientName }</font>指派客户经理
					</td>
					<td align="right" style="padding-top:5px;" width="120">
						<input type="submit" value="保存" class="tab_but" />
						<input type="button" value="返回" class="tab_but" onclick="doback('~client!selToClient.action');"/>
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
						<input type="hidden" name="clientInfo.clientId" value="${clientBean.clientId }" />
						<input type="hidden" name="clientInfo.clientName" value="${clientBean.clientName }" />
						${clientBean.clientName }
					</td>
					<td align="right" width="100">性别：</td>	
					<td>
					  <input type="hidden" name="clientInfo.clientSex" value="${clientBean.clientSex }" />
					  <c:if test="${clientBean.clientSex==1}">男</c:if>
					  <c:if test="${clientBean.clientSex==0}">女</c:if>	
					</td>
				</tr>
				<tr>
					<td align="right" width="100">指派给：</td>	
					<td>
					<select name="clientInfo.employee.empId" id="empid">
						<option></option>
					</select>
					</td>
					<td align="right" width="100">状态：</td>	
					<td>
						${clientBean.dataDict.ddValue }
						<input type="hidden" name="clientInfo.dataDict.ddId" value="16"  />
					</td>
				</tr>
				<tr>
					<td align="right" width="100">电话：</td>	
					<td>
						${clientBean.clientTell }
						<input type="hidden" name="clientInfo.clientTell" value="${clientBean.clientTell }"  />
					</td>
					<td align="right" width="100">注册时间：</td>	
					<td align="left">
					   <s:date name="#attr.clientBean.clientTime" format="yyyy-MM-dd HH:mm:ss" />
						<input type="hidden" name="clientInfo.clientTime" value="${clientBean.clientTime }"/>
					</td>
				</tr>
				<tr>
					<td align="right" width="100">备注信息：</td>	
					<td colspan="3">
						${clientBean.clientRemark }
						<input type="hidden" name="clientInfo.clientRemark" value="${clientBean.clientRemark }" />
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
