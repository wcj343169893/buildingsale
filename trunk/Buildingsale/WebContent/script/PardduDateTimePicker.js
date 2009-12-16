/**
 * 名称:js日历控件
 * 版本:2.0
 * 作者:Parddu
 */

//控件的全局变量
var parddu_disId = false;						//用于显示结果的控件id
var parddu_disFormat = "yyyy-MM-dd hh:mm:ss";	//用于显示结果的格式
var parddu_timeDiv = false;					//用于显示控件的层
var parddu_timeTable = false;					//用于实现控件的表格
var parddu_timeTable_width = 250;			//用于显示控件的表格的宽度
var parddu_nowTimeTd = false;					//显示当前日期
var parddu_year_txt = false;					//年份控件
var parddu_month_txt = false;					//月份控件
var parddu_hour_txt = false;					//小时控件
var parddu_minute_txt = false;					//分钟控件
var parddu_second_txt = false;					//秒钟控件
var parddu_year_change_div = false;				//显示选择年的层
var parddu_year_change_sel = false;				//选择年的列表框
var parddu_none_background_div = false;			//用于隐藏背景的层
var parddu_all_select_list = false;				//页面中所有的下拉列表框
var parddu_datatime_background_Opacity = 70;	//背景透明度
var parddu_datatime_background_food_opacity = 0; //用于控制背景的循环变量

/**
 * 日历控件调用函数
 * txtId为现实结果的控件id
 * format为现实结果的格式
 * yyyy 代表年份
 * MM 代表月
 * dd 代表日
 * hh 代表小时
 * mm 代表分钟
 * ss 代表秒钟
 */
function PardduDateTimePicker(txtId,format,opacity){
	parddu_disId = txtId;
	if (opacity != null && opacity != "" && opacity<=70 && opacity>=30) {
		parddu_datatime_background_Opacity = opacity;
	}
	if(format!=null && format!=""){
		parddu_disFormat = format;
	}
	if(!parddu_timeDiv){
		createparddu_timeDiv();
	}
	parddu_timeDiv.style.top = event.y;
	parddu_timeDiv.style.left = event.x;
	parddu_timeDiv.style.display="block";
	parddu_noneAllSelect();
	parddu_nodisplayBackground();
	parddu_setNowTime();
	parddu_appendDay();
}

//实现模态选择
function parddu_nodisplayBackground(){
	parddu_datatime_background_food_opacity = 0;
	if(!parddu_none_background_div){
		var parddu_temp_height = document.body.clientHeight;
		var parddu_temp_width = document.body.clientWidth;
		parddu_none_background_div = document.createElement("div");
		parddu_none_background_div.id = "parddu_datatime_background_div";
		parddu_none_background_div.style.height=parddu_temp_height;
		parddu_none_background_div.style.width=parddu_temp_width;
		parddu_none_background_div.style.zIndex = 998;
		parddu_none_background_div.style.backgroundColor = "#6699ff";
		parddu_none_background_div.style.filter = "alpha(Opacity=0)";
		parddu_none_background_div.style.position = "absolute";
		parddu_none_background_div.style.top = 0;
		parddu_none_background_div.style.left = 0;
		document.body.appendChild(parddu_none_background_div);
	}
	parddu_none_background_div.style.display = "block";
	window.onresize=parddu_resize_background_div;
	parddu_changeBackground_Opacity();
}

function parddu_resize_background_div(){
	parddu_none_background_div.style.width=document.body.offsetWidth-16;
	parddu_none_background_div.style.height=document.body.offsetHeight-14;
}

//背景渐变
function parddu_changeBackground_Opacity(){
	parddu_datatime_background_food_opacity += 5 ;
	parddu_none_background_div.style.filter = "alpha(Opacity="+parddu_datatime_background_food_opacity+")";
	if (parddu_datatime_background_food_opacity < parddu_datatime_background_Opacity) {
		setTimeout(parddu_changeBackground_Opacity,20);
	}
}

//隐藏所有的下拉列表框
function parddu_noneAllSelect(){
	parddu_all_select_list = false;
	parddu_all_select_list = document.getElementsByTagName("select");
	for(var i=0;i<parddu_all_select_list.length;i++){
		if (parddu_all_select_list[i].id != "parddu_datatime_year_select") {
			parddu_all_select_list[i].style.visibility = "hidden";
		}
	}
}

//显示下拉列表框
function parddu_block_select(){
	parddu_all_select_list = document.getElementsByTagName("select");
	for(var i=0;i<parddu_all_select_list.length;i++){
		if (parddu_all_select_list[i].id != "parddu_datatime_year_select") {
			parddu_all_select_list[i].style.visibility = "visible";
		}
	}
}

//生成日历控件,生成布局
function createparddu_timeDiv(){
	//创建层
	parddu_timeDiv = document.createElement("div");
	parddu_timeDiv.id = "parddu_datatime_div";
	parddu_timeDiv.style.borderWidth = "1px";
	parddu_timeDiv.style.borderStyle = "solid";
	parddu_timeDiv.style.borderColor = "#993366";
	parddu_timeDiv.style.position="absolute";
	parddu_timeDiv.style.zIndex = 999;
	document.body.appendChild(parddu_timeDiv);
	//创建table
	parddu_timeTable = document.createElement("table");
	parddu_timeTable.style.fontSize="12px";
	parddu_timeTable.style.borderWidth="0px"
	parddu_timeTable.style.backgroundColor="#ffffff";
	parddu_timeTable.cellSpacing="0";
	//创建控制行,表格的第一行
	var conRow = parddu_timeTable.insertRow();
	conRow.align="center";
	//表格的第一行
	var crTdTwo = conRow.insertCell();
	crTdTwo.style.backgroundColor="#cccccc";
	crTdTwo.style.textAlign="center";
	crTdTwo.colSpan="7";
	crTdTwo.style.paddingTop="3px";
	crTdTwo.style.paddingBottom="3px";
	//年减少
	parddu_year_butsub = document.createElement("input");
	parddu_year_butsub.type="button";
	parddu_year_butsub.value="<<";
	parddu_year_butsub.title="减少一年";
	parddu_year_butsub.style.height="17px";
	parddu_year_butsub.style.cursor="hand";
	parddu_setButtonStyleOne(parddu_year_butsub);
	parddu_year_butsub.onmouseout=parddu_mouseOutBut;
	parddu_year_butsub.onmouseover=parddu_mouseOverBut;
	parddu_year_butsub.onclick=parddu_changeYearSub;
	crTdTwo.appendChild(parddu_year_butsub);
	var temp_str_one = document.createElement("label");
	temp_str_one.innerText=" ";
	crTdTwo.appendChild(temp_str_one);
	//月减少
	parddu_month_butsub = document.createElement("input");
	parddu_month_butsub.type="button";
	parddu_month_butsub.value="<";
	parddu_month_butsub.title="减少一月";
	parddu_month_butsub.style.height="17px";
	parddu_month_butsub.style.cursor="hand";
	parddu_setButtonStyleOne(parddu_month_butsub);
	parddu_month_butsub.onmouseout=parddu_mouseOutBut;
	parddu_month_butsub.onmouseover=parddu_mouseOverBut;
	parddu_month_butsub.onclick=parddu_changeMonthSub;
	crTdTwo.appendChild(parddu_month_butsub);
	var temp_str_two = document.createElement("label");
	temp_str_two.innerText=" ";
	crTdTwo.appendChild(temp_str_two);
	//选择年
	parddu_year_change_div = document.createElement("div");
	parddu_year_change_div.style.display = "none";
	parddu_year_change_div.style.borderWidth = "0px";
	parddu_year_change_div.style.position = "absolute";
	parddu_year_change_sel = document.createElement("select");
	parddu_year_change_sel.style.width = "50px";
	parddu_year_change_sel.style.height = "17px";
	parddu_year_change_sel.id="parddu_datatime_year_select";
	parddu_setButtonStyleOne(parddu_year_change_sel);
	parddu_year_change_sel.onchange = parddu_closeChangeYear;
	parddu_year_change_div.appendChild(parddu_year_change_sel);
	crTdTwo.appendChild(parddu_year_change_div);
	//添加年控件
	parddu_year_txt = document.createElement("input");
	parddu_year_txt.type="text";
	parddu_year_txt.readOnly="true";
	parddu_year_txt.style.width="32px";
	parddu_year_txt.maxLength="4";
	parddu_year_txt.style.height="16px";
	parddu_setTextStyleOne(parddu_year_txt);
	parddu_year_txt.onclick=parddu_displayChangeYear;
	crTdTwo.appendChild(parddu_year_txt);
	var yearstr = document.createElement("label");
	yearstr.innerText="年";
	crTdTwo.appendChild(yearstr);
	//添加月控件
	parddu_month_txt = document.createElement("input");
	parddu_month_txt.type="text";
	parddu_month_txt.readOnly="true";
	parddu_month_txt.style.width="15px";
	parddu_month_txt.maxLength="2";
	parddu_month_txt.style.height="16px";
	parddu_setTextStyleOne(parddu_month_txt);
	crTdTwo.appendChild(parddu_month_txt);
	var monthstr = document.createElement("label");
	monthstr.innerText="月";
	crTdTwo.appendChild(monthstr);
	var splitstr = document.createElement("label");
	splitstr.innerText=" ";
	crTdTwo.appendChild(splitstr);
	//添加小时控件
	parddu_hour_txt = document.createElement("input");
	parddu_hour_txt.type="text";
	parddu_hour_txt.id = "parddu_hour";
	parddu_hour_txt.title="小时";
	parddu_hour_txt.style.width="15px";
	parddu_hour_txt.maxLength="2";
	parddu_hour_txt.style.height="16px";
	parddu_setTextStyleTwo(parddu_hour_txt);
	parddu_hour_txt.onblur = parddu_timeTxtBlue;
	crTdTwo.appendChild(parddu_hour_txt);
	var hourstr = document.createElement("label");
	hourstr.innerText=":";
	crTdTwo.appendChild(hourstr);
	//parddu_minute_txt
	parddu_minute_txt = document.createElement("input");
	parddu_minute_txt.type="text";
	parddu_minute_txt.id = "parddu_minute";
	parddu_minute_txt.title="分钟";
	parddu_minute_txt.style.width="15px";
	parddu_minute_txt.maxLength="2";
	parddu_minute_txt.style.height="16px";
	parddu_setTextStyleTwo(parddu_minute_txt);
	parddu_minute_txt.onblur = parddu_timeTxtBlue;
	crTdTwo.appendChild(parddu_minute_txt);
	var minutestr = document.createElement("label");
	minutestr.innerText=":";
	crTdTwo.appendChild(minutestr);
	//parddu_second_txt
	parddu_second_txt = document.createElement("input");
	parddu_second_txt.type="text";
	parddu_second_txt.id = "parddu_second";
	parddu_second_txt.title="秒钟";
	parddu_second_txt.style.width="15px";
	parddu_second_txt.title="";
	parddu_second_txt.maxLength="2";
	parddu_second_txt.style.height="16px";
	parddu_setTextStyleTwo(parddu_second_txt);
	parddu_second_txt.onblur = parddu_timeTxtBlue;
	crTdTwo.appendChild(parddu_second_txt);
	var temp_str_three = document.createElement("label");
	temp_str_three.innerText=" ";
	crTdTwo.appendChild(temp_str_three);
	//月增加
	parddu_month_butadd = document.createElement("input");
	parddu_month_butadd.type="button";
	parddu_month_butadd.value=">";
	parddu_month_butadd.title="增加一月";
	parddu_month_butadd.style.height="17px";
	parddu_month_butadd.style.cursor="hand";
	parddu_setButtonStyleOne(parddu_month_butadd);
	parddu_month_butadd.onmouseout=parddu_mouseOutBut;
	parddu_month_butadd.onmouseover=parddu_mouseOverBut;
	parddu_month_butadd.onclick=parddu_changeMonthAdd;
	crTdTwo.appendChild(parddu_month_butadd);
	//年增加
	var temp_str_four = document.createElement("label");
	temp_str_four.innerText=" ";
	crTdTwo.appendChild(temp_str_four);
	parddu_year_butadd = document.createElement("input");
	parddu_year_butadd.type="button";
	parddu_year_butadd.value=">>";
	parddu_year_butadd.title="增加一年";
	parddu_year_butadd.style.height="17px";
	parddu_year_butadd.style.cursor="hand";
	parddu_setButtonStyleOne(parddu_year_butadd);
	parddu_year_butadd.onmouseout=parddu_mouseOutBut;
	parddu_year_butadd.onmouseover=parddu_mouseOverBut;
	parddu_year_butadd.onclick=parddu_changeYearAdd;
	crTdTwo.appendChild(parddu_year_butadd);
	/////判断显示那些空间
	//判断是否有年
	if(parddu_disFormat.indexOf("yyyy")==-1){
		parddu_year_butsub.style.display = "none";
		parddu_year_txt.style.display = "none";
		yearstr.style.display = "none";
		parddu_year_butadd.style.display = "none";
		parddu_timeTable_width -= 70;
	}
	if(parddu_disFormat.indexOf("MM")==-1){
		parddu_month_butsub.style.display = "none";
		parddu_month_txt.style.display = "none";
		monthstr.style.display = "none";
		parddu_month_butadd.style.display = "none";
		parddu_timeTable_width -= 50;
	}
	if(parddu_disFormat.indexOf("hh")==-1){
		parddu_hour_txt.style.display="none";
		parddu_timeTable_width -= 16;
	}
	if(parddu_disFormat.indexOf("mm")==-1){
		parddu_minute_txt.style.display="none";
		hourstr.style.display="none";
		parddu_timeTable_width -= 16;
	}
	if(parddu_disFormat.indexOf("ss")==-1){
		parddu_second_txt.style.display="none";
		minutestr.style.display="none";
		parddu_timeTable_width -= 16;
	}
	//关闭按钮
	var temp_str_four = document.createElement("label");
	temp_str_four.innerText=" ";
	crTdTwo.appendChild(temp_str_four);
	parddu_close_but = document.createElement("input");
	parddu_close_but.type="button";
	parddu_close_but.value="×";
	parddu_close_but.title="关闭";
	parddu_close_but.style.height="17px";
	parddu_close_but.style.cursor="hand";
	parddu_setButtonStyleOne(parddu_close_but);
	parddu_close_but.onmouseout=parddu_mouseOutBut;
	parddu_close_but.onmouseover=parddu_mouseOverBut;
	parddu_close_but.onclick=parddu_closeTimePicker;
	crTdTwo.appendChild(parddu_close_but);
	//表格的宽度
	if(parddu_timeTable_width<180){
		parddu_timeTable_width = 180;
	}
	parddu_timeTable.width=parddu_timeTable_width+"px";
	//创建星期行
	var twoRow = parddu_timeTable.insertRow();
	twoRow.align="center";
	var wList = ["日","一","二","三","四","五","六"];
	for (var i = 0; i < wList.length; i++) {
		var trTd = twoRow.insertCell();
		trTd.style.borderBottom="1px solid #006666";
		trTd.innerText = wList[i];
		trTd.style.paddingTop="3px";
		trTd.style.paddingBottom="3px";
	}
	//将表格div
	parddu_timeDiv.appendChild(parddu_timeTable);
}
//关闭选择年的层
function parddu_closeChangeYear(){
	parddu_year_txt.value = parddu_year_change_sel.value;
	parddu_year_change_div.style.display="none";
	parddu_appendDay();
}
//减少年
function parddu_changeYearSub(){
	parddu_year_txt.value = parseInt(parddu_year_txt.value)-1;
	parddu_appendDay();
}
//减少月份
function parddu_changeMonthSub(){
	var temp_month =  parseInt(parddu_month_txt.value)-1;
	if(temp_month<1){
		parddu_month_txt.value=12-temp_month;
		parddu_year_txt.value= parseInt(parddu_year_txt.value)-1;
	}
	else{
		parddu_month_txt.value=temp_month;
	}
	parddu_appendDay();
}
//增加月份
function parddu_changeMonthAdd(){
	var temp_month = parseInt(parddu_month_txt.value)+1;
	if(temp_month>12){
		parddu_month_txt.value=temp_month-12;
		parddu_year_txt.value= parseInt(parddu_year_txt.value)+1;
	}
	else{
		parddu_month_txt.value=temp_month;
	}
	parddu_appendDay();
}
//增加年
function parddu_changeYearAdd(){
	parddu_year_txt.value = parseInt(parddu_year_txt.value)+1;
	parddu_appendDay();
}
//添加当月日期到表格
function parddu_appendDay(){
	parddu_clearDayInTable();  //清楚之前显示的月份
	var parddu_dayNum = 0;//当前月份有多少天
	var parddu_onedayOfWeek = 0;//当月的第一天是星期几0-6
	//取得当前的年份和月份
	var parddu_year = parddu_year_txt.value;
	var parddu_month = parddu_month_txt.value;
	var parddu_daylist = [31,0,31,30,31,30,31,31,30,31,30,31];
	if(parddu_month!=2){
		parddu_dayNum = parddu_daylist[parddu_month-1];
	}
	else{
		if((parddu_year%4==0 && parddu_year%100!=0) || parddu_year%400==0){
			parddu_dayNum=29;
		}
		else{
			parddu_dayNum=28;
		}
	}
	var temp_date = new Date(parddu_year,parddu_month-1,1);
	parddu_onedayOfweek = temp_date.getDay();
	//添加日期
	var tempTr = false; //临时的行
	var loopDay = 0;
	for(var temp_i = 0 ;loopDay<parddu_dayNum;temp_i++){
		if(temp_i%7==0){
			tempTr = parddu_timeTable.insertRow();
			tempTr.align="center";
		}
		var tempTd = tempTr.insertCell();
		tempTd.style.paddingTop="3px";
		tempTd.style.paddingBottom="3px";
		if(temp_i<parddu_onedayOfweek){
			tempTd.innerText=" ";
		}
		else{
			loopDay++;
			tempTd.title = parddu_getCNDate(parddu_year,parddu_month,loopDay);
			if(loopDay<10){
				tempTd.innerText="0"+loopDay;
			}
			else{
				tempTd.innerText=loopDay;
			}
			tempTd.style.cursor="hand";
			var now = new Date();
			var nowYear = now.getYear();
			var nowMonth = now.getMonth()+1;
			var nowDate = now.getDate();
			if(parddu_year_txt.value==nowYear && parddu_month_txt.value==nowMonth && loopDay==nowDate){
				tempTd.style.color="red";
			}
			tempTd.onmouseover = parddu_mouseover;
			tempTd.onmouseout = parddu_mouseout;
			tempTd.onclick = parddu_mouseclick;
		}
	}
	//添加一个横线	
	parddu_addNowTimeTr_TD();
}

function parddu_addNowTimeTr_TD(){
	var parddu_nowTimeTr = parddu_timeTable.insertRow();
	parddu_nowTimeTd = parddu_nowTimeTr.insertCell();
	parddu_nowTimeTd.style.textAlign="center";
	parddu_nowTimeTd.colSpan="7";
	parddu_nowTimeTd.style.paddingTop="5px";
	parddu_nowTimeTd.style.paddingBottom="5px";
	parddu_nowTimeTd.style.backgroundColor="#cccccc";
	parddu_nowTimeTd.style.cursor="hand";
	parddu_nowTimeTd.style.color="blue";
	parddu_nowTimeTd.style.fontSize="12px";
	parddu_nowTimeTd.style.borderTopWidth="1px";
	parddu_nowTimeTd.style.borderTopColor="#006699";
	parddu_nowTimeTd.style.borderTopStyle="solid";
	parddu_nowTimeTd.title="点击取得当前时间";
	parddu_nowTimeTd.onclick = parddu_outputNowDateTime;
	parddu_setDisplayNowTimeDiv();
}

//当时，分，秒文本框失去焦点时验证时间是否符合要求
function parddu_timeTxtBlue(){
	var temptxt = event.srcElement;
	if(!parddu_judgeInputTime(temptxt.value,temptxt.id)){
		alert("时间值不符合要求，请重新输入！");
		temptxt.select();
		temptxt.focus();
	}
}

//鼠标点击表格列
function parddu_mouseclick(){
	var tempTd = event.srcElement;
	parddu_outputTime(tempTd.innerText);
}
//鼠标悬停表格列
function parddu_mouseover(){
	var tempTd = event.srcElement;
	tempTd.style.fontWeight="bold";
	tempTd.style.fontSize="13px";
	tempTd.style.backgroundColor = "#aabbfc";
}
//鼠标移出表格列
function parddu_mouseout(){
	var tempTd = event.srcElement;
	tempTd.style.fontWeight="";
	tempTd.style.fontSize="12px";
	tempTd.style.backgroundColor = "#ffffff";
}
//设置按钮样式1
function parddu_setButtonStyleOne(tempbut){
	tempbut.style.borderWidth="1px";
	tempbut.style.borderColor="#003366";
	tempbut.style.backgroundColor="#6699cc";
	tempbut.style.fontWeight="";
	tempbut.style.fontSize="12px";
	tempbut.style.color="#000000";
}
//设置按钮样式2
function parddu_setButtonStyleTwo(tempbut){
	tempbut.style.borderWidth="1px";
	tempbut.style.backgroundColor="#abedac";
	tempbut.style.fontSize="12px";
	tempbut.style.fontWeight="bold";
	tempbut.style.color="red";
}
//文本框样式1
function parddu_setTextStyleOne(temptxt){
	temptxt.style.borderWidth="0px";
	temptxt.style.textAlign="right";
	temptxt.style.backgroundColor="transparent";
	temptxt.style.color="blue";
}
//文本框样式1
function parddu_setTextStyleTwo(temptxt){
	temptxt.style.borderLeftWidth="0px";
	temptxt.style.borderTopWidth="0px";
	temptxt.style.borderRightWidth="0px";
	temptxt.style.borderBottomWidth="1px";
	temptxt.style.borderBottomColor="#6699cc";
	temptxt.style.textAlign="right";
	temptxt.style.backgroundColor="transparent";
	temptxt.style.color="blue";
}

//鼠标悬停按钮
function parddu_mouseOverBut(){
	var tempbut = event.srcElement;
	parddu_setButtonStyleTwo(tempbut);
}
//鼠标移出按钮样式
function parddu_mouseOutBut(){
	var tempbut = event.srcElement;
	parddu_setButtonStyleOne(tempbut);
}

//得到当前时间
function parddu_setNowTime(){
	var now = new Date();
	var nowYear = now.getYear();
	var nowMonth = now.getMonth()+1;
	var nowDate = now.getDate();
	var nowDay = now.getDay();
	var nowHour = now.getHours();
	var nowMinute = now.getMinutes();
	var nowSecond = now.getSeconds();
	parddu_year_txt.value=nowYear;
	parddu_month_txt.value=nowMonth;
	parddu_hour_txt.value=parddu_judgeTwoLength(nowHour+"");
	parddu_minute_txt.value=parddu_judgeTwoLength(nowMinute+"");
	parddu_second_txt.value=parddu_judgeTwoLength(nowSecond+"");
}

//刷新当前时间
function parddu_setDisplayNowTimeDiv(){
	if(parddu_nowTimeTd!=false && parddu_nowTimeTd!=null){
		var now = new Date();
		var nowYear = now.getYear();
		var nowMonth = now.getMonth()+1;
		var nowDate = now.getDate();
		var nowDay = now.getDay();
		var nowHour = now.getHours();
		var nowMinute = now.getMinutes();
		var nowSecond = now.getSeconds();
		var temp_weekList = ["日","一","二","三","四","五","六"];
		var nowStr = nowYear+"-"
		nowStr += parddu_judgeTwoLength(nowMonth+"")+"-";
		nowStr += parddu_judgeTwoLength(nowDate+"")+"  "
		nowStr += parddu_judgeTwoLength(nowHour+"")+":"
		nowStr += parddu_judgeTwoLength(nowMinute+"")+":"
		nowStr += parddu_judgeTwoLength(nowSecond+"");
		nowStr += "  星期"+temp_weekList[nowDay];
		parddu_nowTimeTd.innerText = nowStr;
		setTimeout("parddu_setDisplayNowTimeDiv()",1000);
	}
}

//清楚原有的日期列表
function parddu_clearDayInTable(){
	var parddu_rowList = parddu_timeTable.rows;
	for(i=parddu_rowList.length-1;i>1;i--){
		parddu_timeTable.deleteRow(i);
	}
}

//输出结果
function parddu_outputTime(tempdate){
	//获得各项时间值
	var tempYear = parddu_year_txt.value;
	var tempMonth = parddu_judgeTwoLength(parddu_month_txt.value);
	tempdate = parddu_judgeTwoLength(tempdate+"");
	var tempHour = parddu_hour_txt.value;
	var tempMinute = parddu_minute_txt.value;
	var tempSecond = parddu_second_txt.value;
	//得到输出格式
	var outputStr = parddu_disFormat;
	//替换日期格式中的表示符号
	//替换年份
	outputStr = outputStr.replace("yyyy",tempYear);
	outputStr = outputStr.replace("MM",tempMonth);
	outputStr = outputStr.replace("dd",tempdate);
	outputStr = outputStr.replace("hh",tempHour);
	outputStr = outputStr.replace("mm",tempMinute);
	outputStr = outputStr.replace("ss",tempSecond);
	parddu_closeTimePicker();
	document.getElementById(parddu_disId).value=outputStr;
}
//输出当前时间
function parddu_outputNowDateTime(){
	var tempnow = new Date();
	//获得各项时间值
	var tempYear = tempnow.getYear();
	var tempMonth = tempnow.getMonth()+1;
	var tempdate = tempnow.getDate();
	var tempHour = tempnow.getHours();
	var tempMinute = tempnow.getMinutes();
	var tempSecond = tempnow.getSeconds();
	//得到输出格式
	var outputStr = parddu_disFormat;
	//替换日期格式中的表示符号
	//替换年份
	outputStr = outputStr.replace("yyyy",tempYear);
	outputStr = outputStr.replace("MM",parddu_judgeTwoLength(tempMonth+""));
	outputStr = outputStr.replace("dd",parddu_judgeTwoLength(tempdate+""));
	outputStr = outputStr.replace("hh",parddu_judgeTwoLength(tempHour+""));
	outputStr = outputStr.replace("mm",parddu_judgeTwoLength(tempMinute+""));
	outputStr = outputStr.replace("ss",parddu_judgeTwoLength(tempSecond+""));
	parddu_closeTimePicker();
	document.getElementById(parddu_disId).value=outputStr;
}
//判断给定字符串是否长度为2，如果不足在前天添加一个0
function parddu_judgeTwoLength(tempstr){
	if(tempstr.length<2){
		return "0"+tempstr;
	}
	else{
		return tempstr;
	}
}
//验证时间
function parddu_judgeInputTime(value,type){
	var judgeTest = false;
	//小时
	if(type=="parddu_hour"){
		judgeTime = /^([01][0-9])|(2[0-3])$/;
	}
	else{
		judgeTime = /^[0-5]?[0-9]$/;
	}
	return judgeTime.test(value);
}
//显示选择年的层
function parddu_displayChangeYear(){
	var parddu_temp_year = parddu_year_txt.value;
	parddu_year_change_div.style.display="block";
	var temp_begin_year = parddu_temp_year-30;
	parddu_year_change_sel.options.length=60;
	for(var temp_for_i=0 ; temp_for_i<60 ; temp_for_i++){
		parddu_year_change_sel.options[temp_for_i] = new Option(temp_for_i+temp_begin_year+1,temp_for_i+temp_begin_year+1);
	}
	parddu_year_change_sel.value = parddu_temp_year;
}

//关闭时间控件
function parddu_closeTimePicker(){
	parddu_timeDiv.style.display="none";
	parddu_none_background_div.style.display = "none";
	parddu_block_select();
}


///农历
function parddu_getCNDate(year ,month,day){
	var lunarInfo=new Array(
	0x04bd8,0x04ae0,0x0a570,0x054d5,0x0d260,0x0d950,0x16554,0x056a0,0x09ad0,0x055d2,
	0x04ae0,0x0a5b6,0x0a4d0,0x0d250,0x1d255,0x0b540,0x0d6a0,0x0ada2,0x095b0,0x14977,
	0x04970,0x0a4b0,0x0b4b5,0x06a50,0x06d40,0x1ab54,0x02b60,0x09570,0x052f2,0x04970,
	0x06566,0x0d4a0,0x0ea50,0x06e95,0x05ad0,0x02b60,0x186e3,0x092e0,0x1c8d7,0x0c950,
	0x0d4a0,0x1d8a6,0x0b550,0x056a0,0x1a5b4,0x025d0,0x092d0,0x0d2b2,0x0a950,0x0b557,
	0x06ca0,0x0b550,0x15355,0x04da0,0x0a5d0,0x14573,0x052d0,0x0a9a8,0x0e950,0x06aa0,
	0x0aea6,0x0ab50,0x04b60,0x0aae4,0x0a570,0x05260,0x0f263,0x0d950,0x05b57,0x056a0,
	0x096d0,0x04dd5,0x04ad0,0x0a4d0,0x0d4d4,0x0d250,0x0d558,0x0b540,0x0b5a0,0x195a6,
	0x095b0,0x049b0,0x0a974,0x0a4b0,0x0b27a,0x06a50,0x06d40,0x0af46,0x0ab60,0x09570,
	0x04af5,0x04970,0x064b0,0x074a3,0x0ea50,0x06b58,0x055c0,0x0ab60,0x096d5,0x092e0,
	0x0c960,0x0d954,0x0d4a0,0x0da50,0x07552,0x056a0,0x0abb7,0x025d0,0x092d0,0x0cab5,
	0x0a950,0x0b4a0,0x0baa4,0x0ad50,0x055d9,0x04ba0,0x0a5b0,0x15176,0x052b0,0x0a930,
	0x07954,0x06aa0,0x0ad50,0x05b52,0x04b60,0x0a6e6,0x0a4e0,0x0d260,0x0ea65,0x0d530,
	0x05aa0,0x076a3,0x096d0,0x04bd7,0x04ad0,0x0a4d0,0x1d0b6,0x0d250,0x0d520,0x0dd45,
	0x0b5a0,0x056d0,0x055b2,0x049b0,0x0a577,0x0a4b0,0x0aa50,0x1b255,0x06d20,0x0ada0);
	var Animals=new Array("鼠","牛","虎","兔","龙","蛇","马","羊","猴","鸡","狗","猪");
	var Gan=new Array("甲","乙","丙","丁","戊","己","庚","辛","壬","癸");
	var Zhi=new Array("子","丑","寅","卯","辰","巳","午","未","申","酉","戌","亥");
	var now = new Date(year,month-1,day);
	var SY = now.getYear(); 
	var SM = now.getMonth();
	var SD = now.getDate();
		 
	//==== 传入 offset 传回干支, 0=甲子
	function cyclical(num) {
		return(Gan[num%10]+Zhi[num%12]);
	}
	
	//==== 传回农历 y年的总天数
	function lYearDays(y) {
	   var i, sum = 348;
	   for(i=0x8000; i>0x8; i>>=1) sum += (lunarInfo[y-1900] & i)? 1: 0;
	   return(sum+leapDays(y));
	}
	
	//==== 传回农历 y年闰月的天数
	function leapDays(y) {
	   if(leapMonth(y))  return((lunarInfo[y-1900] & 0x10000)? 30: 29);
	   else return(0);
	}
	
	//==== 传回农历 y年闰哪个月 1-12 , 没闰传回 0
	function leapMonth(y) { return(lunarInfo[y-1900] & 0xf)}
	
	//====================================== 传回农历 y年m月的总天数
	function monthDays(y,m) { 
		return( (lunarInfo[y-1900] & (0x10000>>m))? 30: 29 );
	}

	//==== 算出农历, 传入日期物件, 传回农历日期物件
	//     该物件属性有 .year .month .day .isLeap .yearCyl .dayCyl .monCyl
	function Lunar(objDate) {
	   var i, leap=0, temp=0;
	   var baseDate = new Date(1900,0,31);
	   var offset   = (objDate - baseDate)/86400000;
	
	   this.dayCyl = offset + 40;
	   this.monCyl = 14;
	
	   for(i=1900; i<2050 && offset>0; i++) {
		  temp = lYearDays(i);
		  offset -= temp;
		  this.monCyl += 12;
	   }
	   if(offset<0) {
		  offset += temp;
		  i--;
		  this.monCyl -= 12;
	   }
	
	   this.year = i;
	   this.yearCyl = i-1864;
	
	   leap = leapMonth(i) //闰哪个月
	   this.isLeap = false;
	   for(i=1; i<13 && offset>0; i++) {
		  //闰月
		  if(leap>0 && i==(leap+1) && this.isLeap==false){ 
		  	  --i; 
			  this.isLeap = true; 
			  temp = leapDays(this.year); 
		  }
		  else{ 
		  	  temp = monthDays(this.year, i); 
		  }
	
		  //解除闰月
		  if(this.isLeap==true && i==(leap+1)){
			  this.isLeap = false;
		  }
		  offset -= temp;
		  if(this.isLeap == false) {
			  this.monCyl ++;
		  }
	   }
	   if(offset==0 && leap>0 && i==leap+1){
		  if(this.isLeap){
			  this.isLeap = false; 
		  }
		  else{ 
		  	  this.isLeap = true; 
			  --i; 
			  --this.monCyl;
		  }
	   }
	   if(offset<0){ 
	   		offset += temp; 
			--i; 
			--this.monCyl; 
	   }
	   this.month = i
	   this.day = offset + 1
	}
	
	//==== 中文日期
	function cDay(m,d){
		var nStr1 = new Array('日','一','二','三','四','五','六','七','八','九','十');
	 	var nStr2 = new Array('初','十','廿','卅','　');
	 	var s;
		if (m>10){s = '十'+nStr1[m-10]} else {s = nStr1[m]} s += '月'
		switch (d) {
	  		case 10:s += '初十'; break;
	  		case 20:s += '二十'; break;
	  		case 30:s += '三十'; break;
	  		default:s += nStr2[Math.floor(d/10)]; s += nStr1[d%10];
	 	}
	 	return(s);
	}
	function solarDay1(){
    	var sDObj = new Date(SY,SM,SD);
    	var lDObj = new Lunar(sDObj);
    	var cl = '<font color="violet" STYLE="font-size:8pt;">'; 
    	var tt = '【'+Animals[(SY-4)%12]+'】'+cyclical(lDObj.monCyl)+'月'+cyclical(lDObj.dayCyl++)+'日' ;
    	return(cl+tt+'</font>');
 	}
 	function solarDay2(){
    	var sDObj = new Date(SY,SM,SD);
    	var lDObj = new Lunar(sDObj);
    	return lDObj.year + '年'+cDay(lDObj.month,lDObj.day);
 	}
 	function solarDay3(){
		var sTermInfo = new Array(
			0,21208,42467,63836,85337,107014,128867,150921,173149,195551,
			218072,240693,263343,285989,308563,331033,353350,375494,397447,
			419210,440795,462224,483532,504758);
		var solarTerm = new Array(
			"小寒","大寒","立春","雨水","惊蛰","春分","清明","谷雨",
			"立夏","小满","芒种","夏至","小暑","大暑","立秋","处暑",
			"白露","秋分","寒露","霜降","立冬","小雪","大雪","冬至");
		var lFtv = new Array(
			"0101*春节","0115 元宵节","0505 端午节","0707 七夕情人节",
			"0715 中元节 老婆又长了一岁","0804 控件开发人的生日","0815 中秋节",
			"0909 重阳节","1208 腊八节","1224 小年","0100*除夕");
		var sFtv = new Array(
			"0101*元旦","0214 情人节","0308 妇女节","0312 植树节","0315 消费者权益日",
			"0401 愚人节","0501 劳动节","0504 青年节","0512 护士节","0601 儿童节",
			"0701 建党节 香港回归纪念","0801 建军节","0808 父亲节",
			"0909 毛泽东逝世纪念","0910 教师节","0928 孔子诞辰","1001*国庆节","1006 老人节",
			"1024 联合国日","1112 孙中山诞辰","1220 澳门回归纪念","1225 圣诞节","1226 毛泽东诞辰");
		var sDObj = new Date(SY,SM,SD);
  		var lDObj = new Lunar(sDObj);
		var lDPOS = new Array(3);
		var festival='',solarTerms='',solarFestival='',lunarFestival='',tmp1,tmp2;
  		//农历节日 
  		for(i in lFtv)
  		if(lFtv[i].match(/^(\d{2})(.{2})([\s\*])(.+)$/)) {
		   	tmp1=Number(RegExp.$1)-lDObj.month;
		   	tmp2=Number(RegExp.$2)-lDObj.day;
		   	if(tmp1==0 && tmp2==0){
			   lunarFestival=RegExp.$4 
			};
  		}
  		//国历节日
  		for(i in sFtv)
  		if(sFtv[i].match(/^(\d{2})(\d{2})([\s\*])(.+)$/)){
   			tmp1=Number(RegExp.$1)-(SM+1);
   			tmp2=Number(RegExp.$2)-SD;
   			if(tmp1==0 && tmp2==0) {
				solarFestival = RegExp.$4 ;
			}
  		}
  		//节气
  		tmp1 = new Date((31556925974.7*(SY-1900)+sTermInfo[SM*2+1]*60000)+Date.UTC(1900,0,6,2,5));
  		tmp2 = tmp1.getUTCDate();
  		if (tmp2==SD) {
			solarTerms = solarTerm[SM*2+1] ;
		}
  		tmp1 = new Date((31556925974.7*(SY-1900)+sTermInfo[SM*2]*60000)+Date.UTC(1900,0,6,2,5));
  		tmp2= tmp1.getUTCDate();
  		if (tmp2==SD) {
			solarTerms = solarTerm[SM*2] ;
		}
		if(solarTerms!=''){
			festival+=" "+solarTerms;
		}
		if(solarFestival!=''){
			festival+=" "+solarFestival;
		}
		if(lunarFestival!=''){
			festival+=" "+lunarFestival;
		}
  		return festival;
 	}
 	return solarDay2()+solarDay3();
}