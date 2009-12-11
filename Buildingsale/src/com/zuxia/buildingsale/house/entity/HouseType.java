package com.zuxia.buildingsale.house.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * HouseType entity. @author MyEclipse Persistence Tools
 */

public class HouseType implements java.io.Serializable {

	// Fields

	private Integer htId;
	private String htName;
	private Integer htRoom;
	private Integer htHalll;
	private Integer htWc;
	private Integer htCookRoom;
	private Integer htTerrace;
	private Double htGardenArea;
	private String htImg;
	private Set houseInfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public HouseType() {
	}

	/** minimal constructor */
	public HouseType(String htName, Integer htRoom, Integer htHalll,
			Integer htWc, Integer htCookRoom, Integer htTerrace,
			Double htGardenArea, String htImg) {
		this.htName = htName;
		this.htRoom = htRoom;
		this.htHalll = htHalll;
		this.htWc = htWc;
		this.htCookRoom = htCookRoom;
		this.htTerrace = htTerrace;
		this.htGardenArea = htGardenArea;
		this.htImg = htImg;
	}

	/** full constructor */
	public HouseType(String htName, Integer htRoom, Integer htHalll,
			Integer htWc, Integer htCookRoom, Integer htTerrace,
			Double htGardenArea, String htImg, Set houseInfos) {
		this.htName = htName;
		this.htRoom = htRoom;
		this.htHalll = htHalll;
		this.htWc = htWc;
		this.htCookRoom = htCookRoom;
		this.htTerrace = htTerrace;
		this.htGardenArea = htGardenArea;
		this.htImg = htImg;
		this.houseInfos = houseInfos;
	}

	// Property accessors

	public Integer getHtId() {
		return this.htId;
	}

	public void setHtId(Integer htId) {
		this.htId = htId;
	}

	public String getHtName() {
		return this.htName;
	}

	public void setHtName(String htName) {
		this.htName = htName;
	}

	public Integer getHtRoom() {
		return this.htRoom;
	}

	public void setHtRoom(Integer htRoom) {
		this.htRoom = htRoom;
	}

	public Integer getHtHalll() {
		return this.htHalll;
	}

	public void setHtHalll(Integer htHalll) {
		this.htHalll = htHalll;
	}

	public Integer getHtWc() {
		return this.htWc;
	}

	public void setHtWc(Integer htWc) {
		this.htWc = htWc;
	}

	public Integer getHtCookRoom() {
		return this.htCookRoom;
	}

	public void setHtCookRoom(Integer htCookRoom) {
		this.htCookRoom = htCookRoom;
	}

	public Integer getHtTerrace() {
		return this.htTerrace;
	}

	public void setHtTerrace(Integer htTerrace) {
		this.htTerrace = htTerrace;
	}

	public Double getHtGardenArea() {
		return this.htGardenArea;
	}

	public void setHtGardenArea(Double htGardenArea) {
		this.htGardenArea = htGardenArea;
	}

	public String getHtImg() {
		return this.htImg;
	}

	public void setHtImg(String htImg) {
		this.htImg = htImg;
	}

	public Set getHouseInfos() {
		return this.houseInfos;
	}

	public void setHouseInfos(Set houseInfos) {
		this.houseInfos = houseInfos;
	}

}