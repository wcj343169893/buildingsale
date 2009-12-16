<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="parddu" %>
<html>
<head>
	<parddu:base />
	<title>编辑房屋类型</title>
	<link rel="stylesheet" href="style/common_tab.css" />
	<script type="text/javascript" src="script/PardduDateTimePicker.js" ></script>
	<script type="text/javascript" src="script/loft.js" ></script>
</head>

<body onload="onMes('${error }');">
<form action="validate/~house!upHt.action" method="post" name="upform" onsubmit="return donewHt();">
<input type="hidden" name="operate" value="doModiHouseType"/>
<table width="98%" align="center" class="tab_tab" cellpadding="0" cellspacing="0">
	<tr>
		<td class="one_1"></td>
		<td class="one_2">
			<table border="0" cellpadding="0" cellspacing="0" width="100%" height="26">
				<tr>
					<td>
						<img src="images/tab/311.gif" width="16" height="16" />
						编辑房屋类型
					</td>
					<td align="right" style="padding-top:5px;">
						<input type="submit" value="保存" class="tab_but" />
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
					<td align="right" width="100">名称：</td>	
					<td colspan="3">
						<input type="hidden" name="houseType.htId" id="htId" value="${houseTypeBean.htId }" />
						<input type="text" name="houseType.htName" id="htName" value="${houseTypeBean.htName }" style="width:96%" />
					</td>
				</tr>
				<tr>
					<td align="right" width="100">室：</td>	
					<td>
						<input type="text" name="houseType.htRoom" id="htRoom" value="${houseTypeBean.htRoom }" style="width:50px;" />
					</td>
					<td align="right" width="100">厅：</td>	
					<td>
						<input type="text" name="houseType.htHall" id="htHall" value="${houseTypeBean.htHall }" style="width:50px;" />
					</td>
				</tr>
				<tr>
					<td align="right" width="100">厨：</td>	
					<td>
						<input type="text" name="houseType.htCookRoom" id="htCookRoom" value="${houseTypeBean.htCookRoom }" style="width:50px;" />
					</td>
					<td align="right" width="100">卫：</td>	
					<td>
						<input type="text" name="houseType.htWc" id="htWc" value="${houseTypeBean.htWc }" style="width:50px;" />
					</td>
				</tr>
				<tr>
					<td align="right" width="100">阳台：</td>	
					<td>
						<input type="text" name="houseType.htTerrace" id="htTerrace" value="${houseTypeBean.htTerrace }" style="50px;" />
					</td>
					<td align="right" width="100">花园：</td>	
					<td>
						<input type="text" name="houseType.htGardenArea" id="htGardenArea" value="${houseTypeBean.htGardenArea }" style="50px;" />
					</td>
				</tr>
				<tr>
					<td align="right" width="100">户型图：</td>	
					<td colspan="3">
						<input type="hidden" name="houseType.htImg" id="htImg" value="${houseTypeBean.htImg }" />
						<img src="images/houseImg/1.jpg" height="80px" width="200px" />
					</td>
				</tr>
			</table>
			<div style="text-align:center;padding-top:5px;">
				<input type="submit" value="确认编辑" class="tab_but"/>
			</div>
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
</form>
</body>
</html>
