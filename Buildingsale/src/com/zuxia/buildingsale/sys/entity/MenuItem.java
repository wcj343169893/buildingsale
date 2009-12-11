package com.zuxia.buildingsale.sys.entity;

/**
 * MenuItem entity. @author MyEclipse Persistence Tools
 */

public class MenuItem implements java.io.Serializable {

	// Fields

	private Integer miId;
	private MenuInfo menuInfo;
	private String miUrl;
	private String miRemark;

	// Constructors

	/** default constructor */
	public MenuItem() {
	}

	/** minimal constructor */
	public MenuItem(String miUrl) {
		this.miUrl = miUrl;
	}

	/** full constructor */
	public MenuItem(MenuInfo menuInfo, String miUrl, String miRemark) {
		this.menuInfo = menuInfo;
		this.miUrl = miUrl;
		this.miRemark = miRemark;
	}

	// Property accessors

	public Integer getMiId() {
		return this.miId;
	}

	public void setMiId(Integer miId) {
		this.miId = miId;
	}

	public MenuInfo getMenuInfo() {
		return this.menuInfo;
	}

	public void setMenuInfo(MenuInfo menuInfo) {
		this.menuInfo = menuInfo;
	}

	public String getMiUrl() {
		return this.miUrl;
	}

	public void setMiUrl(String miUrl) {
		this.miUrl = miUrl;
	}

	public String getMiRemark() {
		return this.miRemark;
	}

	public void setMiRemark(String miRemark) {
		this.miRemark = miRemark;
	}

}