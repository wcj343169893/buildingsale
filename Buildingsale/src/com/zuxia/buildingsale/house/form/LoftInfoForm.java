/**
 *******************************************************************************
 * filename    : LoftInfoForm.java
 * package     : com.zuxia.buildingsale.house.form
 * createdate  : 2009-12-13 ����11:01:39
 * project     : Buildingsale
 * @version    : 1.0
 * @author     : chaojun
 * (c) Copyright 2009 
 *	�����ܸ�Ҫ��
 *  XXX
 *******************************************************************************
 */
package com.zuxia.buildingsale.house.form;

import java.util.Date;

/**
 * LoftInfoForm��Ҫ˵��
 * 
 * 
 * @author chaojun
 */
public class LoftInfoForm {
	private String loftNo;
	private String loftName;
	private int comptyTypeId;
	private int buildTypeId;
	private Date beginTime;
	private Date shellOutTime;
	private Date finishTime;
	private double price;
	private String zone;
	private String Address;
	private double capacity;
	private double green;
	private String traffic;
	private String facility;
	private String remark;

	/**
	 * loftNo���Ե�get����
	 * 
	 * @return the loftNo
	 */
	public String getLoftNo() {
		return loftNo;
	}

	/**
	 * loftNo���Ե�set����
	 * 
	 * @param loftNo
	 *            the loftNo to set
	 */
	public void setLoftNo(String loftNo) {
		this.loftNo = loftNo;
	}

	/**
	 * loftName���Ե�get����
	 * 
	 * @return the loftName
	 */
	public String getLoftName() {
		return loftName;
	}

	/**
	 * loftName���Ե�set����
	 * 
	 * @param loftName
	 *            the loftName to set
	 */
	public void setLoftName(String loftName) {
		this.loftName = loftName;
	}

	/**
	 * comptyTypeId���Ե�get����
	 * 
	 * @return the comptyTypeId
	 */
	public int getComptyTypeId() {
		return comptyTypeId;
	}

	/**
	 * comptyTypeId���Ե�set����
	 * 
	 * @param comptyTypeId
	 *            the comptyTypeId to set
	 */
	public void setComptyTypeId(int comptyTypeId) {
		this.comptyTypeId = comptyTypeId;
	}

	/**
	 * buildTypeId���Ե�get����
	 * 
	 * @return the buildTypeId
	 */
	public int getBuildTypeId() {
		return buildTypeId;
	}

	/**
	 * buildTypeId���Ե�set����
	 * 
	 * @param buildTypeId
	 *            the buildTypeId to set
	 */
	public void setBuildTypeId(int buildTypeId) {
		this.buildTypeId = buildTypeId;
	}

	/**
	 * beginTime���Ե�get����
	 * 
	 * @return the beginTime
	 */
	public Date getBeginTime() {
		return beginTime;
	}

	/**
	 * beginTime���Ե�set����
	 * 
	 * @param beginTime
	 *            the beginTime to set
	 */
	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}

	/**
	 * shellOutTime���Ե�get����
	 * 
	 * @return the shellOutTime
	 */
	public Date getShellOutTime() {
		return shellOutTime;
	}

	/**
	 * shellOutTime���Ե�set����
	 * 
	 * @param shellOutTime
	 *            the shellOutTime to set
	 */
	public void setShellOutTime(Date shellOutTime) {
		this.shellOutTime = shellOutTime;
	}

	/**
	 * finishTime���Ե�get����
	 * 
	 * @return the finishTime
	 */
	public Date getFinishTime() {
		return finishTime;
	}

	/**
	 * finishTime���Ե�set����
	 * 
	 * @param finishTime
	 *            the finishTime to set
	 */
	public void setFinishTime(Date finishTime) {
		this.finishTime = finishTime;
	}

	/**
	 * price���Ե�get����
	 * 
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * price���Ե�set����
	 * 
	 * @param price
	 *            the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * zone���Ե�get����
	 * 
	 * @return the zone
	 */
	public String getZone() {
		return zone;
	}

	/**
	 * zone���Ե�set����
	 * 
	 * @param zone
	 *            the zone to set
	 */
	public void setZone(String zone) {
		this.zone = zone;
	}

	/**
	 * Address���Ե�get����
	 * 
	 * @return the address
	 */
	public String getAddress() {
		return Address;
	}

	/**
	 * Address���Ե�set����
	 * 
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		Address = address;
	}

	/**
	 * capacity���Ե�get����
	 * 
	 * @return the capacity
	 */
	public double getCapacity() {
		return capacity;
	}

	/**
	 * capacity���Ե�set����
	 * 
	 * @param capacity
	 *            the capacity to set
	 */
	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	/**
	 * green���Ե�get����
	 * 
	 * @return the green
	 */
	public double getGreen() {
		return green;
	}

	/**
	 * green���Ե�set����
	 * 
	 * @param green
	 *            the green to set
	 */
	public void setGreen(double green) {
		this.green = green;
	}

	/**
	 * traffic���Ե�get����
	 * 
	 * @return the traffic
	 */
	public String getTraffic() {
		return traffic;
	}

	/**
	 * traffic���Ե�set����
	 * 
	 * @param traffic
	 *            the traffic to set
	 */
	public void setTraffic(String traffic) {
		this.traffic = traffic;
	}

	/**
	 * facility���Ե�get����
	 * 
	 * @return the facility
	 */
	public String getFacility() {
		return facility;
	}

	/**
	 * facility���Ե�set����
	 * 
	 * @param facility
	 *            the facility to set
	 */
	public void setFacility(String facility) {
		this.facility = facility;
	}

	/**
	 * remark���Ե�get����
	 * 
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * remark���Ե�set����
	 * 
	 * @param remark
	 *            the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

}
