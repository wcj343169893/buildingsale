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
import com.zuxia.buildingsale.house.entity.HouseInfo;

/**
 * IHouseInfoDAO概要说明
 * 
 *
 * @author zcq100 chaojun
 */
public interface IHouseInfoDAO extends IBaseCRUD<HouseInfo> {
	
	/**
	 * findHouseInfoByUnitId方法概述 根据单元查询房屋
	 * 
	 *
	 * @param page 分页信息
	 * @param unitId 单元id
	 * @return List<HouseInfo> 
	 */
	public List<HouseInfo> findHouseInfoByUnit(Page page,int unitId);
	/**
	 * findHouseInfoByHouseTypeCd方法概述 根据房屋类型查询房屋
	 * 
	 *
	 * @param page 分页信息
	 * @param houseType 房屋类型
	 * @return List
	 */
	public List<HouseInfo> findHouseInfoByType(Page page,int houseType);
	/**
	 * findHouseInfoByDataDict方法概述 根据房屋状态类型查询
	 * 
	 *
	 * @param page 分页信息
	 * @param houseType 房屋状态
	 * @return List
	 */
	public List<HouseInfo> findHouseInfoByState(Page page ,int houseType);
}
