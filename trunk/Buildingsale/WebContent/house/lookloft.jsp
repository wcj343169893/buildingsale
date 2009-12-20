<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查看楼盘信息</title>
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
		width: 800px;
	}.titles{
		text-align: right;
	}
	a{
		text-decoration: none;
	}
</style>
</head>
<body>
<div id="lookloft" style="width: 800px">
<c:set value="${requestScope.loftInfo }" var="loftInfo"></c:set>
		<span style="float:left;">查看-->${loftInfo.loftNo }楼盘信息</span><span style="float:right;"><button id="back">返回</button></span>
<table>
	<tbody>
	<tr>
		<td class="titles">编号:</td>
		<td>${loftInfo.loftNo }</td>
		<td class="titles">名称:</td>
		<td>${loftInfo.loftName}</td>
	</tr>
	<tr>
		<td class="titles">物业类型:</td>
		<td>${loftInfo.dataDictByLoftComtyType.ddValue}</td>
		<td class="titles">建筑类型:</td>
		<td>${loftInfo.dataDictByLoftBuildType.ddValue}</td>
	</tr>
	<tr>
		<td class="titles">动工时间:</td>
		<fmt:formatDate value="${loftInfo.loftBeginTime}" pattern="yyyy-MM-dd" var="beginTime"/>
		<td>${beginTime }</td>
		<td class="titles">开盘时间:</td>
		<fmt:formatDate value="${loftInfo.loftShellOutTime}" pattern="yyyy-MM-dd" var="shellOutTime"/>
		<td>${shellOutTime }</td>
	</tr>
	<tr>
		<td class="titles">交房时间:</td>
		<fmt:formatDate value="${loftInfo.loftFinishTime}" pattern="yyyy-MM-dd" var="finishTime"/>
		<td>${finishTime }</td>
		<td class="titles">均价:</td>
		<td>${loftInfo.loftPrice}元平方米</td>
	</tr>
	<tr>
		<td class="titles">区域:</td>
		<td>${loftInfo.loftZone}</td>
		<td class="titles">地址:</td>
		<td>${loftInfo.loftAddress}</td>
	</tr>
	<tr>
		<td class="titles">容积率:</td>
		<td>${loftInfo.loftCapacity}</td>
		<td class="titles">绿化率:</td>
		<td>${loftInfo.loftGreen}</td>
	</tr>
	<tr>
		<td class="titles">交通路线:</td>
		<td colspan="3">${loftInfo.loftTraffic}</td>
	</tr>
	<tr>
		<td class="titles">配套设施:</td>
		<td colspan="3">${loftInfo.loftFacility}</td>
	</tr>
	<tr>
		<td class="titles">备注信息:</td>
		<td colspan="3">${loftInfo.loftRemark}</td>
	</tr>
	</tbody>
	</table>
	<span style="float:left;">楼盘单元信息</span>
	<table style="text-align: center;">
	<thead>
	<tr>
		<td>编号</td>
		<td>名称</td>
		<td>楼层数</td>
		<td>房屋(套)每层</td>
		<td>工程 期号</td>
		<td>操作</td>
	</tr>
	</thead>
	<tbody>
	<c:choose>
		<c:when test="${!empty loftInfo.unitInfos}">
		<c:forEach items="${loftInfo.unitInfos}" var="unitInfo">
			<tr>
				<td>${unitInfo.unitNo }</td>
				<td>${unitInfo.unitName}</td>
				<td>${unitInfo.unitFloorNumber}</td>
				<td>${unitInfo.unitHouseNumber}</td>
				<td>${unitInfo.unitTerm}</td>
				<td><a href="lookunit.action?unitId=${unitInfo.unitId }">查看</a>
					<c:if test="${!empty SESSION_LOGIN_USER}">
						<a href="editunit.action?unitId=${unitInfo.unitId }">修改</a>
						<a href="deleteunit.action?unitId=${unitInfo.unitId }">删除</a>
					</c:if>
				</td>
			</tr>
		</c:forEach>
		</c:when>
		<c:otherwise>
		<tr><td colspan="6">暂无单元<a href="addInitunit.action?loftId=${loftInfo.loftId }">添加单元</a></td></tr>	
		</c:otherwise>
	</c:choose>
	</tbody>
</table>
</div>
</body>
</html>