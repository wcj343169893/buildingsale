<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="parddu" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<parddu:base />
	<title>查看员工信息</title>
	<link rel="stylesheet" href="style/common_tab.css" />
	<script type="text/javascript" src="script/PardduDateTimePicker.js" ></script>
	<script type="text/javascript" src="script/emp.js" ></script>
</head>

<body>
<table width="98%" align="center" class="tab_tab" cellpadding="0" cellspacing="0">
	<tr>
		<td class="one_1"></td>
		<td class="one_2">
			<table border="0" cellpadding="0" cellspacing="0" width="100%" height="26">
				<tr>
					<td>
						<img src="images/tab/311.gif" width="16" height="16" />
						查看员工--><font color="red">${empBean.empName }</font>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						当前状态:<font style="color:red;font-weight:bold;">${empBean.dataDict.ddValue }</font>
					</td>
					<td align="right" style="padding-top:5px;">
						<input type="button" value="编辑"  class="tab_but" onclick="to('~empaction!selByidToedit.action?employee.empId=${empBean.empId }');" />
						<input type="button" value="返回" class="tab_but" onclick="to('~empaction!selAll.action');"/>
					</td>
				</tr>
			</table>
		</td>
		<td class="one_3"></td>
	</tr>
	<tr>
		<td class="two_1"></td>
		<td>
			<table width="100%" border="1" style="border-collapse:collapse;background-color:#ffffff;" bordercolor="#B6D9F6" cellpadding="6">
				<tr>
					<td align="right" width="100">编号：</td>	
					<td>
						${empBean.empNo }
					</td>
					<td align="right" width="100">所属售房部：</td>	
					<td>
						${empBean.shopInfo.shopName }
					</td>
				</tr>
				<tr>
					<td align="right" width="100">姓名：</td>	
					<td>
						${empBean.empName }
					</td>
					<td align="right" width="100">性别：</td>	
					<td>
						 <c:if test="${empBean.empSex==1}">
					    <input disabled="disabled" type="radio" name="employee.empSex" value="1" checked="checked" />男 &nbsp;&nbsp;&nbsp;
						<input disabled="disabled" type="radio" name="employee.empSex" value="0" />女
					    </c:if>
					    <c:if test="${empBean.empSex==0}">
					    <input disabled="disabled" type="radio" name="employee.empSex" value="1" />男 &nbsp;&nbsp;&nbsp;
						<input disabled="disabled" type="radio" name="employee.empSex" value="0" checked="checked" />女
					    </c:if>
					</td>
				</tr>
				<tr>
					<td align="right" width="100">登陆帐号：</td>	
					<td>
						${empBean.empAccount }
					</td>
					<td align="right" width="100">登陆密码：</td>	
					<td>
						${empBean.empPass }
					</td>
				</tr>
				<tr>
					<td align="right" width="100">身份证：</td>	
					<td>
						${empBean.empPid }
					</td>
					<td align="right" width="100">生日：</td>	
					<td>
						${empBean.empBirthday }
					</td>
				</tr>
				<tr>
					<td align="right" width="100">联系电话：</td>	
					<td>
						${empBean.empTell }
					</td>
					<td align="right" width="100">emial：</td>	
					<td>
						${empBean.empEmail }
					</td>
				</tr>
				<tr>
					<td align="right" width="100">家庭住址：</td>	
					<td colspan="3">
						${empBean.empAddress }
					</td>
				</tr>
				<tr>
					<td align="right" width="100">备注信息：</td>	
					<td colspan="3">
						${empBean.empRemark }
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
</body>
</html>
