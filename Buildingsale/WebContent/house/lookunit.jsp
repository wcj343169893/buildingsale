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
	#unitInfo{
		border-right: 1px solid #6BB3ED;
		border-bottom: 1px solid #00A8EC;
		width: 600px;
		border-collapse:collapse; 
		font-size: 14px;
		background-color: white;
	}
	#unitInfo td{
		border-left: 1px solid #00A8EC;
		border-top: 1px solid #00A8EC;
		padding: 0px;
		height: 25px;
	}
	#lookloft{
		background-color: #D3E7FC;
		text-align: center; 
	} 
	#houseinfo{
		border-right: 1px solid #B6D9F6;
		border-bottom: 1px solid #B6D9F6;
		width: 600px;
		border-collapse:collapse; 
		font-size: 14px;
	} 
	#houseinfo td{
		border-left: 1px solid #B6D9F6;
		border-top: 1px solid #B6D9F6;
		padding: 6px;
		height: 25px; 
	}
	.titles{
		text-align: right;
	}
	.已售{
		background-color: red;
	}	
	.未售{
		background-color: green;
	}	
	.下订{
		background-color: #FFFF00;
	}	
	.showvalue{
		text-align: left; 
	}
	a{
		color: black;
		text-decoration: none;
	}
</style>
</head>
<body>
<div id="lookloft" style="width: 620px">
		<span style="float:left;">添加    ${lookUnitDTO.loftInfo.loftNo }-->${lookUnitDTO.unitInfo.unitName }</span><span style="float:right;"><button id="back">返回</button></span>
		<c:set value="${lookUnitDTO.unitInfo.unitHouseNumber }" var="houseNumber"></c:set>
		<c:set value="${lookUnitDTO.unitInfo.unitFloorNumber }" var="floorNumber"></c:set>
<table id="unitInfo"> 
	<tbody>
	<tr>
		<td class="titles">楼盘编号:&nbsp;&nbsp;</td>
		<td class="showvalue"> &nbsp;&nbsp;${lookUnitDTO.loftInfo.loftNo }</td>
		<td class="titles">楼盘名称:&nbsp;&nbsp;</td>
		<td class="showvalue">&nbsp;&nbsp;${lookUnitDTO.loftInfo.loftName }</td>
	</tr>
	<tr>
		<td class="titles">单元编号:&nbsp;&nbsp;</td>
		<td class="showvalue">&nbsp;&nbsp;${lookUnitDTO.unitInfo.unitNo }</td>
		<td class="titles">单元名称:&nbsp;&nbsp;</td>
		<td class="showvalue">&nbsp;&nbsp;${lookUnitDTO.unitInfo.unitName }</td>
	</tr>
	<tr>
		<td class="titles">房屋数量:&nbsp;&nbsp;</td>
		<td class="showvalue">
		&nbsp;&nbsp;${houseNumber }
		</td>
		<td class="titles">楼层数:&nbsp;&nbsp;</td>
		<td class="showvalue">
		&nbsp;&nbsp;${floorNumber }
		</td>
	</tr>
	<tr>
		<td class="titles">施工期号:&nbsp;&nbsp;</td> 
		<td colspan="3" class="showvalue">&nbsp;&nbsp;${lookUnitDTO.unitInfo.unitTerm }</td>
	</tr>
	</tbody>
	</table>
	<br/>
	<span style="float:left;">${lookUnitDTO.unitInfo.unitNo }房屋信息</span>&nbsp;&nbsp;&nbsp;
	<c:forEach items="${lookUnitDTO.dataDicts}" var="data">
		<span class="${data.ddValue }">${data.ddValue }</span>&nbsp;&nbsp;
	</c:forEach>
	<table style="text-align: center;" id="houseinfo">
	<c:set value="0" var="showindex"></c:set>
		<c:forEach var="floorNumber2" begin="1" end="${floorNumber}" step="1">
			<tr>
				<c:forEach var="houseNumber2" begin="1" end="${houseNumber }" step="1">
					<td class="${lookUnitDTO.houseInfos[showindex].dataDict.ddValue }">
						<a href="showhouseinfo.action?hid=${lookUnitDTO.houseInfos[showindex].houseId }">
							${lookUnitDTO.houseInfos[showindex].houseNo }
						</a>	
					</td>
					<c:set value="${showindex+1}" var="showindex"></c:set>
				</c:forEach>
			</tr>
		</c:forEach>
</table>
<br>
</div>
</body>
</html>