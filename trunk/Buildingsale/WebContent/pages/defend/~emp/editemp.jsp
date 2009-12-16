<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="parddu" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<parddu:base />
	<title>编辑员工信息</title>
	<link rel="stylesheet" href="style/common_tab.css" />
	<script type="text/javascript" src="script/PardduDateTimePicker.js" ></script>
	<script type="text/javascript" src="dwr/interface/shopname.js" ></script>
	<script type="text/javascript" src="dwr/engine.js"></script>
	<script type="text/javascript" src="dwr/util.js"></script>
	<script type="text/javascript" src="script/emp.js"></script>
</head>

<body onload="selshop();">
<form action="validate/~empaction!updEmp.action" method="post">
<input type="hidden" name="operate" value="doEditEmp"/>
<table width="98%" align="center" class="tab_tab" cellpadding="0" cellspacing="0">
	<tr>
		<td class="one_1"></td>
		<td class="one_2">
			<table border="0" cellpadding="0" cellspacing="0" width="100%" height="26">
				<tr>
					<td>
						<img src="images/tab/311.gif" width="16" height="16" />
						编辑员工--><font color="red">${empedit.empName }</font>信息
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						当前状态:<font style="color:red;font-weight:bold;">${empedit.dataDict.ddValue }</font>
						<input type="hidden" name="emp.empState.ddId"/>
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
			<table width="100%" border="1" style="border-collapse:collapse;background-color:#ffffff;" bordercolor="#B6D9F6" cellpadding="5">
				<tr>
					<td align="right" width="100">编号：</td>	
					<td>
						<input type="hidden" name="employee.empId" value="${empedit.empId }"/>
						<input type="hidden" name="employee.dataDict.ddId" value="${empedit.dataDict.ddId }"/>
						<input type="text" name="employee.empNo" readonly="readonly" value="${empedit.empNo }" style="width:100px;" />
					</td>
					<td align="right" width="100">所属售房部：</td>	
					<td>
						
						<select id="shopId" name="employee.shopInfo.shopId">
						 <option></option>
						</select>
						<script type="text/javascript">
							//显示数据
							function sel(data){
								var json = eval("("+ data +")");
								var list = document.getElementById('shopId');
							    for(var i =0; i<json.length;i++){
									list.options[i] = new Option(json[i].shopName,json[i].shopId);
								}	
								list.value="${empedit.shopInfo.shopId}";
							}
						</script>
					</td>
				</tr>
				<tr>
					<td align="right" width="100">姓名：</td>	
					<td>
						<input type="text" name="employee.empName" value="${empedit.empName }" style="width:80px;" />
					</td>
					<td align="right" width="100">性别：</td>	
					<td>
					    <c:if test="${empedit.empSex==1}">
					    <input type="radio" name="employee.empSex" value="1" checked="checked" />男 &nbsp;&nbsp;&nbsp;
						<input type="radio" name="employee.empSex" value="0" />女
					    </c:if>
					    <c:if test="${empedit.empSex==0}">
					    <input type="radio" name="employee.empSex" value="1" />男 &nbsp;&nbsp;&nbsp;
						<input type="radio" name="employee.empSex" value="0" checked="checked" />女
					    </c:if>
					</td>
				</tr>
				<tr>
					<td align="right" width="100">登陆帐号：</td>	
					<td>
						<input type="text" name="employee.empAccount" value="${empedit.empAccount }" style="width:80px;" />
					</td>
					<td align="right" width="100">登陆密码：</td>	
					<td>
						<input type="text" name="employee.empPass" style="width:80px;" value="${empedit.empPass }" readonly="readonly" />
					</td>
				</tr>
				<tr>
					<td align="right" width="100">身份证：</td>	
					<td>
						<input type="text" name="employee.empPid" value="${empedit.empPid }" style="width:140px;" />
					</td>
					<td align="right" width="100">生日：</td>	
					<td>
						<input type="text" name="employee.empBirthday" value="${empedit.empBirthday }" Id="ebo" onclick="PardduDateTimePicker('ebo','yyyy-MM-dd',75)" style="width:90px;" />
					</td>
				</tr>
				<tr>
					<td align="right" width="100">联系电话：</td>	
					<td>
						<input type="text" name="employee.empTell" value="${empedit.empTell }" style="width:90px;" />
					</td>
					<td align="right" width="100">emial：</td>	
					<td>
						<input type="text" name="employee.empEmail" value="${empedit.empEmail }" style="width:160px;" />
					</td>
				</tr>
				<tr>
					<td align="right" width="100">家庭住址：</td>	
					<td colspan="3">
						<input type="text" name="employee.empAddress" value="${empedit.empAddress }" style="width:96%;" />
					</td>
				</tr>
				<tr>
					<td align="right" width="100">备注信息：</td>	
					<td colspan="3">
					   <textarea rows="4" cols="" name="employee.empRemark" style="width:100%">${empedit.empRemark }</textarea>
					</td>
				</tr>
			</table>
			<div style="text-align:center;padding-top:5px;">
				<input type="submit" value="确认修改" class="tab_but"/>
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
