package com.zuxia.buildingsale.business.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * DataDictType entity. @author MyEclipse Persistence Tools
 */

public class DataDictType implements java.io.Serializable {

	// Fields

	private Integer ddtId;
	private String ddtType;
	private String ddtName;
	private Set dataDicts = new HashSet(0);

	// Constructors

	/** default constructor */
	public DataDictType() {
	}

	/** minimal constructor */
	public DataDictType(String ddtType, String ddtName) {
		this.ddtType = ddtType;
		this.ddtName = ddtName;
	}

	/** full constructor */
	public DataDictType(String ddtType, String ddtName, Set dataDicts) {
		this.ddtType = ddtType;
		this.ddtName = ddtName;
		this.dataDicts = dataDicts;
	}

	// Property accessors

	public Integer getDdtId() {
		return this.ddtId;
	}

	public void setDdtId(Integer ddtId) {
		this.ddtId = ddtId;
	}

	public String getDdtType() {
		return this.ddtType;
	}

	public void setDdtType(String ddtType) {
		this.ddtType = ddtType;
	}

	public String getDdtName() {
		return this.ddtName;
	}

	public void setDdtName(String ddtName) {
		this.ddtName = ddtName;
	}

	public Set getDataDicts() {
		return this.dataDicts;
	}

	public void setDataDicts(Set dataDicts) {
		this.dataDicts = dataDicts;
	}

}