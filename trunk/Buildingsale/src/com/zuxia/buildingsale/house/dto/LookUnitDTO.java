/**
 *******************************************************************************
 * filename    : LookUnitDTO.java
 * package     : com.zuxia.buildingsale.house.dto
 * createdate  : 2009-12-19 ����10:27:36
 * project     : Buildingsale
 * @version    : 1.0
 * @author     : chaojun
 * (c) Copyright 2009 
 *	�����ܸ�Ҫ��
 *  XXX
 *******************************************************************************
 */
package com.zuxia.buildingsale.house.dto;

import java.util.List;

import com.zuxia.buildingsale.business.entity.DataDict;
import com.zuxia.buildingsale.house.entity.HouseInfo;
import com.zuxia.buildingsale.house.entity.LoftInfo;
import com.zuxia.buildingsale.house.entity.UnitInfo;

/**
 * LookUnitDTO��Ҫ˵��
 * 
 * 
 * @author chaojun
 */
public class LookUnitDTO {
	/**
	 * loftInfo���Ը��� ¥����Ϣ
	 * 
	 */
	private LoftInfo loftInfo;
	/**
	 * unitInfo���Ը��� ��Ԫ��Ϣ
	 * 
	 */
	private UnitInfo unitInfo;
	/**
	 * houseInfos���Ը��� ������Ϣ
	 * 
	 */
	private List<HouseInfo> houseInfos;
	/**
	 * dataDicts���Ը��� ����״̬����
	 * 
	 */
	private List<DataDict> dataDicts;

	/**
	 * loftInfo���Ե�get����
	 * 
	 * @return the loftInfo
	 */
	public LoftInfo getLoftInfo() {
		return loftInfo;
	}

	/**
	 * loftInfo���Ե�set����
	 * 
	 * @param loftInfo
	 *            the loftInfo to set
	 */
	public void setLoftInfo(LoftInfo loftInfo) {
		this.loftInfo = loftInfo;
	}

	/**
	 * unitInfo���Ե�get����
	 * 
	 * @return the unitInfo
	 */
	public UnitInfo getUnitInfo() {
		return unitInfo;
	}

	/**
	 * unitInfo���Ե�set����
	 * 
	 * @param unitInfo
	 *            the unitInfo to set
	 */
	public void setUnitInfo(UnitInfo unitInfo) {
		this.unitInfo = unitInfo;
	}

	/**
	 * houseInfos���Ե�get����
	 * 
	 * @return the houseInfos
	 */
	public List<HouseInfo> getHouseInfos() {
		return houseInfos;
	}

	/**
	 * houseInfos���Ե�set����
	 * 
	 * @param houseInfos
	 *            the houseInfos to set
	 */
	public void setHouseInfos(List<HouseInfo> houseInfos) {
		this.houseInfos = houseInfos;
	}

	/**
	 * dataDicts���Ե�get����
	 * 
	 * @return the dataDicts
	 */
	public List<DataDict> getDataDicts() {
		return dataDicts;
	}

	/**
	 * dataDicts���Ե�set����
	 * 
	 * @param dataDicts
	 *            the dataDicts to set
	 */
	public void setDataDicts(List<DataDict> dataDicts) {
		this.dataDicts = dataDicts;
	}

}
