/**
 *******************************************************************************
 * filename    : MenuInfoServiceImpl.java
 * package     : com.zuxia.buildingsale.sys.service.impl
 * createdate  : 2009-12-13 下午06:21:30
 * project     : Buildingsale
 * @version    : 1.0
 * @author     : zcq100
 * (c) Copyright 2009 
 *	＜功能概要＞
 *  XXX
 *******************************************************************************
 */
package com.zuxia.buildingsale.sys.service.impl;

import java.util.ArrayList;
import java.util.List;
import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.sys.dao.IMenuInfoDao;
import com.zuxia.buildingsale.sys.dto.MenuDto;
import com.zuxia.buildingsale.sys.entity.MenuInfo;
import com.zuxia.buildingsale.sys.service.IMenuInfoService;

/**
 * MenuInfoServiceImpl概要说明
 * 
 *
 * @author zcq100
 */
public class MenuInfoServiceImpl implements IMenuInfoService {
	private IMenuInfoDao menuinfodao;

	
	@Override
	public boolean addMenu(MenuInfo menu) {
		return menuinfodao.save(menu)==1?true:false;
	}

	@Override
	public boolean deleteMenu(int id) {
		MenuInfo menu=menuinfodao.findByid(id);
		return menuinfodao.delete(menu)==1?true:false;
	}


	@Override
	public List<MenuDto> findMenus() {
		List<MenuDto> menedto=new ArrayList<MenuDto>();
		List<MenuInfo> list=menuinfodao.findAll();
		for(MenuInfo mi:list){
			List<MenuInfo> items=menuinfodao.findByMenuInfoParent(mi.getMenuNo());
			if(items.size()>0){
				MenuDto dto=new MenuDto();
				dto.setLevel1(mi);
				dto.setLevel2(items);
				menedto.add(dto);
			}
		}
		return menedto;
	}


	@Override
	public List<MenuInfo> findMenus(Page page) {
		return menuinfodao.findAll(page);
	}

	public IMenuInfoDao getMenuinfodao() {
		return menuinfodao;
	}

	public void setMenuinfodao(IMenuInfoDao menuinfodao) {
		this.menuinfodao = menuinfodao;
	}
	

}
