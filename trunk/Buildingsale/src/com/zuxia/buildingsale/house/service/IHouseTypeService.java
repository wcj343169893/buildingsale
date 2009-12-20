/**
 *******************************************************************************
 * IHouseTypeService.java
 * com.zuxia.buildingsale.house.service
 * (c) Copyright 2009 
 *	2009-12-12
 *＜所属工程名＞
 *  Buildingsale
 *＜功能概要＞
 *  XXX
 *＜作者＞
 *  zcq100 chaojun
 *******************************************************************************
 */
package com.zuxia.buildingsale.house.service;

import java.util.List;

import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.house.entity.HouseType;
import com.zuxia.buildingsale.house.form.HouseTypeForm;
import com.zuxia.buildingsale.sys.entity.Employee;

/**
 * IHouseTypeService概要说明
 * 
 * 
 * @author zcq100 chaojun
 */
public interface IHouseTypeService {
	/**
	 * findAll方法概述 查询所有的房屋类型
	 * 
	 *@param page
	 *            分页信息
	 * @return List
	 */
	public List<HouseType> findAll(Page page);

	public List<HouseType> findAll();

	public int addHouseType(HouseTypeForm houseTypeForm, Employee employee);

	public int deleteHouseType(int houseTypeId);

	public int editHouseType(HouseTypeForm houseTypeForm, Employee employee);
}
