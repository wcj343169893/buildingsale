package com.zuxia.buildingsale.sys.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * RoleInfo entity. @author MyEclipse Persistence Tools
 */

public class RoleInfo implements java.io.Serializable {

	// Fields

	private Integer roleId;
	private String roleName;
	private String roleRemark;
	private Set roleMenus = new HashSet(0);
	private Set empRoles = new HashSet(0);

	// Constructors

	/** default constructor */
	public RoleInfo() {
	}

	/** minimal constructor */
	public RoleInfo(String roleName) {
		this.roleName = roleName;
	}

	/** full constructor */
	public RoleInfo(String roleName, String roleRemark, Set roleMenus,
			Set empRoles) {
		this.roleName = roleName;
		this.roleRemark = roleRemark;
		this.roleMenus = roleMenus;
		this.empRoles = empRoles;
	}

	// Property accessors

	public Integer getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleRemark() {
		return this.roleRemark;
	}

	public void setRoleRemark(String roleRemark) {
		this.roleRemark = roleRemark;
	}

	public Set getRoleMenus() {
		return this.roleMenus;
	}

	public void setRoleMenus(Set roleMenus) {
		this.roleMenus = roleMenus;
	}

	public Set getEmpRoles() {
		return this.empRoles;
	}

	public void setEmpRoles(Set empRoles) {
		this.empRoles = empRoles;
	}

}