package com.zuxia.buildingsale.entity;

/**
 * EmpRole entity. @author MyEclipse Persistence Tools
 */

public class EmpRole implements java.io.Serializable {

	// Fields

	private Integer mrId;
	private RoleInfo roleInfo;
	private Employee employee;

	// Constructors

	/** default constructor */
	public EmpRole() {
	}

	/** full constructor */
	public EmpRole(RoleInfo roleInfo, Employee employee) {
		this.roleInfo = roleInfo;
		this.employee = employee;
	}

	// Property accessors

	public Integer getMrId() {
		return this.mrId;
	}

	public void setMrId(Integer mrId) {
		this.mrId = mrId;
	}

	public RoleInfo getRoleInfo() {
		return this.roleInfo;
	}

	public void setRoleInfo(RoleInfo roleInfo) {
		this.roleInfo = roleInfo;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}