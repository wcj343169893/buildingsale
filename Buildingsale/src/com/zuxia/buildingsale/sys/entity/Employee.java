package com.zuxia.buildingsale.sys.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.zuxia.buildingsale.business.entity.DataDict;
import com.zuxia.buildingsale.house.entity.ShopInfo;

/**
 * Employee entity. @author MyEclipse Persistence Tools
 */

public class Employee implements java.io.Serializable {

	// Fields

	private Integer empId;
	private ShopInfo shopInfo;
	private DataDict dataDict;
	private String empNo;
	private String empAccount;
	private String empPass;
	private String empName;
	private String empPid;
	private Integer empSex;
	private Date empBirthday;
	private String empTell;
	private String empAddress;
	private String empEmail;
	private String empRemark;
	private Set empMenus = new HashSet(0);
	private Set empRoles = new HashSet(0);
	private Set clientInfos = new HashSet(0);
	private Set dealInfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public Employee() {
	}

	/** minimal constructor */
	public Employee(String empNo, String empAccount, String empPass,
			String empName, String empPid, Integer empSex) {
		this.empNo = empNo;
		this.empAccount = empAccount;
		this.empPass = empPass;
		this.empName = empName;
		this.empPid = empPid;
		this.empSex = empSex;
	}

	/** full constructor */
	public Employee(ShopInfo shopInfo, DataDict dataDict, String empNo,
			String empAccount, String empPass, String empName, String empPid,
			Integer empSex, Date empBirthday, String empTell, String empAddress,
			String empEmail, String empRemark, Set empMenus, Set empRoles,
			Set clientInfos, Set dealInfos) {
		this.shopInfo = shopInfo;
		this.dataDict = dataDict;
		this.empNo = empNo;
		this.empAccount = empAccount;
		this.empPass = empPass;
		this.empName = empName;
		this.empPid = empPid;
		this.empSex = empSex;
		this.empBirthday = empBirthday;
		this.empTell = empTell;
		this.empAddress = empAddress;
		this.empEmail = empEmail;
		this.empRemark = empRemark;
		this.empMenus = empMenus;
		this.empRoles = empRoles;
		this.clientInfos = clientInfos;
		this.dealInfos = dealInfos;
	}

	// Property accessors

	public Integer getEmpId() {
		return this.empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public ShopInfo getShopInfo() {
		return this.shopInfo;
	}

	public void setShopInfo(ShopInfo shopInfo) {
		this.shopInfo = shopInfo;
	}

	public DataDict getDataDict() {
		return this.dataDict;
	}

	public void setDataDict(DataDict dataDict) {
		this.dataDict = dataDict;
	}

	public String getEmpNo() {
		return this.empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getEmpAccount() {
		return this.empAccount;
	}

	public void setEmpAccount(String empAccount) {
		this.empAccount = empAccount;
	}

	public String getEmpPass() {
		return this.empPass;
	}

	public void setEmpPass(String empPass) {
		this.empPass = empPass;
	}

	public String getEmpName() {
		return this.empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpPid() {
		return this.empPid;
	}

	public void setEmpPid(String empPid) {
		this.empPid = empPid;
	}

	public Integer getEmpSex() {
		return this.empSex;
	}

	public void setEmpSex(Integer empSex) {
		this.empSex = empSex;
	}

	public Date getEmpBirthday() {
		return this.empBirthday;
	}

	public void setEmpBirthday(Date empBirthday) {
		this.empBirthday = empBirthday;
	}

	public String getEmpTell() {
		return this.empTell;
	}

	public void setEmpTell(String empTell) {
		this.empTell = empTell;
	}

	public String getEmpAddress() {
		return this.empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public String getEmpEmail() {
		return this.empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpRemark() {
		return this.empRemark;
	}

	public void setEmpRemark(String empRemark) {
		this.empRemark = empRemark;
	}

	public Set getEmpMenus() {
		return this.empMenus;
	}

	public void setEmpMenus(Set empMenus) {
		this.empMenus = empMenus;
	}

	public Set getEmpRoles() {
		return this.empRoles;
	}

	public void setEmpRoles(Set empRoles) {
		this.empRoles = empRoles;
	}

	public Set getClientInfos() {
		return this.clientInfos;
	}

	public void setClientInfos(Set clientInfos) {
		this.clientInfos = clientInfos;
	}

	public Set getDealInfos() {
		return this.dealInfos;
	}

	public void setDealInfos(Set dealInfos) {
		this.dealInfos = dealInfos;
	}

}