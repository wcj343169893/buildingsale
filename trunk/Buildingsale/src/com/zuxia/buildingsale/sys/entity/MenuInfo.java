package com.zuxia.buildingsale.sys.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * MenuInfo entity. @author MyEclipse Persistence Tools
 */

public class MenuInfo implements java.io.Serializable {

	// Fields

	private Integer menuId;
	private String menuNo;
	private String menuName;
	private String menuParent;
	private String menuUrl;
	private String menuTarget;
	private String menuImg;
	private String menuDesc;
	private String menuRemark;
	private Set empMenus = new HashSet(0);
	private Set menuItems = new HashSet(0);
	private Set roleMenus = new HashSet(0);

	// Constructors

	/** default constructor */
	public MenuInfo() {
	}

	/** minimal constructor */
	public MenuInfo(String menuNo, String menuName, String menuParent) {
		this.menuNo = menuNo;
		this.menuName = menuName;
		this.menuParent = menuParent;
	}

	/** full constructor */
	public MenuInfo(String menuNo, String menuName, String menuParent,
			String menuUrl, String menuTarget, String menuImg, String menuDesc,
			String menuRemark, Set empMenus, Set menuItems, Set roleMenus) {
		this.menuNo = menuNo;
		this.menuName = menuName;
		this.menuParent = menuParent;
		this.menuUrl = menuUrl;
		this.menuTarget = menuTarget;
		this.menuImg = menuImg;
		this.menuDesc = menuDesc;
		this.menuRemark = menuRemark;
		this.empMenus = empMenus;
		this.menuItems = menuItems;
		this.roleMenus = roleMenus;
	}

	// Property accessors

	public Integer getMenuId() {
		return this.menuId;
	}

	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}

	public String getMenuNo() {
		return this.menuNo;
	}

	public void setMenuNo(String menuNo) {
		this.menuNo = menuNo;
	}

	public String getMenuName() {
		return this.menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getMenuParent() {
		return this.menuParent;
	}

	public void setMenuParent(String menuParent) {
		this.menuParent = menuParent;
	}

	public String getMenuUrl() {
		return this.menuUrl;
	}

	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}

	public String getMenuTarget() {
		return this.menuTarget;
	}

	public void setMenuTarget(String menuTarget) {
		this.menuTarget = menuTarget;
	}

	public String getMenuImg() {
		return this.menuImg;
	}

	public void setMenuImg(String menuImg) {
		this.menuImg = menuImg;
	}

	public String getMenuDesc() {
		return this.menuDesc;
	}

	public void setMenuDesc(String menuDesc) {
		this.menuDesc = menuDesc;
	}

	public String getMenuRemark() {
		return this.menuRemark;
	}

	public void setMenuRemark(String menuRemark) {
		this.menuRemark = menuRemark;
	}

	public Set getEmpMenus() {
		return this.empMenus;
	}

	public void setEmpMenus(Set empMenus) {
		this.empMenus = empMenus;
	}

	public Set getMenuItems() {
		return this.menuItems;
	}

	public void setMenuItems(Set menuItems) {
		this.menuItems = menuItems;
	}

	public Set getRoleMenus() {
		return this.roleMenus;
	}

	public void setRoleMenus(Set roleMenus) {
		this.roleMenus = roleMenus;
	}

}