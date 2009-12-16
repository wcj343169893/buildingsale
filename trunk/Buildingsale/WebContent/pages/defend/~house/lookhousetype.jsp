<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="parddu" %>
<html>
<head>
	<parddu:base />
	<title>查看房屋类型</title>
	<link rel="stylesheet" href="style/common_tab.css" />
	<script type="text/javascript" src="script/PardduDateTimePicker.js" ></script>
	<script type="text/javascript" src="script/loft.js" ></script> 
</head>

<body>
<table width="98%" align="center" class="tab_tab" cellpadding="0" cellspacing="0">
	<tr>
		<td class="one_1"></td>
		<td class="one_2">
			<table border="0" cellpadding="0" cellspacing="0" width="100%" height="26">
				<tr>
					<td>
						<img src="images/tab/311.gif" width="16" height="16" />
						查看房屋类型
					</td>
					<td align="right" style="padding-top:5px;">
						<input type="button" value="编辑" class="tab_but" onclick="doback('~house!toupHt.action');"/>
						<input type="button" value="返回" class="tab_but" onclick="doback('~house!selAll.action');"/>
					</td>
				</tr>
			</table>
		</td>
		<td class="one_3"></td>
	</tr>
	<tr>
		<td class="two_1"></td>
		<td>
			<table width="100%" border="1" style="border-collapse:collapse;background-color:#ffffff;" bordercolor="#B6D9F6" cellpadding="3">
				<tr>
					<td align="right">名称：</td>	
					<td colspan="3">
						${houseTypeBean.htName }
					</td>
				</tr>
				<tr>
					<td align="right" width="100">室：</td>	
					<td width="200">
						${houseTypeBean.htRoom }
					</td>
					<td align="right" width="100">厅：</td>	
					<td>
						${houseTypeBean.htHall }
					</td>
				</tr>
				<tr>
					<td align="right">厨：</td>	
					<td>
						${houseTypeBean.htCookRoom }
					</td>
					<td align="right">卫：</td>	
					<td>
						${houseTypeBean.htWc }
					</td>
				</tr>
				<tr>
					<td align="right">阳台：</td>	
					<td>
						${houseTypeBean.htTerrace }
					</td>
					<td align="right">花园：</td>	
					<td>
						${houseTypeBean.htGardenArea }
					</td>
				</tr>
				<tr>
					<td align="right">户型图：</td>	
					<td colspan="3">
						<img src="images/houseImg/${houseTypeBean.htImg }" height="80px" width="200px"/>
					</td>
				</tr>
			</table>
		</td>
		<td class="two_2"></td>
	</tr>
	<tr>
		<td class="three_1"></td>
		<td class="three_2" align="right">
		</td>
		<td class="three_3"></td>
	</tr>
</table>
</body>
</html>
