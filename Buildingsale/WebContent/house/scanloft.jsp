<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>楼盘列表</title>
<style type="text/css">
a{
	text-decoration: none;
}
#scanloftTable {
	border-right: 1px solid #6BB3ED;
	border-bottom: 1px solid #00A8EC;
	border-collapse: collapse;
	width: 800px;
}

#scanloftTable tbody td {
	border-left: 1px solid #00A8EC;
	border-top: 1px solid #00A8EC;
	padding: 0px;
	text-align: center;
}
#scanloft{
	background-color: #D3E7FC;
	width: 800px;
}
</style>
</head>
<body>

<div id="scanloft">
<table id="scanloftTable">
	<thead>
		<tr>
			<td colspan="3">楼盘信息</td>
			<td colspan="4" style="text-align: right;">楼盘编号<input
				type="text" size="10" />楼盘名<input type="text" size="10" /><input
				type="button" value="查询" /></td>
		</tr>
	</thead>
	<tbody>
		<tr class="class1">
			<td>编号</td>
			<td>名称</td>
			<td>地区</td>
			<td>开盘时间</td>
			<td>交房时间</td>
			<td>均价</td>
			<td>操作</td>
		</tr>
		<c:choose>
			<c:when test="${!empty loftInfos}">
				<c:forEach items="${loftInfos}" var="loft">
					<tr class="class1">
						<td><a href="lookloft.action?loftId=${loft.loftId }">${loft.loftNo }</a></td>
						<td>${loft.loftName }</td>
						<td>${loft.loftZone }</td>
						<fmt:formatDate value="${loft.loftBeginTime }" pattern="yyyy-MM-dd" var="beginTime"/>
						<td>${beginTime }</td>
						<fmt:formatDate value="${loft.loftShellOutTime }" pattern="yyyy-MM-dd" var="shellOutTime"/>
						<td>${shellOutTime }</td>
						<td>${loft.loftPrice }</td>
						<td><a href="lookloft.action?loftId=${loft.loftId }">查看</a>
							<c:if test="${!empty SESSION_LOGIN_USER}">
								<a href="editloft.action?loftId=${loft.loftId }">修改</a><a href="deleteloft.action?loftId=${loft.loftId }">删除</a>
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
<a href="scanloft.action?p=1">第一页</a>
<a href="scanloft.action?p=${pg.pageIndex-1 }">上一页</a>
<a href="scanloft.action?p=${pg.pageIndex+1 }">下一页</a>
<a href="scanloft.action?p=${pg.pageCount }">末尾页</a>
</span>
</div>
</body>
</html>