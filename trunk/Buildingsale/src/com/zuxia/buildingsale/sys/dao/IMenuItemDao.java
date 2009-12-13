/**
 *******************************************************************************
 * IMenuItemDao.java
 * com.zuxia.buildingsale.sys.dao
 * (c) Copyright 2009 
 *	2009-12-11
 *＜所属工程名＞
 *  Buildingsale
 *＜功能概要＞
 *  XXX
 *＜作者＞
 *  zcq100
 *******************************************************************************
 */
package com.zuxia.buildingsale.sys.dao;

import java.util.List;

import com.zuxia.buildingsale.common.IBaseCRUD;
import com.zuxia.buildingsale.sys.entity.MenuItem;

/**
 * IMenuItemDao概要说明
 * 
 *
 * @author zcq100
 */
public interface IMenuItemDao extends IBaseCRUD<MenuItem> {
	/**
	 * 
	 * findByMenuId方法概述
	 * 根据菜单编号获得页面中的链接
	 * @param id	菜单编号
	 * @return	页面中的链接集合
	 */
	public List<MenuItem> findByMenuId(int id);
}
