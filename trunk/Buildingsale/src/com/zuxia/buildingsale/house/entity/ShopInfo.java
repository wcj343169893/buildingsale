package com.zuxia.buildingsale.house.entity;

import java.util.ArrayList;
import java.util.List;

import com.zuxia.buildingsale.sys.entity.Employee;

/**
 * ShopInfo��Ҫ˵�� ��¥����Ϣ
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
	 * employees���Ը���
	 *  Ա��
	 */
	private List<Employee> employees = new ArrayList<Employee>();
	/**
	 * loftShops���Ը���
	 * 	¥��
	 */
	private List<LoftInfo> loftInfos = new ArrayList<LoftInfo>();
	/**
	 * shopId���Ե�get����
	 * @return the shopId
	 */
	public Integer getShopId() {
		return shopId;
	}
	/**
	 * shopId���Ե�set����
	 * @param shopId the shopId to set
	 */
	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}
	/**
	 * shopNo���Ե�get����
	 * @return the shopNo
	 */
	public String getShopNo() {
		return shopNo;
	}
	/**
	 * shopNo���Ե�set����
	 * @param shopNo the shopNo to set
	 */
	public void setShopNo(String shopNo) {
		this.shopNo = shopNo;
	}
	/**
	 * shopName���Ե�get����
	 * @return the shopName
	 */
	public String getShopName() {
		return shopName;
	}
	/**
	 * shopName���Ե�set����
	 * @param shopName the shopName to set
	 */
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	/**
	 * shopAddress���Ե�get����
	 * @return the shopAddress
	 */
	public String getShopAddress() {
		return shopAddress;
	}
	/**
	 * shopAddress���Ե�set����
	 * @param shopAddress the shopAddress to set
	 */
	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}
	/**
	 * shopTellOne���Ե�get����
	 * @return the shopTellOne
	 */
	public String getShopTellOne() {
		return shopTellOne;
	}
	/**
	 * shopTellOne���Ե�set����
	 * @param shopTellOne the shopTellOne to set
	 */
	public void setShopTellOne(String shopTellOne) {
		this.shopTellOne = shopTellOne;
	}
	/**
	 * shopTellTwo���Ե�get����
	 * @return the shopTellTwo
	 */
	public String getShopTellTwo() {
		return shopTellTwo;
	}
	/**
	 * shopTellTwo���Ե�set����
	 * @param shopTellTwo the shopTellTwo to set
	 */
	public void setShopTellTwo(String shopTellTwo) {
		this.shopTellTwo = shopTellTwo;
	}
	/**
	 * shopTellThree���Ե�get����
	 * @return the shopTellThree
	 */
	public String getShopTellThree() {
		return shopTellThree;
	}
	/**
	 * shopTellThree���Ե�set����
	 * @param shopTellThree the shopTellThree to set
	 */
	public void setShopTellThree(String shopTellThree) {
		this.shopTellThree = shopTellThree;
	}
	/**
	 * shopTellFour���Ե�get����
	 * @return the shopTellFour
	 */
	public String getShopTellFour() {
		return shopTellFour;
	}
	/**
	 * shopTellFour���Ե�set����
	 * @param shopTellFour the shopTellFour to set
	 */
	public void setShopTellFour(String shopTellFour) {
		this.shopTellFour = shopTellFour;
	}
	/**
	 * shopRemark���Ե�get����
	 * @return the shopRemark
	 */
	public String getShopRemark() {
		return shopRemark;
	}
	/**
	 * shopRemark���Ե�set����
	 * @param shopRemark the shopRemark to set
	 */
	public void setShopRemark(String shopRemark) {
		this.shopRemark = shopRemark;
	}
	/**
	 * employees���Ե�get����
	 * @return the employees
	 */
	public List<Employee> getEmployees() {
		return employees;
	}
	/**
	 * employees���Ե�set����
	 * @param employees the employees to set
	 */
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	/**
	 * loftInfos���Ե�get����
	 * @return the loftInfos
	 */
	public List<LoftInfo> getLoftInfos() {
		return loftInfos;
	}
	/**
	 * loftInfos���Ե�set����
	 * @param loftInfos the loftInfos to set
	 */
	public void setLoftInfos(List<LoftInfo> loftInfos) {
		this.loftInfos = loftInfos;
	}

	

}