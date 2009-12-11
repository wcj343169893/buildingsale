package com.zuxia.buildingsale.sys.entity;

/**
 * EmpMenu entity. @author MyEclipse Persistence Tools
 */

public class EmpMenu implements java.io.Serializable {

	// Fields

	private Integer emId;
	private MenuInfo menuInfo;
	private Employee employee;

	// Constructors

	/** default constructor */
	public EmpMenu() {
	}

	/** full constructor */
	public EmpMenu(MenuInfo menuInfo, Employee employee) {
		this.menuInfo = menuInfo;
		this.employee = employee;
	}

	// Property accessors

	public Integer getEmId() {
		return this.emId;
	}

	public void setEmId(Integer emId) {
		this.emId = emId;
	}

	public MenuInfo getMenuInfo() {
		return this.menuInfo;
	}

	public void setMenuInfo(MenuInfo menuInfo) {
		this.menuInfo = menuInfo;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}