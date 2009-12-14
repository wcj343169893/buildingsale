package com.zuxia.buildingsale.house.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.zuxia.buildingsale.business.entity.DataDict;
import com.zuxia.buildingsale.business.entity.DealInfo;

/**
 * HouseInfo 房间信息
 * 
 * 
 * @author zcq100 chaojun
 */
public class HouseInfo implements java.io.Serializable {

	// Fields

	private Integer houseId;
	private DataDict dataDict;
	private UnitInfo unitInfo;
	private HouseType houseType;
	private Integer houseFloors;
	private String houseNo;
	private Double houseBuildArea;
	private Double houseBuildPrice;
	private Double houseDealBuildPrice;
	private Double houseUseArea;
	private Double houseUsePrice;
	private Double houseDealUsePrice;
	private Double houseDealPrice;
	private String houseDecoration;
	private List<DealInfo> dealInfos = new ArrayList<DealInfo>();

	/**
	 * houseId属性的get方法
	 * 
	 * @return the houseId
	 */
	public Integer getHouseId() {
		return houseId;
	}

	/**
	 * houseId属性的set方法
	 * 
	 * @param houseId
	 *            the houseId to set
	 */
	public void setHouseId(Integer houseId) {
		this.houseId = houseId;
	}

	/**
	 * dataDict属性的get方法
	 * 
	 * @return the dataDict
	 */
	public DataDict getDataDict() {
		return dataDict;
	}

	/**
	 * dataDict属性的set方法
	 * 
	 * @param dataDict
	 *            the dataDict to set
	 */
	public void setDataDict(DataDict dataDict) {
		this.dataDict = dataDict;
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
	 * houseType属性的get方法
	 * 
	 * @return the houseType
	 */
	public HouseType getHouseType() {
		return houseType;
	}

	/**
	 * houseType属性的set方法
	 * 
	 * @param houseType
	 *            the houseType to set
	 */
	public void setHouseType(HouseType houseType) {
		this.houseType = houseType;
	}

	/**
	 * houseFloors属性的get方法
	 * 
	 * @return the houseFloors
	 */
	public Integer getHouseFloors() {
		return houseFloors;
	}

	/**
	 * houseFloors属性的set方法
	 * 
	 * @param houseFloors
	 *            the houseFloors to set
	 */
	public void setHouseFloors(Integer houseFloors) {
		this.houseFloors = houseFloors;
	}

	/**
	 * houseNo属性的get方法
	 * 
	 * @return the houseNo
	 */
	public String getHouseNo() {
		return houseNo;
	}

	/**
	 * houseNo属性的set方法
	 * 
	 * @param houseNo
	 *            the houseNo to set
	 */
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	/**
	 * houseBuildArea属性的get方法
	 * 
	 * @return the houseBuildArea
	 */
	public Double getHouseBuildArea() {
		return houseBuildArea;
	}

	/**
	 * houseBuildArea属性的set方法
	 * 
	 * @param houseBuildArea
	 *            the houseBuildArea to set
	 */
	public void setHouseBuildArea(Double houseBuildArea) {
		this.houseBuildArea = houseBuildArea;
	}

	/**
	 * houseBuildPrice属性的get方法
	 * 
	 * @return the houseBuildPrice
	 */
	public Double getHouseBuildPrice() {
		return houseBuildPrice;
	}

	/**
	 * houseBuildPrice属性的set方法
	 * 
	 * @param houseBuildPrice
	 *            the houseBuildPrice to set
	 */
	public void setHouseBuildPrice(Double houseBuildPrice) {
		this.houseBuildPrice = houseBuildPrice;
	}

	/**
	 * houseDealBuildPrice属性的get方法
	 * 
	 * @return the houseDealBuildPrice
	 */
	public Double getHouseDealBuildPrice() {
		return houseDealBuildPrice;
	}

	/**
	 * houseDealBuildPrice属性的set方法
	 * 
	 * @param houseDealBuildPrice
	 *            the houseDealBuildPrice to set
	 */
	public void setHouseDealBuildPrice(Double houseDealBuildPrice) {
		this.houseDealBuildPrice = houseDealBuildPrice;
	}

	/**
	 * houseUseArea属性的get方法
	 * 
	 * @return the houseUseArea
	 */
	public Double getHouseUseArea() {
		return houseUseArea;
	}

	/**
	 * houseUseArea属性的set方法
	 * 
	 * @param houseUseArea
	 *            the houseUseArea to set
	 */
	public void setHouseUseArea(Double houseUseArea) {
		this.houseUseArea = houseUseArea;
	}

	/**
	 * houseUsePrice属性的get方法
	 * 
	 * @return the houseUsePrice
	 */
	public Double getHouseUsePrice() {
		return houseUsePrice;
	}

	/**
	 * houseUsePrice属性的set方法
	 * 
	 * @param houseUsePrice
	 *            the houseUsePrice to set
	 */
	public void setHouseUsePrice(Double houseUsePrice) {
		this.houseUsePrice = houseUsePrice;
	}

	/**
	 * houseDealUsePrice属性的get方法
	 * 
	 * @return the houseDealUsePrice
	 */
	public Double getHouseDealUsePrice() {
		return houseDealUsePrice;
	}

	/**
	 * houseDealUsePrice属性的set方法
	 * 
	 * @param houseDealUsePrice
	 *            the houseDealUsePrice to set
	 */
	public void setHouseDealUsePrice(Double houseDealUsePrice) {
		this.houseDealUsePrice = houseDealUsePrice;
	}

	/**
	 * houseDealPrice属性的get方法
	 * 
	 * @return the houseDealPrice
	 */
	public Double getHouseDealPrice() {
		return houseDealPrice;
	}

	/**
	 * houseDealPrice属性的set方法
	 * 
	 * @param houseDealPrice
	 *            the houseDealPrice to set
	 */
	public void setHouseDealPrice(Double houseDealPrice) {
		this.houseDealPrice = houseDealPrice;
	}

	/**
	 * houseDecoration属性的get方法
	 * 
	 * @return the houseDecoration
	 */
	public String getHouseDecoration() {
		return houseDecoration;
	}

	/**
	 * houseDecoration属性的set方法
	 * 
	 * @param houseDecoration
	 *            the houseDecoration to set
	 */
	public void setHouseDecoration(String houseDecoration) {
		this.houseDecoration = houseDecoration;
	}

	/**
	 * dealInfos属性的get方法
	 * 
	 * @return the dealInfos
	 */
	public List<DealInfo> getDealInfos() {
		return dealInfos;
	}

	/**
	 * dealInfos属性的set方法
	 * 
	 * @param dealInfos
	 *            the dealInfos to set
	 */
	public void setDealInfos(List<DealInfo> dealInfos) {
		this.dealInfos = dealInfos;
	}

}