<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="parddu" %>
<html>
<head>
	<parddu:base />
	<title>新建楼盘信息</title>
	<link rel="stylesheet" href="style/common_tab.css" />
	<script type="text/javascript" src="script/PardduDateTimePicker.js" ></script>
	<script type="text/javascript" src="dwr/interface/loftcheckno.js" ></script>
	<script type="text/javascript" src="dwr/engine.js"></script>
	<script type="text/javascript" src="dwr/util.js"></script>
	<SCRIPT type="text/javascript" src="script/loft.js"></SCRIPT>
</head>

<body>
<form action="validate/~loft!newloft.action" method="post" onsubmit="return doadd();">
<input type="hidden" name="operate" value="doNewLoft"/>
<table width="98%" align="center" class="tab_tab" cellpadding="0" cellspacing="0">
	<tr>
		<td class="one_1"></td>
		<td class="one_2">
			<table border="0" cellpadding="0" cellspacing="0" width="100%" height="26">
				<tr>
					<td>
						<img src="images/tab/311.gif" width="16" height="16" />
						新楼盘
					</td>
					<td align="right" style="padding-top:5px;">
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
					<table border="0" cellpadding="0" cellspacing="0">
					  	<tr>
					  		<td><input type="text" name="loftinfto.loftNo" id="loftNo" style="width:120px;" onblur="checkLoft('lono');" />&nbsp;</td>
					  		<td><input type="button" class="tab_but" value="检查是否可用" onclick="checkLoft('lono');"/>&nbsp;&nbsp;</td>
					  		<td width="18">  <img src="images\tab\exclamation.png" alt="该编号不可用" id="delno" style="display: none;"/>
					  		<img src="images\tab\accept.png" alt="该编号可用" id="yeno" style="display: none;"/></td>
					  	</tr>
					  </table>
					</td>
					<td align="right" width="100">名称：</td>	
					<td>
					<table border="0" cellpadding="0" cellspacing="0">
					  	<tr>
					  		<td><input type="text" name="loftinfto.loftName" id="loftName" style="width:120px;" onblur="checkLoft('loname');" />&nbsp;</td>
					  		<td><input type="button" class="tab_but" value="检查是否可用" onclick="checkLoft('loname');"/>&nbsp;&nbsp;</td>
					  		<td width="18"><img src="images\tab\exclamation.png" alt="该名称不可用" id="delna" style="display: none;"/>
					  		<img src="images\tab\accept.png" alt="该名称可用" id="yena" style="display: none;"/></td>
					  	</tr>
					  </table>
						
					</td>
				</tr>
				<tr>
					<td align="right" width="100">物业类型：</td>	
					<td>
					   <select name="loftinfto.dataDictByLoftComtyType.ddId" id="dataDictByLoftComtyType">
					   	<option value="3">普通住房</option>
					   </select>
					</td>
					<td align="right" width="100">建筑类型：</td>	
					<td>
						<select name="loftinfto.dataDictByLoftBuildType.ddId" id="dataDictByLoftBuildType">
					   	<option value="4">高层</option>
					   </select>
					</td>
				</tr>
				<tr>
					<td align="right" width="100">动工时间：</td>	
					<td>
						<input type="text" name="loftinfto.loftBeginTime" style="width:80px;" readonly="readonly" Id="beginTime" onclick="PardduDateTimePicker('beginTime','yyyy-MM-dd')"/>
					</td>
					<td align="right" width="100">开盘时间：</td>	
					<td>
						<input type="text" name="loftinfto.loftShellOutTime" style="width:80px;" readonly="readonly" Id="sellTime" onclick="PardduDateTimePicker('sellTime','yyyy-MM-dd')"/>
					</td>
				</tr>
				<tr>
					<td align="right" width="100">交房时间：</td>	
					<td>
						<input type="text" name="loftinfto.loftFinishTime" style="width:80px;" readonly="readonly" Id="finishTime" onclick="PardduDateTimePicker('finishTime','yyyy-MM-dd')"/>
					</td>
					<td align="right" width="100">均价：</td>	
					<td>
						<input type="text" name="loftinfto.loftPrice" id="loftPrice" style="width:60px;" />元/米<sup>2</sup>
					</td>
				</tr>
				<tr>
					<td align="right" width="100">区域：</td>	
					<td>
						<input type="text" name="loftinfto.loftZone" id="loftZone" style="width:160px;" />
					</td>
					<td align="right" width="100">地址：</td>	
					<td>
						<input type="text" name="loftinfto.loftAddress" id="loftAddress" style="width:250px;" />
					</td>
				</tr>
				<tr>
					<td align="right" width="100">容积率：</td>	
					<td>
						<input type="text" name="loftinfto.loftCapacity" id="loftCapacity" style="width:50px;" />
						百分率，如:65.45
					</td>
					<td align="right" width="100">绿化率：</td>	
					<td>
						<input type="text" name="loftinfto.loftGreen" id="loftGreen" style="width:50px;" />
						百分率，如:65.45
					</td>
				</tr>
				<tr>
					<td align="right" width="100">交通路线：</td>	
					<td colspan="3">
					 <textarea rows="2" cols="" name="loftinfto.loftTraffic" id="loftTraffic" style="width:100%"></textarea>
					</td>
				</tr>
				<tr>
					<td align="right" width="100">配套设施：</td>	
					<td colspan="3">
					    <textarea rows="2" cols="" name="loftinfto.loftFacility" id="loftFacility" style="width:100%"></textarea>
					</td>
				</tr>
				<tr>
					<td align="right" width="100">备注信息：</td>	
					<td colspan="3">
					    <textarea rows="2" cols="" name="loftinfto.loftRemark" id="loftRemark" style="width:100%"></textarea>
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
