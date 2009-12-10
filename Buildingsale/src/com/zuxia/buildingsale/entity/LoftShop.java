package com.zuxia.buildingsale.entity;

/**
 * LoftShop entity. @author MyEclipse Persistence Tools
 */

public class LoftShop implements java.io.Serializable {

	// Fields

	private Integer lsId;
	private ShopInfo shopInfo;
	private LoftInfo loftInfo;

	// Constructors

	/** default constructor */
	public LoftShop() {
	}

	/** full constructor */
	public LoftShop(ShopInfo shopInfo, LoftInfo loftInfo) {
		this.shopInfo = shopInfo;
		this.loftInfo = loftInfo;
	}

	// Property accessors

	public Integer getLsId() {
		return this.lsId;
	}

	public void setLsId(Integer lsId) {
		this.lsId = lsId;
	}

	public ShopInfo getShopInfo() {
		return this.shopInfo;
	}

	public void setShopInfo(ShopInfo shopInfo) {
		this.shopInfo = shopInfo;
	}

	public LoftInfo getLoftInfo() {
		return this.loftInfo;
	}

	public void setLoftInfo(LoftInfo loftInfo) {
		this.loftInfo = loftInfo;
	}

}