

//dwr 实现 显示所有属售楼部
//得到数据
function selshop(){
	shopname.selShop(sel);
}
//显示数据
function sel(data){
	var json = eval("("+ data +")");
	var list = document.getElementById('shopId');
    for(var i =0; i<json.length;i++){
		list.options[i] = new Option(json[i].shopName,json[i].shopId);
	}	
}
//dwr实现
//验证员工编号是否存在
function docheckempno(){
	empcheckno.selEmpNo(docheck);
}
function docheck(data){
	var json = eval("("+data+")");
	//得到文本框的值
	var emno = document.getElementById('empNo').value;
	for(var i=0; i<json.length;i++){
		if(emno==json[i].empNo||emno == ""){
		   document.getElementById('del').style.display ='block';
		   document.getElementById('ye').style.display ='none';
		   break;
		}
			document.getElementById('ye').style.display ='block';
		    document.getElementById('del').style.display ='none';
	}
}

//验证添加新员工
 function doaddemp(){
	//检查用户是否输入完整
	if(document.getElementById('del').style.display =='block'){
	   alert('该员工编号已经存在!');
	   return false;
	}
 	 if(document.getElementById('empNo').value==''){
 	    alert('员工编号不能为空！');
 	    return false;
 	 }else if(document.getElementById('empName').value==''){
 	    alert('姓名不能为空！');
 	    return false;
 	 }else if(document.getElementById('empAccount').value==''){
 	    alert('登陆账号不能为空！');
 	    return false;
 	 }else if(document.getElementById('empPass').value==''){
 	    alert('登陆密码不能为空！');
 	    return false;
 	 }else if(document.getElementById('empPid').value==''){
 	    alert('身份证号不能为空！');
 	    return false;
 	 }else if(document.getElementById('empPid').value.length!=18){
 	   alert('身份证号必须为18位');
 	   return false;
 	 }else if(document.getElementById('ebo').value==''){
 	    alert('生日不能为空!');
 	    return false;
 	 }else{
 	 	return true;
 	 }
 }
 
 
 
 //跳转页面
 function to(tourl){
 	location.href=tourl;
 }