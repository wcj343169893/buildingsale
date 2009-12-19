<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
<script type="js/jquery-1.3.2.js"></script>
<script type="js/jquery-ui-1.7.2.custom.min.js"></script>
<link rel="stylesheet" href="../style/style.css" />
<link rel="stylesheet" href="css/ui-sui.css" />
</head>
<body>
<form action="Employee-update.action" method="post">
<table width="98%" align="center" class="tab_tab" cellpadding="0" cellspacing="0">
	<tr>
		<td class="one_1"></td>
		<td class="one_2">
			<table border="0" cellpadding="0" cellspacing="0" width="100%" height="26">
				<tr>
					<td>
						<img src="../images/tab/311.gif" width="16" height="16" />
						新员工入职
					</td>
					<td align="right" style="padding-top:5px;">
						<input type="submit" value="保存" class="tab_but" />
						<input type="button" value="返回" class="tab_but" onclick="history.back();"/>
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
					  		<td><input type="text" name="empNo" value="${empNo }" id="empNo" style="width:100px;" onblur="docheckempno();" />&nbsp;</td>
					  		<td><input type="button" class="tab_but" value="检查是否可用" onclick=""/>&nbsp;&nbsp;</td>
					  		<td width="18">  <img src="../images\tab\exclamation.png" alt="该编号不可用" id="del" style="display: none;"/>
					  		<img src="../images\tab\accept.png" alt="该编号可用" id="ye" style="display: none;"/></td>
					  	</tr>
					  </table>
					</td>
					<td align="right" width="100">所属售房部：</td>	
					<td>
						<select name="shopInfo.shopId" id="shopId" >
						 <option value="1">请选择</option>
						</select>
					</td>
				</tr>
				<tr>
					<td align="right" width="100">姓名：</td>	
					<td>
						<input type="text" name="empName" value="${empName }" id="empName" style="width:80px;" />
					</td>
					<td align="right" width="100">性别：</td>	
					<td>
						<input type="radio" name="empSex" value="1" <c:if test='${empSex==1}'>checked="checked"</c:if> />男 &nbsp;&nbsp;&nbsp;
						<input type="radio" name="empSex" value="0" <c:if test='${empSex==0}'>checked="checked"</c:if>/>女
					</td>
				</tr>
				<tr>
					<td align="right" width="100">登陆帐号：</td>	
					<td>
						<input type="text" name="empAccount" value="${empAccount }" id="empAccount" style="width:80px;" />
					</td>
					<td align="right" width="100">登陆密码：</td>	
					<td>
						<input type="text" name="empPass"  id="empPass" style="width:80px;" value="8888" readonly="readonly" />
					</td>
				</tr>
				<tr>
					<td align="right" width="100">身份证：</td>	
					<td>
						<input type="text" name="empPid" value="${empPid}" id="empPid" style="width:140px;" />
					</td>
					<td align="right" width="100">生日：</td>	
					<td>
						<input type="text" name="empBirthday" value="<fmt:formatDate value='${empBirthday}' pattern="yyyy-MM-dd"/>" id="ebo" style="width:90px;" />
					</td>
				</tr>
				<tr>
					<td align="right" width="100">联系电话：</td>	
					<td>
						<input type="text" name="empTell" value="${empTell }" style="width:90px;" />
					</td>
					<td align="right" width="100">emial：</td>	
					<td>
						<input type="text" name="empEmail" value="${empEmail }" style="width:160px;" />
					</td>
				</tr>
				<tr>
					<td align="right" width="100">家庭住址：</td>	
					<td colspan="3">
						<input type="text" name="empAddress" value="${empAddress }" style="width:96%;" />
					</td>
				</tr>
				<tr>
					<td align="right" width="100">备注信息：</td>	
					<td colspan="3">
					   <textarea rows="4" name="empRemark" cols=""style="width:100%">${empRemark }</textarea>
					</td>
				</tr>
			</table>
			<input type="hidden" name="empState.ddId" value="13"/>
			<div style="text-align:center;padding-top:5px;">
				<input type="submit" value="确认提交" class="tab_but"/>
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
<script>
if(window.jQuery){jQuery(function(){
		(function(){ jQuery('#ebo').bind('click', function(event, ui){var target = jQuery('#ebo'); target.datepicker({dateFormat:'mm/dd/yy',dayNamesMin:['日', '一', '二', '三', '四', '五', '六'],dayNamesShort:['星期日', '星期一', '星期二', '星期三', '星期四', '星期五', '星期六'],monthNames:['一月', '二月', '三月', '四月', '五月', '六月', '七月', '八月', '九月', '十月', '十一月', '十二月'],monthNamesShort:['一月', '二月', '三月', '四月', '五月', '六月', '七月', '八月', '九月', '十月', '十一月', '十二月'],showButtonPanel: true,currentText: '本月',closeText: '关闭'})});})();
	})};
</script>
</body>
</html>