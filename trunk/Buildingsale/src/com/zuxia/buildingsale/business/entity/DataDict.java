package com.zuxia.buildingsale.business.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * DataDict entity. @author MyEclipse Persistence Tools
 */

public class DataDict implements java.io.Serializable {

	// Fields

	private Integer ddId;
	private DataDictType dataDictType;
	private String ddValue;
	private String ddRemark;
	private Set houseInfos = new HashSet(0);
	private Set loftInfosForLoftBuildType = new HashSet(0);
	private Set clientInfos = new HashSet(0);
	private Set dealInfosForDealState = new HashSet(0);
	private Set employees = new HashSet(0);
	private Set loftInfosForLoftComtyType = new HashSet(0);
	private Set dealInfosForDealPayStyle = new HashSet(0);

	// Constructors

	/** default constructor */
	public DataDict() {
	}

	/** minimal constructor */
	public DataDict(DataDictType dataDictType, String ddValue) {
		this.dataDictType = dataDictType;
		this.ddValue = ddValue;
	}

	/** full constructor */
	public DataDict(DataDictType dataDictType, String ddValue, String ddRemark,
			Set houseInfos, Set loftInfosForLoftBuildType, Set clientInfos,
			Set dealInfosForDealState, Set employees,
			Set loftInfosForLoftComtyType, Set dealInfosForDealPayStyle) {
		this.dataDictType = dataDictType;
		this.ddValue = ddValue;
		this.ddRemark = ddRemark;
		this.houseInfos = houseInfos;
		this.loftInfosForLoftBuildType = loftInfosForLoftBuildType;
		this.clientInfos = clientInfos;
		this.dealInfosForDealState = dealInfosForDealState;
		this.employees = employees;
		this.loftInfosForLoftComtyType = loftInfosForLoftComtyType;
		this.dealInfosForDealPayStyle = dealInfosForDealPayStyle;
	}

	// Property accessors

	public Integer getDdId() {
		return this.ddId;
	}

	public void setDdId(Integer ddId) {
		this.ddId = ddId;
	}

	public DataDictType getDataDictType() {
		return this.dataDictType;
	}

	public void setDataDictType(DataDictType dataDictType) {
		this.dataDictType = dataDictType;
	}

	public String getDdValue() {
		return this.ddValue;
	}

	public void setDdValue(String ddValue) {
		this.ddValue = ddValue;
	}

	public String getDdRemark() {
		return this.ddRemark;
	}

	public void setDdRemark(String ddRemark) {
		this.ddRemark = ddRemark;
	}

	public Set getHouseInfos() {
		return this.houseInfos;
	}

	public void setHouseInfos(Set houseInfos) {
		this.houseInfos = houseInfos;
	}

	public Set getLoftInfosForLoftBuildType() {
		return this.loftInfosForLoftBuildType;
	}

	public void setLoftInfosForLoftBuildType(Set loftInfosForLoftBuildType) {
		this.loftInfosForLoftBuildType = loftInfosForLoftBuildType;
	}

	public Set getClientInfos() {
		return this.clientInfos;
	}

	public void setClientInfos(Set clientInfos) {
		this.clientInfos = clientInfos;
	}

	public Set getDealInfosForDealState() {
		return this.dealInfosForDealState;
	}

	public void setDealInfosForDealState(Set dealInfosForDealState) {
		this.dealInfosForDealState = dealInfosForDealState;
	}

	public Set getEmployees() {
		return this.employees;
	}

	public void setEmployees(Set employees) {
		this.employees = employees;
	}

	public Set getLoftInfosForLoftComtyType() {
		return this.loftInfosForLoftComtyType;
	}

	public void setLoftInfosForLoftComtyType(Set loftInfosForLoftComtyType) {
		this.loftInfosForLoftComtyType = loftInfosForLoftComtyType;
	}

	public Set getDealInfosForDealPayStyle() {
		return this.dealInfosForDealPayStyle;
	}

	public void setDealInfosForDealPayStyle(Set dealInfosForDealPayStyle) {
		this.dealInfosForDealPayStyle = dealInfosForDealPayStyle;
	}

}