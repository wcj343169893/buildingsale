/**
 *******************************************************************************
 * HouseInfoServiceImpl.java
 * com.zuxia.buildingsale.house.service.impl
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
package com.zuxia.buildingsale.house.service.impl;

import java.util.List;

import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.house.dao.IHouseInfoDAO;
import com.zuxia.buildingsale.house.entity.HouseInfo;
import com.zuxia.buildingsale.house.form.HouseInfoForm;
import com.zuxia.buildingsale.house.service.IHouseInfoService;
import com.zuxia.buildingsale.sys.entity.Employee;

/**
 * HouseInfoServiceImpl概要说明
 * 
 * 
 * @author zcq100 chaojun
 */
public class HouseInfoServiceImpl implements IHouseInfoService {
	private IHouseInfoDAO houseInfoDAO;

	/**
	 * houseInfoDAO属性的get方法
	 * 
	 * @return the houseInfoDAO
	 */
	public IHouseInfoDAO getHouseInfoDAO() {
		return houseInfoDAO;
	}

	/**
	 * houseInfoDAO属性的set方法
	 * 
	 * @param houseInfoDAO
	 *            the houseInfoDAO to set
	 */
	public void setHouseInfoDAO(IHouseInfoDAO houseInfoDAO) {
		this.houseInfoDAO = houseInfoDAO;
	}

	@Override
	public int addHouseInfo(HouseInfoForm houseInfoForm, Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteHouseInfo(int houseId) {
		return houseInfoDAO.delete(houseInfoDAO.findByid(houseId));
	}

	@Override
	public int editHouseInfo(HouseInfoForm houseInfoForm, Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<HouseInfo> findAll(Page page) {
		return houseInfoDAO.findAll(page);
	}

	@Override
	public List<HouseInfo> findByState(Page page, int houseState) {
		return houseInfoDAO.findByState(page, houseState);
	}

	@Override
	public List<HouseInfo> findByType(Page page, int houseType) {
		return houseInfoDAO.findByType(page, houseType);
	}

	@Override
	public List<HouseInfo> findByUnit(Page page, int unitId) {
		return houseInfoDAO.findByUnit(page, unitId);
	}

}
