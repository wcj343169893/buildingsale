<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="parddu" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<parddu:base />
	<title>查看员工信息</title>
	<link rel="stylesheet" href="style/common_tab.css" />
	<script type="text/javascript" src="script/emp.js"></script>
</head>

<body>
<form action="pages/struts/emp" method="post">
<input type="hidden" name="operate" value="toScanEmp"/>
<table width="98%" align="center" class="tab_tab" cellpadding="0" cellspacing="0">
	<tr>
		<td class="one_1"></td>
		<td class="one_2">
			<table border="0" cellpadding="0" cellspacing="0" width="100%" height="26">
				<tr>
					<td>
						<img src="images/user.gif" width="16" height="16" />
						员工信息
					</td>
					<td align="right" style="padding-top:5px;">
						员工状态<select style="font-size:10px;height:16px;" name="emp.empState.ddId">
								<option value="0">--所有--</option>
								<optgroup label=""></optgroup>
							  </select>&nbsp;&nbsp;&nbsp;
						员工姓名<input type="text" class="tab_txt" style="width:80px;" name="emp.empName" />
					</td>
					<td align="right" style="padding-top:5px;" width="140">
						<input type="submit" value="查询" class="tab_but" />
						<input type="button" value="新员工入职" class="tab_but" onclick="to('~empaction!toaddemp.action');"/>
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
					<th width="120">编号</th>
					<th>姓名</th>
					<th>所属售房部</th>
					<th>性别</th>
					<th>电话</th>
					<th width="100">email</th>
					<th width="60">状态</th>
					<th width="150">操作</th>
				</tr>
				<c:forEach items="${emps }" var="e">
					<tr class="tab_tr_out" onmouseover="this.className='tab_tr_over'" onmouseout="this.className='tab_tr_out'">
						<td align="center">${e.empNo }</td>
						<td align="center">${e.empName }</td>
						<td>${e.shopInfo.shopName }</td>
						<td align="center">
						<c:if test="${e.empSex==1}">
								男
						</c:if>
						<c:if test="${e.empSex==2}">
								女
						</c:if>
						</td>
						<td align="center">${e.empTell }</td>
						<td>${e.empEmail }</td>
						<td align="center">
							${e.dataDict.ddValue }
						</td>
						<td align="center">
							<a href="validate/~empaction!selByIdTolookemp.action?employee.empId=${e.empId }"><img src="images/tab/scan.png" />查看</a>&nbsp;&nbsp;
							<c:if test="${e.dataDict.ddId==13 }">
							<a href="validate/~empaction!selByidToedit.action?employee.empId=${e.empId }"><img src="images/tab/edit.gif" />编辑</a>&nbsp;&nbsp;
							<a href="validate/~empaction!selByIdquit.action?employee.empId=${e.empId }"><img src="images/tab/del.png" alt="离职" />离职</a>
							</c:if>
							<c:if test="${e.dataDict.ddId==14 }"></c:if>
						</td>
					</tr>
				</c:forEach>
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
			<a href="validate/~empaction!selAll.action?page=1" class="page_a">第一页</a>
			<c:choose>
				<c:when test="${allpage==1 }">上一页&nbsp;下一页</c:when>
				<c:when test="${(page-1)<1 }">上一页&nbsp;
						<a href="validate/~empaction!selAll.action?page=${page+1 }" class="page_a">下一页</a>
				</c:when>
				<c:when test="${(page+1)>allpage }">
				      <a href="validate/~empaction!selAll.action?page=${page-1 }" class="page_a">上一页</a>&nbsp;下一页
				</c:when>
				<c:otherwise>
						<a href="validate/~empaction!selAll.action?page=${page-1 }" class="page_a">上一页</a>
						<a href="validate/~empaction!selAll.action?page=${page+1 }" class="page_a">下一页</a>
				</c:otherwise>
			</c:choose>
			<a href="validate/~empaction!selAll.action?page=${allpage }" class="page_a">末尾页</a>
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
						    location.href="~empaction!selAll.action?page="+countnum+"&pagecount="+pagecou;
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
