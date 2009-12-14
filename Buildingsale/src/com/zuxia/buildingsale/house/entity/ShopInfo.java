package com.zuxia.buildingsale.house.entity;

import java.util.ArrayList;
import java.util.List;

import com.zuxia.buildingsale.sys.entity.Employee;

/**
 * ShopInfo概要说明 售楼部信息
 * 
 * 
 * @author zcq100 chaojun
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
	/**
	 * employees属性概述
	 *  员工
	 */
	private List<Employee> employees = new ArrayList<Employee>();
	/**
	 * loftShops属性概述
	 * 	楼盘
	 */
	private List<LoftInfo> loftInfos = new ArrayList<LoftInfo>();
	/**
	 * shopId属性的get方法
	 * @return the shopId
	 */
	public Integer getShopId() {
		return shopId;
	}
	/**
	 * shopId属性的set方法
	 * @param shopId the shopId to set
	 */
	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}
	/**
	 * shopNo属性的get方法
	 * @return the shopNo
	 */
	public String getShopNo() {
		return shopNo;
	}
	/**
	 * shopNo属性的set方法
	 * @param shopNo the shopNo to set
	 */
	public void setShopNo(String shopNo) {
		this.shopNo = shopNo;
	}
	/**
	 * shopName属性的get方法
	 * @return the shopName
	 */
	public String getShopName() {
		return shopName;
	}
	/**
	 * shopName属性的set方法
	 * @param shopName the shopName to set
	 */
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	/**
	 * shopAddress属性的get方法
	 * @return the shopAddress
	 */
	public String getShopAddress() {
		return shopAddress;
	}
	/**
	 * shopAddress属性的set方法
	 * @param shopAddress the shopAddress to set
	 */
	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}
	/**
	 * shopTellOne属性的get方法
	 * @return the shopTellOne
	 */
	public String getShopTellOne() {
		return shopTellOne;
	}
	/**
	 * shopTellOne属性的set方法
	 * @param shopTellOne the shopTellOne to set
	 */
	public void setShopTellOne(String shopTellOne) {
		this.shopTellOne = shopTellOne;
	}
	/**
	 * shopTellTwo属性的get方法
	 * @return the shopTellTwo
	 */
	public String getShopTellTwo() {
		return shopTellTwo;
	}
	/**
	 * shopTellTwo属性的set方法
	 * @param shopTellTwo the shopTellTwo to set
	 */
	public void setShopTellTwo(String shopTellTwo) {
		this.shopTellTwo = shopTellTwo;
	}
	/**
	 * shopTellThree属性的get方法
	 * @return the shopTellThree
	 */
	public String getShopTellThree() {
		return shopTellThree;
	}
	/**
	 * shopTellThree属性的set方法
	 * @param shopTellThree the shopTellThree to set
	 */
	public void setShopTellThree(String shopTellThree) {
		this.shopTellThree = shopTellThree;
	}
	/**
	 * shopTellFour属性的get方法
	 * @return the shopTellFour
	 */
	public String getShopTellFour() {
		return shopTellFour;
	}
	/**
	 * shopTellFour属性的set方法
	 * @param shopTellFour the shopTellFour to set
	 */
	public void setShopTellFour(String shopTellFour) {
		this.shopTellFour = shopTellFour;
	}
	/**
	 * shopRemark属性的get方法
	 * @return the shopRemark
	 */
	public String getShopRemark() {
		return shopRemark;
	}
	/**
	 * shopRemark属性的set方法
	 * @param shopRemark the shopRemark to set
	 */
	public void setShopRemark(String shopRemark) {
		this.shopRemark = shopRemark;
	}
	/**
	 * employees属性的get方法
	 * @return the employees
	 */
	public List<Employee> getEmployees() {
		return employees;
	}
	/**
	 * employees属性的set方法
	 * @param employees the employees to set
	 */
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	/**
	 * loftInfos属性的get方法
	 * @return the loftInfos
	 */
	public List<LoftInfo> getLoftInfos() {
		return loftInfos;
	}
	/**
	 * loftInfos属性的set方法
	 * @param loftInfos the loftInfos to set
	 */
	public void setLoftInfos(List<LoftInfo> loftInfos) {
		this.loftInfos = loftInfos;
	}

	

}