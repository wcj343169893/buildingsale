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

import com.zuxia.buildingsale.business.dao.IDataDictDAO;
import com.zuxia.buildingsale.business.entity.DataDict;
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
	private IDataDictDAO dataDictDAO;

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

	/**
	 * dataDictDAO属性的get方法
	 * 
	 * @return the dataDictDAO
	 */
	public IDataDictDAO getDataDictDAO() {
		return dataDictDAO;
	}

	/**
	 * dataDictDAO属性的set方法
	 * 
	 * @param dataDictDAO
	 *            the dataDictDAO to set
	 */
	public void setDataDictDAO(IDataDictDAO dataDictDAO) {
		this.dataDictDAO = dataDictDAO;
	}

	@Override
	public int addLoftInfo(LoftInfoForm loftInfoForm, Employee employee) {
		LoftInfo loftInfo = new LoftInfo();
		loftInfo.setLoftNo(loftInfoForm.getLoftNo());
		loftInfo.setLoftName(loftInfoForm.getLoftName());
		loftInfo.setLoftBeginTime(loftInfoForm.getBeginTime());
		loftInfo.setLoftShellOutTime(loftInfoForm.getShellOutTime());
		loftInfo.setLoftFinishTime(loftInfoForm.getFinishTime());
		loftInfo.setLoftPrice(loftInfoForm.getPrice());
		loftInfo.setLoftZone(loftInfoForm.getZone());
		loftInfo.setLoftAddress(loftInfoForm.getAddress());
		loftInfo.setLoftFacility(loftInfoForm.getFacility());
		loftInfo.setLoftGreen(loftInfoForm.getGreen());
		loftInfo.setLoftTraffic(loftInfoForm.getTraffic());
		loftInfo.setLoftRemark(loftInfoForm.getRemark());
		loftInfo.setLoftCapacity(loftInfoForm.getCapacity());
		loftInfo.setDataDictByLoftBuildType(dataDictDAO.findByid(loftInfoForm
				.getBuildTypeId()));
		loftInfo.setDataDictByLoftComtyType(dataDictDAO.findByid(loftInfoForm
				.getComptyTypeId()));
		return loftInfoDAO.save(loftInfo);
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

	@Override
	public LoftInfo findById(int loftId) {
		return loftInfoDAO.findByid(loftId);
	}

	@Override
	public List<DataDict> getComtyBuildType() {
		return dataDictDAO.findByDictType(new Page(), 4);
	}

	@Override
	public List<DataDict> getComtyType() {
		return dataDictDAO.findByDictType(new Page(), 3);
	}

}
