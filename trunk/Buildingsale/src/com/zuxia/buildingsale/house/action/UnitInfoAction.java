/**
 *******************************************************************************
 * filename    : UnitInfoAction.java
 * package     : com.zuxia.buildingsale.house.action
 * createdate  : 2009-12-17 ����04:42:29
 * project     : Buildingsale
 * @version    : 1.0
 * @author     : chaojun
 * (c) Copyright 2009 
 *	�����ܸ�Ҫ��
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
 * UnitInfoAction��Ҫ˵��
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
	 * look�������� �鿴��Ԫ��Ϣ
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
	 * add�������� ���ӵ�Ԫ��Ϣ
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
	 * addInit�������� ���ӵ�Ԫ��Ϣ ��ʾ¥�̣���������
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
	 * unitInfoService���Ե�get����
	 * 
	 * @return the unitInfoService
	 */
	public IUnitInfoService getUnitInfoService() {
		return unitInfoService;
	}

	/**
	 * unitInfoService���Ե�set����
	 * 
	 * @param unitInfoService
	 *            the unitInfoService to set
	 */
	public void setUnitInfoService(IUnitInfoService unitInfoService) {
		this.unitInfoService = unitInfoService;
	}

	/**
	 * unitId���Ե�get����
	 * 
	 * @return the unitId
	 */
	public int getUnitId() {
		return unitId;
	}

	/**
	 * unitId���Ե�set����
	 * 
	 * @param unitId
	 *            the unitId to set
	 */
	public void setUnitId(int unitId) {
		this.unitId = unitId;
	}

	/**
	 * loftId���Ե�get����
	 * 
	 * @return the loftId
	 */
	public int getLoftId() {
		return loftId;
	}

	/**
	 * loftId���Ե�set����
	 * 
	 * @param loftId
	 *            the loftId to set
	 */
	public void setLoftId(int loftId) {
		this.loftId = loftId;
	}

	/**
	 * loftInfoService���Ե�get����
	 * 
	 * @return the loftInfoService
	 */
	public ILoftInfoService getLoftInfoService() {
		return loftInfoService;
	}

	/**
	 * loftInfoService���Ե�set����
	 * 
	 * @param loftInfoService
	 *            the loftInfoService to set
	 */
	public void setLoftInfoService(ILoftInfoService loftInfoService) {
		this.loftInfoService = loftInfoService;
	}

	/**
	 * houseTypeService���Ե�get����
	 * 
	 * @return the houseTypeService
	 */
	public IHouseTypeService getHouseTypeService() {
		return houseTypeService;
	}

	/**
	 * houseTypeService���Ե�set����
	 * 
	 * @param houseTypeService
	 *            the houseTypeService to set
	 */
	public void setHouseTypeService(IHouseTypeService houseTypeService) {
		this.houseTypeService = houseTypeService;
	}

	/**
	 * uif���Ե�get����
	 * 
	 * @return the uif
	 */
	public UnitInfoForm getUif() {
		return uif;
	}

	/**
	 * uif���Ե�set����
	 * 
	 * @param uif
	 *            the uif to set
	 */
	public void setUif(UnitInfoForm uif) {
		this.uif = uif;
	}

}
