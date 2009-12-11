/**
 *******************************************************************************
 * ILoftInfoDAO.java
 * com.zuxia.buildingsale.house.dao
 * (c) Copyright 2009 
 *	2009-12-11
 *＜所属工程名＞
 *  Buildingsale
 *＜功能概要＞
 *  XXX
 *＜作者＞
 *  zcq100 chaojun
 *******************************************************************************
 */
package com.zuxia.buildingsale.house.dao;

import java.util.List;

import com.zuxia.buildingsale.common.IBaseCRUD;
import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.house.entity.LoftInfo;

/**
 * ILoftInfoDAO概要说明
 * 
 * 
 * @author zcq100 chaojun
 */
public interface ILoftInfoDAO extends IBaseCRUD<LoftInfo> {

	/**
	 * findByComtyType方法概述 根据物业类型查询
	 * 
	 * 
	 * @param page
	 *            分页信息
	 * @param loftComtyType
	 *            物业类型
	 * @return List
	 */
	public List<LoftInfo> findByComtyType(Page page, int loftComtyType);

	/**
	 * findByBuildType方法概述 根据建筑类型查询楼盘
	 * 
	 * 
	 * @param page
	 *            分页信息
	 * @param loftBuildType
	 *            楼盘类型
	 * @return List
	 */
	public List<LoftInfo> findByBuildType(Page page, int loftBuildType);

	/**
	 * findAll方法概述 查询所有楼盘信息
	 * 
	 *
	 * @param page  分页信息
	 * @return List
	 */
	public List<LoftInfo> findAll(Page page);
}
