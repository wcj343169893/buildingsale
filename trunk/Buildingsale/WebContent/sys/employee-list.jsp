<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="pg" uri="/WEB-INF/lib/pager-taglib.jar"%>
<%@taglib prefix="zcq" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>员工信息</title>
<link href="../style/style.css" rel="stylesheet" type="text/css" />
</head>
<body>
<h1>员工信息</h1>
<form action="EmployeeSearch.action" method="post">账号:<input
	type="text" name="account" value="${account }" />&nbsp; 姓名:<input
	type="text" name="name" value="${name }" />&nbsp; 性别:<select name="sex">
	<option value="2" selected="selected">请选择</option>
	<option value="1" <c:if test="${sex==1}">selected="selected"</c:if>>男</option>
	<option value="0" <c:if test="${sex==0}">selected="selected"</c:if>>女</option>
</select>&nbsp; 地址:<input type="text" name="address" value="${address }" />&nbsp;
店铺:<select name="shopid">
	<option value="0">请选择</option>
</select>&nbsp; 
状态:<select name="state">
	<option value="0">请选择</option>
	<option value="13" <c:if test="${state==13}">selected="selected"</c:if>>在职</option>
	<option value="14" <c:if test="${state==14}">selected="selected"</c:if>>离职</option>
</select>&nbsp; <c:if test="state==13"></c:if> <input type="submit" value="查询" />&nbsp;
<input type="button" value="全部"
	onclick="location.href='EmployeeList.action'" /></form>
<table width="100%">
	<tr>
		<td>id</td>
		<td>员工编号</td>
		<td>员工账号</td>
		<td>姓名</td>
		<td>身份证</td>
		<td>性别</td>
		<td>生日</td>
		<td>电话</td>
		<td>地址</td>
		<td>邮箱</td>
		<td>备注</td>
		<td>操作</td>
	</tr>
	<c:forEach var="emp" items="${requestScope.employeelist}">
		<tr>
			<td>${emp.empId }</td>
			<td><a href="Employee-view.action?id=${emp.empId }">${emp.empNo
			}</a></td>
			<td>${emp.empAccount }</td>
			<td>${emp.empName }</td>
			<td>${emp.empPid}</td>
			<td><c:if test="${emp.empSex==1}">男</c:if> <c:if test="${emp.empSex==0}">女</c:if></td>
			<td><fmt:formatDate value="${emp.empBirthday }"
				pattern="yyyy-MM-dd" /></td>
			<td>${emp.empTell }</td>
			<td>${emp.empAddress }</td>
			<td>${emp.empEmail }</td>
			<td>${emp.empRemark }</td>
			<td><a href="Employee-edit.action?id=${emp.empId }">修改</a>&nbsp;
			<a href="Employee-delete.action?id=${emp.empId }">删除</a></td>
		</tr>
	</c:forEach>
</table>
<pg:pager url="EmployeeList.action"
	items="${requestScope.page.totalRecordCount}"
	maxPageItems="${requestScope.page.pageRecordCount}"
	export="currentPageNumber=pageNumber">
	<pg:param name="pageNo" value="${currentPageNumber }" />
	<pg:index>
		<font face=Helvetica size=-1>结果: <pg:prev>&nbsp;<a
				href="<%=pageUrl%>">[&lt;&lt; 前一页]</a>
		</pg:prev> <pg:pages>
			<%
				if (pageNumber.intValue() < 10) {
			%>&nbsp;<%
				}
							if (pageNumber == currentPageNumber) {
			%><b><%=pageNumber%></b>
			<%
				} else {
			%><a href="<%=pageUrl%>"><%=pageNumber%></a>
			<%
				}
			%>
		</pg:pages> <pg:next>&nbsp;<a href="<%=pageUrl%>">[下一页 &gt;&gt;]</a>
		</pg:next> <br />
		</font>
	</pg:index>
</pg:pager>
</body>
</html>