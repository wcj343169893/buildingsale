package com.zuxia.buildingsale.sys.entity;

/**
 * RoleMenu entity. @author MyEclipse Persistence Tools
 */

public class RoleMenu implements java.io.Serializable {

	// Fields

	private Integer rmId;
	private MenuInfo menuInfo;
	private RoleInfo roleInfo;

	// Constructors

	/** default constructor */
	public RoleMenu() {
	}

	/** full constructor */
	public RoleMenu(MenuInfo menuInfo, RoleInfo roleInfo) {
		this.menuInfo = menuInfo;
		this.roleInfo = roleInfo;
	}

	// Property accessors

	public Integer getRmId() {
		return this.rmId;
	}

	public void setRmId(Integer rmId) {
		this.rmId = rmId;
	}

	public MenuInfo getMenuInfo() {
		return this.menuInfo;
	}

	public void setMenuInfo(MenuInfo menuInfo) {
		this.menuInfo = menuInfo;
	}

	public RoleInfo getRoleInfo() {
		return this.roleInfo;
	}

	public void setRoleInfo(RoleInfo roleInfo) {
		this.roleInfo = roleInfo;
	}
	
	@Override
	public String toString() {
		return this.rmId+",RoleMenu [menuInfo=" + menuInfo.getMenuId()+","+menuInfo.getMenuName() + ", roleInfo=" + roleInfo.getRoleId()+","+roleInfo.getRoleName() + "]";
	}

}