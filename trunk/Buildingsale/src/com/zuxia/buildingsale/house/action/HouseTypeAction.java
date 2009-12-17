/**
 *******************************************************************************
 * filename    : HouseTypeAction.java
 * package     : com.zuxia.buildingsale.house.action
 * createdate  : 2009-12-17 ����03:30:03
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
import com.zuxia.buildingsale.house.service.IHouseTypeService;

/**
 * HouseTypeAction��Ҫ˵��
 * 
 * 
 * @author chaojun
 */
public class HouseTypeAction extends MyAction {
	private IHouseTypeService houseTypeService;
	private int p = 1;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}

	public String scan() throws Exception {
		init();
		Page page = new Page();
		page.setPageIndex(p);
		page.setPageRecordCount(10);
		request.setAttribute("houseTypes", houseTypeService.findAll(page));
		request.setAttribute("pg", page);
		return "scan";
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
	 * p���Ե�get����
	 * 
	 * @return the p
	 */
	public int getP() {
		return p;
	}

	/**
	 * p���Ե�set����
	 * 
	 * @param p
	 *            the p to set
	 */
	public void setP(int p) {
		this.p = p;
	}

}
