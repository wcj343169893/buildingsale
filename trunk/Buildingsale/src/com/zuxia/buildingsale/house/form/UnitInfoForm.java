/**
 *******************************************************************************
 * filename    : UnitInfoForm.java
 * package     : com.zuxia.buildingsale.house.form
 * createdate  : 2009-12-13 ����11:01:58
 * project     : Buildingsale
 * @version    : 1.0
 * @author     : chaojun
 * (c) Copyright 2009 
 *	�����ܸ�Ҫ��
 *  XXX
 *******************************************************************************
 */
package com.zuxia.buildingsale.house.form;

import java.util.ArrayList;
import java.util.List;

/**
 * UnitInfoForm��Ҫ˵��
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
	 * loftId���Ե�get����
	 * 
	 * @return the loftId
	 */
	public int getLoftId() {
		return loftId;
	}

	/**
	 * loftId���Ե�set����
	 * 
	 * @param loftId
	 *            the loftId to set
	 */
	public void setLoftId(int loftId) {
		this.loftId = loftId;
	}

	/**
	 * unitNo���Ե�get����
	 * 
	 * @return the unitNo
	 */
	public String getUnitNo() {
		return unitNo;
	}

	/**
	 * unitNo���Ե�set����
	 * 
	 * @param unitNo
	 *            the unitNo to set
	 */
	public void setUnitNo(String unitNo) {
		this.unitNo = unitNo;
	}

	/**
	 * unitName���Ե�get����
	 * 
	 * @return the unitName
	 */
	public String getUnitName() {
		return unitName;
	}

	/**
	 * unitName���Ե�set����
	 * 
	 * @param unitName
	 *            the unitName to set
	 */
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	/**
	 * houseNumber���Ե�get����
	 * 
	 * @return the houseNumber
	 */
	public int getHouseNumber() {
		return houseNumber;
	}

	/**
	 * houseNumber���Ե�set����
	 * 
	 * @param houseNumber
	 *            the houseNumber to set
	 */
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	/**
	 * floorNumber���Ե�get����
	 * 
	 * @return the floorNumber
	 */
	public int getFloorNumber() {
		return floorNumber;
	}

	/**
	 * floorNumber���Ե�set����
	 * 
	 * @param floorNumber
	 *            the floorNumber to set
	 */
	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}

	/**
	 * term���Ե�get����
	 * 
	 * @return the term
	 */
	public int getTerm() {
		return term;
	}

	/**
	 * term���Ե�set����
	 * 
	 * @param term
	 *            the term to set
	 */
	public void setTerm(int term) {
		this.term = term;
	}

	/**
	 * hif���Ե�get����
	 * 
	 * @return the hif
	 */
	public List<HouseInfoForm> getHif() {
		return hif;
	}

	/**
	 * hif���Ե�set����
	 * 
	 * @param hif
	 *            the hif to set
	 */
	public void setHif(List<HouseInfoForm> hif) {
		this.hif = hif;
	}

}
