<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查看单元信息</title>
<style type="text/css">
	#lookloft table{
		border-right: 1px solid #6BB3ED;
		border-bottom: 1px solid #00A8EC;
		width: 800px;
		border-collapse:collapse; 
		font-size: 14px;
		background-color: white;
	}
	#lookloft table td{
		border-left: 1px solid #00A8EC;
		border-top: 1px solid #00A8EC;
		padding: 0px;
	}
	#lookloft{
		background-color: #D3E7FC;
	}.titles{
		text-align: right;
	}
	.已售{
		background-color: red;
	}	
	.未售{
		background-color: blue;
	}	
	.下订{
		background-color: gray;
	}	
</style>
</head>
<body>
<div id="lookloft" style="width: 800px">
		<span style="float:left;">添加    ${lookUnitDTO.loftInfo.loftNo }-->${lookUnitDTO.unitInfo.unitName }</span><span style="float:right;"><button id="back">返回</button></span>
		<c:set value="${lookUnitDTO.unitInfo.unitHouseNumber }" var="houseNumber"></c:set>
		<c:set value="${lookUnitDTO.unitInfo.unitFloorNumber }" var="floorNumber"></c:set>
<table>
	<tbody>
	<tr>
		<td class="titles">楼盘编号:</td>
		<td> ${lookUnitDTO.loftInfo.loftNo }</td>
		<td class="titles">楼盘名称:</td>
		<td>${lookUnitDTO.loftInfo.loftName }</td>
	</tr>
	<tr>
		<td class="titles">单元编号:</td>
		<td>${lookUnitDTO.unitInfo.unitNo }</td>
		<td class="titles">单元名称:</td>
		<td>${lookUnitDTO.unitInfo.unitName }</td>
	</tr>
	<tr>
		<td class="titles">房屋数量:</td>
		<td>
		${houseNumber }
		</td>
		<td class="titles">楼层数:</td>
		<td>
		${floorNumber }
		</td>
	</tr>
	<tr>
		<td class="titles">施工期号:</td>
		<td colspan="3">${lookUnitDTO.unitInfo.unitTerm }</td>
	</tr>
	</tbody>
	</table>
	<span style="float:left;">${lookUnitDTO.unitInfo.unitNo }房屋信息</span>&nbsp;&nbsp;&nbsp;
	<c:forEach items="${lookUnitDTO.dataDicts}" var="data">
		<span class="${data.ddValue }">${data.ddValue }</span>&nbsp;&nbsp;
	</c:forEach>
	<table style="text-align: center;">
	<c:set value="0" var="showindex"></c:set>
		<c:forEach var="floorNumber2" begin="1" end="${floorNumber}" step="1">
			<tr>
				<c:forEach var="houseNumber2" begin="1" end="${houseNumber }" step="1">
					<td class="${lookUnitDTO.houseInfos[showindex].dataDict.ddValue }">${lookUnitDTO.houseInfos[showindex].houseNo }</td>
					<c:set value="${showindex+1}" var="showindex"></c:set>
				</c:forEach>
			</tr>
		</c:forEach>
</table>
</div>
</body>
</html>