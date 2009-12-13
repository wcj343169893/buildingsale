/**
 *******************************************************************************
 * HouseTypeServiceImpl.java
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
import com.zuxia.buildingsale.house.dao.IHouseTypeDAO;
import com.zuxia.buildingsale.house.entity.HouseType;
import com.zuxia.buildingsale.house.form.HouseTypeForm;
import com.zuxia.buildingsale.house.service.IHouseTypeService;
import com.zuxia.buildingsale.sys.entity.Employee;

/**
 * HouseTypeServiceImpl概要说明
 * 
 * 
 * @author zcq100 chaojun
 */
public class HouseTypeServiceImpl implements IHouseTypeService {
	private IHouseTypeDAO houseTypeDAO;

	/**
	 * houseTypeDAO属性的get方法
	 * 
	 * @return the houseTypeDAO
	 */
	public IHouseTypeDAO getHouseTypeDAO() {
		return houseTypeDAO;
	}

	/**
	 * houseTypeDAO属性的set方法
	 * 
	 * @param houseTypeDAO
	 *            the houseTypeDAO to set
	 */
	public void setHouseTypeDAO(IHouseTypeDAO houseTypeDAO) {
		this.houseTypeDAO = houseTypeDAO;
	}

	@Override
	public int addHouseType(HouseTypeForm houseTypeForm, Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteHouseType(int houseTypeId) {
		return houseTypeDAO.delete(houseTypeDAO.findByid(houseTypeId));
	}

	@Override
	public int editHouseType(HouseTypeForm houseTypeForm, Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<HouseType> findAll(Page page) {
		return houseTypeDAO.findAll(page);
	}

}
