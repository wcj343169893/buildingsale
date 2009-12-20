/**
 *******************************************************************************
 * filename    : NewHouseInfoForm.java
 * package     : com.zuxia.buildingsale.house.form
 * createdate  : 2009-12-13 下午11:00:32
 * project     : Buildingsale
 * @version    : 1.0
 * @author     : chaojun
 * (c) Copyright 2009 
 *	＜功能概要＞
 *  XXX
 *******************************************************************************
 */
package com.zuxia.buildingsale.house.form;

/**
 * NewHouseInfoForm概要说明
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
	 * number属性的get方法
	 * 
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * number属性的set方法
	 * 
	 * @param number
	 *            the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * houseTypeId属性的get方法
	 * 
	 * @return the houseTypeId
	 */
	public int getHouseTypeId() {
		return houseTypeId;
	}

	/**
	 * houseTypeId属性的set方法
	 * 
	 * @param houseTypeId
	 *            the houseTypeId to set
	 */
	public void setHouseTypeId(int houseTypeId) {
		this.houseTypeId = houseTypeId;
	}

	/**
	 * buildArea属性的get方法
	 * 
	 * @return the buildArea
	 */
	public double getBuildArea() {
		return buildArea;
	}

	/**
	 * buildArea属性的set方法
	 * 
	 * @param buildArea
	 *            the buildArea to set
	 */
	public void setBuildArea(double buildArea) {
		this.buildArea = buildArea;
	}

	/**
	 * buildPrice属性的get方法
	 * 
	 * @return the buildPrice
	 */
	public double getBuildPrice() {
		return buildPrice;
	}

	/**
	 * buildPrice属性的set方法
	 * 
	 * @param buildPrice
	 *            the buildPrice to set
	 */
	public void setBuildPrice(double buildPrice) {
		this.buildPrice = buildPrice;
	}

	/**
	 * useArea属性的get方法
	 * 
	 * @return the useArea
	 */
	public double getUseArea() {
		return useArea;
	}

	/**
	 * useArea属性的set方法
	 * 
	 * @param useArea
	 *            the useArea to set
	 */
	public void setUseArea(double useArea) {
		this.useArea = useArea;
	}

	/**
	 * usePrice属性的get方法
	 * 
	 * @return the usePrice
	 */
	public double getUsePrice() {
		return usePrice;
	}

	/**
	 * usePrice属性的set方法
	 * 
	 * @param usePrice
	 *            the usePrice to set
	 */
	public void setUsePrice(double usePrice) {
		this.usePrice = usePrice;
	}

}
