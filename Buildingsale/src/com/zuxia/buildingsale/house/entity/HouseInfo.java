package com.zuxia.buildingsale.house.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.zuxia.buildingsale.business.entity.DataDict;
import com.zuxia.buildingsale.business.entity.DealInfo;

/**
 * HouseInfo ������Ϣ
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
	 * houseId���Ե�get����
	 * 
	 * @return the houseId
	 */
	public Integer getHouseId() {
		return houseId;
	}

	/**
	 * houseId���Ե�set����
	 * 
	 * @param houseId
	 *            the houseId to set
	 */
	public void setHouseId(Integer houseId) {
		this.houseId = houseId;
	}

	/**
	 * dataDict���Ե�get����
	 * 
	 * @return the dataDict
	 */
	public DataDict getDataDict() {
		return dataDict;
	}

	/**
	 * dataDict���Ե�set����
	 * 
	 * @param dataDict
	 *            the dataDict to set
	 */
	public void setDataDict(DataDict dataDict) {
		this.dataDict = dataDict;
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
	 * houseType���Ե�get����
	 * 
	 * @return the houseType
	 */
	public HouseType getHouseType() {
		return houseType;
	}

	/**
	 * houseType���Ե�set����
	 * 
	 * @param houseType
	 *            the houseType to set
	 */
	public void setHouseType(HouseType houseType) {
		this.houseType = houseType;
	}

	/**
	 * houseFloors���Ե�get����
	 * 
	 * @return the houseFloors
	 */
	public Integer getHouseFloors() {
		return houseFloors;
	}

	/**
	 * houseFloors���Ե�set����
	 * 
	 * @param houseFloors
	 *            the houseFloors to set
	 */
	public void setHouseFloors(Integer houseFloors) {
		this.houseFloors = houseFloors;
	}

	/**
	 * houseNo���Ե�get����
	 * 
	 * @return the houseNo
	 */
	public String getHouseNo() {
		return houseNo;
	}

	/**
	 * houseNo���Ե�set����
	 * 
	 * @param houseNo
	 *            the houseNo to set
	 */
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	/**
	 * houseBuildArea���Ե�get����
	 * 
	 * @return the houseBuildArea
	 */
	public Double getHouseBuildArea() {
		return houseBuildArea;
	}

	/**
	 * houseBuildArea���Ե�set����
	 * 
	 * @param houseBuildArea
	 *            the houseBuildArea to set
	 */
	public void setHouseBuildArea(Double houseBuildArea) {
		this.houseBuildArea = houseBuildArea;
	}

	/**
	 * houseBuildPrice���Ե�get����
	 * 
	 * @return the houseBuildPrice
	 */
	public Double getHouseBuildPrice() {
		return houseBuildPrice;
	}

	/**
	 * houseBuildPrice���Ե�set����
	 * 
	 * @param houseBuildPrice
	 *            the houseBuildPrice to set
	 */
	public void setHouseBuildPrice(Double houseBuildPrice) {
		this.houseBuildPrice = houseBuildPrice;
	}

	/**
	 * houseDealBuildPrice���Ե�get����
	 * 
	 * @return the houseDealBuildPrice
	 */
	public Double getHouseDealBuildPrice() {
		return houseDealBuildPrice;
	}

	/**
	 * houseDealBuildPrice���Ե�set����
	 * 
	 * @param houseDealBuildPrice
	 *            the houseDealBuildPrice to set
	 */
	public void setHouseDealBuildPrice(Double houseDealBuildPrice) {
		this.houseDealBuildPrice = houseDealBuildPrice;
	}

	/**
	 * houseUseArea���Ե�get����
	 * 
	 * @return the houseUseArea
	 */
	public Double getHouseUseArea() {
		return houseUseArea;
	}

	/**
	 * houseUseArea���Ե�set����
	 * 
	 * @param houseUseArea
	 *            the houseUseArea to set
	 */
	public void setHouseUseArea(Double houseUseArea) {
		this.houseUseArea = houseUseArea;
	}

	/**
	 * houseUsePrice���Ե�get����
	 * 
	 * @return the houseUsePrice
	 */
	public Double getHouseUsePrice() {
		return houseUsePrice;
	}

	/**
	 * houseUsePrice���Ե�set����
	 * 
	 * @param houseUsePrice
	 *            the houseUsePrice to set
	 */
	public void setHouseUsePrice(Double houseUsePrice) {
		this.houseUsePrice = houseUsePrice;
	}

	/**
	 * houseDealUsePrice���Ե�get����
	 * 
	 * @return the houseDealUsePrice
	 */
	public Double getHouseDealUsePrice() {
		return houseDealUsePrice;
	}

	/**
	 * houseDealUsePrice���Ե�set����
	 * 
	 * @param houseDealUsePrice
	 *            the houseDealUsePrice to set
	 */
	public void setHouseDealUsePrice(Double houseDealUsePrice) {
		this.houseDealUsePrice = houseDealUsePrice;
	}

	/**
	 * houseDealPrice���Ե�get����
	 * 
	 * @return the houseDealPrice
	 */
	public Double getHouseDealPrice() {
		return houseDealPrice;
	}

	/**
	 * houseDealPrice���Ե�set����
	 * 
	 * @param houseDealPrice
	 *            the houseDealPrice to set
	 */
	public void setHouseDealPrice(Double houseDealPrice) {
		this.houseDealPrice = houseDealPrice;
	}

	/**
	 * houseDecoration���Ե�get����
	 * 
	 * @return the houseDecoration
	 */
	public String getHouseDecoration() {
		return houseDecoration;
	}

	/**
	 * houseDecoration���Ե�set����
	 * 
	 * @param houseDecoration
	 *            the houseDecoration to set
	 */
	public void setHouseDecoration(String houseDecoration) {
		this.houseDecoration = houseDecoration;
	}

	/**
	 * dealInfos���Ե�get����
	 * 
	 * @return the dealInfos
	 */
	public List<DealInfo> getDealInfos() {
		return dealInfos;
	}

	/**
	 * dealInfos���Ե�set����
	 * 
	 * @param dealInfos
	 *            the dealInfos to set
	 */
	public void setDealInfos(List<DealInfo> dealInfos) {
		this.dealInfos = dealInfos;
	}

}