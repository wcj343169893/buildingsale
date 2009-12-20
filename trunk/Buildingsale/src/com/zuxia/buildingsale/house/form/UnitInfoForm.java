/**
 *******************************************************************************
 * filename    : UnitInfoForm.java
 * package     : com.zuxia.buildingsale.house.form
 * createdate  : 2009-12-13 下午11:01:58
 * project     : Buildingsale
 * @version    : 1.0
 * @author     : chaojun
 * (c) Copyright 2009 
 *	＜功能概要＞
 *  XXX
 *******************************************************************************
 */
package com.zuxia.buildingsale.house.form;

import java.util.ArrayList;
import java.util.List;

/**
 * UnitInfoForm概要说明
 * 
 * 
 * @author chaojun
 */
public class UnitInfoForm {
	private int loftId;
	private String unitNo;
	private String unitName;
	private int houseNumber;
	private int floorNumber;
	private int term;
	private List<HouseInfoForm> hif;

	/**
	 * loftId属性的get方法
	 * 
	 * @return the loftId
	 */
	public int getLoftId() {
		return loftId;
	}

	/**
	 * loftId属性的set方法
	 * 
	 * @param loftId
	 *            the loftId to set
	 */
	public void setLoftId(int loftId) {
		this.loftId = loftId;
	}

	/**
	 * unitNo属性的get方法
	 * 
	 * @return the unitNo
	 */
	public String getUnitNo() {
		return unitNo;
	}

	/**
	 * unitNo属性的set方法
	 * 
	 * @param unitNo
	 *            the unitNo to set
	 */
	public void setUnitNo(String unitNo) {
		this.unitNo = unitNo;
	}

	/**
	 * unitName属性的get方法
	 * 
	 * @return the unitName
	 */
	public String getUnitName() {
		return unitName;
	}

	/**
	 * unitName属性的set方法
	 * 
	 * @param unitName
	 *            the unitName to set
	 */
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	/**
	 * houseNumber属性的get方法
	 * 
	 * @return the houseNumber
	 */
	public int getHouseNumber() {
		return houseNumber;
	}

	/**
	 * houseNumber属性的set方法
	 * 
	 * @param houseNumber
	 *            the houseNumber to set
	 */
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	/**
	 * floorNumber属性的get方法
	 * 
	 * @return the floorNumber
	 */
	public int getFloorNumber() {
		return floorNumber;
	}

	/**
	 * floorNumber属性的set方法
	 * 
	 * @param floorNumber
	 *            the floorNumber to set
	 */
	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}

	/**
	 * term属性的get方法
	 * 
	 * @return the term
	 */
	public int getTerm() {
		return term;
	}

	/**
	 * term属性的set方法
	 * 
	 * @param term
	 *            the term to set
	 */
	public void setTerm(int term) {
		this.term = term;
	}

	/**
	 * hif属性的get方法
	 * 
	 * @return the hif
	 */
	public List<HouseInfoForm> getHif() {
		return hif;
	}

	/**
	 * hif属性的set方法
	 * 
	 * @param hif
	 *            the hif to set
	 */
	public void setHif(List<HouseInfoForm> hif) {
		this.hif = hif;
	}

}
