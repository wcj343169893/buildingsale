package com.zuxia.buildingsale.house.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * UnitInfo概要说明 单元信息
 * 
 * 
 * @author zcq100 chaojun
 */
public class UnitInfo implements java.io.Serializable {

	// Fields

	private Integer unitId;
	private LoftInfo loftInfo;
	private String unitNo;
	private String unitName;
	private Integer unitHouseNumber;
	private Integer unitFloorNumber;
	private Integer unitTerm;
	private List<HouseInfo> houseInfos=new ArrayList<HouseInfo>();
	/**
	 * unitId属性的get方法
	 * @return the unitId
	 */
	public Integer getUnitId() {
		return unitId;
	}
	/**
	 * unitId属性的set方法
	 * @param unitId the unitId to set
	 */
	public void setUnitId(Integer unitId) {
		this.unitId = unitId;
	}
	/**
	 * loftInfo属性的get方法
	 * @return the loftInfo
	 */
	public LoftInfo getLoftInfo() {
		return loftInfo;
	}
	/**
	 * loftInfo属性的set方法
	 * @param loftInfo the loftInfo to set
	 */
	public void setLoftInfo(LoftInfo loftInfo) {
		this.loftInfo = loftInfo;
	}
	/**
	 * unitNo属性的get方法
	 * @return the unitNo
	 */
	public String getUnitNo() {
		return unitNo;
	}
	/**
	 * unitNo属性的set方法
	 * @param unitNo the unitNo to set
	 */
	public void setUnitNo(String unitNo) {
		this.unitNo = unitNo;
	}
	/**
	 * unitName属性的get方法
	 * @return the unitName
	 */
	public String getUnitName() {
		return unitName;
	}
	/**
	 * unitName属性的set方法
	 * @param unitName the unitName to set
	 */
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}
	/**
	 * unitHouseNumber属性的get方法
	 * @return the unitHouseNumber
	 */
	public Integer getUnitHouseNumber() {
		return unitHouseNumber;
	}
	/**
	 * unitHouseNumber属性的set方法
	 * @param unitHouseNumber the unitHouseNumber to set
	 */
	public void setUnitHouseNumber(Integer unitHouseNumber) {
		this.unitHouseNumber = unitHouseNumber;
	}
	/**
	 * unitFloorNumber属性的get方法
	 * @return the unitFloorNumber
	 */
	public Integer getUnitFloorNumber() {
		return unitFloorNumber;
	}
	/**
	 * unitFloorNumber属性的set方法
	 * @param unitFloorNumber the unitFloorNumber to set
	 */
	public void setUnitFloorNumber(Integer unitFloorNumber) {
		this.unitFloorNumber = unitFloorNumber;
	}
	/**
	 * unitTerm属性的get方法
	 * @return the unitTerm
	 */
	public Integer getUnitTerm() {
		return unitTerm;
	}
	/**
	 * unitTerm属性的set方法
	 * @param unitTerm the unitTerm to set
	 */
	public void setUnitTerm(Integer unitTerm) {
		this.unitTerm = unitTerm;
	}
	/**
	 * houseInfos属性的get方法
	 * @return the houseInfos
	 */
	public List<HouseInfo> getHouseInfos() {
		return houseInfos;
	}
	/**
	 * houseInfos属性的set方法
	 * @param houseInfos the houseInfos to set
	 */
	public void setHouseInfos(List<HouseInfo> houseInfos) {
		this.houseInfos = houseInfos;
	}


}