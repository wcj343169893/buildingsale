<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="parddu" %>
<html>
<head>
	<parddu:base />
	<title>编辑楼盘信息</title>
	<link rel="stylesheet" href="style/common_tab.css" />
	<script type="text/javascript" src="script/PardduDateTimePicker.js" ></script>
	<SCRIPT type="text/javascript" src="script/loft.js"></SCRIPT>
</head>

<body>
<form action="validate/~loft!upLoft.action" method="post" onsubmit="return doup();">
<input type="hidden" value="doModiLoft"/>
<table width="98%" align="center" class="tab_tab" cellpadding="0" cellspacing="0">
	<tr>
		<td class="one_1"></td>
		<td class="one_2">
			<table border="0" cellpadding="0" cellspacing="0" width="100%" height="26">
				<tr>
					<td>
						<img src="images/tab/311.gif" width="16" height="16" />
						编辑--><font color="red">${loftBean.loftNo }</font> 楼盘信息
					</td>
					<td align="right" style="padding-top:5px;">
						<input type="submit" value="保存" class="tab_but" />
						<input type="button" value="返回" class="tab_but" onclick="doback('~loft!selByToall.action');"/>
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
					<td align="right" width="100">编号：</td>	
					<td>
						<input type="hidden" name="loftinfto.loftId" id="loftId" value="${loftBean.loftId }" />
						<input type="text" name="loftinfto.loftNo" id="loftNo" readonly="readonly" value="${loftBean.loftNo }" style="width:120px;" />
					</td>
					<td align="right" width="100">名称：</td>	
					<td>
						<input type="text" name="loftinfto.loftName" id="loftName" readonly="readonly" value="${loftBean.loftName }" style="width:160px;" />
					</td>
				</tr>
				<tr>
					<td align="right" width="100">物业类型：</td>	
					<td>
					  <select name="loftinfto.dataDictByLoftComtyType.ddId" id="sddId">
					  	<option value="${loftBean.dataDictByLoftComtyType.ddId}">${loftBean.dataDictByLoftComtyType.ddValue}</option>
					  </select>
					</td>
					<td align="right" width="100">建筑类型：</td>	
					<td>
					 <select name="loftinfto.dataDictByLoftBuildType.ddId">
					  	<option value="${loftBean.dataDictByLoftBuildType.ddId}">${loftBean.dataDictByLoftBuildType.ddValue}</option>
					  </select>
					  
					</td>
				</tr>
				<tr>
					<td align="right" width="100">动工时间：</td>	
					<td>
						<input type="text" name="loftinfto.loftBeginTime" value="${loftBean.loftBeginTime }" style="width:80px;" readonly="readonly" Id="beginTime" onclick="PardduDateTimePicker('beginTime','yyyy-MM-dd')"/>
					</td>
					<td align="right" width="100">开盘时间：</td>	
					<td>
						<input type="text" name="loftinfto.loftShellOutTime" value="${loftBean.loftShellOutTime }" style="width:80px;" readonly="readonly" Id="sellTime" onclick="PardduDateTimePicker('sellTime','yyyy-MM-dd')"/>
					</td>
				</tr>
				<tr>
					<td align="right" width="100">交房时间：</td>	
					<td>
						<input type="text" name="loftinfto.loftFinishTime" value="${loftBean.loftFinishTime }" style="width:80px;" readonly="readonly" Id="finishTime" onclick="PardduDateTimePicker('finishTime','yyyy-MM-dd')"/>
					</td>
					<td align="right" width="100">均价：</td>	
					<td>
						<input type="text" name="loftinfto.loftPrice" value="${loftBean.loftPrice }" style="width:60px;" />元/米<sup>2</sup>
					</td>
				</tr>
				<tr>
					<td align="right" width="100">区域：</td>	
					<td>
						<input type="text" name="loftinfto.loftZone" value="${loftBean.loftZone }" id="loftZone" style="width:160px;" />
					</td>
					<td align="right" width="100">地址：</td>	
					<td>
						<input type="text" name="loftinfto.loftAddress" value="${loftBean.loftAddress }" id="loftAddress" style="width:250px;" />
					</td>
				</tr>
				<tr>
					<td align="right" width="100">容积率：</td>	
					<td>
						<input type="text" name="loftinfto.loftCapacity" value="${loftBean.loftCapacity }" id="loftCapacity" style="width:50px;" />
						百分率，如:65.45
					</td>
					<td align="right" width="100">绿化率：</td>	
					<td>
						<input type="text" name="loftinfto.loftGreen" value="${loftBean.loftGreen }" id="loftGreen" style="width:50px;" />
						百分率，如:65.45
					</td>
				</tr>
				<tr>
					<td align="right" width="100">交通路线：</td>	
					<td colspan="3">
					   <textarea rows="2" cols="" style="width:100%" name="loftinfto.loftTraffic">${loftBean.loftTraffic }</textarea>
					</td>
				</tr>
				<tr>
					<td align="right" width="100">配套设施：</td>	
					<td colspan="3">
					 <textarea rows="2" cols="" style="width:100%" name="loftinfto.loftFacility">${loftBean.loftFacility }</textarea>
					</td>
				</tr>
				<tr>
					<td align="right" width="100">备注信息：</td>	
					<td colspan="3">
					   <textarea rows="4" cols="" style="width:100%" name="loftinfto.loftRemark">${loftBean.loftRemark }</textarea>
					</td>
				</tr>
			</table>
			<div style="text-align:center;padding-top:5px;">
				<input type="submit" value="确认修改" class="tab_but"/>
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
