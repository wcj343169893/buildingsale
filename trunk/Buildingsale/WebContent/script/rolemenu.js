//dwr实现角色菜单选择
function doselmenu(roleid){
  //dwr访问业务层
  roleMess.selMenuByRid(roleid,doseldata);
   //异步刷新权限菜单页面
  //$.get("vallogin/~comaction!doselEmp.action",function(htm){
  //  parent.frames.item("menu").document.open();
  	//parent.frames.item("menu").document.write(htm);
  	//parent.frames.item("menu").document.close();
//});
}

//选择数据[data为返回回来的数据(权限数组)]
function doseldata(data){
	//启用保存按钮
	$("#savemenu").attr("disabled",false);

	//清空隐藏域值
   	$("#hidRole").val("");
	
   //得到所有ID为chkTd 下的所有input标签(全部为checkbox)
   var chkItems = jQuery("#chkTd :input");
   //直接得到ID为chkTd下的全部Checkbox
   //var chkItems = $("#chkTd :input[@type='checkbox']");
   //循环读取每一个checkbox(each相当于foreach循环)
   chkItems.each(function(){   		
   		//先设置每一个checkbox为不选中
   		$(this).attr("checked",false);     
   		//循环读取数据
   		for(var i=0;i<data.length;i++){
   			//判断是否有此权限，如果是则选中
   			if(data[i].menuId == $(this).val()){
   				$(this).attr("checked",true);
   				//选中的权限值放入隐藏域中
   				$("#hidRole").val($("#hidRole").val()+","+data[i].menuId);
   			}
   		}   		
   });
}

//绑定checkbox单击事件
function changeCheck(obj,bool,parentId){	
	//如果被选中,隐藏域添加值
	if(obj.checked){
		$("#hidRole").val($("#hidRole").val()+","+obj.value);		
	}//否则去掉值
	else{
		$("#hidRole").val($("#hidRole").val().replace(","+obj.value,""));
	}
	//判断是否是根节点
	if(bool){
		//判断根节点是否被选中
		if(obj.checked){
			//得到对应DIV的checkbox
			$("#div_"+obj.value+" :input[@type='checkbox']").each(function(){
				//判断Checkbox是否被选中
				if($(this).attr("checked") == false){
					//如果不为选中则选中
					$(this).attr("checked",true);
					//添加隐藏域值
					$("#hidRole").val($("#hidRole").val()+","+$(this).val());
				}
			});
		}else{
			//得到对应DIV的checkbox
			$("#div_"+obj.value+" :input[@type='checkbox']").each(function(){
				//判断Checkbox是否被选中
				if($(this).attr("checked") == true){
					//如果为选中则不选中
					$(this).attr("checked",false);
					//去掉隐藏域值
					$("#hidRole").val($("#hidRole").val().replace(","+$(this).val(),""));
				}
			});
		}
	}//如果不是根节点
	else{
		if(parentId!=0){
			//得到ID为chkTd下的所有checkbox
			$("#chkTd :input[@type='checkbox']").each(function(){
				//找到此子节点的根节点checkbox
				if($(this).val() == parentId){
					//如果当前节点被选中
					if(obj.checked){
						//如果根节点未选中
						if($(this).attr("checked") == false){
							//选中根节点
							$(this).attr("checked",true);
							//添加根节点值到隐藏域值
							$("#hidRole").val($("#hidRole").val()+","+$(this).val());
						}
					}//如果当前节点未被选中
					else{
						//得到对应DIV的checkbox
						var flage = true;
						var itemsChk = $("#div_"+$(this).val()+" :input[@type='checkbox']");
						for(var j=0;j<itemsChk.length;j++){
							//如果选中一个,就不管根节点
							if(itemsChk[j].checked){
								flage = false;
								break;
							}
						}
						//如果一个都没被选中
						if(flage){
							//判断根节点是否被选中
							//如果根节点被选中
							if($(this).attr("checked")){
								//设置根节点未选中
								$(this).attr("checked",false);
								//移除隐藏域中此根节点的值
								$("#hidRole").val($("#hidRole").val().replace(","+$(this).val(),""));
							}
						}else{
							//判断根节点是否被选中
							//如果根节点未选中
							if($(this).attr("checked") == false){								
								//设置根节点选中
								$(this).attr("checked",true);
								//添加此根节点的值
								$("#hidRole").val($("#hidRole").val()+","+$(this).val());
							}
						}				
					}
				}
			});
		}
	}
}

//用dwr实现角色权限添加}
 //得到该角色原有权限
function checkMenu(){
   //得到角色id
  var rname = document.getElementsByName("roeid");
  var rid="";
  for(var i=0;i<rname.length;i++){
  	if(rname[i].checked){
  		rid=rname[i].value;
  		break;
  	}
  }
  // alert("角色 "+rid);
  //得到该角色原有权限
  roleMess.selMenuByRid(rid,checkYN);
}

//判断权限存在与否
function checkYN(data){
    //得到角色id
	 var rname = document.getElementsByName("roeid");
	 var rid="";
	 for(var i=0;i<rname.length;i++){
		if(rname[i].checked){
		  rid=rname[i].value;
		  break;
		}
	}
	var hidR = $("#hidRole").val();  //得到隐藏域的id集合
	//根据','截取字符串,存入h数组里
	var h = hidR.split(',');

	//循环判断删除角色权限
	        //调用删除方法
	roleMess.deleteRoleInfo(parseInt(rid),huiddao2);
	alert("修改角色权限成功!");
	var j=0;
	//判断添加角色权限
	for(var i=1 ; i<h.length;i++){
	 roleMess.addRoleInfo(parseInt(rid),parseInt(h[i]),hudiao1);
	}
	
	
}

function hudiao1(data){
}
function huiddao2(data){
}









