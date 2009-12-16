<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="parddu" %>
<html>
<head>
	<parddu:base />
	<title>员工离职</title>
	<link rel="stylesheet" href="style/common_tab.css" />
	<script type="text/javascript" src="script/PardduDateTimePicker.js" ></script>
	<script type="text/javascript" src="script/emp.js" ></script>
</head>

<body>
<form action="validate/~empaction!updquit.action" method="post">
<input type="hidden" name="operate" value="doEmpQuit"/>
<table width="98%" align="center" class="tab_tab" cellpadding="0" cellspacing="0">
	<tr>
		<td class="one_1"></td>
		<td class="one_2">
			<table border="0" cellpadding="0" cellspacing="0" width="100%" height="26">
				<tr>
					<td>
						<img src="images/tab/311.gif" width="16" height="16" />
						员工--><font color="red">${emp.empName }</font>离职
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						当前状态:<font style="color:red;font-weight:bold;">${emp.dataDict.ddValue }</font>
						<input type="hidden" name="employee.dataDict.ddId" value="14"/>						
					</td>
					<td align="right" style="padding-top:5px;">
						<input type="button" value="编辑"  class="tab_but" onclick="to('~empaction!selByidToedit.action?employee.empId=${emp.empId }');" />
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
			<table width="100%" border="1" style="border-collapse:collapse;background-color:#ffffff;" bordercolor="#B6D9F6" cellpadding="5">
				<tr>
					<td align="right" width="100">编号：</td>	
					<td>
						<input type="hidden" name="employee.empId" value="${emp.empId }"/>
						<input type="hidden" name="employee.empNo" value="${emp.empNo }" />
						${emp.empNo }
					</td>
					<td align="right" width="100">所属售房部：</td>	
					<td>
						<input type="hidden" name="employee.shopInfo.shopId" value="${emp.shopInfo.shopId }"/>
						${emp.shopInfo.shopName }
					</td>
				</tr>
				<tr>
					<td align="right" width="100">姓名：</td>	
					<td>
						<input type="hidden" name="employee.empName" value="${emp.empName }" />
						${emp.empName }
					</td>
					<td align="right" width="100">性别：</td>	
					<td>
						<input type="hidden" name="employee.empSex" value="${emp.empSex }" />
						${emp.empSex }
					</td>
				</tr>
				<tr>
					<td align="right" width="100">登陆帐号：</td>	
					<td>
						<input type="hidden" name="employee.empAccount" value="${emp.empAccount }" />
						${emp.empAccount }
					</td>
					<td align="right" width="100">登陆密码：</td>	
					<td>
						<input type="hidden" name="employee.empPass" value="${emp.empPass }" />
						${emp.empPass }
					</td>
				</tr>
				<tr>
					<td align="right" width="100">身份证：</td>	
					<td>
						<input type="hidden" name="employee.empPid" value="${emp.empPid }" />
						${emp.empPid }
					</td>
					<td align="right" width="100">生日：</td>	
					<td>
						<input type="hidden" name="employee.empBirthday" value="${emp.empBirthday }" />
						${emp.empBirthday }
					</td>
				</tr>
				<tr>
					<td align="right" width="100">联系电话：</td>	
					<td>
						<input type="hidden" name="employee.empTell" value="${emp.empTell }" />
						${emp.empTell }
					</td>
					<td align="right" width="100">emial：</td>	
					<td>
						<input type="hidden" name="employee.empEmail" value="${emp.empEmail }" />
						${emp.empEmail }
					</td>
				</tr>
				<tr>
					<td align="right" width="100">家庭住址：</td>	
					<td colspan="3">
						<input type="hidden" name="employee.empAddress" value="${emp.empAddress }" />
						${emp.empAddress }
					</td>
				</tr>
				<tr>
					<td align="right" width="100">备注信息：</td>	
					<td colspan="3">
						<input type="hidden" name="employee.empRemark" value="${emp.empRemark }" />
						${emp.empRemark }
					</td>
				</tr>
			</table>
			<div style="text-align:center;padding-top:5px;">
				<input type="submit" value="确认离职" class="tab_but"/>
			</div>
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
