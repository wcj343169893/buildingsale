package com.zuxia.buildingsale.house.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * UnitInfo entity. @author MyEclipse Persistence Tools
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
	private Set houseInfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public UnitInfo() {
	}

	/** minimal constructor */
	public UnitInfo(String unitNo, String unitName, Integer unitHouseNumber,
			Integer unitFloorNumber) {
		this.unitNo = unitNo;
		this.unitName = unitName;
		this.unitHouseNumber = unitHouseNumber;
		this.unitFloorNumber = unitFloorNumber;
	}

	/** full constructor */
	public UnitInfo(LoftInfo loftInfo, String unitNo, String unitName,
			Integer unitHouseNumber, Integer unitFloorNumber, Integer unitTerm,
			Set houseInfos) {
		this.loftInfo = loftInfo;
		this.unitNo = unitNo;
		this.unitName = unitName;
		this.unitHouseNumber = unitHouseNumber;
		this.unitFloorNumber = unitFloorNumber;
		this.unitTerm = unitTerm;
		this.houseInfos = houseInfos;
	}

	// Property accessors

	public Integer getUnitId() {
		return this.unitId;
	}

	public void setUnitId(Integer unitId) {
		this.unitId = unitId;
	}

	public LoftInfo getLoftInfo() {
		return this.loftInfo;
	}

	public void setLoftInfo(LoftInfo loftInfo) {
		this.loftInfo = loftInfo;
	}

	public String getUnitNo() {
		return this.unitNo;
	}

	public void setUnitNo(String unitNo) {
		this.unitNo = unitNo;
	}

	public String getUnitName() {
		return this.unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public Integer getUnitHouseNumber() {
		return this.unitHouseNumber;
	}

	public void setUnitHouseNumber(Integer unitHouseNumber) {
		this.unitHouseNumber = unitHouseNumber;
	}

	public Integer getUnitFloorNumber() {
		return this.unitFloorNumber;
	}

	public void setUnitFloorNumber(Integer unitFloorNumber) {
		this.unitFloorNumber = unitFloorNumber;
	}

	public Integer getUnitTerm() {
		return this.unitTerm;
	}

	public void setUnitTerm(Integer unitTerm) {
		this.unitTerm = unitTerm;
	}

	public Set getHouseInfos() {
		return this.houseInfos;
	}

	public void setHouseInfos(Set houseInfos) {
		this.houseInfos = houseInfos;
	}

}