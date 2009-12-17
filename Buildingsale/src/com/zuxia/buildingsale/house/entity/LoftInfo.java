package com.zuxia.buildingsale.house.entity;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.zuxia.buildingsale.business.entity.DataDict;

/**
 * LoftInfo概要说明 楼盘信息
 * 
 * 
 * @author zcq100 chaojun
 */
public class LoftInfo implements java.io.Serializable {

	// Fields

	private Integer loftId;
	private DataDict dataDictByLoftComtyType;
	private DataDict dataDictByLoftBuildType;
	private String loftNo;
	private String loftName;
	private String loftZone;
	private String loftAddress;
	private Double loftPrice;
	private Date loftBeginTime;
	private Date loftShellOutTime;
	private Date loftFinishTime;
	private Double loftCapacity;
	private Double loftGreen;
	private String loftTraffic;
	private String loftFacility;
	private String loftRemark;
	private List<ShopInfo> shopInfos = new ArrayList<ShopInfo>();
	private List<UnitInfo> unitInfos = new ArrayList<UnitInfo>();

	/**
	 * loftId属性的get方法
	 * 
	 * @return the loftId
	 */
	public Integer getLoftId() {
		return loftId;
	}

	/**
	 * loftId属性的set方法
	 * 
	 * @param loftId
	 *            the loftId to set
	 */
	public void setLoftId(Integer loftId) {
		this.loftId = loftId;
	}

	/**
	 * dataDictByLoftComtyType属性的get方法
	 * 
	 * @return the dataDictByLoftComtyType
	 */
	public DataDict getDataDictByLoftComtyType() {
		return dataDictByLoftComtyType;
	}

	/**
	 * dataDictByLoftComtyType属性的set方法
	 * 
	 * @param dataDictByLoftComtyType
	 *            the dataDictByLoftComtyType to set
	 */
	public void setDataDictByLoftComtyType(DataDict dataDictByLoftComtyType) {
		this.dataDictByLoftComtyType = dataDictByLoftComtyType;
	}

	/**
	 * dataDictByLoftBuildType属性的get方法
	 * 
	 * @return the dataDictByLoftBuildType
	 */
	public DataDict getDataDictByLoftBuildType() {
		return dataDictByLoftBuildType;
	}

	/**
	 * dataDictByLoftBuildType属性的set方法
	 * 
	 * @param dataDictByLoftBuildType
	 *            the dataDictByLoftBuildType to set
	 */
	public void setDataDictByLoftBuildType(DataDict dataDictByLoftBuildType) {
		this.dataDictByLoftBuildType = dataDictByLoftBuildType;
	}

	/**
	 * loftNo属性的get方法
	 * 
	 * @return the loftNo
	 */
	public String getLoftNo() {
		return loftNo;
	}

	/**
	 * loftNo属性的set方法
	 * 
	 * @param loftNo
	 *            the loftNo to set
	 */
	public void setLoftNo(String loftNo) {
		this.loftNo = loftNo;
	}

	/**
	 * loftName属性的get方法
	 * 
	 * @return the loftName
	 */
	public String getLoftName() {
		return loftName;
	}

	/**
	 * loftName属性的set方法
	 * 
	 * @param loftName
	 *            the loftName to set
	 */
	public void setLoftName(String loftName) {
		this.loftName = loftName;
	}

	/**
	 * loftZone属性的get方法
	 * 
	 * @return the loftZone
	 */
	public String getLoftZone() {
		return loftZone;
	}

	/**
	 * loftZone属性的set方法
	 * 
	 * @param loftZone
	 *            the loftZone to set
	 */
	public void setLoftZone(String loftZone) {
		this.loftZone = loftZone;
	}

	/**
	 * loftAddress属性的get方法
	 * 
	 * @return the loftAddress
	 */
	public String getLoftAddress() {
		return loftAddress;
	}

	/**
	 * loftAddress属性的set方法
	 * 
	 * @param loftAddress
	 *            the loftAddress to set
	 */
	public void setLoftAddress(String loftAddress) {
		this.loftAddress = loftAddress;
	}

	/**
	 * loftPrice属性的get方法
	 * 
	 * @return the loftPrice
	 */
	public Double getLoftPrice() {
		return loftPrice;
	}

	/**
	 * loftPrice属性的set方法
	 * 
	 * @param loftPrice
	 *            the loftPrice to set
	 */
	public void setLoftPrice(Double loftPrice) {
		this.loftPrice = loftPrice;
	}

	/**
	 * loftBeginTime属性的get方法
	 * 
	 * @return the loftBeginTime
	 */
	public Date getLoftBeginTime() {
		return loftBeginTime;
	}

	/**
	 * loftBeginTime属性的set方法
	 * 
	 * @param loftBeginTime
	 *            the loftBeginTime to set
	 */
	public void setLoftBeginTime(Date loftBeginTime) {
		this.loftBeginTime = loftBeginTime;
	}

	/**
	 * loftShellOutTime属性的get方法
	 * 
	 * @return the loftShellOutTime
	 */
	public Date getLoftShellOutTime() {
		return loftShellOutTime;
	}

	/**
	 * loftShellOutTime属性的set方法
	 * 
	 * @param loftShellOutTime
	 *            the loftShellOutTime to set
	 */
	public void setLoftShellOutTime(Date loftShellOutTime) {
		this.loftShellOutTime = loftShellOutTime;
	}

	/**
	 * loftFinishTime属性的get方法
	 * 
	 * @return the loftFinishTime
	 */
	public Date getLoftFinishTime() {
		return loftFinishTime;
	}

	/**
	 * loftFinishTime属性的set方法
	 * 
	 * @param loftFinishTime
	 *            the loftFinishTime to set
	 */
	public void setLoftFinishTime(Date loftFinishTime) {
		this.loftFinishTime = loftFinishTime;
	}

	/**
	 * loftCapacity属性的get方法
	 * 
	 * @return the loftCapacity
	 */
	public Double getLoftCapacity() {
		return loftCapacity;
	}

	/**
	 * loftCapacity属性的set方法
	 * 
	 * @param loftCapacity
	 *            the loftCapacity to set
	 */
	public void setLoftCapacity(Double loftCapacity) {
		this.loftCapacity = loftCapacity;
	}

	/**
	 * loftGreen属性的get方法
	 * 
	 * @return the loftGreen
	 */
	public Double getLoftGreen() {
		return loftGreen;
	}

	/**
	 * loftGreen属性的set方法
	 * 
	 * @param loftGreen
	 *            the loftGreen to set
	 */
	public void setLoftGreen(Double loftGreen) {
		this.loftGreen = loftGreen;
	}

	/**
	 * loftTraffic属性的get方法
	 * 
	 * @return the loftTraffic
	 */
	public String getLoftTraffic() {
		return loftTraffic;
	}

	/**
	 * loftTraffic属性的set方法
	 * 
	 * @param loftTraffic
	 *            the loftTraffic to set
	 */
	public void setLoftTraffic(String loftTraffic) {
		this.loftTraffic = loftTraffic;
	}

	/**
	 * loftFacility属性的get方法
	 * 
	 * @return the loftFacility
	 */
	public String getLoftFacility() {
		return loftFacility;
	}

	/**
	 * loftFacility属性的set方法
	 * 
	 * @param loftFacility
	 *            the loftFacility to set
	 */
	public void setLoftFacility(String loftFacility) {
		this.loftFacility = loftFacility;
	}

	/**
	 * loftRemark属性的get方法
	 * 
	 * @return the loftRemark
	 */
	public String getLoftRemark() {
		return loftRemark;
	}

	/**
	 * loftRemark属性的set方法
	 * 
	 * @param loftRemark
	 *            the loftRemark to set
	 */
	public void setLoftRemark(String loftRemark) {
		this.loftRemark = loftRemark;
	}

	/**
	 * shopInfos属性的get方法
	 * 
	 * @return the shopInfos
	 */
	public List<ShopInfo> getShopInfos() {
		return shopInfos;
	}

	/**
	 * shopInfos属性的set方法
	 * 
	 * @param shopInfos
	 *            the shopInfos to set
	 */
	public void setShopInfos(List<ShopInfo> shopInfos) {
		this.shopInfos = shopInfos;
	}

	/**
	 * unitInfos属性的get方法
	 * 
	 * @return the unitInfos
	 */
	public List<UnitInfo> getUnitInfos() {
		return unitInfos;
	}

	/**
	 * unitInfos属性的set方法
	 * 
	 * @param unitInfos
	 *            the unitInfos to set
	 */
	public void setUnitInfos(List<UnitInfo> unitInfos) {
		this.unitInfos = unitInfos;
	}

}