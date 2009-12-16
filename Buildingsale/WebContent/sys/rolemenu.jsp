<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>
<div>
<table width="100%">
<tr><td width="20%">
<p>角色</p>
<c:forEach var="rolemenu" items="${requestScope.list}">
<input type="radio" onclick="open(${rolemenu.role.roleId});">${rolemenu.role.String}</input><br/>
</c:forEach>
</td>
<td> 
<c:forEach var="rolemenudto" items="${requestScope.roleMenuDtos}">
${rolemenudto.role }<br/>
<c:forEach var="menu" items="${rolemenudto.menu">
${menu.menuName }
</c:forEach>
</c:forEach>
</td></tr>
</table>
</div>
</body>
</html>