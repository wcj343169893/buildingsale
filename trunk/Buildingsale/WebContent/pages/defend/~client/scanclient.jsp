<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="parddu" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
	<parddu:base />
	<title>客户信息</title>
	<link rel="stylesheet" href="style/common_tab.css" />
	<script type="text/javascript" src="dwr/interface/selClientDdit.js" ></script>
	<script type="text/javascript" src="dwr/engine.js"></script>
	<script type="text/javascript" src="dwr/util.js"></script>
	<script type="text/javascript" src="script/client.js"></script>
</head>

<body onload="selDdict();">
<form action="validate/~client!selClientBy.action" method="post" onsubmit="return selBysome();">
<input type="hidden" name="operate" value="scanClient"/>
<table width="98%" align="center" class="tab_tab" cellpadding="0" cellspacing="0">
	<tr>
		<td class="one_1"></td>
		<td class="one_2">
			<table border="0" cellpadding="0" cellspacing="0" width="100%" height="26">
				<tr>
					<td>
						<img src="images/user.gif" width="16" height="16" />
						客户信息
					</td>
					<td align="right" style="padding-top:5px;">
						客户状态
						<select name="clientInfo.dataDict.ddId" id="ddtype">
							<option value="0">--所有--</option>
						</select>&nbsp;&nbsp;&nbsp;
						客户姓名<input type="text" class="tab_txt" style="width:80px;" id="clientName" name="clientInfo.clientName" />
					</td>
					<td align="right" style="padding-top:5px;" width="100">
						<input type="submit" value="查询" class="tab_but" />
						<input type="button" value="返回" class="tab_but" onclick="doback('~client!selAllClient.action');" />
					</td>
				</tr>
			</table>
		</td>
		<td class="one_3"></td>
	</tr>
	<tr>
		<td class="two_1"></td>
		<td>
			<table width="100%" border="1" style="border-collapse:collapse;" cellpadding="4" bordercolor="#6BB3ED">
				<tr class="tab_top">
					<th>姓名</th>
					<th>性别</th>
					<th>电话</th>
					<th>注册时间</th>
					<th>状态</th>
					<th>客户经理</th>
					<th width="200">备注</th>
				</tr>
				<c:forEach items="${clients }" var="c">
					<tr class="tab_tr_out" onmouseover="this.className='tab_tr_over'" onmouseout="this.className='tab_tr_out'">
						<td align="center">${c.clientName }</td>
						<td align="center">
						  <c:if test="${c.clientSex==1}">
						     男 
						  </c:if>
						   <c:if test="${c.clientSex==0}">
						     女
						  </c:if>
						</td>
						<td align="center">${c.clientTell }</td>
						<td align="center"><s:date name="#attr.c.clientTime"  format="yyyy-MM-dd"  /></td>
						<td align="center">${c.dataDict.ddValue }</td>
						<td align="center">${c.employee.empName }</td>
						<td align="center">
						  <input type="text" readonly="readonly" style="border:0px; background-color:transparent; width:100%" value="${c.clientRemark }" />
						</td>
					</tr></c:forEach>
			</table>
		</td>
		<td class="two_2"></td>
	</tr>
	<tr>
		<td class="three_1"></td>
		<td class="three_2" align="right" >
			 <font style="font-size:12px;color=#006699;">
			共 ${count } 条记录&nbsp;
			每页<input type="text" class="page_tag_txt" name="page.pageNumber" id="pageNumber" size="3" value="${pagecount }" />条&nbsp;
			当前<input type="text" class="page_tag_txt" readonly="readonly" name="page.pageIndex" id="pageIndex" size="3" value="${page }" />页/
			共 ${allpage }页
			<a href="validate/~client!selAllClient.action?page=1" class="page_a">第一页</a>
			<c:choose>
				<c:when test="${allpage==1 }">上一页&nbsp;下一页</c:when>
				<c:when test="${(page-1)<1 }">上一页&nbsp;
						<a href="validate/~client!selAllClient.action?page=${page+1 }" class="page_a">下一页</a>
				</c:when>
				<c:when test="${(page+1)>allpage }">
				      <a href="validate/~client!selAllClient.action?page=${page-1 }" class="page_a">上一页</a>&nbsp;下一页
				</c:when>
				<c:otherwise>
						<a href="validate/~client!selAllClient.action?page=${page-1 }" class="page_a">上一页</a>
						<a href="validate/~client!selAllClient.action?page=${page+1 }" class="page_a">下一页</a>
				</c:otherwise>
			</c:choose>
			<a href="validate/~client!selAllClient.action?page=${allpage }" class="page_a">末尾页</a>
			转到<input value="${page }" name="" class="page_tag_txt" id="gopage" size="2"/>页	
				<script type="text/javascript">
					function dogopage(pages){
						var countnum = document.getElementById('gopage').value;
						var pagecou =document.getElementById('pageNumber').value;
						var zz = /^\d+$/;
						if(!zz.test(countnum)||!zz.test(pagecou)){
						    alert("页数只能输入数字");
						}else if(countnum>pages){
							alert("你输入的页数过大!");
						}else if(countnum<=0||pagecou<=0){
							alert("不能输入小于1的页数!");
						}else{
						    location.href="~client!selAllClient.action?page="+countnum+"&pagecount="+pagecou;
						}
					}
				</script>
			<button width="20" onclick="dogopage('${allpage}');" class="page_tag_but">GO</button>
			</font>
		</td>
		<td class="three_3"></td>
	</tr>
</table>
</form>
</body>
</html>
