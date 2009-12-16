//dwr查询出客户的所有状态信息
function selDdict() {
	var sta = 7;
	selClientDdit.selDataType(sta, selDdictBack);
}
//回调函数
function selDdictBack(data) {
	var json = eval("(" + data + ")");
	var list = document.getElementById("ddtype");
	for (var i = 1; i <= json.length; i++) {
			list.options[i] = new Option(json[i-1].ddvalue, json[i-1].ddid);
	}
}

//模糊查询前验证
function selBysome(){
    if(document.getElementById('ddtype').value==0 &&document.getElementById('clientName').value=="" ){
      alert("请输入一个信息进行模糊查询!");
      return false;
    }else{
    	return true;
    }
}

//返回
function doback(url){
	window.location.href=url;
}

//新建客户信息加载判断
function onerror(ero){
	if(ero==""){}else{alert(ero);}
}

//新建客户提交前判断
function newclient(){
	if(document.getElementById('clientName').value==""){
	    alert('请输入客户姓名！');
	    return false;
	}else if(document.getElementById('clientTell').value==""){
	    alert('请输入客户联系电话！');
	    return false;
	}
	return true;
}

//dwr查询指定角色员工信息
function selEmpRole(){
	empcheckno.selEmp(backSelRmp);
}
//回调函数
function backSelRmp(data){
	var json = eval("(" + data + ")");
	//alert(json);
	var list = document.getElementById("empid");
	for (var i = 0; i < json.length-1; i++) {
			list.options[i] = new Option(json[i].empname, json[i].empno);
	}
}

//查看是否指派成功
function er(error){
	if(error==""){}else{alert(error);}
}


//更改客户需求前客户端验证
function checkupcli(){
	
}


