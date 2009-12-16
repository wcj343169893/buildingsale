<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
<head>
	<title>scanloft</title>
	<link rel="stylesheet" href="style/common_tab.css" />
</head>

<body>
<form action="" method="post">
<table width="98%" align="center" class="tab_tab" cellpadding="0" cellspacing="0">
	<tr>
		<td class="one_1"></td>
		<td class="one_2">
			<table border="0" cellpadding="0" cellspacing="0" width="100%" height="26">
				<tr>
					<td>
						<img src="images/loft.png" width="16" height="16" />
						楼盘信息
					</td>
					<td align="right" style="padding-top:5px;">
						楼盘编号<input type="text" class="tab_txt" style="width:80px;" />&nbsp;&nbsp;&nbsp;&nbsp;
						楼盘名<input type="text" class="tab_txt" style="width:80px;" name="" />
					</td>
					<td align="right" style="padding-top:5px;" width="120">
						<input type="submit" value="查询" class="tab_but" />
						<input type="button" value="新楼盘" class="tab_but" onclick="location.href='${applicationScope.projectPath }pages/struts/loft.do?operate=toNewLoft'"/>
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
					<th>名称</th>
					<th>地区</th>
					<th>开盘时间</th>
					<th>交房时间</th>
					<th width="100">均价</th>
					<th width="180">操作</th>
				</tr>
					<tr class="tab_tr_out" onmouseover="this.className='tab_tr_over'" onmouseout="this.className='tab_tr_out'">
						<td align="center">&nbsp;<td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
						<td align="center">&nbsp;</td>
						<td align="center">&nbsp;</td>
						<td align="center">&nbsp;元</td>
						<td align="center">
							<a href="#"><img src="images/tab/scan.png" />查看</a>&nbsp;&nbsp;
							<a href="#"><img src="images/tab/edit.gif" />编辑</a>&nbsp;&nbsp;
							<a href="#"><img src="images/tab/del.png" />删除</a>
						</td>
					</tr>
			</table>
		</td>
		<td class="two_2"></td>
	</tr>
	<tr>
		<td class="three_1"></td>
		<td class="three_2" align="right" >
			
		</td>
		<td class="three_3"></td>
	</tr>
</table>
</form>
</body>
</html>
