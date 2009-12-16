<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="parddu" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<parddu:base />
	<title>员工销售信息</title>
	<link rel="stylesheet" href="style/common_tab.css" />
</head>

<body>
<form action="" method="post">
<input type="hidden" value="toCountEmpSell"/>
<table width="98%" align="center" class="tab_tab" cellpadding="0" cellspacing="0">
	<tr>
		<td class="one_1"></td>
		<td class="one_2">
			<table border="0" cellpadding="0" cellspacing="0" width="100%" height="26">
				<tr>
					<td>
						<img src="images/user.gif" width="16" height="16" />
						员工销售信息
					</td>
					<td align="right" style="padding-top:5px;">
						员工编号<input type="text" class="tab_txt" style="width:80px;" name="emp.empNo" />&nbsp;&nbsp;&nbsp;
						员工姓名<input type="text" class="tab_txt" style="width:80px;" name="emp.empName" />
					</td>
					<td align="right" style="padding-top:5px;" width="50">
						<input type="submit" value="查询" class="tab_but" />
					</td>
				</tr>
			</table>
		</td>
		<td class="one_3"></td>
	</tr>
	<tr>
		<td class="two_1"></td>
		<td>
			<table width="100%" border="1" style="border-collapse:collapse;" cellpadding="4" bordercolor="#6BB3ED">
				<tr class="tab_top">
					<th width="120">编号</th>
					<th>姓名</th>
					<th>所属售房部</th>
					<th>总成交套数</th>
					<th>总成交金额</th>
					<th width="50">操作</th>
				</tr>
				<!-- 循环取值 -->
				<c:forEach items="" var="e">
					<tr class="tab_tr_out" onmouseover="this.className='tab_tr_over'" onmouseout="this.className='tab_tr_out'">
						<td align="center">${e.empNo }</td>
						<td align="center">${e.empName }</td>
						<td>${e.shopInfo.shopName }</td>
						<td align="center">${e.sellNum }</td>
						<td align="center">${e.sellMoney }</td>
						<td align="center">
							<a href="pages/struts/emp.do?operate=toLookEmpSell&emp.empId=${e.empId }"><img src="images/tab/scan.png" />查看</a>&nbsp;&nbsp;
						</td>
					</tr>
				</c:forEach>
			</table>
		</td>
		<td class="two_2"></td>
	</tr>
	<tr>
		<td class="three_1"></td>
		<td class="three_2" align="right" >
			<parddu:page name="pageBean" formName="empForm" scope="request" />
		</td>
		<td class="three_3"></td>
	</tr>
</table>
</form>
</body>
</html>
