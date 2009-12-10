package com.zuxia.buildingsale.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * ShopInfo entity. @author MyEclipse Persistence Tools
 */

public class ShopInfo implements java.io.Serializable {

	// Fields

	private Integer shopId;
	private String shopNo;
	private String shopName;
	private String shopAddress;
	private String shopTellOne;
	private String shopTellTwo;
	private String shopTellThree;
	private String shopTellFour;
	private String shopRemark;
	private Set employees = new HashSet(0);
	private Set loftShops = new HashSet(0);

	// Constructors

	/** default constructor */
	public ShopInfo() {
	}

	/** minimal constructor */
	public ShopInfo(String shopNo, String shopName, String shopAddress,
			String shopTellOne) {
		this.shopNo = shopNo;
		this.shopName = shopName;
		this.shopAddress = shopAddress;
		this.shopTellOne = shopTellOne;
	}

	/** full constructor */
	public ShopInfo(String shopNo, String shopName, String shopAddress,
			String shopTellOne, String shopTellTwo, String shopTellThree,
			String shopTellFour, String shopRemark, Set employees, Set loftShops) {
		this.shopNo = shopNo;
		this.shopName = shopName;
		this.shopAddress = shopAddress;
		this.shopTellOne = shopTellOne;
		this.shopTellTwo = shopTellTwo;
		this.shopTellThree = shopTellThree;
		this.shopTellFour = shopTellFour;
		this.shopRemark = shopRemark;
		this.employees = employees;
		this.loftShops = loftShops;
	}

	// Property accessors

	public Integer getShopId() {
		return this.shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public String getShopNo() {
		return this.shopNo;
	}

	public void setShopNo(String shopNo) {
		this.shopNo = shopNo;
	}

	public String getShopName() {
		return this.shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopAddress() {
		return this.shopAddress;
	}

	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}

	public String getShopTellOne() {
		return this.shopTellOne;
	}

	public void setShopTellOne(String shopTellOne) {
		this.shopTellOne = shopTellOne;
	}

	public String getShopTellTwo() {
		return this.shopTellTwo;
	}

	public void setShopTellTwo(String shopTellTwo) {
		this.shopTellTwo = shopTellTwo;
	}

	public String getShopTellThree() {
		return this.shopTellThree;
	}

	public void setShopTellThree(String shopTellThree) {
		this.shopTellThree = shopTellThree;
	}

	public String getShopTellFour() {
		return this.shopTellFour;
	}

	public void setShopTellFour(String shopTellFour) {
		this.shopTellFour = shopTellFour;
	}

	public String getShopRemark() {
		return this.shopRemark;
	}

	public void setShopRemark(String shopRemark) {
		this.shopRemark = shopRemark;
	}

	public Set getEmployees() {
		return this.employees;
	}

	public void setEmployees(Set employees) {
		this.employees = employees;
	}

	public Set getLoftShops() {
		return this.loftShops;
	}

	public void setLoftShops(Set loftShops) {
		this.loftShops = loftShops;
	}

}