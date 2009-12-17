/**
 *******************************************************************************
 * filename    : LoftAction.java
 * package     : com.zuxia.buildingsale.house.action
 * createdate  : 2009-12-16 下午05:22:07
 * project     : Buildingsale
 * @version    : 1.0
 * @author     : chaojun
 * (c) Copyright 2009 
 *	＜功能概要＞
 *  XXX
 *******************************************************************************
 */
package com.zuxia.buildingsale.house.action;

import java.util.List;

import com.zuxia.buildingsale.common.Building;
import com.zuxia.buildingsale.common.MyAction;
import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.house.entity.LoftInfo;
import com.zuxia.buildingsale.house.form.LoftInfoForm;
import com.zuxia.buildingsale.house.service.ILoftInfoService;
import com.zuxia.buildingsale.sys.entity.Employee;

/**
 * LoftAction概要说明
 * 
 * 
 * @author chaojun
 */
public class LoftInfoAction extends MyAction {
	/**
	 * serialVersionUID属性概述
	 * 
	 */
	private static final long serialVersionUID = 8927375163927214119L;
	private ILoftInfoService loftInfoService;
	private int p = 1;
	private int loftId = 1;
	private LoftInfoForm loftInfoForm;

	/**
	 * scan方法概述 浏览
	 * 
	 * 
	 * @return
	 * @throws Exception
	 */
	public String scan() throws Exception {
		init();
		Page page = new Page();
		page.setPageIndex(p);
		page.setPageRecordCount(10);
		List<LoftInfo> loftInfos = loftInfoService.findAll(page);
		request.setAttribute("loftInfos", loftInfos);
		request.setAttribute("pg", page);
		return "scan";
	}

	/**
	 * look方法概述 查看
	 * 
	 * 
	 * @return
	 * @throws Exception
	 */
	public String look() throws Exception {
		init();
		request.setAttribute("loftInfo", loftInfoService.findById(loftId));
		return "look";
	}

	/**
	 * add方法概述 增加
	 * 
	 * 
	 * @return
	 * @throws Exception
	 */
	public String add() throws Exception {
		init();
		loftInfoService.addLoftInfo(loftInfoForm, (Employee) request
				.getSession().getAttribute(Building.SESSION_LOGIN_USER.toString()));
		return "add";
	}

	/**
	 * addInit方法概述 增加前初始化物业类型和建筑类型
	 * 
	 * 
	 * @return
	 * @throws Exception
	 */
	public String addInit() throws Exception {
		init();
		request.setAttribute("loftComtyType", loftInfoService.getComtyType());// 物业类型
		request.setAttribute("loftBuildType", loftInfoService
				.getComtyBuildType());// 建筑类型
		return "addInit";
	}

	/**
	 * edit方法概述 修改
	 * 
	 * 
	 * @return
	 * @throws Exception
	 */
	public String edit() throws Exception {
		init();
		request.setAttribute("loftInfo", loftInfoService.findById(loftId));
		return "edit";
	}

	/**
	 * delete方法概述 删除
	 * 
	 * 
	 * @return
	 * @throws Exception
	 */
	public String delete() throws Exception {
		init();
		request.setAttribute("loftInfo", loftInfoService.findById(loftId));
		return "delete";
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
	 * p属性的get方法
	 * 
	 * @return the p
	 */
	public int getP() {
		return p;
	}

	/**
	 * p属性的set方法
	 * 
	 * @param p
	 *            the p to set
	 */
	public void setP(int p) {
		this.p = p;
	}

	/**
	 * serialVersionUID属性的get方法
	 * 
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
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
	 * loftInfoForm属性的get方法
	 * 
	 * @return the loftInfoForm
	 */
	public LoftInfoForm getLoftInfoForm() {
		return loftInfoForm;
	}

	/**
	 * loftInfoForm属性的set方法
	 * 
	 * @param loftInfoForm
	 *            the loftInfoForm to set
	 */
	public void setLoftInfoForm(LoftInfoForm loftInfoForm) {
		this.loftInfoForm = loftInfoForm;
	}

}
