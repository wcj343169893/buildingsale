
//显示时间方法
	function showTime(){
 		var myDate = new Date();
  		var year = myDate.getFullYear();   //获取当前年份
  		var month = myDate.getMonth()+1;    //获取当前月份
  		var date = myDate.getDate();     //获取当前日
  		var day = myDate.getDay();    //获取当前星期几
  		var hous = myDate.getHours()+1;   //获取小时数
  		var minutes = myDate.getMinutes()+1;  //获取分钟数
  		var second = myDate.getSeconds()+1;  //获取当前毫秒
  		var m;
  		if(day ==1){
  			m='星期一';
  		}else if(day == 2){
  		    m='星期二';
  		}else if(day == 3){
  		    m='星期三';
  		}else if(day == 4){
  		    m='星期四';
  		}else if(day == 5){
  		    m='星期五';
  		}else if(day == 6){
  		    m='星期六';
  		}else if(day ==7){
  		    m='星期日';
  		}
  		var alldate = '当前时间:'+year+'/'+month+'/'+date+'  '+hous+':'+minutes+':'+second+' '+m;
  		document.getElementById('down_right').innerHTML=alldate;
  		setTimeout('showTime()',1000);
}

