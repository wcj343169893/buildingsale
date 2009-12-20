/**
 *******************************************************************************
 * UnitInfoServiceImpl.java
 * com.zuxia.buildingsale.house.service.impl
 * (c) Copyright 2009 
 *	2009-12-12
 *��������������
 *  Buildingsale
 *�����ܸ�Ҫ��
 *  XXX
 *�����ߣ�
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
 * UnitInfoServiceImpl��Ҫ˵��
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
		unitInfo.setUnitNo(unitInfoForm.getUnitNo());//��Ԫ���
		unitInfo.setUnitName(unitInfoForm.getUnitName());//��Ԫ����
		unitInfo.setLoftInfo(loftInfoDAO.findByid(unitInfoForm.getLoftId()));//¥��
		unitInfo.setUnitFloorNumber(unitInfoForm.getFloorNumber());//¥����
		unitInfo.setUnitTerm(unitInfoForm.getTerm());//�����ں�
		unitInfo.setUnitHouseNumber(unitInfoForm.getHouseNumber());//ÿ��¥�ķ�������

		List<HouseInfoForm> houseInfoForms = unitInfoForm.getHif();//ÿ�׷�����Ϣ/��
		DataDict dataDict = dataDictDAO.findByDictType(5).get(0);// ����Ϊδ��
		if(unitInfoDAO.save(unitInfo)>0){// ���浥Ԫ��Ϣ
			for (int i = 1; i <= unitInfoForm.getFloorNumber(); i++) {// ѭ��¥��
				for (HouseInfoForm houseInfoForm : houseInfoForms) {// ѭ��ÿ��
					HouseInfo houseInfo = new HouseInfo();// �·���
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
	 *���ݵ�Ԫid��ѯ��Ԫ
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
	 * unitInfoDAO���Ե�get����
	 * 
	 * @return the unitInfoDAO
	 */
	public IUnitInfoDAO getUnitInfoDAO() {
		return unitInfoDAO;
	}

	/**
	 * unitInfoDAO���Ե�set����
	 * 
	 * @param unitInfoDAO
	 *            the unitInfoDAO to set
	 */
	public void setUnitInfoDAO(IUnitInfoDAO unitInfoDAO) {
		this.unitInfoDAO = unitInfoDAO;
	}

	/**
	 * dataDictDAO���Ե�get����
	 * 
	 * @return the dataDictDAO
	 */
	public IDataDictDAO getDataDictDAO() {
		return dataDictDAO;
	}

	/**
	 * dataDictDAO���Ե�set����
	 * 
	 * @param dataDictDAO
	 *            the dataDictDAO to set
	 */
	public void setDataDictDAO(IDataDictDAO dataDictDAO) {
		this.dataDictDAO = dataDictDAO;
	}

	/**
	 * houseTypeDAO���Ե�get����
	 * 
	 * @return the houseTypeDAO
	 */
	public IHouseTypeDAO getHouseTypeDAO() {
		return houseTypeDAO;
	}

	/**
	 * houseTypeDAO���Ե�set����
	 * 
	 * @param houseTypeDAO
	 *            the houseTypeDAO to set
	 */
	public void setHouseTypeDAO(IHouseTypeDAO houseTypeDAO) {
		this.houseTypeDAO = houseTypeDAO;
	}

	/**
	 * loftInfoDAO���Ե�get����
	 * 
	 * @return the loftInfoDAO
	 */
	public ILoftInfoDAO getLoftInfoDAO() {
		return loftInfoDAO;
	}

	/**
	 * loftInfoDAO���Ե�set����
	 * 
	 * @param loftInfoDAO
	 *            the loftInfoDAO to set
	 */
	public void setLoftInfoDAO(ILoftInfoDAO loftInfoDAO) {
		this.loftInfoDAO = loftInfoDAO;
	}

	/**
	 * houseInfoDAO���Ե�get����
	 * 
	 * @return the houseInfoDAO
	 */
	public IHouseInfoDAO getHouseInfoDAO() {
		return houseInfoDAO;
	}

	/**
	 * houseInfoDAO���Ե�set����
	 * 
	 * @param houseInfoDAO
	 *            the houseInfoDAO to set
	 */
	public void setHouseInfoDAO(IHouseInfoDAO houseInfoDAO) {
		this.houseInfoDAO = houseInfoDAO;
	}

}
