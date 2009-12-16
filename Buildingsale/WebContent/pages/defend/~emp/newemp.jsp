<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="parddu" %>
<html>
<head>
	<parddu:base />
	<title>新员工入职</title>
	<link rel="stylesheet" href="style/common_tab.css" />
	<script type="text/javascript" src="script/PardduDateTimePicker.js" ></script>
	<script type="text/javascript" src="script/emp.js" ></script>
	<script type="text/javascript" src="dwr/interface/shopname.js" ></script>
	<script type="text/javascript" src="dwr/interface/empcheckno.js" ></script>
	<script type="text/javascript" src="dwr/engine.js"></script>
	<script type="text/javascript" src="dwr/util.js"></script>
</head>

<body onload="selshop();">
<form action="validate/~empaction!addEmp.action" method="post" onsubmit="docheckempno();return doaddemp();">
<input type="hidden" name="operate" value="doNewEmp"/>
<table width="98%" align="center" class="tab_tab" cellpadding="0" cellspacing="0">
	<tr>
		<td class="one_1"></td>
		<td class="one_2">
			<table border="0" cellpadding="0" cellspacing="0" width="100%" height="26">
				<tr>
					<td>
						<img src="images/tab/311.gif" width="16" height="16" />
						新员工入职
					</td>
					<td align="right" style="padding-top:5px;">
						<input type="submit" value="保存" class="tab_but" />
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
			<table width="100%" border="1" style="border-collapse:collapse;background-color:#ffffff;" bordercolor="#B6D9F6" cellpadding="3">
				<tr>
					<td align="right" width="100">编号：</td>	
					<td>
					  <table border="0" cellpadding="0" cellspacing="0">
					  	<tr>
					  		<td><input type="text" name="employee.empNo" id="empNo" style="width:100px;" onblur="docheckempno();" />&nbsp;</td>
					  		<td><input type="button" class="tab_but" value="检查是否可用" onclick="docheckempno();"/>&nbsp;&nbsp;</td>
					  		<td width="18">  <img src="images\tab\exclamation.png" alt="该编号不可用" id="del" style="display: none;"/>
					  		<img src="images\tab\accept.png" alt="该编号可用" id="ye" style="display: none;"/></td>
					  	</tr>
					  </table>						
					</td>
					<td align="right" width="100">所属售房部：</td>	
					<td>
						<select name="employee.shopInfo.shopId" id="shopId" >
						 <option></option>
						</select>
					</td>
				</tr>
				<tr>
					<td align="right" width="100">姓名：</td>	
					<td>
						<input type="text" name="employee.empName" id="empName" style="width:80px;" />
					</td>
					<td align="right" width="100">性别：</td>	
					<td>
						<input type="radio" name="employee.empSex" value="1" checked="checked" />男 &nbsp;&nbsp;&nbsp;
						<input type="radio" name="employee.empSex" value="0" />女
					</td>
				</tr>
				<tr>
					<td align="right" width="100">登陆帐号：</td>	
					<td>
						<input type="text" name="employee.empAccount" id="empAccount" style="width:80px;" />
					</td>
					<td align="right" width="100">登陆密码：</td>	
					<td>
						<input type="text" name="employee.empPass" id="empPass" style="width:80px;" value="8888" readonly="readonly" />
					</td>
				</tr>
				<tr>
					<td align="right" width="100">身份证：</td>	
					<td>
						<input type="text" name="employee.empPid" id="empPid" style="width:140px;" />
					</td>
					<td align="right" width="100">生日：</td>	
					<td>
						<input type="text" name="employee.empBirthday"  Id="ebo" onclick="PardduDateTimePicker('ebo','yyyy-MM-dd',75)" style="width:90px;" />
					</td>
				</tr>
				<tr>
					<td align="right" width="100">联系电话：</td>	
					<td>
						<input type="text" name="employee.empTell" style="width:90px;" />
					</td>
					<td align="right" width="100">emial：</td>	
					<td>
						<input type="text" name="employee.empEmail" style="width:160px;" />
					</td>
				</tr>
				<tr>
					<td align="right" width="100">家庭住址：</td>	
					<td colspan="3">
						<input type="text" name="employee.empAddress" style="width:96%;" />
					</td>
				</tr>
				<tr>
					<td align="right" width="100">备注信息：</td>	
					<td colspan="3">
					   <textarea rows="4" name="employee.empRemark" cols=""style="width:100%"></textarea>
					</td>
				</tr>
			</table>
			<input type="hidden" name="employee.dataDict.ddId" value="13"/>
			<div style="text-align:center;padding-top:5px;">
				<input type="submit" value="确认新建" class="tab_but"/>
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
