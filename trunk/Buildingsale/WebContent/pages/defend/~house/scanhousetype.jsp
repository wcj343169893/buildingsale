<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="parddu" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<parddu:base />
	<title>房屋类型信息</title>
	<link rel="stylesheet" href="style/common_tab.css" />
	<script type="text/javascript" src="script/loft.js" ></script> 
	
</head>

<body onload="onMes('${message }');">
<form action="/pages/struts/house" method="post">
<input type="hidden" name="operate" value="toScanHouseType" />
<table width="98%" align="center" class="tab_tab" cellpadding="0" cellspacing="0">
	<tr>
		<td class="one_1"></td>
		<td class="one_2">
			<table border="0" cellpadding="0" cellspacing="0" width="100%" height="26">
				<tr>
					<td>
						<img src="images/tab/311.gif" width="16" height="16" />
						房屋类型信息
					</td>
					<td align="right" style="padding-top:5px;">
						<input type="button" value="新建" class="tab_but" onclick="doback('~house!tonewHt.action');"/>
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
					<th>名称</th>
					<th>室</th>
					<th>厅</th>
					<th>厨</th>
					<th>卫</th>
					<th>阳台</th>
					<th>户型图</th>
					<th width="150">操作</th>
				</tr>
				<c:forEach items="${houses}" var="ht">
					<tr class="tab_tr_out" onmouseover="this.className='tab_tr_over'" onmouseout="this.className='tab_tr_out'">
						<td>${ht.htName }</td>
						<td>${ht.htRoom }</td>
						<td>${ht.htHall }</td>
						<td>${ht.htCookRoom }</td>
						<td>${ht.htWc }</td>
						<td>${ht.htTerrace }</td>
						<td>
						 <c:choose>
						 	<c:when test="${empty ht.htImg}">
						 		无
						 	</c:when>
						 	<c:otherwise>
						 		有
						 	</c:otherwise>
						 </c:choose>
						</td>
						<td align="center">
							<a href="validate/~house!selByidToLook.action?houseType.htId=${ht.htId }"><img src="images/tab/scan.png" />查看</a>&nbsp;&nbsp;
							<a href="validate/~house!toupHt.action?houseType.htId=${ht.htId }"><img src="images/tab/edit.gif" />编辑</a>&nbsp;&nbsp;
							<a href="validate/~house!delHt.action?houseType.htId=${ht.htId }"><img src="images/tab/del.png" />删除</a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</td>
		<td class="two_2"></td>
	</tr>
	<tr>
		<td class="three_1"></td>
		<td class="three_2" align="right">
			<font style="font-size:12px;color=#006699;">
			共 ${count } 条记录&nbsp;
			每页<input type="text" class="page_tag_txt" name="page.pageNumber" id="pageNumber" size="3" value="${pagecount }" />条&nbsp;
			当前<input type="text" class="page_tag_txt" readonly="readonly" name="page.pageIndex" id="pageIndex" size="3" value="${page }" />页/
			共 ${allpage }页
			<a href="validate/~house!selAll.action?page=1" class="page_a">第一页</a>
			<c:choose>
				<c:when test="${allpage==1 }">上一页&nbsp;下一页</c:when>
				<c:when test="${(page-1)<1 }">上一页&nbsp;
						<a href="validate/~house!selAll.action?page=${page+1 }" class="page_a">下一页</a>
				</c:when>
				<c:when test="${(page+1)>allpage }">
				      <a href="validate/~house!selAll.action?page=${page-1 }" class="page_a">上一页</a>&nbsp;下一页
				</c:when>
				<c:otherwise>
						<a href="validate/~house!selAll.action?page=${page-1 }" class="page_a">上一页</a>
						<a href="validate/~house!selAll.action?page=${page+1 }" class="page_a">下一页</a>
				</c:otherwise>
			</c:choose>
			<a href="validate/~house!selAll.action?page=${allpage }" class="page_a">末尾页</a>
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
						}else if(pagecou>${count}){
							alert("你输入的每页显示的条数过大!");
						}else if(countnum<=0||pagecou<=0){
							alert("不能输入小于1的页数!");
						}else{
						    location.href="~house!selAll.action?page="+countnum+"&pagecount="+pagecou;
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
