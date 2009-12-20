/**
 *******************************************************************************
 * filename    : UnitInfoAction.java
 * package     : com.zuxia.buildingsale.house.action
 * createdate  : 2009-12-17 下午04:42:29
 * project     : Buildingsale
 * @version    : 1.0
 * @author     : chaojun
 * (c) Copyright 2009 
 *	＜功能概要＞
 *  XXX
 *******************************************************************************
 */
package com.zuxia.buildingsale.house.action;

import com.zuxia.buildingsale.common.MyAction;
import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.house.entity.HouseType;
import com.zuxia.buildingsale.house.form.UnitInfoForm;
import com.zuxia.buildingsale.house.service.IHouseTypeService;
import com.zuxia.buildingsale.house.service.ILoftInfoService;
import com.zuxia.buildingsale.house.service.IUnitInfoService;

/**
 * UnitInfoAction概要说明
 * 
 * 
 * @author chaojun
 */
public class UnitInfoAction extends MyAction {
	private IUnitInfoService unitInfoService;
	private ILoftInfoService loftInfoService;
	private IHouseTypeService houseTypeService;
	private int unitId;
	private int loftId;
	private UnitInfoForm uif;

	@Override
	public String execute() throws Exception {
		init();
		return super.execute();
	}

	public String scan() throws Exception {
		init();
		return super.execute();
	}

	/**
	 * look方法概述 查看单元信息
	 * 
	 * 
	 * @return
	 * @throws Exception
	 */
	public String look() throws Exception {
		init();
		request
				.setAttribute("lookUnitDTO", unitInfoService
						.findUnitDTO(unitId));
		return "look";
	}

	/**
	 * add方法概述 增加单元信息
	 * 
	 * 
	 * @return
	 * @throws Exception
	 */
	public String add() throws Exception {
		init();
		if(unitInfoService.addUnitInfo(uif)>0){
			return "add";
		}
		return "error";
	}

	/**
	 * addInit方法概述 增加单元信息 显示楼盘，房屋类型
	 * 
	 * 
	 * @return
	 * @throws Exception
	 */
	public String addInit() throws Exception {
		init();
		request.setAttribute("loftInfo", loftInfoService.findById(loftId));
		String str = "";
		for (HouseType ht : houseTypeService.findAll()) {
			str += ht.getHtId() + "-" + ht.getHtName() + ",";
		}
		request.setAttribute("housetypestr", str);
		return "addInit";
	}

	public String edit() throws Exception {
		init();
		return super.execute();
	}

	public String delete() throws Exception {
		init();
		return super.execute();
	}

	/**
	 * unitInfoService属性的get方法
	 * 
	 * @return the unitInfoService
	 */
	public IUnitInfoService getUnitInfoService() {
		return unitInfoService;
	}

	/**
	 * unitInfoService属性的set方法
	 * 
	 * @param unitInfoService
	 *            the unitInfoService to set
	 */
	public void setUnitInfoService(IUnitInfoService unitInfoService) {
		this.unitInfoService = unitInfoService;
	}

	/**
	 * unitId属性的get方法
	 * 
	 * @return the unitId
	 */
	public int getUnitId() {
		return unitId;
	}

	/**
	 * unitId属性的set方法
	 * 
	 * @param unitId
	 *            the unitId to set
	 */
	public void setUnitId(int unitId) {
		this.unitId = unitId;
	}

	/**
	 * loftId属性的get方法
	 * 
	 * @return the loftId
	 */
	public int getLoftId() {
		return loftId;
	}

	/**
	 * loftId属性的set方法
	 * 
	 * @param loftId
	 *            the loftId to set
	 */
	public void setLoftId(int loftId) {
		this.loftId = loftId;
	}

	/**
	 * loftInfoService属性的get方法
	 * 
	 * @return the loftInfoService
	 */
	public ILoftInfoService getLoftInfoService() {
		return loftInfoService;
	}

	/**
	 * loftInfoService属性的set方法
	 * 
	 * @param loftInfoService
	 *            the loftInfoService to set
	 */
	public void setLoftInfoService(ILoftInfoService loftInfoService) {
		this.loftInfoService = loftInfoService;
	}

	/**
	 * houseTypeService属性的get方法
	 * 
	 * @return the houseTypeService
	 */
	public IHouseTypeService getHouseTypeService() {
		return houseTypeService;
	}

	/**
	 * houseTypeService属性的set方法
	 * 
	 * @param houseTypeService
	 *            the houseTypeService to set
	 */
	public void setHouseTypeService(IHouseTypeService houseTypeService) {
		this.houseTypeService = houseTypeService;
	}

	/**
	 * uif属性的get方法
	 * 
	 * @return the uif
	 */
	public UnitInfoForm getUif() {
		return uif;
	}

	/**
	 * uif属性的set方法
	 * 
	 * @param uif
	 *            the uif to set
	 */
	public void setUif(UnitInfoForm uif) {
		this.uif = uif;
	}

}
