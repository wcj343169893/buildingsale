<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="pg" uri="/WEB-INF/lib/pager-taglib.jar"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>员工信息</title>
</head>
<body>
<h1>员工信息</h1>
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
	</tr>
	<c:forEach var="emp" items="${requestScope.employeelist}">
		<tr>
			<td>${emp.empId }</td>
			<td>${emp.empNo }</td>
			<td>${emp.empAccount }</td>
			<td>${emp.empName }</td>
			<td>${emp.empPid}</td>
			<td>${emp.empSex }</td>
			<td><fmt:formatDate value="${emp.empBirthday }" pattern="yyyy-MM-dd"/></td>
			<td>${emp.empTell }</td>
			<td>${emp.empAddress }</td>
			<td>${emp.empEmail }</td>
			<td>${emp.empRemark }</td>
		</tr>
	</c:forEach>
</table>
<pg:pager url="employeeList.action"
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
		</pg:next> <br>
		</font>
	</pg:index>

</pg:pager>
</body>
</html>