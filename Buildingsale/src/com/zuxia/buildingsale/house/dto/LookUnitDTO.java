/**
 *******************************************************************************
 * filename    : LookUnitDTO.java
 * package     : com.zuxia.buildingsale.house.dto
 * createdate  : 2009-12-19 上午10:27:36
 * project     : Buildingsale
 * @version    : 1.0
 * @author     : chaojun
 * (c) Copyright 2009 
 *	＜功能概要＞
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
 * LookUnitDTO概要说明
 * 
 * 
 * @author chaojun
 */
public class LookUnitDTO {
	/**
	 * loftInfo属性概述 楼盘信息
	 * 
	 */
	private LoftInfo loftInfo;
	/**
	 * unitInfo属性概述 单元信息
	 * 
	 */
	private UnitInfo unitInfo;
	/**
	 * houseInfos属性概述 房屋信息
	 * 
	 */
	private List<HouseInfo> houseInfos;
	/**
	 * dataDicts属性概述 房屋状态类型
	 * 
	 */
	private List<DataDict> dataDicts;

	/**
	 * loftInfo属性的get方法
	 * 
	 * @return the loftInfo
	 */
	public LoftInfo getLoftInfo() {
		return loftInfo;
	}

	/**
	 * loftInfo属性的set方法
	 * 
	 * @param loftInfo
	 *            the loftInfo to set
	 */
	public void setLoftInfo(LoftInfo loftInfo) {
		this.loftInfo = loftInfo;
	}

	/**
	 * unitInfo属性的get方法
	 * 
	 * @return the unitInfo
	 */
	public UnitInfo getUnitInfo() {
		return unitInfo;
	}

	/**
	 * unitInfo属性的set方法
	 * 
	 * @param unitInfo
	 *            the unitInfo to set
	 */
	public void setUnitInfo(UnitInfo unitInfo) {
		this.unitInfo = unitInfo;
	}

	/**
	 * houseInfos属性的get方法
	 * 
	 * @return the houseInfos
	 */
	public List<HouseInfo> getHouseInfos() {
		return houseInfos;
	}

	/**
	 * houseInfos属性的set方法
	 * 
	 * @param houseInfos
	 *            the houseInfos to set
	 */
	public void setHouseInfos(List<HouseInfo> houseInfos) {
		this.houseInfos = houseInfos;
	}

	/**
	 * dataDicts属性的get方法
	 * 
	 * @return the dataDicts
	 */
	public List<DataDict> getDataDicts() {
		return dataDicts;
	}

	/**
	 * dataDicts属性的set方法
	 * 
	 * @param dataDicts
	 *            the dataDicts to set
	 */
	public void setDataDicts(List<DataDict> dataDicts) {
		this.dataDicts = dataDicts;
	}

}
