package com.zuxia.buildingsale.sys.entity;

import java.util.ArrayList;
import java.util.List;


public class RoleInfo implements java.io.Serializable {

	// Fields

	/**
	 * serialVersionUID Ù–‘∏≈ ˆ
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer roleId;
	private String roleName;
	private String roleRemark;
	private List<MenuInfo> menus = new ArrayList<MenuInfo>();
	private List<Employee> employees = new ArrayList<Employee>();
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleRemark() {
		return roleRemark;
	}
	public void setRoleRemark(String roleRemark) {
		this.roleRemark = roleRemark;
	}
	public List<MenuInfo> getMenus() {
		return menus;
	}
	public void setMenus(List<MenuInfo> menus) {
		this.menus = menus;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	
}