/**
 *******************************************************************************
 * UnitInfoServiceImpl.java
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
import com.zuxia.buildingsale.house.dao.IUnitInfoDAO;
import com.zuxia.buildingsale.house.entity.UnitInfo;
import com.zuxia.buildingsale.house.form.UnitInfoForm;
import com.zuxia.buildingsale.house.service.IUnitInfoService;
import com.zuxia.buildingsale.sys.entity.Employee;

/**
 * UnitInfoServiceImpl概要说明
 * 
 * 
 * @author zcq100 chaojun
 */
public class UnitInfoServiceImpl implements IUnitInfoService {
	private IUnitInfoDAO unitInfoDAO;

	/**
	 * unitInfoDAO属性的get方法
	 * 
	 * @return the unitInfoDAO
	 */
	public IUnitInfoDAO getUnitInfoDAO() {
		return unitInfoDAO;
	}

	/**
	 * unitInfoDAO属性的set方法
	 * 
	 * @param unitInfoDAO
	 *            the unitInfoDAO to set
	 */
	public void setUnitInfoDAO(IUnitInfoDAO unitInfoDAO) {
		this.unitInfoDAO = unitInfoDAO;
	}

	@Override
	public int addUnitInfo(UnitInfoForm unitInfoForm, Employee employee) {
		UnitInfo unitInfo = new UnitInfo();
		return 0;
	}

	@Override
	public int deleteUnitInfo(int unitInfoId) {
		UnitInfo unitInfo = unitInfoDAO.findByid(unitInfoId);
		return unitInfoDAO.delete(unitInfo);
	}

	@Override
	public int editUnitInfo(UnitInfoForm unitInfoForm, Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<UnitInfo> findAll(Page page) {
		return unitInfoDAO.findAll(page);
	}

	@Override
	public List<UnitInfo> findByLoft(Page page, int loftId) {
		return unitInfoDAO.findByLoft(page, loftId);
	}

}
