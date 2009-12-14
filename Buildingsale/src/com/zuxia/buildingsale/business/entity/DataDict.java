package com.zuxia.buildingsale.business.entity;

import java.util.ArrayList;
import java.util.List;

import com.zuxia.buildingsale.house.entity.HouseInfo;
import com.zuxia.buildingsale.sys.entity.Employee;

/**
 * DataDict entity. @author MyEclipse Persistence Tools
 */

public class DataDict implements java.io.Serializable {

	// Fields

	private Integer ddId;
	private DataDictType dataDictType;
	private String ddValue;
	private String ddRemark;
	/**
	 * houseInfos属性概述 房屋信息
	 * 
	 */
	private List<HouseInfo> houseInfos = new ArrayList<HouseInfo>();
	/**
	 * clientInfos属性概述 客户信息
	 * 
	 */
	private List<ClientInfo> clientInfos = new ArrayList<ClientInfo>();
	/**
	 * employees属性概述 员工
	 * 
	 */
	private List<Employee> employees = new ArrayList<Employee>();
	/**
	 * loftInfosForLoftBuildType属性概述 楼盘建筑类型
	 * 
	 */
	private List<DataDict> loftInfosForLoftBuildType = new ArrayList<DataDict>();
	/**
	 * loftInfosForLoftComtyType属性概述 楼盘物业类型
	 * 
	 */
	private List<DataDict> loftInfosForLoftComtyType = new ArrayList<DataDict>();
	/**
	 * dealInfosForDealState属性概述 交易表的状态
	 * 
	 */
	private List<DataDict> dealInfosForDealState = new ArrayList<DataDict>();
	/**
	 * dealInfosForDealPayStyle属性概述 交易表的付款方式
	 * 
	 */
	private List<DataDict> dealInfosForDealPayStyle = new ArrayList<DataDict>();

	/**
	 * ddId属性的get方法
	 * 
	 * @return the ddId
	 */
	public Integer getDdId() {
		return ddId;
	}

	/**
	 * ddId属性的set方法
	 * 
	 * @param ddId
	 *            the ddId to set
	 */
	public void setDdId(Integer ddId) {
		this.ddId = ddId;
	}

	/**
	 * dataDictType属性的get方法
	 * 
	 * @return the dataDictType
	 */
	public DataDictType getDataDictType() {
		return dataDictType;
	}

	/**
	 * dataDictType属性的set方法
	 * 
	 * @param dataDictType
	 *            the dataDictType to set
	 */
	public void setDataDictType(DataDictType dataDictType) {
		this.dataDictType = dataDictType;
	}

	/**
	 * ddValue属性的get方法
	 * 
	 * @return the ddValue
	 */
	public String getDdValue() {
		return ddValue;
	}

	/**
	 * ddValue属性的set方法
	 * 
	 * @param ddValue
	 *            the ddValue to set
	 */
	public void setDdValue(String ddValue) {
		this.ddValue = ddValue;
	}

	/**
	 * ddRemark属性的get方法
	 * 
	 * @return the ddRemark
	 */
	public String getDdRemark() {
		return ddRemark;
	}

	/**
	 * ddRemark属性的set方法
	 * 
	 * @param ddRemark
	 *            the ddRemark to set
	 */
	public void setDdRemark(String ddRemark) {
		this.ddRemark = ddRemark;
	}

	/**
	 * houseInfos属性的get方法
	 * 
	 * @return the houseInfos
	 */
	public List<HouseInfo> getHouseInfos() {
		return houseInfos;
	}

	/**
	 * houseInfos属性的set方法
	 * 
	 * @param houseInfos
	 *            the houseInfos to set
	 */
	public void setHouseInfos(List<HouseInfo> houseInfos) {
		this.houseInfos = houseInfos;
	}

	/**
	 * clientInfos属性的get方法
	 * 
	 * @return the clientInfos
	 */
	public List<ClientInfo> getClientInfos() {
		return clientInfos;
	}

	/**
	 * clientInfos属性的set方法
	 * 
	 * @param clientInfos
	 *            the clientInfos to set
	 */
	public void setClientInfos(List<ClientInfo> clientInfos) {
		this.clientInfos = clientInfos;
	}

	/**
	 * employees属性的get方法
	 * 
	 * @return the employees
	 */
	public List<Employee> getEmployees() {
		return employees;
	}

	/**
	 * employees属性的set方法
	 * 
	 * @param employees
	 *            the employees to set
	 */
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	/**
	 * loftInfosForLoftBuildType属性的get方法
	 * 
	 * @return the loftInfosForLoftBuildType
	 */
	public List<DataDict> getLoftInfosForLoftBuildType() {
		return loftInfosForLoftBuildType;
	}

	/**
	 * loftInfosForLoftBuildType属性的set方法
	 * 
	 * @param loftInfosForLoftBuildType
	 *            the loftInfosForLoftBuildType to set
	 */
	public void setLoftInfosForLoftBuildType(
			List<DataDict> loftInfosForLoftBuildType) {
		this.loftInfosForLoftBuildType = loftInfosForLoftBuildType;
	}

	/**
	 * loftInfosForLoftComtyType属性的get方法
	 * 
	 * @return the loftInfosForLoftComtyType
	 */
	public List<DataDict> getLoftInfosForLoftComtyType() {
		return loftInfosForLoftComtyType;
	}

	/**
	 * loftInfosForLoftComtyType属性的set方法
	 * 
	 * @param loftInfosForLoftComtyType
	 *            the loftInfosForLoftComtyType to set
	 */
	public void setLoftInfosForLoftComtyType(
			List<DataDict> loftInfosForLoftComtyType) {
		this.loftInfosForLoftComtyType = loftInfosForLoftComtyType;
	}

	/**
	 * dealInfosForDealState属性的get方法
	 * 
	 * @return the dealInfosForDealState
	 */
	public List<DataDict> getDealInfosForDealState() {
		return dealInfosForDealState;
	}

	/**
	 * dealInfosForDealState属性的set方法
	 * 
	 * @param dealInfosForDealState
	 *            the dealInfosForDealState to set
	 */
	public void setDealInfosForDealState(List<DataDict> dealInfosForDealState) {
		this.dealInfosForDealState = dealInfosForDealState;
	}

	/**
	 * dealInfosForDealPayStyle属性的get方法
	 * 
	 * @return the dealInfosForDealPayStyle
	 */
	public List<DataDict> getDealInfosForDealPayStyle() {
		return dealInfosForDealPayStyle;
	}

	/**
	 * dealInfosForDealPayStyle属性的set方法
	 * 
	 * @param dealInfosForDealPayStyle
	 *            the dealInfosForDealPayStyle to set
	 */
	public void setDealInfosForDealPayStyle(
			List<DataDict> dealInfosForDealPayStyle) {
		this.dealInfosForDealPayStyle = dealInfosForDealPayStyle;
	}

}