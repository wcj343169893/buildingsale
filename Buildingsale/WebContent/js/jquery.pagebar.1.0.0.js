/// <reference path="jquery.js"/>
/*
* jpagebar
* version: 1.0.0 (01/12/2009)
* @ jQuery v1.3.*
*
* 
* usage as:
*     $.fn.jpagebar({ 
*				//pagebar ����div
*               renderTo: $("#pagebarDiv2"),               
*               //��ҳ��
*				totalpage: 10,
*				//��ǰҳ��
*				currentPage: 1,
*				//��ҳ����ʽ
*				pagebarCssName: 'pagebar',	
*				//ҳ����ʽ
*				pageNumberCssName:'page_number',
*				//��ҳ����һҳ����һҳ��βҳ��ʽ
*				pageNameCssName:'pageName',
*				//ѡ����ҳ����һҳ����һҳ��βҳ��ʽ
*				currentPageNameCssName:'current_pageName',
*				//��ǰѡ��ҳ����ʽ
*				currentPageNumberCssName:'current_page_number',
*				//��ʾ��ҳ����ʽ
*				totalpageNumberCssName:'totalpage_number',	
*				//���ҳ��action
*				onClickPage : function(pageIndex){
*								//���¶���jpagebar����ʾ
*								$.fn.setCurrentPage(this,pageIndex);
*								//�û���������������
*								//...
*							}
*	});     
* Copyright 2009 LYM [ lym6520@qq.com ] 
*/
(function($) {
    $.extend($.fn, {        
        jpagebar: function(setting) {
            var pb = $.extend({
                //pagebar ����div
                renderTo: $(document.body),               
                //��ҳ��
				totalpage: 0,
				//��ǰҳ��
				currentPage: 0,
				//��ҳ����ʽ
				pagebarCssName: 'pagebar',	
				//ҳ����ʽ
				pageNumberCssName:'page_number',	
				//��ҳ����һҳ����һҳ��βҳ��ʽ
				pageNameCssName:'pageName',
				//ѡ����ҳ����һҳ����һҳ��βҳ��ʽ
				currentPageNameCssName:'current_pageName',
				//��ǰѡ��ҳ����ʽ
				currentPageNumberCssName:'current_page_number',
				//��ʾ��ҳ����ʽ
				totalpageNumberCssName:'totalpage_number',	
				//���ҳ��action
				onClickPage : function(pageIndex){
									
								}
            }, setting);
			
				
			pb.resetPagebar = function(){	
				var _this = this;
				_this.renderTo = (typeof _this.renderTo == 'string' ? $(_this.renderTo) : _this.renderTo);

				/* ---------->
				html :
				<div> ---->pagebar
					<a>��ҳ</a>
					<a>��һҳ</a>
					<a>&nbsp;</a>...    ----> ��ʾҳ��
					<a>��һҳ</a>
					<a>βҳ</a>
					<span class="show_page_detail">			---->��ʾ��Ϣ      
						<span class="current_page">currentpage</span>  ----> ��ʾ��ǰҳ��
						<span>/</span> 
						<span class="total_page">totalpage</span>		----> ��ʾ��ҳ��
					</span>	       
				</div>
				<-----------*/
				var pagebar = _this.renderTo;
				pagebar.attr('class',_this.pagebarCssName);

				//��շ�ҳ������   
				pagebar.empty();

				if(totalpage = 0){				
					return ;
				}
				// ��ҳ   
				var front_block = parseInt(_this.currentPage) - 5;// ��ǰҳ��ǰ��һ��   
				var back_block = parseInt(_this.currentPage) + 5;// ��ǰҳ�����һ��   
				
				//������ҳ����һҳ
				if(_this.currentPage == 1 ){
					//��ǰҳΪ��һҳ
					$('<a>��ҳ</a> ').attr('class',_this.pageNameCssName + ' ' + _this.currentPageNameCssName)
						  .appendTo(pagebar);
					$('<a>��һҳ</a> ').attr('class',_this.pageNameCssName + ' ' + _this.currentPageNameCssName)
						 .appendTo(pagebar);
				
				}else{
					//��ǰҳ���ڵ�һҳ
					$('<a>��ҳ</a> ').attr('class',_this.pageNameCssName)
						  .bind("click", function(){										  
											  _this.onClickPage(1);
											})
							.appendTo(pagebar);
					$('<a>��һҳ</a> ').attr('class',_this.pageNameCssName)
						 .bind("click", function(){										 
											  _this.onClickPage(_this.currentPage-1);
											})
							.appendTo(pagebar);
				}

				//��������ҳ��
				
				if(_this.totalpage == 1){
					//��1ҳ
					$('<a>1</a> ').attr('class',_this.currentPageNumberCssName)
						  .bind("click", function(){										  
											 _this.onClickPage(1);
											})
							.appendTo(_this.renderTo);
					
				}else{
					//�ж�ҳ
					var tempBack_block = _this.totalpage;   
					var tempFront_block = 1;   
					if (back_block < _this.totalpage)   
						tempBack_block = back_block;   
					if (front_block > 1)   
						tempFront_block = front_block;  
					
					for (var i = tempFront_block; i <= tempBack_block; i++) {  					
						if (_this.currentPage == i) { 	
							//��ǰҳ
							$('<a>'+i+'</a> ').attr('class',_this.pageNumberCssName + ' ' + _this.currentPageNumberCssName)
								.appendTo(pagebar);
						} else {   
							 $('<a>'+i+'</a> ').attr('class',_this.pageNumberCssName)
								 .bind("click", function(){										
											  _this.onClickPage(this.innerHTML);
											}).appendTo(pagebar);
							
						}   
					} 			
				}

				 // ��һҳ, βҳ  ����
				if (_this.currentPage == _this.totalpage) {  
					//��ǰҳΪ���һҳ
					$('<a>��һҳ</a> ').attr('class',_this.pageNameCssName + ' ' + _this.currentPageNameCssName)
						  .appendTo(pagebar);
					$('<a>βҳ</a> ').attr('class',_this.pageNameCssName + ' ' + _this.currentPageNameCssName)
						 .appendTo(pagebar);
				} else {   
					$('<a>��һҳ</a> ').attr('class',_this.pageNameCssName)
								.bind("click", function(){										  
											  _this.onClickPage(parseInt(_this.currentPage)+1);
							})
						  .appendTo(pagebar);
					$('<a>βҳ</a> ').attr('class',_this.pageNameCssName)
								.bind("click", function(){										  
											  _this.onClickPage(_this.totalpage);
							})
						.appendTo(pagebar);  
				}  
				

				// ��ɫ������ʾ��ǰҳ   
				$('<span>'+_this.currentPage+'</span> ').attr('class',_this.currentPageNumberCssName)
					 .appendTo(pagebar); 
				$('<span>/</span>').appendTo(pagebar); 
				$('<span>'+_this.totalpage+'</span> ').attr('class',_this.totalpageNumberCssName)
				  .appendTo(pagebar); 

				//pagebar.find("a").attr('class',_this.pageNumberCssName);
			}
			pb.resetPagebar();
        },
		setCurrentPage:function(_this,currentPage){			
			_this.currentPage = currentPage;
			_this.resetPagebar(_this);
		}
       
    });
})(jQuery);