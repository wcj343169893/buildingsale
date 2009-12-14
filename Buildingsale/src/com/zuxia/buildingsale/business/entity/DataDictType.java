package com.zuxia.buildingsale.business.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * DataDictType entity. @author MyEclipse Persistence Tools
 */

public class DataDictType implements java.io.Serializable {

	// Fields

	private Integer ddtId;
	private String ddtType;
	private String ddtName;
	private List<DataDict> dataDicts = new ArrayList<DataDict>();

	/**
	 * ddtId���Ե�get����
	 * 
	 * @return the ddtId
	 */
	public Integer getDdtId() {
		return ddtId;
	}

	/**
	 * ddtId���Ե�set����
	 * 
	 * @param ddtId
	 *            the ddtId to set
	 */
	public void setDdtId(Integer ddtId) {
		this.ddtId = ddtId;
	}

	/**
	 * ddtType���Ե�get����
	 * 
	 * @return the ddtType
	 */
	public String getDdtType() {
		return ddtType;
	}

	/**
	 * ddtType���Ե�set����
	 * 
	 * @param ddtType
	 *            the ddtType to set
	 */
	public void setDdtType(String ddtType) {
		this.ddtType = ddtType;
	}

	/**
	 * ddtName���Ե�get����
	 * 
	 * @return the ddtName
	 */
	public String getDdtName() {
		return ddtName;
	}

	/**
	 * ddtName���Ե�set����
	 * 
	 * @param ddtName
	 *            the ddtName to set
	 */
	public void setDdtName(String ddtName) {
		this.ddtName = ddtName;
	}

	/**
	 * dataDicts���Ե�get����
	 * 
	 * @return the dataDicts
	 */
	public List<DataDict> getDataDicts() {
		return dataDicts;
	}

	/**
	 * dataDicts���Ե�set����
	 * 
	 * @param dataDicts
	 *            the dataDicts to set
	 */
	public void setDataDicts(List<DataDict> dataDicts) {
		this.dataDicts = dataDicts;
	}

}