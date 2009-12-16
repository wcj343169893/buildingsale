

//dwr得到员工的角色信息
function selRole(empid){
	roleMess.selRoleinfo(empid,checkMenu);
}

//根据查询出的信息，选中菜单总的匹配项
function checkMenu(data){
    //启用保存按钮
    $("#saverole").attr("disabled",false);
	//直接得到id为rmtd下的所有checkbox集合 
	var cbitem = $("#rmtd :input[@type='checkbox']");
	
	//清空隐藏域值
   	$("#hidemprole").val("");
   	
	//循环读取每个checkbox
	cbitem.each(function(){
	   //先设置每个checkbox为不选中
	   $(this).attr("checked",false);
	   //循环判断数据
	   for(var i=0;i<data.length;i++){
	     //如果相等，选中checkbox
	   	if(data[i].roleId == $(this).val()){
	   	   $(this).attr("checked",true);
		   $("#hidemprole").val($("#hidemprole").val()+","+data[i].roleId);	   	   
	   	}
	   }
	});
}

//复选框的单击事件
function checkRole(cherole){
    //如果复选框被选中，就给隐藏域加值,反之则掉值
	if(cherole.checked){
		 $("#hidemprole").val($("#hidemprole").val()+","+cherole.value);	 
	}else{
		$("#hidemprole").val($("#hidemprole").val().replace(","+cherole.value,""));
	}
}

///dwr修改员工角色信息
function upemprole(){
	//得到员工id
	var empall = document.getElementsByName('empname');
	var empid ="";
	for(var i=0;i<empall.length;i++){
		if(empall[i].checked){
		    empid = empall[i].value;
		    break;
		}
	}
	var hidR = $("#hidemprole").val();  //得到隐藏域的id集合
	//根据','截取字符串,存入h数组里
	var h = hidR.split(',');
	
	//删除员工的全部角色
	roleMess.deleteEmpRole(parseInt(empid),de);
	alert("修改员工角色权限成功!");
	//循环添加
	for(var i=1;i<h.length;i++){
		roleMess.addEmpRole(parseInt(h[i]),parseInt(empid),ad);
	}
}

//回掉函数
function de(data){}
function ad(data){}

