<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>浏览房屋类型</title>
<style type="text/css">
	#housetype table{
		border-right: 1px solid #6BB3ED;
		border-bottom: 1px solid #00A8EC;
		width: 800px;
		border-collapse:collapse; 
		font-size: 14px;
		text-align: center;
	}
	#housetype table td{
		border-left: 1px solid #00A8EC;
		border-top: 1px solid #00A8EC;
		padding: 0px;
	}
	#housetype{
		background-color: #D3E7FC;
	}
	.titles{
		font-family: monospace;
	}
</style>
</head>
<body>
<div id="housetype" style="width: 800px">
		<span style="float:left;">房屋类型信息</span><span style="float:right;"><button id="createnew">新建</button></span>
<table>
	<thead>
		<tr>
			<td class="titles">名称:</td>
			<td class="titles">室</td>
			<td class="titles">厅</td>
			<td class="titles">厨</td>
			<td class="titles">卫</td>
			<td class="titles">阳台</td>
			<td class="titles">户型图</td>
			<td class="titles">操作</td>
		</tr>
	</thead>
	<tbody>
	<c:choose>
		<c:when test="${!empty requestScope.houseTypes}">
		<c:forEach items="${requestScope.houseTypes}" var="houseType">
			<tr>
				<td>${houseType.htName }</td>
				<td>${houseType.htRoom }</td>
				<td>${houseType.htHalll }</td>
				<td>${houseType.htCookRoom }</td>
				<td>${houseType.htWc }</td>
				<td>${houseType.htTerrace }</td>
				<td>${houseType.htImg }</td>
				<td><a href="#">查看</a>
					<c:if test="${!empty SESSION_LOGIN_USER}">
					  <a href="#">编辑</a>  <a href="#">删除</a>
					</c:if>
				</td>
			</tr>
		</c:forEach>
		</c:when>
		<c:otherwise>
			暂无内容
		</c:otherwise>
	</c:choose>
	</tbody>
</table>
<span style="float: right;">
共${pg.totalRecordCount }条记录   每页10条  当前${pg.pageIndex }页/共${pg.pageCount }页
<a href="scanhouseType.action?p=1">第一页</a>
<a href="scanhouseType.action?p=${pg.pageIndex-1 }">上一页</a>
<a href="scanhouseType.action?p=${pg.pageIndex+1 }">下一页</a>
<a href="scanhouseType.action?p=${pg.pageCount }">末尾页</a>
</span>
</div>
</body>
</html>