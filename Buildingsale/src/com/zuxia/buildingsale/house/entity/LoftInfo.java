package com.zuxia.buildingsale.house.entity;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.zuxia.buildingsale.business.entity.DataDict;

/**
 * LoftInfo��Ҫ˵�� ¥����Ϣ
 * 
 * 
 * @author zcq100 chaojun
 */
public class LoftInfo implements java.io.Serializable {

	// Fields

	private Integer loftId;
	private DataDict dataDictByLoftComtyType;
	private DataDict dataDictByLoftBuildType;
	private String loftNo;
	private String loftName;
	private String loftZone;
	private String loftAddress;
	private Double loftPrice;
	private Date loftBeginTime;
	private Date loftShellOutTime;
	private Date loftFinishTime;
	private Double loftCapacity;
	private Double loftGreen;
	private String loftTraffic;
	private String loftFacility;
	private String loftRemark;
	private List<ShopInfo> shopInfos = new ArrayList<ShopInfo>();
	private List<UnitInfo> unitInfos = new ArrayList<UnitInfo>();

	/**
	 * loftId���Ե�get����
	 * 
	 * @return the loftId
	 */
	public Integer getLoftId() {
		return loftId;
	}

	/**
	 * loftId���Ե�set����
	 * 
	 * @param loftId
	 *            the loftId to set
	 */
	public void setLoftId(Integer loftId) {
		this.loftId = loftId;
	}

	/**
	 * dataDictByLoftComtyType���Ե�get����
	 * 
	 * @return the dataDictByLoftComtyType
	 */
	public DataDict getDataDictByLoftComtyType() {
		return dataDictByLoftComtyType;
	}

	/**
	 * dataDictByLoftComtyType���Ե�set����
	 * 
	 * @param dataDictByLoftComtyType
	 *            the dataDictByLoftComtyType to set
	 */
	public void setDataDictByLoftComtyType(DataDict dataDictByLoftComtyType) {
		this.dataDictByLoftComtyType = dataDictByLoftComtyType;
	}

	/**
	 * dataDictByLoftBuildType���Ե�get����
	 * 
	 * @return the dataDictByLoftBuildType
	 */
	public DataDict getDataDictByLoftBuildType() {
		return dataDictByLoftBuildType;
	}

	/**
	 * dataDictByLoftBuildType���Ե�set����
	 * 
	 * @param dataDictByLoftBuildType
	 *            the dataDictByLoftBuildType to set
	 */
	public void setDataDictByLoftBuildType(DataDict dataDictByLoftBuildType) {
		this.dataDictByLoftBuildType = dataDictByLoftBuildType;
	}

	/**
	 * loftNo���Ե�get����
	 * 
	 * @return the loftNo
	 */
	public String getLoftNo() {
		return loftNo;
	}

	/**
	 * loftNo���Ե�set����
	 * 
	 * @param loftNo
	 *            the loftNo to set
	 */
	public void setLoftNo(String loftNo) {
		this.loftNo = loftNo;
	}

	/**
	 * loftName���Ե�get����
	 * 
	 * @return the loftName
	 */
	public String getLoftName() {
		return loftName;
	}

	/**
	 * loftName���Ե�set����
	 * 
	 * @param loftName
	 *            the loftName to set
	 */
	public void setLoftName(String loftName) {
		this.loftName = loftName;
	}

	/**
	 * loftZone���Ե�get����
	 * 
	 * @return the loftZone
	 */
	public String getLoftZone() {
		return loftZone;
	}

	/**
	 * loftZone���Ե�set����
	 * 
	 * @param loftZone
	 *            the loftZone to set
	 */
	public void setLoftZone(String loftZone) {
		this.loftZone = loftZone;
	}

	/**
	 * loftAddress���Ե�get����
	 * 
	 * @return the loftAddress
	 */
	public String getLoftAddress() {
		return loftAddress;
	}

	/**
	 * loftAddress���Ե�set����
	 * 
	 * @param loftAddress
	 *            the loftAddress to set
	 */
	public void setLoftAddress(String loftAddress) {
		this.loftAddress = loftAddress;
	}

	/**
	 * loftPrice���Ե�get����
	 * 
	 * @return the loftPrice
	 */
	public Double getLoftPrice() {
		return loftPrice;
	}

	/**
	 * loftPrice���Ե�set����
	 * 
	 * @param loftPrice
	 *            the loftPrice to set
	 */
	public void setLoftPrice(Double loftPrice) {
		this.loftPrice = loftPrice;
	}

	/**
	 * loftBeginTime���Ե�get����
	 * 
	 * @return the loftBeginTime
	 */
	public Date getLoftBeginTime() {
		return loftBeginTime;
	}

	/**
	 * loftBeginTime���Ե�set����
	 * 
	 * @param loftBeginTime
	 *            the loftBeginTime to set
	 */
	public void setLoftBeginTime(Date loftBeginTime) {
		this.loftBeginTime = loftBeginTime;
	}

	/**
	 * loftShellOutTime���Ե�get����
	 * 
	 * @return the loftShellOutTime
	 */
	public Date getLoftShellOutTime() {
		return loftShellOutTime;
	}

	/**
	 * loftShellOutTime���Ե�set����
	 * 
	 * @param loftShellOutTime
	 *            the loftShellOutTime to set
	 */
	public void setLoftShellOutTime(Date loftShellOutTime) {
		this.loftShellOutTime = loftShellOutTime;
	}

	/**
	 * loftFinishTime���Ե�get����
	 * 
	 * @return the loftFinishTime
	 */
	public Date getLoftFinishTime() {
		return loftFinishTime;
	}

	/**
	 * loftFinishTime���Ե�set����
	 * 
	 * @param loftFinishTime
	 *            the loftFinishTime to set
	 */
	public void setLoftFinishTime(Date loftFinishTime) {
		this.loftFinishTime = loftFinishTime;
	}

	/**
	 * loftCapacity���Ե�get����
	 * 
	 * @return the loftCapacity
	 */
	public Double getLoftCapacity() {
		return loftCapacity;
	}

	/**
	 * loftCapacity���Ե�set����
	 * 
	 * @param loftCapacity
	 *            the loftCapacity to set
	 */
	public void setLoftCapacity(Double loftCapacity) {
		this.loftCapacity = loftCapacity;
	}

	/**
	 * loftGreen���Ե�get����
	 * 
	 * @return the loftGreen
	 */
	public Double getLoftGreen() {
		return loftGreen;
	}

	/**
	 * loftGreen���Ե�set����
	 * 
	 * @param loftGreen
	 *            the loftGreen to set
	 */
	public void setLoftGreen(Double loftGreen) {
		this.loftGreen = loftGreen;
	}

	/**
	 * loftTraffic���Ե�get����
	 * 
	 * @return the loftTraffic
	 */
	public String getLoftTraffic() {
		return loftTraffic;
	}

	/**
	 * loftTraffic���Ե�set����
	 * 
	 * @param loftTraffic
	 *            the loftTraffic to set
	 */
	public void setLoftTraffic(String loftTraffic) {
		this.loftTraffic = loftTraffic;
	}

	/**
	 * loftFacility���Ե�get����
	 * 
	 * @return the loftFacility
	 */
	public String getLoftFacility() {
		return loftFacility;
	}

	/**
	 * loftFacility���Ե�set����
	 * 
	 * @param loftFacility
	 *            the loftFacility to set
	 */
	public void setLoftFacility(String loftFacility) {
		this.loftFacility = loftFacility;
	}

	/**
	 * loftRemark���Ե�get����
	 * 
	 * @return the loftRemark
	 */
	public String getLoftRemark() {
		return loftRemark;
	}

	/**
	 * loftRemark���Ե�set����
	 * 
	 * @param loftRemark
	 *            the loftRemark to set
	 */
	public void setLoftRemark(String loftRemark) {
		this.loftRemark = loftRemark;
	}

	/**
	 * shopInfos���Ե�get����
	 * 
	 * @return the shopInfos
	 */
	public List<ShopInfo> getShopInfos() {
		return shopInfos;
	}

	/**
	 * shopInfos���Ե�set����
	 * 
	 * @param shopInfos
	 *            the shopInfos to set
	 */
	public void setShopInfos(List<ShopInfo> shopInfos) {
		this.shopInfos = shopInfos;
	}

	/**
	 * unitInfos���Ե�get����
	 * 
	 * @return the unitInfos
	 */
	public List<UnitInfo> getUnitInfos() {
		return unitInfos;
	}

	/**
	 * unitInfos���Ե�set����
	 * 
	 * @param unitInfos
	 *            the unitInfos to set
	 */
	public void setUnitInfos(List<UnitInfo> unitInfos) {
		this.unitInfos = unitInfos;
	}

}