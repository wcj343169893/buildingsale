/**
 *******************************************************************************
 * filename    : IEmployeeService.java
 * package     : com.zuxia.buildingsale.sys.service
 * createdate  : 2009-12-13 下午05:26:56
 * project     : Buildingsale
 * @version    : 1.0
 * @author     : zcq100
 * (c) Copyright 2009 
 *	＜功能概要＞
 *  员工服务类接口
 *******************************************************************************
 */
package com.zuxia.buildingsale.sys.service;

import java.util.List;

import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.sys.entity.Employee;

/**
 * IEmployeeService概要说明
 * @author zcq100
 */
public interface IEmployeeService {
	/**
	 * 
	 * addEmployee方法概述
	 * 添加新的员工信息
	 * @param emp	员工对象
	 * @return	状态信息
	 */
	int addEmployee(Employee emp);
	
	/**
	 * 
	 * deleteEmployee方法概述
	 * 
	 *
	 * @param id
	 * @return
	 */
	int deleteEmployee(int id);
	
	/**
	 * 
	 * updateEmployee方法概述
	 * 
	 *
	 * @param emp
	 * @return
	 */
	int updateEmployee(Employee emp);
	
	/**
	 * 
	 * findEmployeeById方法概述
	 * 
	 *
	 * @param id
	 * @return
	 */
	Employee findEmployeeById(int id);
	
	/**
	 * 
	 * findByEmployeeAccount方法概述
	 * 
	 *
	 * @param account
	 * @param password
	 * @return
	 */
	Employee findByEmployeeAccount(String account,String password);
	
	/**
	 * 
	 * findByEcample方法概述
	 * 
	 *
	 * @param page
	 * @param emp
	 * @return
	 */
	List<Employee> findByExample(Page page,Employee emp);
	
	/**
	 * 
	 * findAllEmployee方法概述
	 * 
	 *
	 * @param page
	 * @return
	 */
	List<Employee> findAllEmployee(Page page);
}
