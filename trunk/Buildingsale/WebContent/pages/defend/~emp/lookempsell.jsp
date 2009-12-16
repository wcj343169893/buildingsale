<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="parddu" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<parddu:base />
	<title>查询员工销售信息</title>
	<link rel="stylesheet" href="style/common_tab.css" />
	<script type="text/javascript" src="script/PardduDateTimePicker.js" ></script>
</head>

<body>
<form action="/pages/struts/emp" method="post">
<input type="hidden" name="operate" value="toLookEmpSell" />
<table width="98%" align="center" class="tab_tab" cellpadding="0" cellspacing="0">
	<tr>
		<td class="one_1"></td>
		<td class="one_2">
			<table border="0" cellpadding="0" cellspacing="0" width="100%" height="26">
				<tr>
					<td>
						<img src="images/tab/311.gif" width="16" height="16" />
						员工--><font color="red">${requestScope.empBean.empName }</font>销售详情
					</td>
					<td align="right" style="padding-top:5px;">
						<input type="button" value="返回" class="tab_but" onclick="location.href='${applicationScope.projectPath }pages/struts/emp.do?operate=toCountEmpSell'"/>
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
						${requestScope.empBean.empNo }
						<input type="hidden" name="emp.empId"/>
					</td>
					<td align="right" width="100">所属售房部：</td>	
					<td>
						${requestScope.empBean.shopInfo.shopName }
					</td>
				</tr>
				<tr>
					<td align="right" width="100">姓名：</td>	
					<td>
						${requestScope.empBean.empName }
					</td>
					<td align="right" width="100">联系电话：</td>	
					<td>
						${requestScope.empBean.empTell }
					</td>
				</tr>
				<tr>
					<td align="right" width="100">总成交套数：</td>	
					<td>
						${requestScope.empBean.sellNum }
					</td>
					<td align="right" width="100">总成交金额：</td>	
					<td>
						${requestScope.empBean.sellMoney }
					</td>
				</tr>
			</table>
			<table border="0" style="margin-top:10px;" cellpadding="0" cellspacing="0" width="100%">
				<tr>
					<td style="color:red;">
						${requestScope.empBean.empName }销售信息
					</td>
					<td align="right">
						时间:<input type="text" name="beginTimeOne" class="tab_txt" style="width:75px" readonly="readonly" styleId="bt" onclick="PardduDateTimePicker('bt','yyyy-MM-dd',75)"/>~<html:text property="endTimeOne" styleClass="tab_txt" style="width:75px" readonly="true" styleId="et" onclick="PardduDateTimePicker('et','yyyy-MM-dd',75)"/>
						&nbsp;&nbsp;&nbsp;&nbsp;楼盘名<input type="text" class="tab_txt" style="width:80px;" name="loftName" />
					</td>
					<td align="right"width="50">
						<input type="submit" value="查询" class="tab_but" />
					</td>
				</tr>
			</table>
			<table width="100%" border="1" style="border-collapse:collapse;margin:3px;" cellpadding="4" bordercolor="#6BB3ED">
				<tr class="tab_top">
					<th>楼盘</th>
					<th>单元</th>
					<th>房号</th>
					<th>套内面积</th>
					<th>套内价格</th>
					<th>总价(含税)</th>
					<th>时间</th>
					<th>购买者</th>
					<th width="70">查看详情</th>
				</tr>
				<c:forEach items="" var="d">
					<tr class="tab_tr_out" onmouseover="this.className='tab_tr_over'" onmouseout="this.className='tab_tr_out'">
						<td>${d.houseInfo.unitInfo.loftInfo.loftName }</td>
						<td align="center">${d.houseInfo.unitInfo.unitName }</td>
						<td align="center">${d.houseInfo.houseNo }</td>
						<td align="center">${d.houseInfo.houseUseArea } m<sup>2</sup></td>
						<td align="center">${d.houseInfo.houseDealUsePrice } 元</td>
						<td align="center">${d.dealAllPrice } 元</td>
						<td align="center"><bean:write name="d" property="dealTime" format="yyyy-MM-dd" /></td>
						<td align="center">${d.dealPurchaserName }</td>
						<td align="center">
							<a href="#"><img src="images/tab/scan.png" />查看</a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</td>
		<td class="two_2"></td>
	</tr>
	<tr>
		<td class="three_1"></td>
		<td class="three_2" align="right">
		</td>
		<td class="three_3">a</td>
	</tr>
</table>
</form>
</body>
</html>
