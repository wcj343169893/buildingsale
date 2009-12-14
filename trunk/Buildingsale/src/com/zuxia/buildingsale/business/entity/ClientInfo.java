package com.zuxia.buildingsale.business.entity;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.zuxia.buildingsale.sys.entity.Employee;

/**
 * ClientInfo entity. @author MyEclipse Persistence Tools
 */

public class ClientInfo implements java.io.Serializable {

	// Fields

	private Integer clientId;
	private DataDict dataDict;
	private Employee employee;
	private String clientName;
	private Short clientSex;
	private String clientTell1;
	private String clientTell2;
	private String clientTell3;
	private String clientEmail;
	private String clientAddress;
	private String clientPid;
	private Timestamp clientTime;
	private String clientRemark;
	private List<DealInfo> dealInfos = new ArrayList<DealInfo>();

	/**
	 * clientId���Ե�get����
	 * 
	 * @return the clientId
	 */
	public Integer getClientId() {
		return clientId;
	}

	/**
	 * clientId���Ե�set����
	 * 
	 * @param clientId
	 *            the clientId to set
	 */
	public void setClientId(Integer clientId) {
		this.clientId = clientId;
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
	 * employee���Ե�get����
	 * 
	 * @return the employee
	 */
	public Employee getEmployee() {
		return employee;
	}

	/**
	 * employee���Ե�set����
	 * 
	 * @param employee
	 *            the employee to set
	 */
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	/**
	 * clientName���Ե�get����
	 * 
	 * @return the clientName
	 */
	public String getClientName() {
		return clientName;
	}

	/**
	 * clientName���Ե�set����
	 * 
	 * @param clientName
	 *            the clientName to set
	 */
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	/**
	 * clientSex���Ե�get����
	 * 
	 * @return the clientSex
	 */
	public Short getClientSex() {
		return clientSex;
	}

	/**
	 * clientSex���Ե�set����
	 * 
	 * @param clientSex
	 *            the clientSex to set
	 */
	public void setClientSex(Short clientSex) {
		this.clientSex = clientSex;
	}

	/**
	 * clientTell1���Ե�get����
	 * 
	 * @return the clientTell1
	 */
	public String getClientTell1() {
		return clientTell1;
	}

	/**
	 * clientTell1���Ե�set����
	 * 
	 * @param clientTell1
	 *            the clientTell1 to set
	 */
	public void setClientTell1(String clientTell1) {
		this.clientTell1 = clientTell1;
	}

	/**
	 * clientTell2���Ե�get����
	 * 
	 * @return the clientTell2
	 */
	public String getClientTell2() {
		return clientTell2;
	}

	/**
	 * clientTell2���Ե�set����
	 * 
	 * @param clientTell2
	 *            the clientTell2 to set
	 */
	public void setClientTell2(String clientTell2) {
		this.clientTell2 = clientTell2;
	}

	/**
	 * clientTell3���Ե�get����
	 * 
	 * @return the clientTell3
	 */
	public String getClientTell3() {
		return clientTell3;
	}

	/**
	 * clientTell3���Ե�set����
	 * 
	 * @param clientTell3
	 *            the clientTell3 to set
	 */
	public void setClientTell3(String clientTell3) {
		this.clientTell3 = clientTell3;
	}

	/**
	 * clientEmail���Ե�get����
	 * 
	 * @return the clientEmail
	 */
	public String getClientEmail() {
		return clientEmail;
	}

	/**
	 * clientEmail���Ե�set����
	 * 
	 * @param clientEmail
	 *            the clientEmail to set
	 */
	public void setClientEmail(String clientEmail) {
		this.clientEmail = clientEmail;
	}

	/**
	 * clientAddress���Ե�get����
	 * 
	 * @return the clientAddress
	 */
	public String getClientAddress() {
		return clientAddress;
	}

	/**
	 * clientAddress���Ե�set����
	 * 
	 * @param clientAddress
	 *            the clientAddress to set
	 */
	public void setClientAddress(String clientAddress) {
		this.clientAddress = clientAddress;
	}

	/**
	 * clientPid���Ե�get����
	 * 
	 * @return the clientPid
	 */
	public String getClientPid() {
		return clientPid;
	}

	/**
	 * clientPid���Ե�set����
	 * 
	 * @param clientPid
	 *            the clientPid to set
	 */
	public void setClientPid(String clientPid) {
		this.clientPid = clientPid;
	}

	/**
	 * clientTime���Ե�get����
	 * 
	 * @return the clientTime
	 */
	public Timestamp getClientTime() {
		return clientTime;
	}

	/**
	 * clientTime���Ե�set����
	 * 
	 * @param clientTime
	 *            the clientTime to set
	 */
	public void setClientTime(Timestamp clientTime) {
		this.clientTime = clientTime;
	}

	/**
	 * clientRemark���Ե�get����
	 * 
	 * @return the clientRemark
	 */
	public String getClientRemark() {
		return clientRemark;
	}

	/**
	 * clientRemark���Ե�set����
	 * 
	 * @param clientRemark
	 *            the clientRemark to set
	 */
	public void setClientRemark(String clientRemark) {
		this.clientRemark = clientRemark;
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