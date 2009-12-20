<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加单元信息</title>
<style type="text/css">
	#newloft table{
		border-right: 1px solid #6BB3ED;
		border-bottom: 1px solid #00A8EC;
		width: 800px;
		border-collapse:collapse; 
		font-size: 14px;
		background-color: white;
	}
	#newloft table td{
		border-left: 1px solid #00A8EC;
		border-top: 1px solid #00A8EC;
		padding: 0px;
	}
	#newloft{
		background-color: #D3E7FC;
	}.titles{
		text-align: right;
	}
</style>
<script type="text/javascript">
function $(elementId){return document.getElementById(elementId);}
	function showhouseinfo(){
		var housetypeStr=document.getElementById("htstr").value;
		var housetypelist=new Array();//把房间类型信息存放到这个数组中
		housetypelist=housetypeStr.split(",");
		//alert(housetypelist);
		var houseNumber=$("houseNumber").value;//获取到房屋数
		var houseTable=$("houseTable");
		clear();
		for(var i=0;i<houseNumber;i++){
			var row=document.createElement("tr"); 
			//房号
			var houseNo=document.createElement("td");
			var houseNoInput=document.createElement("<input name='uif.hif["+i+"].number'/>");
			houseNoInput.setAttribute("value",i+1);
			houseNoInput.setAttribute("size", "2");
			houseNoInput.readOnly=true;
			houseNo.appendChild(houseNoInput); 
			row.appendChild(houseNo); 
			//房屋类型
			var houseType=document.createElement("td");
			var houseTypeSelect=document.createElement("<select name='uif.hif["+i+"].houseTypeId'>");//申明<select></select>
			//select设置name
			
			for(var j=0;j<housetypelist.length-1 ;j++){//遍历房屋类型数组housetypelist
				var houseTypeOption=document.createElement("option");//新建<option></option>
				houseTypeOption.setAttribute("value", housetypelist[j].split("-")[0]);//设置option的value
				houseTypeOption.appendChild(document.createTextNode(housetypelist[j].split("-")[1]));//设置option的显示值
				houseTypeSelect.appendChild(houseTypeOption);//把option加入到select中
			}
			houseType.appendChild(houseTypeSelect); //把select加入到td中
			row.appendChild(houseType); //加入到tr中
			//建筑面积
			var houseBuildArea=document.createElement("td");
			var houseBuildAreaInput=document.createElement("<input name='uif.hif["+i+"].buildArea'/>");
			houseBuildArea.appendChild(houseBuildAreaInput); 
			row.appendChild(houseBuildArea); 
			//建筑价格
			var houseBuildPrice=document.createElement("td");
			var houseBuildPriceInput=document.createElement("<input type='text' name='uif.hif["+i+"].buildPrice'/>");
			houseBuildPrice.appendChild(houseBuildPriceInput); 
			row.appendChild(houseBuildPrice); 
			//套内面积
			var houseUseArea=document.createElement("td");
			var houseUseAreaInput=document.createElement("<input name='uif.hif["+i+"].useArea'/>");
			houseUseArea.appendChild(houseUseAreaInput); 
			row.appendChild(houseUseArea); 
			//套内价格
			var houseUsePrice=document.createElement("td");
			var houseUsePriceInput=document.createElement("<input name='uif.hif["+i+"].usePrice'/>");
			houseUsePrice.appendChild(houseUsePriceInput); 
			row.appendChild(houseUsePrice);
			document.getElementById("newbody").appendChild(row);
		}
		alert(document.getElementById("newbody").innerHTML);
	}
	function clear(){
		 var opanel = document.getElementById("newbody");
		 var pchildren = opanel.childNodes;
		 //清空表中的行和列
		 for(var a=pchildren.length; a>0; a--){
		  opanel.deleteRow(pchildren[a]); 
		 }
		 
		}
</script>
</head>
<body>
<input type="hidden" id="htstr" value="${housetypestr}" readonly="readonly">
<div id="newloft" style="width: 800px">
		<span style="float:left;">添加    ${requestScope.loftInfo.loftNo }-->楼盘单元信息</span><span style="float:right;"><button id="save">保存</button><button id="back">返回</button></span>
<form action="addunit.action" method="post">
<input type="hidden" value="${requestScope.loftInfo.loftId }" name="uif.loftId">
<input type="hidden" name="">
<table>
	<tbody>
	<tr>
		<td class="titles">楼盘编号:</td>
		<td>${requestScope.loftInfo.loftNo }</td>
		<td class="titles">楼盘名称:</td>
		<td>${requestScope.loftInfo.loftName }</td>
	</tr>
	<tr>
		<td class="titles">单元编号:</td>
		<td><input type="text" class="unitno" name="uif.unitNo"/></td>
		<td class="titles">单元名称:</td>
		<td><input type="text" class="unitname" name="uif.unitName"/></td>
	</tr>
	<tr>
		<td class="titles">房屋数量:</td>
		<td><input type="text" id="houseNumber" name="uif.houseNumber" size="2" onblur="showhouseinfo()"/>套/层</td>
		<td class="titles">楼层数:</td>
		<td><input type="text" id="floorNumber" name="uif.floorNumber" size="3"/>楼</td>
	</tr>
	<tr>
		<td class="titles">施工期号:</td>
		<td colspan="23"><input type="text" name="uif.term" size="3"/>期工程</td>
	</tr>
	</tbody>
</table>
	<br/>
<table style="text-align: center;" id="houseTable">
	<thead>
		<tr>
			<td>房号</td>
			<td>房屋类型</td>
			<td>建筑面积()</td>
			<td>建筑价格(元)</td>
			<td>套内面积()</td>
			<td>套内价格(元)</td>
		</tr>
	</thead>
	<tbody id="newbody">
	</tbody>
	<tfoot>
		<tr><td style="text-align: center;" colspan="6"><input type="submit" value="确认添加"/></td></tr>
	</tfoot>
</table>
</form>
</div>
</body>
</html>