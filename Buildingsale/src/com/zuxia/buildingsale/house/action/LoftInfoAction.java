/**
 *******************************************************************************
 * filename    : LoftAction.java
 * package     : com.zuxia.buildingsale.house.action
 * createdate  : 2009-12-16 ����05:22:07
 * project     : Buildingsale
 * @version    : 1.0
 * @author     : chaojun
 * (c) Copyright 2009 
 *	�����ܸ�Ҫ��
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
 * LoftAction��Ҫ˵��
 * 
 * 
 * @author chaojun
 */
public class LoftInfoAction extends MyAction {
	/**
	 * serialVersionUID���Ը���
	 * 
	 */
	private static final long serialVersionUID = 8927375163927214119L;
	private ILoftInfoService loftInfoService;
	private int p = 1;
	private int loftId = 1;
	private LoftInfoForm loftInfoForm;

	/**
	 * scan�������� ���
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
	 * look�������� �鿴
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
	 * add�������� ����
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
	 * addInit�������� ����ǰ��ʼ����ҵ���ͺͽ�������
	 * 
	 * 
	 * @return
	 * @throws Exception
	 */
	public String addInit() throws Exception {
		init();
		request.setAttribute("loftComtyType", loftInfoService.getComtyType());// ��ҵ����
		request.setAttribute("loftBuildType", loftInfoService
				.getComtyBuildType());// ��������
		return "addInit";
	}

	/**
	 * edit�������� �޸�
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
	 * delete�������� ɾ��
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

	/**
	 * serialVersionUID���Ե�get����
	 * 
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
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
	 * loftInfoForm���Ե�get����
	 * 
	 * @return the loftInfoForm
	 */
	public LoftInfoForm getLoftInfoForm() {
		return loftInfoForm;
	}

	/**
	 * loftInfoForm���Ե�set����
	 * 
	 * @param loftInfoForm
	 *            the loftInfoForm to set
	 */
	public void setLoftInfoForm(LoftInfoForm loftInfoForm) {
		this.loftInfoForm = loftInfoForm;
	}

}
