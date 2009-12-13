/**
 *******************************************************************************
 * IHouseInfoService.java
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
import com.zuxia.buildingsale.house.entity.HouseInfo;
import com.zuxia.buildingsale.house.form.HouseInfoForm;
import com.zuxia.buildingsale.sys.entity.Employee;

/**
 * IHouseInfoService概要说明
 * 
 * 
 * @author zcq100 chaojun
 */
public interface IHouseInfoService {
	/**
	 * findHouseInfoByUnitId方法概述 根据单元查询房屋
	 * 
	 * 
	 * @param page
	 *            分页信息
	 * @param unitId
	 *            单元id
	 * @return List<HouseInfo>
	 */
	public List<HouseInfo> findByUnit(Page page, int unitId);

	/**
	 * findHouseInfoByHouseTypeCd方法概述 根据房屋类型查询房屋
	 * 
	 * 
	 * @param page
	 *            分页信息
	 * @param houseType
	 *            房屋类型
	 * @return List
	 */
	public List<HouseInfo> findByType(Page page, int houseType);

	/**
	 * findHouseInfoByDataDict方法概述 根据房屋状态类型查询
	 * 
	 * 
	 * @param page
	 *            分页信息
	 * @param houseState
	 *            房屋状态
	 * @return List
	 */
	public List<HouseInfo> findByState(Page page, int houseState);

	/**
	 * findAll方法概述 查询所有房屋
	 * 
	 * 
	 * @param page
	 *            page 分页信息
	 * @return List
	 */
	public List<HouseInfo> findAll(Page page);

	public int addHouseInfo(HouseInfoForm houseInfoForm, Employee employee);

	public int deleteHouseInfo(int houseId);

	public int editHouseInfo(HouseInfoForm houseInfoForm, Employee employee);
}
