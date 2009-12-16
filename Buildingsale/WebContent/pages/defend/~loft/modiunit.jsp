<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="parddu" %>
<html>
<head>
	<parddu:base />
	<title>修改楼盘单元信息</title>
	<link rel="stylesheet" href="style/common_tab.css" />
	<SCRIPT type="text/javascript" src="script/loft.js"></SCRIPT>
</head>

<body>
<form action="validate/~loft!upUnit.action" method="post" onsubmit="return checkupunit();">
<input type="hidden" name="operate" value="doModiUnit"/>
<table width="98%" align="center" class="tab_tab" cellpadding="0" cellspacing="0">
	<tr>
		<td class="one_1"></td>
		<td class="one_2">
			<table border="0" cellpadding="0" cellspacing="0" width="100%" height="26">
				<tr>
					<td>
						<img src="images/tab/311.gif" width="16" height="16" />
						修改 <font color="red">${unitForm.loftInfo.loftNo }-->${unitForm.unitName }</font> 信息
					</td>
					<td align="right" style="padding-top:5px;">
						<input type="submit" value="保存" class="tab_but" />
						<input type="button" value="返回" class="tab_but" onclick="doback('~loft!toloftmanager.action?loftinfto.loftId=${unitForm.loftInfo.loftId}');"/>
					</td>
				</tr>
			</table>
		</td>
		<td class="one_3"></td>
	</tr>
	<tr>
		<td class="two_1"></td>
		<td>
			<table width="100%" border="1" style="border-collapse:collapse;background-color:#ffffff;" bordercolor="#B6D9F6" cellpadding="6">
				<tr>
					<td align="right" width="100">楼盘编号：</td>	
					<td>
						<input type="hidden" name="unitinfo.loftInfo.loftId" value="${unitForm.loftInfo.loftId }" />
						${unitForm.loftInfo.loftNo }
					</td>
					<td align="right" width="100">楼盘名称：</td>	
					<td>
						${unitForm.loftInfo.loftName }
					</td>
				</tr>
				<tr>
					<td align="right" width="100">单元编号：</td>	
					<td>
						<input type="hidden" name="unitinfo.unitId" value="${unitForm.unitId }" />
						<input type="text" name="unitinfo.unitNo" value="${unitForm.unitNo }" id="unitNo" />
					</td>
					<td align="right" width="100">单元名称：</td>	
					<td>
						<input type="text" name="unitinfo.unitName" value="${unitForm.unitName }" id="unitName" />
					</td>
				</tr>
				<tr>
					<td align="right" width="100">房屋数量：</td>	
					<td>
						<input type="text" name="unitinfo.unitHouseNum" value="${unitForm.unitHouseNum }" id="unitHouseNum" />
					</td>
					<td align="right" width="100">楼层数：</td>	
					<td>
						<input type="text" name="unitinfo.unitFloorNum" value="${unitForm.unitFloorNum }" id="unitFloorNum" />
					</td>
				</tr>
				<tr>
					<td align="right" width="100">施工期号：</td>	
					<td>
						<input type="text" name="unitinfo.unitTerm" value="${unitForm.unitTerm }" />
					</td>
				</tr>
			</table>
		</td>
		<td class="two_2"></td>
	</tr>
	<tr>
		<td class="three_1"></td>
		<td class="three_2" align="center">
			<input type="submit" value="确认修改" class="tab_but" />
		</td>
		<td class="three_3"></td>
	</tr>
</table>
</form>
</body>
</html>
