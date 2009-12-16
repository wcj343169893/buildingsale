<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="parddu" %>
<html>
<head>
	<parddu:base />
	<title>新建房屋类型</title>
	<link rel="stylesheet" href="style/common_tab.css" />
	<script type="text/javascript" src="script/PardduDateTimePicker.js" ></script>
	<script type="text/javascript" src="script/loft.js" ></script> 
</head>

<body onload="onMes('${error }');">
<form action="validate/~house!newHt.action"  onsubmit="return donewHt();" method="post" name="newform">
<input type="hidden" name="operate" value="doNewHouseType"/>
<table width="98%" align="center" class="tab_tab" cellpadding="0" cellspacing="0">
	<tr>
		<td class="one_1"></td>
		<td class="one_2">
			<table border="0" cellpadding="0" cellspacing="0" width="100%" height="26">
				<tr>
					<td>
						<img src="images/tab/311.gif" width="16" height="16" />
						新建房屋类型
					</td>
					<td align="right" style="padding-top:5px;">
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
						<input type="text" name="houseType.htName" id="htName" style="width:96%" />
					</td>
				</tr>
				<tr>
					<td align="right" width="100">室：</td>	
					<td>
						<input type="text" name="houseType.htRoom" id="htRoom" style="width:50px;" />
					</td>
					<td align="right" width="100">厅：</td>	
					<td>
						<input type="text" name="houseType.htHall" id="htHall" style="width:50px;" />
					</td>
				</tr>
				<tr>
					<td align="right" width="100">厨：</td>	
					<td>
						<input type="text" name="houseType.htCookRoom" id="htCookRoom" style="width:50px;" />
					</td>
					<td align="right" width="100">卫：</td>	
					<td>
						<input type="text" name="houseType.htWc" id="htWc" style="width:50px;" />
					</td>
				</tr>
				<tr>
					<td align="right" width="100">阳台：</td>	
					<td>
						<input type="text" name="houseType.htTerrace" id="htTerrace" style="50px;" />
					</td>
					<td align="right" width="100">花园：</td>	
					<td>
						<input type="text" name="houseType.htGardenArea" id="htGardenArea" style="50px;" />
					</td>
				</tr>
				<tr>
					<td align="right" width="100">户型图：</td>	
					<td colspan="3">
						<input type="hidden" name="houseType.htImg" id="htImg" value="" />
						<input type="file" name="filename" /> <br />
						<img src="images/houseImg/1.jpg" id="imgvalue" height="80px" width="200px" />
					</td>
				</tr>
			</table>
			<div style="text-align:center;padding-top:5px;">
				<input type="submit" value="确认新建" class="tab_but"/>
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
