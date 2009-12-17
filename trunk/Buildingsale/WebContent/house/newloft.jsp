<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新建楼盘</title>
<script type="text/javascript" language="javascript" src="../ixedit/js/jquery-plus-jquery-ui.js"></script>
<link rel="stylesheet" type="text/css" href="../ixedit/css/ui-sui.css" />
<script type="text/javascript">
	if(window.jQuery){jQuery(function(){
		(function(){ var target = jQuery('input.times'); target.datepicker({dateFormat:'yy-mm-dd',dayNamesMin:['日', '一', '二', '三', '四', '五', '六'],dayNamesShort:['星期日', '星期一', '星期二', '星期三', '星期四', '星期五', '星期六'],monthNames:['一月', '二月', '三月', '四月', '五月', '六月', '七月', '八月', '九月', '十月', '十一月', '十二月'],monthNamesShort:['一月', '二月', '三月', '四月', '五月', '六月', '七月', '八月', '九月', '十月', '十一月', '十二月'],showButtonPanel: true,currentText: '本月',closeText: '关闭'}); })();
	})};
</script>
<style type="text/css">
	#loft table{
		border-right: 1px solid #6BB3ED;
		border-bottom: 1px solid #00A8EC;
		width: 800px;
		border-collapse:collapse; 
		font-size: 14px;
	}
	#loft table td{
		border-left: 1px solid #00A8EC;
		border-top: 1px solid #00A8EC;
		padding: 0px;
	}
	#loft{
		background-color: #D3E7FC;
		width: 800px;
	}
	.titles{
		text-align: right;
	}
</style>
</head>
<body>
<div id="loft">
 <form action="addloft.action" method="post">
 <span style="float: left;">新楼盘</span>
 <span style="float: right;"><button id="back">返回</button></span>
<table>
	<tr>
		<td class="titles">编号:</td>
		<td><input type="text" class="class1" name="loftInfoForm.loftNo" /></td>
		<td class="titles">名称:</td>
		<td><input type="text" class="class2" name="loftInfoForm.loftName" /></td>
	</tr>
	<tr>
		<td class="titles">物业类型:</td>
		<td><select name="loftInfoForm.comptyTypeId">
		<c:forEach items="${requestScope.loftComtyType}" var="comty">
			<option value="${comty.ddId }">${comty.ddValue }</option>
		</c:forEach>
		</select></td>
		<td class="titles">建筑类型:</td>
		<td><select name="loftInfoForm.buildTypeId">
		<c:forEach items="${requestScope.loftBuildType}" var="build">
			<option value="${build.ddId }">${build.ddValue }</option>
		</c:forEach>
		</select></td>
	</tr>
	<tr>
		<td class="titles">动工时间:</td>
		<td><input type="text" readonly="readonly"  size="10" class="times" name="loftInfoForm.beginTime" /></td>
		<td class="titles">开盘时间:</td>
		<td><input type="text" readonly="readonly" size="10" class="times" name="loftInfoForm.shellOutTime" /></td>
	</tr>
	<tr>
		<td class="titles">交房时间:</td>
		<td><input type="text" readonly="readonly"  size="10" class="times" name="loftInfoForm.finishTime" /></td>
		<td class="titles">均价:</td>
		<td><input type="text" size="8" class="price" name="loftInfoForm.price"/>元平方米</td>
	</tr>
	<tr>
		<td class="titles">区域:</td>
		<td><input type="text" class="area" name="loftInfoForm.zone" /></td>
		<td class="titles">地址:</td>
		<td><input type="text" class="address" name="loftInfoForm.Address" /></td>
	</tr>
	<tr>
		<td class="titles">容积率:</td>
		<td><input type="text" class="area" name="loftInfoForm.capacity" />百分率，如65.45</td>
		<td class="titles">绿化率:</td>
		<td><input type="text" class="address" name="loftInfoForm.green" />百分率，如65.45</td>
	</tr>
	<tr>
		<td class="titles">交通路线:</td>
		<td colspan="3"><textarea cols="50" class="area" name="loftInfoForm.traffic"></textarea></td>
	</tr>
	<tr>
		<td class="titles">配套设施:</td>
		<td colspan="3"><textarea cols="50" class="area" name="loftInfoForm.facility"></textarea></td>
	</tr>
	<tr>
		<td class="titles">备注信息:</td>
		<td colspan="3"><textarea cols="50" class="area" name="loftInfoForm.remark"></textarea></td>
	</tr>
	<tr>
		<td colspan="4" style="text-align: center"><input type="submit"
			value="确认新建" /></td>
	</tr>
</table>
</form>
</div>
</body>
</html>