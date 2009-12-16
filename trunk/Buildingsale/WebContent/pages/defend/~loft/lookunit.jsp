<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="parddu" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
	<parddu:base />
	<title>添加信息</title>
	<link rel="stylesheet" href="style/common_tab.css" />
	<SCRIPT type="text/javascript" src="script/loft.js"></SCRIPT>
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
						添加 <font color="red">${unitBean.loftInfo.loftNo }-->${unitBean.unitName }</font> 信息
					</td>
					<td align="right" style="padding-top:5px;">
						<input type="button" value="返回" class="tab_but" onclick="doback('~loft!selById.action?loftinfto.loftId=${unitBean.loftInfo.loftId }');"/>
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
					<td align="right" width="100">楼盘编号：</td>	
					<td>
						${unitBean.loftInfo.loftNo }
					</td>
					<td align="right" width="100">楼盘名称：</td>	
					<td>
						${unitBean.loftInfo.loftName }
					</td>
				</tr>
				<tr>
					<td align="right" width="100">单元编号：</td>	
					<td>
						${unitBean.unitNo }
					</td>
					<td align="right" width="100">单元名称：</td>	
					<td>
						${unitBean.unitName }
					</td>
				</tr>
				<tr>
					<td align="right" width="100">房屋数量：</td>	
					<td>
						${unitBean.unitHouseNum }
					</td>
					<td align="right" width="100">楼层数：</td>	
					<td>
						${unitBean.unitFloorNum }
					</td>
				</tr>
				<tr>
					<td align="right" width="100">施工期号：</td>	
					<td colspan="3">
						${unitBean.unitTerm }
					</td>
				</tr>
			</table>
			<div style="width:100%;margin:11px 2px 2px 2px;">
				<div style="font-weight:bold;float:left;width:150px;height:100%;padding-top:5px; padding-bottom: 5px;">
					${unitBean.unitNo }房屋信息
				</div><table border="0" cellpadding="2" style="float:left;" cellspacing="0">
					<tr>
						<td bgcolor="red">&nbsp;&nbsp;已售&nbsp;&nbsp;</td>
						<td style="width:5px;"></td>
						<td bgcolor="yellow">&nbsp;&nbsp;下订&nbsp;&nbsp;</td>
						<td style="width:5px;"></td>
						<td bgcolor="green">&nbsp;&nbsp;未售&nbsp;&nbsp;</td>
					</tr>
				</table></div>
				<table width="100%" border="1" style="border-collapse:collapse;background-color:#ffffff;" bordercolor="#B6D9F6" cellpadding="6">
				<tr><c:set var="h" value="1"></c:set><c:set var="j" value="1"></c:set>
				<c:forEach items="${unitBean.houseInfos}" var="hinfo">
				       
				       <c:if test="${i==unitBean.unitHouseNum}">
				       <c:set var="i" value="0"></c:set>
				       <c:set var="j" value="1"></c:set>
				       <c:set var="h" value="${h+1}"></c:set>
				       </tr><tr></c:if>
					   <c:if test="${hinfo.dataDict.ddValue=='已售'}">
					    <td align="center" bgcolor="red"></td>${h}_${j}
					    <c:set var="i" value="${i+1}"></c:set>
					    <c:set var="j" value="${j+1}"></c:set>
					   </c:if>
						<c:if test="${hinfo.dataDict.ddValue=='下订'}">
					      <td align="center" bgcolor="yellow">${h}_${j}</td>
					      <c:set var="i" value="${i+1}"></c:set>
					      <c:set var="j" value="${j+1}"></c:set>
					   </c:if>
					   <c:if test="${hinfo.dataDict.ddValue=='未售'}">
					    <td align="center" bgcolor="green">${h}_${j}</td>
					    <c:set var="i" value="${i+1}"></c:set>
					    <c:set var="j" value="${j+1}"></c:set>
					   </c:if>
				</c:forEach>
				</tr>
			</table>
		</td>
		<td class="two_2"></td>
	</tr>
	<tr>
		<td class="three_1"></td>
		<td class="three_2" align="center">
		</td>
		<td class="three_3"></td>
	</tr>
</table>
</body>
</html>
