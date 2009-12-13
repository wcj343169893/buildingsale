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

import java.util.List;
import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.sys.dao.IMenuInfoDao;
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
	public int addMenuInfo(MenuInfo menuinfo) {
		return menuinfodao.save(menuinfo);
	}

	@Override
	public int deleteMenuInfoByid(int id) {
		MenuInfo menuinfo=menuinfodao.findByid(id);
		return menuinfodao.delete(menuinfo);
	}

	@Override
	public List<MenuInfo> findAllMenuInfo(Page page) {
		return menuinfodao.findAll(page);
	}

	@Override
	public int updateMenuInfo(MenuInfo menuinfo) {
		return menuinfodao.merge(menuinfo);
	}

	public IMenuInfoDao getMenuinfodao() {
		return menuinfodao;
	}

	public void setMenuinfodao(IMenuInfoDao menuinfodao) {
		this.menuinfodao = menuinfodao;
	}
	
	

}
