/**
 *******************************************************************************
 * filename    : NewHouseInfoForm.java
 * package     : com.zuxia.buildingsale.house.form
 * createdate  : 2009-12-13 ����11:00:32
 * project     : Buildingsale
 * @version    : 1.0
 * @author     : chaojun
 * (c) Copyright 2009 
 *	�����ܸ�Ҫ��
 *  XXX
 *******************************************************************************
 */
package com.zuxia.buildingsale.house.form;

/**
 * NewHouseInfoForm��Ҫ˵��
 * 
 * 
 * @author chaojun
 */
public class HouseInfoForm {
	private String number;
	private int houseTypeId;
	private double buildArea;
	private double buildPrice;
	private double useArea;
	private double usePrice;

	/**
	 * number���Ե�get����
	 * 
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * number���Ե�set����
	 * 
	 * @param number
	 *            the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * houseTypeId���Ե�get����
	 * 
	 * @return the houseTypeId
	 */
	public int getHouseTypeId() {
		return houseTypeId;
	}

	/**
	 * houseTypeId���Ե�set����
	 * 
	 * @param houseTypeId
	 *            the houseTypeId to set
	 */
	public void setHouseTypeId(int houseTypeId) {
		this.houseTypeId = houseTypeId;
	}

	/**
	 * buildArea���Ե�get����
	 * 
	 * @return the buildArea
	 */
	public double getBuildArea() {
		return buildArea;
	}

	/**
	 * buildArea���Ե�set����
	 * 
	 * @param buildArea
	 *            the buildArea to set
	 */
	public void setBuildArea(double buildArea) {
		this.buildArea = buildArea;
	}

	/**
	 * buildPrice���Ե�get����
	 * 
	 * @return the buildPrice
	 */
	public double getBuildPrice() {
		return buildPrice;
	}

	/**
	 * buildPrice���Ե�set����
	 * 
	 * @param buildPrice
	 *            the buildPrice to set
	 */
	public void setBuildPrice(double buildPrice) {
		this.buildPrice = buildPrice;
	}

	/**
	 * useArea���Ե�get����
	 * 
	 * @return the useArea
	 */
	public double getUseArea() {
		return useArea;
	}

	/**
	 * useArea���Ե�set����
	 * 
	 * @param useArea
	 *            the useArea to set
	 */
	public void setUseArea(double useArea) {
		this.useArea = useArea;
	}

	/**
	 * usePrice���Ե�get����
	 * 
	 * @return the usePrice
	 */
	public double getUsePrice() {
		return usePrice;
	}

	/**
	 * usePrice���Ե�set����
	 * 
	 * @param usePrice
	 *            the usePrice to set
	 */
	public void setUsePrice(double usePrice) {
		this.usePrice = usePrice;
	}

}
