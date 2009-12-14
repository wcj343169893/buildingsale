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
	 * houseInfos���Ը��� ������Ϣ
	 * 
	 */
	private List<HouseInfo> houseInfos = new ArrayList<HouseInfo>();
	/**
	 * clientInfos���Ը��� �ͻ���Ϣ
	 * 
	 */
	private List<ClientInfo> clientInfos = new ArrayList<ClientInfo>();
	/**
	 * employees���Ը��� Ա��
	 * 
	 */
	private List<Employee> employees = new ArrayList<Employee>();
	/**
	 * loftInfosForLoftBuildType���Ը��� ¥�̽�������
	 * 
	 */
	private List<DataDict> loftInfosForLoftBuildType = new ArrayList<DataDict>();
	/**
	 * loftInfosForLoftComtyType���Ը��� ¥����ҵ����
	 * 
	 */
	private List<DataDict> loftInfosForLoftComtyType = new ArrayList<DataDict>();
	/**
	 * dealInfosForDealState���Ը��� ���ױ��״̬
	 * 
	 */
	private List<DataDict> dealInfosForDealState = new ArrayList<DataDict>();
	/**
	 * dealInfosForDealPayStyle���Ը��� ���ױ�ĸ��ʽ
	 * 
	 */
	private List<DataDict> dealInfosForDealPayStyle = new ArrayList<DataDict>();

	/**
	 * ddId���Ե�get����
	 * 
	 * @return the ddId
	 */
	public Integer getDdId() {
		return ddId;
	}

	/**
	 * ddId���Ե�set����
	 * 
	 * @param ddId
	 *            the ddId to set
	 */
	public void setDdId(Integer ddId) {
		this.ddId = ddId;
	}

	/**
	 * dataDictType���Ե�get����
	 * 
	 * @return the dataDictType
	 */
	public DataDictType getDataDictType() {
		return dataDictType;
	}

	/**
	 * dataDictType���Ե�set����
	 * 
	 * @param dataDictType
	 *            the dataDictType to set
	 */
	public void setDataDictType(DataDictType dataDictType) {
		this.dataDictType = dataDictType;
	}

	/**
	 * ddValue���Ե�get����
	 * 
	 * @return the ddValue
	 */
	public String getDdValue() {
		return ddValue;
	}

	/**
	 * ddValue���Ե�set����
	 * 
	 * @param ddValue
	 *            the ddValue to set
	 */
	public void setDdValue(String ddValue) {
		this.ddValue = ddValue;
	}

	/**
	 * ddRemark���Ե�get����
	 * 
	 * @return the ddRemark
	 */
	public String getDdRemark() {
		return ddRemark;
	}

	/**
	 * ddRemark���Ե�set����
	 * 
	 * @param ddRemark
	 *            the ddRemark to set
	 */
	public void setDdRemark(String ddRemark) {
		this.ddRemark = ddRemark;
	}

	/**
	 * houseInfos���Ե�get����
	 * 
	 * @return the houseInfos
	 */
	public List<HouseInfo> getHouseInfos() {
		return houseInfos;
	}

	/**
	 * houseInfos���Ե�set����
	 * 
	 * @param houseInfos
	 *            the houseInfos to set
	 */
	public void setHouseInfos(List<HouseInfo> houseInfos) {
		this.houseInfos = houseInfos;
	}

	/**
	 * clientInfos���Ե�get����
	 * 
	 * @return the clientInfos
	 */
	public List<ClientInfo> getClientInfos() {
		return clientInfos;
	}

	/**
	 * clientInfos���Ե�set����
	 * 
	 * @param clientInfos
	 *            the clientInfos to set
	 */
	public void setClientInfos(List<ClientInfo> clientInfos) {
		this.clientInfos = clientInfos;
	}

	/**
	 * employees���Ե�get����
	 * 
	 * @return the employees
	 */
	public List<Employee> getEmployees() {
		return employees;
	}

	/**
	 * employees���Ե�set����
	 * 
	 * @param employees
	 *            the employees to set
	 */
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	/**
	 * loftInfosForLoftBuildType���Ե�get����
	 * 
	 * @return the loftInfosForLoftBuildType
	 */
	public List<DataDict> getLoftInfosForLoftBuildType() {
		return loftInfosForLoftBuildType;
	}

	/**
	 * loftInfosForLoftBuildType���Ե�set����
	 * 
	 * @param loftInfosForLoftBuildType
	 *            the loftInfosForLoftBuildType to set
	 */
	public void setLoftInfosForLoftBuildType(
			List<DataDict> loftInfosForLoftBuildType) {
		this.loftInfosForLoftBuildType = loftInfosForLoftBuildType;
	}

	/**
	 * loftInfosForLoftComtyType���Ե�get����
	 * 
	 * @return the loftInfosForLoftComtyType
	 */
	public List<DataDict> getLoftInfosForLoftComtyType() {
		return loftInfosForLoftComtyType;
	}

	/**
	 * loftInfosForLoftComtyType���Ե�set����
	 * 
	 * @param loftInfosForLoftComtyType
	 *            the loftInfosForLoftComtyType to set
	 */
	public void setLoftInfosForLoftComtyType(
			List<DataDict> loftInfosForLoftComtyType) {
		this.loftInfosForLoftComtyType = loftInfosForLoftComtyType;
	}

	/**
	 * dealInfosForDealState���Ե�get����
	 * 
	 * @return the dealInfosForDealState
	 */
	public List<DataDict> getDealInfosForDealState() {
		return dealInfosForDealState;
	}

	/**
	 * dealInfosForDealState���Ե�set����
	 * 
	 * @param dealInfosForDealState
	 *            the dealInfosForDealState to set
	 */
	public void setDealInfosForDealState(List<DataDict> dealInfosForDealState) {
		this.dealInfosForDealState = dealInfosForDealState;
	}

	/**
	 * dealInfosForDealPayStyle���Ե�get����
	 * 
	 * @return the dealInfosForDealPayStyle
	 */
	public List<DataDict> getDealInfosForDealPayStyle() {
		return dealInfosForDealPayStyle;
	}

	/**
	 * dealInfosForDealPayStyle���Ե�set����
	 * 
	 * @param dealInfosForDealPayStyle
	 *            the dealInfosForDealPayStyle to set
	 */
	public void setDealInfosForDealPayStyle(
			List<DataDict> dealInfosForDealPayStyle) {
		this.dealInfosForDealPayStyle = dealInfosForDealPayStyle;
	}

}