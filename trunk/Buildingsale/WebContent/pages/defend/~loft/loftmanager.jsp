<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="parddu" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
	<parddu:base />
	<title>楼盘管理--查看楼盘信息</title>
	<link rel="stylesheet" href="style/common_tab.css" />
	<SCRIPT type="text/javascript" src="script/loft.js"></SCRIPT>
</head>

<body onload="showError('${error }');">
<table width="98%" align="center" class="tab_tab" cellpadding="0" cellspacing="0">
	<tr>
		<td class="one_1"></td>
		<td class="one_2">
			<table border="0" cellpadding="0" cellspacing="0" width="100%" height="26">
				<tr>
					<td>
						<img src="images/tab/311.gif" width="16" height="16" />
						查看--><font color="red">${loftBean.loftNo }</font> 楼盘信息
					</td>
					<td align="right" style="padding-top:5px;">
						<input type="button" value="编辑" class="tab_but" onclick="doback('~loft!toUpLoft.action?loftinfto.loftId=${loftBean.loftId }')"/>
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
			<table width="100%" border="1" style="border-collapse:collapse;background-color:#ffffff;" bordercolor="#B6D9F6" cellpadding="6">
				<tr>
					<td align="right" width="100">编号：</td>	
					<td>
						${loftBean.loftNo }
					</td>
					<td align="right" width="100">名称：</td>	
					<td>
						${loftBean.loftName }
					</td>
				</tr>
				<tr>
					<td align="right" width="100">物业类型：</td>	
					<td>
						${loftBean.dataDictByLoftComtyType.ddValue }
					</td>
					<td align="right" width="100">建筑类型：</td>	
					<td>
						${loftBean.dataDictByLoftBuildType.ddValue }
					</td>
				</tr>
				<tr>
					<td align="right" width="100">动工时间：</td>	
					<td>
					<s:date name="#attr.loftBean.loftBeginTime" format="yyyy-MM-dd"/>
					</td>
					<td align="right" width="100">开盘时间：</td>	
					<td>
						<s:date name="#attr.loftBean.loftShellOutTime " format="yyyy-MM-dd"/>
					</td>
				</tr>
				<tr>
					<td align="right" width="100">交房时间：</td>	
					<td>
						 <s:date name="#attr.loftBean.loftFinishTime" format="yyyy-MM-dd"/>
					</td>
					<td align="right" width="100">均价：</td>	
					<td>
						${loftBean.loftPrice } 元/米<sup>2</sup>
					</td>
				</tr>
				<tr>
					<td align="right" width="100">区域：</td>	
					<td>
						${loftBean.loftZone }
					</td>
					<td align="right" width="100">地址：</td>	
					<td>
						${loftBean.loftAddress }
					</td>
				</tr>
				<tr>
					<td align="right" width="100">容积率：</td>	
					<td>
						${loftBean.loftCapacity }%
					</td>
					<td align="right" width="100">绿化率：</td>	
					<td>
						${loftBean.loftGreen }%
					</td>
				</tr>
				<tr>
					<td align="right" width="100">交通路线：</td>	
					<td colspan="3">
						${loftBean.loftTraffic }
					</td>
				</tr>
				<tr>
					<td align="right" width="100">配套设施：</td>	
					<td colspan="3">
						${loftBean.loftFacility }
					</td>
				</tr>
				<tr>
					<td align="right" width="100">备注信息：</td>	
					<td colspan="3">
						${loftBean.loftRemark }
					</td>
				</tr>
			</table>
			<div style="width:100%;margin:11px 2px 2px 2px;">
				<div style="font-weight:bold;float:left;width:150px;height:100%;padding-top:5px;">
					楼盘单元信息
				</div>
				<div style="float:right;width:250px;text-align:right;">
					<input type="button" class="tab_but" value="新单元" onclick="doback('~loft!toNewUnit.action?loftinfto.loftId=${loftBean.loftId }');" />
				</div>
			</div>
			<table width="100%" border="1" style="border-collapse:collapse;" cellpadding="4" bordercolor="#6BB3ED">
				<tr class="tab_top">
					<th width="120">编号</th>
					<th>名称</th>
					<th>楼层数</th>
					<th>房屋(套)/每层</th>
					<th width="100">工程期号</th>
					<th width="150">操作</th>
				</tr>
				 <c:forEach items="${loftBean.unitInfos }" var="u">
					<tr>
						<td align="center">${u.unitNo }</td>
						<td align="center">${u.unitName }</td>
						<td align="center">${u.unitFloorNum }</td>
						<td align="center">${u.unitHouseNum }</td>
						<td align="center">${u.unitTerm }</td>
						<td align="center">
							<a href="validate/~loft!selUnit.action?unitinfo.unitId=${u.unitId }"><img src="images/tab/scan.png" />查看</a>&nbsp;&nbsp;
							<a href="validate/~loft!toUpUnit.action?unitinfo.unitId=${u.unitId }"><img src="images/tab/edit.gif" />编辑</a>&nbsp;&nbsp;
							<a href="validate/~loft!deletUnit.action?unitinfo.unitId=${u.unitId }&unitinfo.loftInfo.loftId=${loftBean.loftId }"><img src="images/tab/del.png" />删除</a>
						</td>
					</tr>
				</c:forEach>
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
