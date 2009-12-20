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

import java.util.ArrayList;
import java.util.List;

import com.zuxia.buildingsale.business.dao.IDataDictDAO;
import com.zuxia.buildingsale.business.entity.DataDict;
import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.house.dao.IHouseInfoDAO;
import com.zuxia.buildingsale.house.dao.IHouseTypeDAO;
import com.zuxia.buildingsale.house.dao.ILoftInfoDAO;
import com.zuxia.buildingsale.house.dao.IUnitInfoDAO;
import com.zuxia.buildingsale.house.dto.LookUnitDTO;
import com.zuxia.buildingsale.house.entity.HouseInfo;
import com.zuxia.buildingsale.house.entity.HouseType;
import com.zuxia.buildingsale.house.entity.UnitInfo;
import com.zuxia.buildingsale.house.form.HouseInfoForm;
import com.zuxia.buildingsale.house.form.UnitInfoForm;
import com.zuxia.buildingsale.house.service.IUnitInfoService;

/**
 * UnitInfoServiceImpl概要说明
 * 
 * 
 * @author zcq100 chaojun
 */
public class UnitInfoServiceImpl implements IUnitInfoService {
	private IUnitInfoDAO unitInfoDAO;
	private IDataDictDAO dataDictDAO;
	private IHouseTypeDAO houseTypeDAO;
	private ILoftInfoDAO loftInfoDAO;
	private IHouseInfoDAO houseInfoDAO;

	@Override
	public int addUnitInfo(UnitInfoForm unitInfoForm) {
		UnitInfo unitInfo = new UnitInfo();
		unitInfo.setUnitNo(unitInfoForm.getUnitNo());//单元编号
		unitInfo.setUnitName(unitInfoForm.getUnitName());//单元名称
		unitInfo.setLoftInfo(loftInfoDAO.findByid(unitInfoForm.getLoftId()));//楼盘
		unitInfo.setUnitFloorNumber(unitInfoForm.getFloorNumber());//楼层数
		unitInfo.setUnitTerm(unitInfoForm.getTerm());//工程期号
		unitInfo.setUnitHouseNumber(unitInfoForm.getHouseNumber());//每层楼的房屋数量

		List<HouseInfoForm> houseInfoForms = unitInfoForm.getHif();//每套房屋信息/层
		DataDict dataDict = dataDictDAO.findByDictType(5).get(0);// 房屋为未售
		if(unitInfoDAO.save(unitInfo)>0){// 保存单元信息
			for (int i = 1; i <= unitInfoForm.getFloorNumber(); i++) {// 循环楼层
				for (HouseInfoForm houseInfoForm : houseInfoForms) {// 循环每层
					HouseInfo houseInfo = new HouseInfo();// 新房屋
					houseInfo.setHouseNo(i + "_" + houseInfoForm.getNumber());
					houseInfo.setHouseFloors(i);
					houseInfo.setUnitInfo(unitInfo);
					houseInfo.setHouseBuildArea(houseInfoForm.getBuildArea());
					houseInfo.setHouseBuildPrice(houseInfoForm.getBuildPrice());
					houseInfo.setHouseUseArea(houseInfoForm.getUseArea());
					houseInfo.setHouseUsePrice(houseInfoForm.getUsePrice());
					HouseType houseType = new HouseType();
					houseType.setHtId(houseInfoForm.getHouseTypeId());
					houseInfo.setHouseType(houseType);
					houseInfo.setDataDict(dataDict);
					houseInfoDAO.save(houseInfo);
				}
			}
		}

		return 1;
	}

	@Override
	public int deleteUnitInfo(int unitInfoId) {
		UnitInfo unitInfo = unitInfoDAO.findByid(unitInfoId);
		return unitInfoDAO.delete(unitInfo);
	}

	@Override
	public int editUnitInfo(UnitInfoForm unitInfoForm) {
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

	/**
	 *根据单元id查询单元
	 */
	@Override
	public UnitInfo findById(int unitId) {
		return unitInfoDAO.findByid(unitId);
	}

	@Override
	public LookUnitDTO findUnitDTO(int unitId) {
		LookUnitDTO lookUnitDTO = new LookUnitDTO();
		UnitInfo unitInfo = findById(unitId);
		lookUnitDTO.setUnitInfo(unitInfo);
		lookUnitDTO.setHouseInfos(unitInfo.getHouseInfos());
		lookUnitDTO.setLoftInfo(unitInfo.getLoftInfo());
		lookUnitDTO.setDataDicts(dataDictDAO.findByDictType(5));
		return lookUnitDTO;
	}

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

}
