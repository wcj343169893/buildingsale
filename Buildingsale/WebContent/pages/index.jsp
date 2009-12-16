<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="parddu" %>
<html>
<head>
	<parddu:base />
	<title>index</title>
	<link rel="stylesheet" href="style/index.css" />
</head>

<frameset rows="55,*,23" cols="*" framespacing="0" frameborder="no" border="0">
  <frame src="vallogin/~comaction!dotop.action" name="top" scrolling="No" noresize="noresize" id="top" />
  <frameset rows="*" cols="200,12,*" id="ListframeSet">
    <frame src="vallogin/~comaction!doselEmp.action" name="menu" id="menu" noresize="noresize"/>
    <frame src="vallogin/~comaction!domyhtml.action" name="LiftControl" scrolling="no" noresize="noresize"/>
    <frame src="#" name="main" id="main" noresize="noresize"/>
  </frameset>
  <frame src="vallogin/~comaction!dobottom.action" name="bottom" scrolling="No" noresize="noresize" id="bottom" />
</frameset>
<noframes><body>
</body>
</noframes></html>