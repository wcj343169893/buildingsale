/**
 *******************************************************************************
 * IHouseInfoDAO.java
 * com.zuxia.buildingsale.house.dao
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
package com.zuxia.buildingsale.house.dao;

import java.util.List;

import com.zuxia.buildingsale.common.IBaseCRUD;
import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.house.entity.ShopInfo;

public interface IShopInfoDAO extends IBaseCRUD<ShopInfo> {
	/**
	 * findAll方法概述 查询所有的售楼部
	 * 
	 *
	 * @param page 分页信息
	 * @return List
	 */
	public List<ShopInfo> findAll(Page page);
}
