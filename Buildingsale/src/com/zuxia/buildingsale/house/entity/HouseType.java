package com.zuxia.buildingsale.house.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * HouseType概要说明 房间类型信息
 * 
 * 
 * @author zcq100 chaojun
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
	private List<HouseInfo> houseInfos=new ArrayList<HouseInfo>();
	/**
	 * htId属性的get方法
	 * @return the htId
	 */
	public Integer getHtId() {
		return htId;
	}
	/**
	 * htId属性的set方法
	 * @param htId the htId to set
	 */
	public void setHtId(Integer htId) {
		this.htId = htId;
	}
	/**
	 * htName属性的get方法
	 * @return the htName
	 */
	public String getHtName() {
		return htName;
	}
	/**
	 * htName属性的set方法
	 * @param htName the htName to set
	 */
	public void setHtName(String htName) {
		this.htName = htName;
	}
	/**
	 * htRoom属性的get方法
	 * @return the htRoom
	 */
	public Integer getHtRoom() {
		return htRoom;
	}
	/**
	 * htRoom属性的set方法
	 * @param htRoom the htRoom to set
	 */
	public void setHtRoom(Integer htRoom) {
		this.htRoom = htRoom;
	}
	/**
	 * htHalll属性的get方法
	 * @return the htHalll
	 */
	public Integer getHtHalll() {
		return htHalll;
	}
	/**
	 * htHalll属性的set方法
	 * @param htHalll the htHalll to set
	 */
	public void setHtHalll(Integer htHalll) {
		this.htHalll = htHalll;
	}
	/**
	 * htWc属性的get方法
	 * @return the htWc
	 */
	public Integer getHtWc() {
		return htWc;
	}
	/**
	 * htWc属性的set方法
	 * @param htWc the htWc to set
	 */
	public void setHtWc(Integer htWc) {
		this.htWc = htWc;
	}
	/**
	 * htCookRoom属性的get方法
	 * @return the htCookRoom
	 */
	public Integer getHtCookRoom() {
		return htCookRoom;
	}
	/**
	 * htCookRoom属性的set方法
	 * @param htCookRoom the htCookRoom to set
	 */
	public void setHtCookRoom(Integer htCookRoom) {
		this.htCookRoom = htCookRoom;
	}
	/**
	 * htTerrace属性的get方法
	 * @return the htTerrace
	 */
	public Integer getHtTerrace() {
		return htTerrace;
	}
	/**
	 * htTerrace属性的set方法
	 * @param htTerrace the htTerrace to set
	 */
	public void setHtTerrace(Integer htTerrace) {
		this.htTerrace = htTerrace;
	}
	/**
	 * htGardenArea属性的get方法
	 * @return the htGardenArea
	 */
	public Double getHtGardenArea() {
		return htGardenArea;
	}
	/**
	 * htGardenArea属性的set方法
	 * @param htGardenArea the htGardenArea to set
	 */
	public void setHtGardenArea(Double htGardenArea) {
		this.htGardenArea = htGardenArea;
	}
	/**
	 * htImg属性的get方法
	 * @return the htImg
	 */
	public String getHtImg() {
		return htImg;
	}
	/**
	 * htImg属性的set方法
	 * @param htImg the htImg to set
	 */
	public void setHtImg(String htImg) {
		this.htImg = htImg;
	}
	/**
	 * houseInfos属性的get方法
	 * @return the houseInfos
	 */
	public List<HouseInfo> getHouseInfos() {
		return houseInfos;
	}
	/**
	 * houseInfos属性的set方法
	 * @param houseInfos the houseInfos to set
	 */
	public void setHouseInfos(List<HouseInfo> houseInfos) {
		this.houseInfos = houseInfos;
	}

}