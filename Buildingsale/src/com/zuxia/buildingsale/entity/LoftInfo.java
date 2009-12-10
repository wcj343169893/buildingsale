package com.zuxia.buildingsale.entity;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * LoftInfo entity. @author MyEclipse Persistence Tools
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
	private Timestamp loftBeginTime;
	private Timestamp loftShellOutTime;
	private Timestamp loftFinishTime;
	private Double lloftCapacity;
	private Double loftGreen;
	private String loftTraffic;
	private String loftFacility;
	private String loftRemark;
	private Set loftShops = new HashSet(0);
	private Set unitInfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public LoftInfo() {
	}

	/** minimal constructor */
	public LoftInfo(DataDict dataDictByLoftComtyType,
			DataDict dataDictByLoftBuildType, String loftNo, String loftName,
			String loftZone, String loftAddress) {
		this.dataDictByLoftComtyType = dataDictByLoftComtyType;
		this.dataDictByLoftBuildType = dataDictByLoftBuildType;
		this.loftNo = loftNo;
		this.loftName = loftName;
		this.loftZone = loftZone;
		this.loftAddress = loftAddress;
	}

	/** full constructor */
	public LoftInfo(DataDict dataDictByLoftComtyType,
			DataDict dataDictByLoftBuildType, String loftNo, String loftName,
			String loftZone, String loftAddress, Double loftPrice,
			Timestamp loftBeginTime, Timestamp loftShellOutTime,
			Timestamp loftFinishTime, Double lloftCapacity, Double loftGreen,
			String loftTraffic, String loftFacility, String loftRemark,
			Set loftShops, Set unitInfos) {
		this.dataDictByLoftComtyType = dataDictByLoftComtyType;
		this.dataDictByLoftBuildType = dataDictByLoftBuildType;
		this.loftNo = loftNo;
		this.loftName = loftName;
		this.loftZone = loftZone;
		this.loftAddress = loftAddress;
		this.loftPrice = loftPrice;
		this.loftBeginTime = loftBeginTime;
		this.loftShellOutTime = loftShellOutTime;
		this.loftFinishTime = loftFinishTime;
		this.lloftCapacity = lloftCapacity;
		this.loftGreen = loftGreen;
		this.loftTraffic = loftTraffic;
		this.loftFacility = loftFacility;
		this.loftRemark = loftRemark;
		this.loftShops = loftShops;
		this.unitInfos = unitInfos;
	}

	// Property accessors

	public Integer getLoftId() {
		return this.loftId;
	}

	public void setLoftId(Integer loftId) {
		this.loftId = loftId;
	}

	public DataDict getDataDictByLoftComtyType() {
		return this.dataDictByLoftComtyType;
	}

	public void setDataDictByLoftComtyType(DataDict dataDictByLoftComtyType) {
		this.dataDictByLoftComtyType = dataDictByLoftComtyType;
	}

	public DataDict getDataDictByLoftBuildType() {
		return this.dataDictByLoftBuildType;
	}

	public void setDataDictByLoftBuildType(DataDict dataDictByLoftBuildType) {
		this.dataDictByLoftBuildType = dataDictByLoftBuildType;
	}

	public String getLoftNo() {
		return this.loftNo;
	}

	public void setLoftNo(String loftNo) {
		this.loftNo = loftNo;
	}

	public String getLoftName() {
		return this.loftName;
	}

	public void setLoftName(String loftName) {
		this.loftName = loftName;
	}

	public String getLoftZone() {
		return this.loftZone;
	}

	public void setLoftZone(String loftZone) {
		this.loftZone = loftZone;
	}

	public String getLoftAddress() {
		return this.loftAddress;
	}

	public void setLoftAddress(String loftAddress) {
		this.loftAddress = loftAddress;
	}

	public Double getLoftPrice() {
		return this.loftPrice;
	}

	public void setLoftPrice(Double loftPrice) {
		this.loftPrice = loftPrice;
	}

	public Timestamp getLoftBeginTime() {
		return this.loftBeginTime;
	}

	public void setLoftBeginTime(Timestamp loftBeginTime) {
		this.loftBeginTime = loftBeginTime;
	}

	public Timestamp getLoftShellOutTime() {
		return this.loftShellOutTime;
	}

	public void setLoftShellOutTime(Timestamp loftShellOutTime) {
		this.loftShellOutTime = loftShellOutTime;
	}

	public Timestamp getLoftFinishTime() {
		return this.loftFinishTime;
	}

	public void setLoftFinishTime(Timestamp loftFinishTime) {
		this.loftFinishTime = loftFinishTime;
	}

	public Double getLloftCapacity() {
		return this.lloftCapacity;
	}

	public void setLloftCapacity(Double lloftCapacity) {
		this.lloftCapacity = lloftCapacity;
	}

	public Double getLoftGreen() {
		return this.loftGreen;
	}

	public void setLoftGreen(Double loftGreen) {
		this.loftGreen = loftGreen;
	}

	public String getLoftTraffic() {
		return this.loftTraffic;
	}

	public void setLoftTraffic(String loftTraffic) {
		this.loftTraffic = loftTraffic;
	}

	public String getLoftFacility() {
		return this.loftFacility;
	}

	public void setLoftFacility(String loftFacility) {
		this.loftFacility = loftFacility;
	}

	public String getLoftRemark() {
		return this.loftRemark;
	}

	public void setLoftRemark(String loftRemark) {
		this.loftRemark = loftRemark;
	}

	public Set getLoftShops() {
		return this.loftShops;
	}

	public void setLoftShops(Set loftShops) {
		this.loftShops = loftShops;
	}

	public Set getUnitInfos() {
		return this.unitInfos;
	}

	public void setUnitInfos(Set unitInfos) {
		this.unitInfos = unitInfos;
	}

}