package com.zuxia.buildingsale.entity;

import java.sql.Timestamp;

/**
 * DealInfo entity. @author MyEclipse Persistence Tools
 */

public class DealInfo implements java.io.Serializable {

	// Fields

	private Integer dealId;
	private ClientInfo clientInfo;
	private DataDict dataDictByDealPayStyle;
	private Employee employee;
	private HouseInfo houseInfo;
	private DataDict dataDictByDealState;
	private Timestamp dealTime;
	private Double dealHousePrice;
	private Double dealDeedTax;
	private Double dealTradTax;
	private Double dealMetaTax;
	private Double dealLandTax;
	private Double dealFiveOpen;
	private Double dealBigBuild;
	private Double dealPawnPrice;
	private Double dealPawnTax;
	private Double dealPawnTradTax;
	private Double dealAllPrice;
	private Double dealBookMoney;

	// Constructors

	/** default constructor */
	public DealInfo() {
	}

	/** full constructor */
	public DealInfo(ClientInfo clientInfo, DataDict dataDictByDealPayStyle,
			Employee employee, HouseInfo houseInfo,
			DataDict dataDictByDealState, Timestamp dealTime,
			Double dealHousePrice, Double dealDeedTax, Double dealTradTax,
			Double dealMetaTax, Double dealLandTax, Double dealFiveOpen,
			Double dealBigBuild, Double dealPawnPrice, Double dealPawnTax,
			Double dealPawnTradTax, Double dealAllPrice, Double dealBookMoney) {
		this.clientInfo = clientInfo;
		this.dataDictByDealPayStyle = dataDictByDealPayStyle;
		this.employee = employee;
		this.houseInfo = houseInfo;
		this.dataDictByDealState = dataDictByDealState;
		this.dealTime = dealTime;
		this.dealHousePrice = dealHousePrice;
		this.dealDeedTax = dealDeedTax;
		this.dealTradTax = dealTradTax;
		this.dealMetaTax = dealMetaTax;
		this.dealLandTax = dealLandTax;
		this.dealFiveOpen = dealFiveOpen;
		this.dealBigBuild = dealBigBuild;
		this.dealPawnPrice = dealPawnPrice;
		this.dealPawnTax = dealPawnTax;
		this.dealPawnTradTax = dealPawnTradTax;
		this.dealAllPrice = dealAllPrice;
		this.dealBookMoney = dealBookMoney;
	}

	// Property accessors

	public Integer getDealId() {
		return this.dealId;
	}

	public void setDealId(Integer dealId) {
		this.dealId = dealId;
	}

	public ClientInfo getClientInfo() {
		return this.clientInfo;
	}

	public void setClientInfo(ClientInfo clientInfo) {
		this.clientInfo = clientInfo;
	}

	public DataDict getDataDictByDealPayStyle() {
		return this.dataDictByDealPayStyle;
	}

	public void setDataDictByDealPayStyle(DataDict dataDictByDealPayStyle) {
		this.dataDictByDealPayStyle = dataDictByDealPayStyle;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public HouseInfo getHouseInfo() {
		return this.houseInfo;
	}

	public void setHouseInfo(HouseInfo houseInfo) {
		this.houseInfo = houseInfo;
	}

	public DataDict getDataDictByDealState() {
		return this.dataDictByDealState;
	}

	public void setDataDictByDealState(DataDict dataDictByDealState) {
		this.dataDictByDealState = dataDictByDealState;
	}

	public Timestamp getDealTime() {
		return this.dealTime;
	}

	public void setDealTime(Timestamp dealTime) {
		this.dealTime = dealTime;
	}

	public Double getDealHousePrice() {
		return this.dealHousePrice;
	}

	public void setDealHousePrice(Double dealHousePrice) {
		this.dealHousePrice = dealHousePrice;
	}

	public Double getDealDeedTax() {
		return this.dealDeedTax;
	}

	public void setDealDeedTax(Double dealDeedTax) {
		this.dealDeedTax = dealDeedTax;
	}

	public Double getDealTradTax() {
		return this.dealTradTax;
	}

	public void setDealTradTax(Double dealTradTax) {
		this.dealTradTax = dealTradTax;
	}

	public Double getDealMetaTax() {
		return this.dealMetaTax;
	}

	public void setDealMetaTax(Double dealMetaTax) {
		this.dealMetaTax = dealMetaTax;
	}

	public Double getDealLandTax() {
		return this.dealLandTax;
	}

	public void setDealLandTax(Double dealLandTax) {
		this.dealLandTax = dealLandTax;
	}

	public Double getDealFiveOpen() {
		return this.dealFiveOpen;
	}

	public void setDealFiveOpen(Double dealFiveOpen) {
		this.dealFiveOpen = dealFiveOpen;
	}

	public Double getDealBigBuild() {
		return this.dealBigBuild;
	}

	public void setDealBigBuild(Double dealBigBuild) {
		this.dealBigBuild = dealBigBuild;
	}

	public Double getDealPawnPrice() {
		return this.dealPawnPrice;
	}

	public void setDealPawnPrice(Double dealPawnPrice) {
		this.dealPawnPrice = dealPawnPrice;
	}

	public Double getDealPawnTax() {
		return this.dealPawnTax;
	}

	public void setDealPawnTax(Double dealPawnTax) {
		this.dealPawnTax = dealPawnTax;
	}

	public Double getDealPawnTradTax() {
		return this.dealPawnTradTax;
	}

	public void setDealPawnTradTax(Double dealPawnTradTax) {
		this.dealPawnTradTax = dealPawnTradTax;
	}

	public Double getDealAllPrice() {
		return this.dealAllPrice;
	}

	public void setDealAllPrice(Double dealAllPrice) {
		this.dealAllPrice = dealAllPrice;
	}

	public Double getDealBookMoney() {
		return this.dealBookMoney;
	}

	public void setDealBookMoney(Double dealBookMoney) {
		this.dealBookMoney = dealBookMoney;
	}

}