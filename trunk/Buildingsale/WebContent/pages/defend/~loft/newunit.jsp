<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="parddu" %>
<html>
<head>
	<parddu:base />
	<title>添加楼盘单元信息</title>
	<link rel="stylesheet" href="style/common_tab.css" />
	<script type='text/javascript' src='dwr/interface/selHt.js'></script>
	<script type='text/javascript' src='dwr/engine.js'></script>
	<script type='text/javascript' src='dwr/util.js'></script>
	<script type="text/javascript" src="script/loft.js" ></script>
    <script type="text/javascript" src="script/jquery-1.3.2-vsdoc2.js"></script></head>
<body>
<form action="validate/~loft!newUnit.action" method="post" onsubmit="return addUnitHouset();" >
<input type="hidden" name="operate" value="doNewUnit"/>
<table width="98%" align="center" class="tab_tab" cellpadding="0" cellspacing="0">
	<tr>
		<td class="one_1"></td>
		<td class="one_2">
			<table border="0" cellpadding="0" cellspacing="0" width="100%" height="26">
				<tr>
					<td>
						<img src="images/tab/311.gif" width="16" height="16" />
						添加 <font color="red">${loftBean.loftNo }</font> 楼盘单元信息
					</td>
					<td align="right" style="padding-top:5px;">
						<input type="submit" value="保存" class="tab_but" />
						<input type="button" value="返回" class="tab_but" onclick="doback('~loft!toloftmanager.action?loftinfto.loftId=${loftBean.loftId }');"/>
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
						<input type="hidden" name="unitinfo.loftInfo.loftId" value="${loftBean.loftId }" />
						${loftBean.loftNo }
					</td>
					<td align="right" width="100">楼盘名称：</td>	
					<td>
						${loftBean.loftName }
					</td>
				</tr>
				<tr>
					<td align="right" width="100">单元编号：</td>	
					<td>
						<input type="text" name="unitinfo.unitNo" id="unitNo" style="width:120px;"/>
					</td>
					<td align="right" width="100">单元名称：</td>	
					<td>
						<input type="text" name="unitinfo.unitName" id="unitName" style="width:120px;"/>
					</td>
				</tr>
				<tr>
					<td align="right" width="100">房屋数量：</td>	
					<td>
						<input type="text" name="unitinfo.unitHouseNum" id="unitHouseNum" onblur="createHouse(this);" style="width:30px;"/> 套/层
					</td>
					<td align="right" width="100">楼层数：</td>	
					<td>
						<input type="text" name="unitinfo.unitFloorNum" id="unitFloorNum" style="width:30px;"/> 楼
					</td>
				</tr>
				<tr>
					<td align="right" width="100">施工期号：</td>	
					<td colspan="3">
						<input type="text" name="unitinfo.unitTerm" style="width:30px;"/> 期工程
					</td>
				</tr>
			</table>
			<table id="unit_fouse_tab" width="100%" border="1" style="border-collapse:collapse;" cellpadding="4" bordercolor="#6BB3ED">
				<tr class="tab_top">
					<th>房号</th>
					<th width="120">房屋类型</th>
					<th>建筑面积(M<sup>2</sup>)</th>
					<th>建面价格(元)</th>
					<th>套内面积(M<sup>2</sup>)</th>
					<th>套内价格(元)</th>
				</tr>
			</table>
		</td>
		<td class="two_2"></td>
	</tr>
	<tr>
		<td class="three_1"></td>
		<td class="three_2" align="center">
			<input type="submit" value="确认添加" class="tab_but" />
		</td>
		<td class="three_3"></td>
	</tr>
</table>
</form>
</body>
</html>
