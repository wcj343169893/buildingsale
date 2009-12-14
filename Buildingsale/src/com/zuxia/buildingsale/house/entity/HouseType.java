package com.zuxia.buildingsale.house.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * HouseType��Ҫ˵�� ����������Ϣ
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
	 * htId���Ե�get����
	 * @return the htId
	 */
	public Integer getHtId() {
		return htId;
	}
	/**
	 * htId���Ե�set����
	 * @param htId the htId to set
	 */
	public void setHtId(Integer htId) {
		this.htId = htId;
	}
	/**
	 * htName���Ե�get����
	 * @return the htName
	 */
	public String getHtName() {
		return htName;
	}
	/**
	 * htName���Ե�set����
	 * @param htName the htName to set
	 */
	public void setHtName(String htName) {
		this.htName = htName;
	}
	/**
	 * htRoom���Ե�get����
	 * @return the htRoom
	 */
	public Integer getHtRoom() {
		return htRoom;
	}
	/**
	 * htRoom���Ե�set����
	 * @param htRoom the htRoom to set
	 */
	public void setHtRoom(Integer htRoom) {
		this.htRoom = htRoom;
	}
	/**
	 * htHalll���Ե�get����
	 * @return the htHalll
	 */
	public Integer getHtHalll() {
		return htHalll;
	}
	/**
	 * htHalll���Ե�set����
	 * @param htHalll the htHalll to set
	 */
	public void setHtHalll(Integer htHalll) {
		this.htHalll = htHalll;
	}
	/**
	 * htWc���Ե�get����
	 * @return the htWc
	 */
	public Integer getHtWc() {
		return htWc;
	}
	/**
	 * htWc���Ե�set����
	 * @param htWc the htWc to set
	 */
	public void setHtWc(Integer htWc) {
		this.htWc = htWc;
	}
	/**
	 * htCookRoom���Ե�get����
	 * @return the htCookRoom
	 */
	public Integer getHtCookRoom() {
		return htCookRoom;
	}
	/**
	 * htCookRoom���Ե�set����
	 * @param htCookRoom the htCookRoom to set
	 */
	public void setHtCookRoom(Integer htCookRoom) {
		this.htCookRoom = htCookRoom;
	}
	/**
	 * htTerrace���Ե�get����
	 * @return the htTerrace
	 */
	public Integer getHtTerrace() {
		return htTerrace;
	}
	/**
	 * htTerrace���Ե�set����
	 * @param htTerrace the htTerrace to set
	 */
	public void setHtTerrace(Integer htTerrace) {
		this.htTerrace = htTerrace;
	}
	/**
	 * htGardenArea���Ե�get����
	 * @return the htGardenArea
	 */
	public Double getHtGardenArea() {
		return htGardenArea;
	}
	/**
	 * htGardenArea���Ե�set����
	 * @param htGardenArea the htGardenArea to set
	 */
	public void setHtGardenArea(Double htGardenArea) {
		this.htGardenArea = htGardenArea;
	}
	/**
	 * htImg���Ե�get����
	 * @return the htImg
	 */
	public String getHtImg() {
		return htImg;
	}
	/**
	 * htImg���Ե�set����
	 * @param htImg the htImg to set
	 */
	public void setHtImg(String htImg) {
		this.htImg = htImg;
	}
	/**
	 * houseInfos���Ե�get����
	 * @return the houseInfos
	 */
	public List<HouseInfo> getHouseInfos() {
		return houseInfos;
	}
	/**
	 * houseInfos���Ե�set����
	 * @param houseInfos the houseInfos to set
	 */
	public void setHouseInfos(List<HouseInfo> houseInfos) {
		this.houseInfos = houseInfos;
	}

}