package com.zuxia.buildingsale.sys.entity;

import java.util.ArrayList;
import java.util.List;


public class MenuInfo implements java.io.Serializable {

	/**
	 * serialVersionUID Ù–‘∏≈ ˆ
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer menuId;
	private String menuNo;
	private String menuName;
	private String menuParent;
	private String menuUrl;
	private String menuTarget;
	private String menuImg;
	private String menuDesc;
	private String menuRemark;
	private MenuItem menuitem;
	private List<RoleInfo> roles= new ArrayList<RoleInfo>();
	private List<Employee> employees = new ArrayList<Employee>();
	public Integer getMenuId() {
		return menuId;
	}
	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}
	public String getMenuNo() {
		return menuNo;
	}
	public void setMenuNo(String menuNo) {
		this.menuNo = menuNo;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public String getMenuParent() {
		return menuParent;
	}
	public void setMenuParent(String menuParent) {
		this.menuParent = menuParent;
	}
	public String getMenuUrl() {
		return menuUrl;
	}
	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}
	public String getMenuTarget() {
		return menuTarget;
	}
	public void setMenuTarget(String menuTarget) {
		this.menuTarget = menuTarget;
	}
	public String getMenuImg() {
		return menuImg;
	}
	public void setMenuImg(String menuImg) {
		this.menuImg = menuImg;
	}
	public String getMenuDesc() {
		return menuDesc;
	}
	public void setMenuDesc(String menuDesc) {
		this.menuDesc = menuDesc;
	}
	public String getMenuRemark() {
		return menuRemark;
	}
	public void setMenuRemark(String menuRemark) {
		this.menuRemark = menuRemark;
	}
	public MenuItem getMenuitem() {
		return menuitem;
	}
	public void setMenuitem(MenuItem menuitem) {
		this.menuitem = menuitem;
	}
	public List<RoleInfo> getRoles() {
		return roles;
	}
	public void setRoles(List<RoleInfo> roles) {
		this.roles = roles;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	
	
}