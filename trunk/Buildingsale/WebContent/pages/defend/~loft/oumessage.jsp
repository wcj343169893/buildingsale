<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="parddu" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
	<parddu:base />
	<title>楼盘信息</title>
	<link rel="stylesheet" href="style/common_tab.css" />
	<SCRIPT type="text/javascript" src="script/loft.js"></SCRIPT>
</head>

<body>
 <form action="validate/~loft!outByMess.action" name="selby" method="post" onsubmit="return doselby();">
<input type="hidden" name="operate" value="toScanLoft"/>
<table width="98%" align="center" class="tab_tab" cellpadding="0" cellspacing="0">
	<tr>
		<td class="one_1"></td>
		<td class="one_2">
		  
			<table border="0" cellpadding="0" cellspacing="0" width="100%" height="26">
				<tr>
					<td>
						<img src="images/loft.png" width="16" height="16" />
						楼盘信息&nbsp;&nbsp;&nbsp;
						
					</td>
					<td align="right" style="padding-top:5px;">
						楼盘编号<input type="text" class="tab_txt" style="width:80px;" id="loftNo" name="loftinfto.loftNo" />&nbsp;&nbsp;&nbsp;&nbsp;
						楼盘名<input type="text" class="tab_txt" style="width:80px;" id="loftName" name="loftinfto.loftName" />&nbsp;&nbsp;&nbsp;&nbsp;
						<input type="submit" value="查询" class="tab_but" />
						<input type="button" value="返回" class="tab_but" onclick="doback('~loft!outmess.action');" />&nbsp;&nbsp;
					</td>
					<td align="right" style="padding-top:5px;" width="80">
						<input type="button" onclick="javascript:AllAreaExcel();" class="tab_but" value="导出页面指定区域内容到Excel">					
					</td>
				</tr>
			</table>
			
		</td>
		<td class="one_3"></td>
	</tr>
	<tr>
		<td class="two_1"></td>
		<td>
			<table width="100%" border="1" style="border-collapse:collapse;" cellpadding="4" id="PrintA" bordercolor="#6BB3ED">
				<tr class="tab_top">
					<th width="120">编号</th>
					<th>名称</th>
					<th>地区</th>
					<th>开盘时间</th>
					<th>交房时间</th>
					<th width="100">均价</th>
				</tr>
				<c:forEach items="${lofts}" var="l">
					<tr class="tab_tr_out" onmouseover="this.className='tab_tr_over'" onmouseout="this.className='tab_tr_out'">
						<td align="center">${l.loftNo }</td>
						<td>${l.loftName }</td>
						<td>${l.loftZone }</td>
						<td align="center"><s:date name="#attr.l.loftBeginTime" format="yyyy-MM-dd"/></td>
						<td align="center"><s:date name="#attr.l.loftFinishTime" format="yyyy-MM-dd"/></td>
						<td align="center">${l.loftPrice }元</td>
					</tr>
				</c:forEach>
			</table>
		</td>
	</tr>
	<tr>
		<td class="three_1"></td>
		<td class="three_2" align="right" >
			<font style="font-size:12px;color=#006699;">
			共 ${count } 条记录&nbsp;
			每页<input type="text" class="page_tag_txt" name="page.pageNumber" id="pageNumber" size="3" value="${pagecount }" />条&nbsp;
			当前<input type="text" class="page_tag_txt" readonly="readonly" name="page.pageIndex" id="pageIndex" size="3" value="${page }" />页/
			共 ${allpage }页
			<a href="validate/~loft!outmess.action?page=1" class="page_a">第一页</a>
			<c:choose>
				<c:when test="${allpage==1 }">上一页&nbsp;下一页</c:when>
				<c:when test="${(page-1)<1 }">上一页&nbsp;
						<a href="validate/~loft!outmess.action?page=${page+1 }" class="page_a">下一页</a>
				</c:when>
				<c:when test="${(page+1)>allpage }">
				      <a href="validate/~loft!outmess.action?page=${page-1 }" class="page_a">上一页</a>&nbsp;下一页
				</c:when>
				<c:otherwise>
						<a href="validate/~loft!outmess.action?page=${page-1 }" class="page_a">上一页</a>
						<a href="validate/~loft!outmess.action?page=${page+1 }" class="page_a">下一页</a>
				</c:otherwise>
			</c:choose>
			<a href="validate/~loft!outmess.action?page=${allpage }" class="page_a">末尾页</a>
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
						    location.href="~loft!outmess.action?page="+countnum+"&pagecount="+pagecou;
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
