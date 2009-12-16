//楼盘信息js文件
//模糊查询判断
function doselby(){
	if(document.getElementById('loftNo').value==""&&document.getElementById('loftName').value==""){
	   alert("请输入一项信息进行模糊查询!");
	   return false;
	}else{
		return true;
	}
}

//返回
function doback(url){
	window.location.href=url;
}

//房屋类型js
//房屋类型添加前判断
function donewHt(){
     var zz = /^\d+$/
     var hname=document.getElementById('htName').value;
     var hroom=document.getElementById('htRoom').value;
     var hkt=document.getElementById('htHall').value;
     var hcookroom=document.getElementById('htCookRoom').value;
     var hwc=document.getElementById('htWc').value;
     var hterrace=document.getElementById('htTerrace').value;
     var hgarden = document.getElementById('htGardenArea').value;
	if(hname==""){
		alert('类型名格式错误！');
		return false;	
	}
	if(hroom==""||!zz.test(hroom)){
		alert('卧室间数格式错误！');
		return false;	
	}
	if(hkt==""||!zz.test(hkt)){
		alert('客厅间数格式错误！');
		return false;	
	}
	if(hcookroom==""||!zz.test(hcookroom)){
		alert('厨房间数格式错误!');
		return false;	
	}
    if(hwc==""||!zz.test(hwc)){
		alert('卫生间数格式错误!');
		return false;	
	}
	if(hterrace==""||!zz.test(hterrace)){
		alert('阳台数格式错误!');
		return false;	
	}
	if(hgarden==""){
		alert('阳台花园数格式错误!');
		return false;	
	}
	return true;
}

//弹出提示信息
function onMes(mess){
   if(mess==""){
   }else{
   	alert(mess);
   }
}

//楼盘管理

//修改楼盘信息是提交验证
function doup(){
	if(document.getElementById('loftName').value==""){
		alert("楼盘名称不能为空！");
		return false;
	}else if(document.getElementById('loftZone').value==""){
		alert("楼盘区域为空！");
		return false;
	}else if(document.getElementById('loftAddress').value==""){
		alert("楼盘地址不能为空！");
		return false;
	}else{
		return true;
	}
}

//插入时比较楼盘名和楼盘编号是否存在
function checkLoft(bo){
    if(bo=="lono"){ //编号
     loftcheckno.selLoftName(backloftno);
    }else if(bo=="loname"){  //楼盘名
     loftcheckno.selLoftName(backloftname);
    }
}
//回掉函数
//判断编号是否可用
function backloftno(data){
	var json = eval("("+data+")");  //得到数据库数据
	var loftno = document.getElementById('loftNo').value;  //得到编号信息
	for(var i=0;i<json.length;i++){
		if(loftno==json[i].lofno||loftno == ""){
		   document.getElementById('delno').style.display ='block';
		   document.getElementById('yeno').style.display ='none';
		   break;
		}
			document.getElementById('yeno').style.display ='block';
		    document.getElementById('delno').style.display ='none';
	}
}
//判断楼盘名称是否可用
function backloftname(data){
	var json = eval("("+data+")");  //得到数据库数据
	var loftname = document.getElementById('loftName').value;  //得到编号信息
	for(var i=0;i<json.length;i++){
		if(loftname==json[i].lofname||loftname == ""){
		   document.getElementById('delna').style.display ='block';
		   document.getElementById('yena').style.display ='none';
		   break;
		}
			document.getElementById('yena').style.display ='block';
		    document.getElementById('delna').style.display ='none';
	}
}


//新建楼盘信息提交前
function doadd(){
    var zz = /^\d+$/;
    var pri = document.getElementById('loftPrice').value;  //价格
	if(document.getElementById('loftNo').value==""){
	    document.getElementById('delno').style.display ='block';
		document.getElementById('yeno').style.display ='none';
		return false;
	}else if(document.getElementById('loftName').value==""){
	    document.getElementById('yena').style.display ='none';
		document.getElementById('delna').style.display ='block';
		//alert("楼盘名称不能为空！");
		return false;
	}else if(document.getElementById('loftZone').value==""){
		alert("楼盘区域为空！");
		return false;
	}else if(document.getElementById('loftAddress').value==""){
		alert("楼盘地址不能为空！");
		return false;
	}else if(pri==""||!zz.test(pri)){
		   alert("均价格式错误!");
		   return false;
	}else{
		return true;
	}
}

//dwr查询出房屋类型信息
function selhtype(){
	selHt.selType(selhtback);
}

//回掉函数
function selhtback(data){
	var json = eval("("+ data +")");
	//alert(json);
	var list = document.getElementById('utno');
    for(var i =0; i<json.length;i++){
		list.options[i] = new Option(json[i].htName,json[i].htid);
	}	
}

function createHouse(txt){
	if(isNaN(txt.value) || txt.value<1 || txt.value.indexOf(".")!=-1){
		alert("每层楼的房屋数量必须是大于0的整数！");
	}
	else{
		var tab = document.getElementById("unit_fouse_tab");
		//删除原有的信息
		var len = tab.rows.length;
		for(var i=1;i<len;i++){
			tab.deleteRow(1);
		}
		
		var houseTypeList = [];
		//读取房屋类型
		selHt.selType(function(data){
		    var list = eval("("+data+")");
		    var houid = [];
			for(var i=0;i<list.length;i++){
			    houid[i] = list[i].htid;
				houseTypeList[i]=[list[i].htid,list[i].htroom+"室"+list[i].hthall+"厅"+list[i].htcook+"厨"+list[i].htwc+"卫"+list[i].htter+"阳台"];
			}
			
			for(var i=0;i<txt.value;i++){
				var row = tab.insertRow();
				
				var td1 = row.insertCell();
				td1.style.textAlign="center";				
				var txt1 = document.createElement("input");
				txt1.type="text";
				txt1.name="houseNo";  //编号
				txt1.style.width=30;
				txt1.value=i+1;
				txt1.readOnly=true;
				txt1.style.textAlign="center";
				td1.appendChild(txt1);
				
				var td2 = row.insertCell();
				td2.style.textAlign="center";
				var sel2 = document.createElement("select");
				sel2.name="houseTypeId";   //类型id
				sel2.id="htid";
				sel2.options.length=houseTypeList.length;
				for(var k=0;k<houseTypeList.length;k++){
					sel2.options[k]=new Option(houseTypeList[k][1],houid[k]);
				}
				td2.appendChild(sel2);
				//
				var td3 = row.insertCell();
				td3.style.textAlign="center";
				//td3.id="td"+i;
				var txt3 = document.createElement("input");
				txt3.type="text";
				txt3.name="houseBuildArea";
				//txt3.setAttribute("name","houseBuildArea");   //建筑面积
				//txt3.setAttribute("value","aaaaaaaaa");
				txt3.id="buildArea"+i;
				txt3.style.width=120;
				td3.appendChild(txt3);
				
				var td4 = row.insertCell();
				td4.style.textAlign="center";
				var txt4 = document.createElement("input");
				txt4.type="text";
				txt4.id="buildPrice"+i;
				txt4.name="houseBuildPrice";   //建筑价格
				txt4.style.width=120;
				td4.appendChild(txt4);
				
				var td5 = row.insertCell();
				td5.style.textAlign="center";
				var txt5 = document.createElement("input");
				txt5.type="text";
				txt5.id="builduseArea"+i;
				txt5.name="houseUseArea";   //套内面积
				txt5.style.width=120;
				td5.appendChild(txt5);
				
				var td6 = row.insertCell();
				td6.style.textAlign="center";
				var txt6 = document.createElement("input");
				txt6.type="text";
				txt6.id="buildusePrice"+i;
				txt6.name="houseUsePrice";   //套内价格
				txt6.style.width=120;
				td6.appendChild(txt6);
			}
		});
	}
}


//添加房屋信息和单元信息本地验证
function addUnitHouset(){
    var unitnum = document.getElementById('unitHouseNum').value;
	//单元名
	if(document.getElementById('unitNo').value==""){
		alert("单元编号不能为空！");
		return false;
	}else if(document.getElementById('unitName').value==""){
		alert("单元名称不能为空！");
		return false;
	}else if(unitnum ==""){
		alert("房屋数量不能为空！");
		return false;
	}else if(document.getElementById('unitFloorNum').value==""){
		alert("楼层数不能为空！");
		return false;
	}else{
	//验证房屋信息
	//alert("建筑面积"+document.getElementById('a5').value);
	//循环判断房屋信息是否输入完整
	for(var i=0;i<unitnum;i++){
		if(document.getElementById('buildArea'+i).value==""){
			alert("建筑面积不能为空！");
			return false;
		}else if(document.getElementById('buildPrice'+i).value==""){
			alert("建筑价格不能为空！");
			return false;
		}else if(document.getElementById('builduseArea'+i).value==""){
			alert("套内面积不能为空！");
			return false;
		}else if(document.getElementById('buildusePrice'+i).value==""){
			alert("套内价格不能为空！");
			return false;
		}
	 }
	}
	return true;
}

//删除单元信息提示
function showError(eror){
	if(eror==""){}else{alert(eror);}
}

//修改单元信息提交前判断
function checkupunit(){
	var zz = /^\d+$/  
	 var unitnum = document.getElementById('unitHouseNum').value;
	 var floornum= document.getElementById('unitFloorNum').value;
	//单元名
	if(document.getElementById('unitNo').value==""){
		alert("单元编号不能为空！");
		return false;
	}else if(document.getElementById('unitName').value==""){
		alert("单元名称不能为空！");
		return false;
	}else if(unitnum ==""){
		alert("房屋数量不能为空！");
		return false;
	}else if(!zz.test(unitnum)){
	    alert("房屋数量必须为大于0的数字！");
		return false;
	}else if(floornum==""){
		alert("楼层数不能为空！");
		return false;
	}else if(!zz.test(floornum)){
		alert("楼层数必须为大于0的数字！");
		return false;
	}else{
		return true;
	}
}


//导入导出数据
//指定页面区域内容导入Excel 
function AllAreaExcel() 
{ 
  var oXL = new ActiveXObject("Excel.Application"); 
  var oWB = oXL.Workbooks.Add(); 
  var oSheet = oWB.ActiveSheet;  
  var sel=document.body.createTextRange(); 
  //PrintA是table的id 
  sel.moveToElementText(PrintA); 
  sel.select(); 
  sel.execCommand("Copy"); 
  oSheet.Paste(); 
  oXL.Visible = true; 
}




