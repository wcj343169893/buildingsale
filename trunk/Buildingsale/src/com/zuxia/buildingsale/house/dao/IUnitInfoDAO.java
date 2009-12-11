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
import com.zuxia.buildingsale.house.entity.UnitInfo;

public interface IUnitInfoDAO extends IBaseCRUD<UnitInfo> {
	/**
	 * findByLoft方法概述 查询单元信息
	 * 
	 * 
	 * @param page
	 *            分页信息
	 * @param loftId
	 *            楼盘id
	 * @return List
	 */
	public List<UnitInfo> findByLoft(Page page, int loftId);

	/**
	 * findAll方法概述 查询全部单元信息
	 * 
	 * 
	 * @param page
	 *            分页信息
	 * @return List
	 */
	public List<UnitInfo> findAll(Page page);
}
