package com.zuxia.buildingsale.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * HouseInfo entity. @author MyEclipse Persistence Tools
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
	private Set dealInfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public HouseInfo() {
	}

	/** minimal constructor */
	public HouseInfo(HouseType houseType, Integer houseFloors, String houseNo,
			Double houseBuildArea, Double houseUseArea) {
		this.houseType = houseType;
		this.houseFloors = houseFloors;
		this.houseNo = houseNo;
		this.houseBuildArea = houseBuildArea;
		this.houseUseArea = houseUseArea;
	}

	/** full constructor */
	public HouseInfo(DataDict dataDict, UnitInfo unitInfo, HouseType houseType,
			Integer houseFloors, String houseNo, Double houseBuildArea,
			Double houseBuildPrice, Double houseDealBuildPrice,
			Double houseUseArea, Double houseUsePrice,
			Double houseDealUsePrice, Double houseDealPrice,
			String houseDecoration, Set dealInfos) {
		this.dataDict = dataDict;
		this.unitInfo = unitInfo;
		this.houseType = houseType;
		this.houseFloors = houseFloors;
		this.houseNo = houseNo;
		this.houseBuildArea = houseBuildArea;
		this.houseBuildPrice = houseBuildPrice;
		this.houseDealBuildPrice = houseDealBuildPrice;
		this.houseUseArea = houseUseArea;
		this.houseUsePrice = houseUsePrice;
		this.houseDealUsePrice = houseDealUsePrice;
		this.houseDealPrice = houseDealPrice;
		this.houseDecoration = houseDecoration;
		this.dealInfos = dealInfos;
	}

	// Property accessors

	public Integer getHouseId() {
		return this.houseId;
	}

	public void setHouseId(Integer houseId) {
		this.houseId = houseId;
	}

	public DataDict getDataDict() {
		return this.dataDict;
	}

	public void setDataDict(DataDict dataDict) {
		this.dataDict = dataDict;
	}

	public UnitInfo getUnitInfo() {
		return this.unitInfo;
	}

	public void setUnitInfo(UnitInfo unitInfo) {
		this.unitInfo = unitInfo;
	}

	public HouseType getHouseType() {
		return this.houseType;
	}

	public void setHouseType(HouseType houseType) {
		this.houseType = houseType;
	}

	public Integer getHouseFloors() {
		return this.houseFloors;
	}

	public void setHouseFloors(Integer houseFloors) {
		this.houseFloors = houseFloors;
	}

	public String getHouseNo() {
		return this.houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public Double getHouseBuildArea() {
		return this.houseBuildArea;
	}

	public void setHouseBuildArea(Double houseBuildArea) {
		this.houseBuildArea = houseBuildArea;
	}

	public Double getHouseBuildPrice() {
		return this.houseBuildPrice;
	}

	public void setHouseBuildPrice(Double houseBuildPrice) {
		this.houseBuildPrice = houseBuildPrice;
	}

	public Double getHouseDealBuildPrice() {
		return this.houseDealBuildPrice;
	}

	public void setHouseDealBuildPrice(Double houseDealBuildPrice) {
		this.houseDealBuildPrice = houseDealBuildPrice;
	}

	public Double getHouseUseArea() {
		return this.houseUseArea;
	}

	public void setHouseUseArea(Double houseUseArea) {
		this.houseUseArea = houseUseArea;
	}

	public Double getHouseUsePrice() {
		return this.houseUsePrice;
	}

	public void setHouseUsePrice(Double houseUsePrice) {
		this.houseUsePrice = houseUsePrice;
	}

	public Double getHouseDealUsePrice() {
		return this.houseDealUsePrice;
	}

	public void setHouseDealUsePrice(Double houseDealUsePrice) {
		this.houseDealUsePrice = houseDealUsePrice;
	}

	public Double getHouseDealPrice() {
		return this.houseDealPrice;
	}

	public void setHouseDealPrice(Double houseDealPrice) {
		this.houseDealPrice = houseDealPrice;
	}

	public String getHouseDecoration() {
		return this.houseDecoration;
	}

	public void setHouseDecoration(String houseDecoration) {
		this.houseDecoration = houseDecoration;
	}

	public Set getDealInfos() {
		return this.dealInfos;
	}

	public void setDealInfos(Set dealInfos) {
		this.dealInfos = dealInfos;
	}

}