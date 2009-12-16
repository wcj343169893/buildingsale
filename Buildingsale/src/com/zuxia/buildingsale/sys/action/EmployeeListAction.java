/**
 *******************************************************************************
 * filename    : EmployeeListAction.java
 * package     : com.zuxia.buildingsale.sys.action
 * createdate  : 2009-12-16 下午06:29:31
 * project     : Buildingsale
 * @version    : 1.0
 * @author     : Administrator
 * (c) Copyright 2009 
 *	＜功能概要＞
 *  XXX
 *******************************************************************************
 */
package com.zuxia.buildingsale.sys.action;

import com.jsptags.navigation.pager.PagerTag;
import com.zuxia.buildingsale.common.MyAction;
import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.sys.service.IEmployeeService;

/**
 * EmployeeListAction概要说明
 * 
 *
 * @author Administrator
 */
public class EmployeeListAction extends MyAction{
	/**
	 * serialVersionUID属性概述
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IEmployeeService employeeservice;
	private PagerTag pager;
	
	@Override
	public String execute() {
		init();
		Page page=new Page();
		try {
			int index=Integer.valueOf(request.getParameter("pageNo"));
			page.setPageIndex(index);
		} catch (Exception e) {
		}
		request.setAttribute("employeelist", employeeservice.findAllEmployee(page));
		request.setAttribute("page", page);
		return SUCCESS;
	}

	public IEmployeeService getEmployeeservice() {
		return employeeservice;
	}

	public void setEmployeeservice(IEmployeeService employeeservice) {
		this.employeeservice = employeeservice;
	}

	public void setPager(PagerTag pager) {
		this.pager = pager;
	}

	


	
}
