/**
 *******************************************************************************
 * filename    : EmployeeListAction.java
 * package     : com.zuxia.buildingsale.sys.action
 * createdate  : 2009-12-16 ����06:29:31
 * project     : Buildingsale
 * @version    : 1.0
 * @author     : Administrator
 * (c) Copyright 2009 
 *	�����ܸ�Ҫ��
 *  XXX
 *******************************************************************************
 */
package com.zuxia.buildingsale.sys.action;

import com.zuxia.buildingsale.common.MyAction;
import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.sys.service.IEmployeeService;

/**
 * EmployeeListAction��Ҫ˵��
 * 
 *
 * @author Administrator
 */
public class EmployeeListAction extends MyAction{
	/**
	 * serialVersionUID���Ը���
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IEmployeeService employeeservice;
	
	@Override
	public String execute() {
		init();
		Page page=new Page();
		request.setAttribute("employeelist", employeeservice.findAllEmployee(page));
		request.setAttribute("page", page);
		System.out.println(page);
		return SUCCESS;
	}

	public IEmployeeService getEmployeeservice() {
		return employeeservice;
	}

	public void setEmployeeservice(IEmployeeService employeeservice) {
		this.employeeservice = employeeservice;
	}
}
