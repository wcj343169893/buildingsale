package com.zuxia.buildingsale.business.entity;

import java.sql.Timestamp;
import java.util.HashSet;
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
	private Set dealInfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public ClientInfo() {
	}

	/** minimal constructor */
	public ClientInfo(String clientName, Short clientSex, String clientTell1,
			Timestamp clientTime) {
		this.clientName = clientName;
		this.clientSex = clientSex;
		this.clientTell1 = clientTell1;
		this.clientTime = clientTime;
	}

	/** full constructor */
	public ClientInfo(DataDict dataDict, Employee employee, String clientName,
			Short clientSex, String clientTell1, String clientTell2,
			String clientTell3, String clientEmail, String clientAddress,
			String clientPid, Timestamp clientTime, String clientRemark,
			Set dealInfos) {
		this.dataDict = dataDict;
		this.employee = employee;
		this.clientName = clientName;
		this.clientSex = clientSex;
		this.clientTell1 = clientTell1;
		this.clientTell2 = clientTell2;
		this.clientTell3 = clientTell3;
		this.clientEmail = clientEmail;
		this.clientAddress = clientAddress;
		this.clientPid = clientPid;
		this.clientTime = clientTime;
		this.clientRemark = clientRemark;
		this.dealInfos = dealInfos;
	}

	// Property accessors

	public Integer getClientId() {
		return this.clientId;
	}

	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	public DataDict getDataDict() {
		return this.dataDict;
	}

	public void setDataDict(DataDict dataDict) {
		this.dataDict = dataDict;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getClientName() {
		return this.clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public Short getClientSex() {
		return this.clientSex;
	}

	public void setClientSex(Short clientSex) {
		this.clientSex = clientSex;
	}

	public String getClientTell1() {
		return this.clientTell1;
	}

	public void setClientTell1(String clientTell1) {
		this.clientTell1 = clientTell1;
	}

	public String getClientTell2() {
		return this.clientTell2;
	}

	public void setClientTell2(String clientTell2) {
		this.clientTell2 = clientTell2;
	}

	public String getClientTell3() {
		return this.clientTell3;
	}

	public void setClientTell3(String clientTell3) {
		this.clientTell3 = clientTell3;
	}

	public String getClientEmail() {
		return this.clientEmail;
	}

	public void setClientEmail(String clientEmail) {
		this.clientEmail = clientEmail;
	}

	public String getClientAddress() {
		return this.clientAddress;
	}

	public void setClientAddress(String clientAddress) {
		this.clientAddress = clientAddress;
	}

	public String getClientPid() {
		return this.clientPid;
	}

	public void setClientPid(String clientPid) {
		this.clientPid = clientPid;
	}

	public Timestamp getClientTime() {
		return this.clientTime;
	}

	public void setClientTime(Timestamp clientTime) {
		this.clientTime = clientTime;
	}

	public String getClientRemark() {
		return this.clientRemark;
	}

	public void setClientRemark(String clientRemark) {
		this.clientRemark = clientRemark;
	}

	public Set getDealInfos() {
		return this.dealInfos;
	}

	public void setDealInfos(Set dealInfos) {
		this.dealInfos = dealInfos;
	}

}