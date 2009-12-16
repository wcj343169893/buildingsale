package com.zuxia.buildingsale.sys.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.zuxia.buildingsale.business.entity.ClientInfo;
import com.zuxia.buildingsale.business.entity.DataDict;
import com.zuxia.buildingsale.business.entity.DealInfo;
import com.zuxia.buildingsale.house.entity.ShopInfo;

public class Employee implements java.io.Serializable {


	/**
	 * serialVersionUID Ù–‘∏≈ ˆ
	 * 
	 */
	private static final long serialVersionUID = -5235626715610849265L;
	private Integer empId;
	private ShopInfo shopInfo;
	private DataDict empState;
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
	private List<RoleInfo> roles = new ArrayList<RoleInfo>();
	private List<MenuInfo> menus=new ArrayList<MenuInfo>();
	private List<ClientInfo> clientInfos = new ArrayList<ClientInfo>();
	private List<DealInfo> dealinfos= new ArrayList<DealInfo>();
	
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public ShopInfo getShopInfo() {
		return shopInfo;
	}
	public void setShopInfo(ShopInfo shopInfo) {
		this.shopInfo = shopInfo;
	}
	
	public DataDict getEmpState() {
		return empState;
	}
	public void setEmpState(DataDict empState) {
		this.empState = empState;
	}
	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public String getEmpAccount() {
		return empAccount;
	}
	public void setEmpAccount(String empAccount) {
		this.empAccount = empAccount;
	}
	public String getEmpPass() {
		return empPass;
	}
	public void setEmpPass(String empPass) {
		this.empPass = empPass;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpPid() {
		return empPid;
	}
	public void setEmpPid(String empPid) {
		this.empPid = empPid;
	}
	public Integer getEmpSex() {
		return empSex;
	}
	public void setEmpSex(Integer empSex) {
		this.empSex = empSex;
	}
	public Date getEmpBirthday() {
		return empBirthday;
	}
	public void setEmpBirthday(Date empBirthday) {
		this.empBirthday = empBirthday;
	}
	public String getEmpTell() {
		return empTell;
	}
	public void setEmpTell(String empTell) {
		this.empTell = empTell;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public String getEmpRemark() {
		return empRemark;
	}
	public void setEmpRemark(String empRemark) {
		this.empRemark = empRemark;
	}
	public List<RoleInfo> getRoles() {
		return roles;
	}
	public void setRoles(List<RoleInfo> roles) {
		this.roles = roles;
	}
	public List<ClientInfo> getClientInfos() {
		return clientInfos;
	}
	public void setClientInfos(List<ClientInfo> clientInfos) {
		this.clientInfos = clientInfos;
	}
	public List<DealInfo> getDealinfos() {
		return dealinfos;
	}
	public void setDealinfos(List<DealInfo> dealinfos) {
		this.dealinfos = dealinfos;
	}
	public List<MenuInfo> getMenus() {
		return menus;
	}
	public void setMenus(List<MenuInfo> menus) {
		this.menus = menus;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", empAccount=" + empAccount + ", clientInfos=" + clientInfos
				+ ", dealinfos=" + dealinfos + ", roles=" + roles
				+ ", shopInfo=" + shopInfo + "]";
	}


	

}