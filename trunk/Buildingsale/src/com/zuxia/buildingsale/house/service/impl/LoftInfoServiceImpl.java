/**
 *******************************************************************************
 * LoftInfoServiceImpl.java
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
import com.zuxia.buildingsale.house.dao.ILoftInfoDAO;
import com.zuxia.buildingsale.house.entity.LoftInfo;
import com.zuxia.buildingsale.house.form.LoftInfoForm;
import com.zuxia.buildingsale.house.service.ILoftInfoService;
import com.zuxia.buildingsale.sys.entity.Employee;

/**
 * LoftInfoServiceImpl概要说明
 * 
 * 
 * @author zcq100 chaojun
 */
public class LoftInfoServiceImpl implements ILoftInfoService {
	private ILoftInfoDAO loftInfoDAO;

	/**
	 * loftInfoDAO属性的get方法
	 * 
	 * @return the loftInfoDAO
	 */
	public ILoftInfoDAO getLoftInfoDAO() {
		return loftInfoDAO;
	}

	/**
	 * loftInfoDAO属性的set方法
	 * 
	 * @param loftInfoDAO
	 *            the loftInfoDAO to set
	 */
	public void setLoftInfoDAO(ILoftInfoDAO loftInfoDAO) {
		this.loftInfoDAO = loftInfoDAO;
	}

	@Override
	public int addLoftInfo(LoftInfoForm loftInfoForm, Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteLoftInfo(int loftInfoId) {
		return loftInfoDAO.delete(loftInfoDAO.findByid(loftInfoId));
	}

	@Override
	public int editLoftInfo(LoftInfoForm loftInfoForm, Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<LoftInfo> findAll(Page page) {
		return loftInfoDAO.findAll(page);
	}

	@Override
	public List<LoftInfo> findByBuildType(Page page, int loftBuildType) {
		return loftInfoDAO.findByBuildType(page, loftBuildType);
	}

	@Override
	public List<LoftInfo> findByComtyType(Page page, int loftComtyType) {
		return loftInfoDAO.findByComtyType(page, loftComtyType);
	}

}
