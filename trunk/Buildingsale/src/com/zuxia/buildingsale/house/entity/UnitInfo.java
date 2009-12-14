package com.zuxia.buildingsale.house.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * UnitInfo��Ҫ˵�� ��Ԫ��Ϣ
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
	 * unitId���Ե�get����
	 * @return the unitId
	 */
	public Integer getUnitId() {
		return unitId;
	}
	/**
	 * unitId���Ե�set����
	 * @param unitId the unitId to set
	 */
	public void setUnitId(Integer unitId) {
		this.unitId = unitId;
	}
	/**
	 * loftInfo���Ե�get����
	 * @return the loftInfo
	 */
	public LoftInfo getLoftInfo() {
		return loftInfo;
	}
	/**
	 * loftInfo���Ե�set����
	 * @param loftInfo the loftInfo to set
	 */
	public void setLoftInfo(LoftInfo loftInfo) {
		this.loftInfo = loftInfo;
	}
	/**
	 * unitNo���Ե�get����
	 * @return the unitNo
	 */
	public String getUnitNo() {
		return unitNo;
	}
	/**
	 * unitNo���Ե�set����
	 * @param unitNo the unitNo to set
	 */
	public void setUnitNo(String unitNo) {
		this.unitNo = unitNo;
	}
	/**
	 * unitName���Ե�get����
	 * @return the unitName
	 */
	public String getUnitName() {
		return unitName;
	}
	/**
	 * unitName���Ե�set����
	 * @param unitName the unitName to set
	 */
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}
	/**
	 * unitHouseNumber���Ե�get����
	 * @return the unitHouseNumber
	 */
	public Integer getUnitHouseNumber() {
		return unitHouseNumber;
	}
	/**
	 * unitHouseNumber���Ե�set����
	 * @param unitHouseNumber the unitHouseNumber to set
	 */
	public void setUnitHouseNumber(Integer unitHouseNumber) {
		this.unitHouseNumber = unitHouseNumber;
	}
	/**
	 * unitFloorNumber���Ե�get����
	 * @return the unitFloorNumber
	 */
	public Integer getUnitFloorNumber() {
		return unitFloorNumber;
	}
	/**
	 * unitFloorNumber���Ե�set����
	 * @param unitFloorNumber the unitFloorNumber to set
	 */
	public void setUnitFloorNumber(Integer unitFloorNumber) {
		this.unitFloorNumber = unitFloorNumber;
	}
	/**
	 * unitTerm���Ե�get����
	 * @return the unitTerm
	 */
	public Integer getUnitTerm() {
		return unitTerm;
	}
	/**
	 * unitTerm���Ե�set����
	 * @param unitTerm the unitTerm to set
	 */
	public void setUnitTerm(Integer unitTerm) {
		this.unitTerm = unitTerm;
	}
	/**
	 * houseInfos���Ե�get����
	 * @return the houseInfos
	 */
	public List<HouseInfo> getHouseInfos() {
		return houseInfos;
	}
	/**
	 * houseInfos���Ե�set����
	 * @param houseInfos the houseInfos to set
	 */
	public void setHouseInfos(List<HouseInfo> houseInfos) {
		this.houseInfos = houseInfos;
	}


}