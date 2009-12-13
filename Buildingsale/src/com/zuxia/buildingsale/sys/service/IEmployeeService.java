/**
 *******************************************************************************
 * filename    : IEmployeeService.java
 * package     : com.zuxia.buildingsale.sys.service
 * createdate  : 2009-12-13 ����05:26:56
 * project     : Buildingsale
 * @version    : 1.0
 * @author     : zcq100
 * (c) Copyright 2009 
 *	�����ܸ�Ҫ��
 *  Ա��������ӿ�
 *******************************************************************************
 */
package com.zuxia.buildingsale.sys.service;

import java.util.List;

import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.sys.entity.Employee;

/**
 * IEmployeeService��Ҫ˵��
 * @author zcq100
 */
public interface IEmployeeService {
	/**
	 * 
	 * addEmployee��������
	 * ����µ�Ա����Ϣ
	 * @param emp	Ա������
	 * @return	״̬��Ϣ
	 */
	int addEmployee(Employee emp);
	
	/**
	 * 
	 * deleteEmployee��������
	 * 
	 *
	 * @param id
	 * @return
	 */
	int deleteEmployee(int id);
	
	/**
	 * 
	 * updateEmployee��������
	 * 
	 *
	 * @param emp
	 * @return
	 */
	int updateEmployee(Employee emp);
	
	/**
	 * 
	 * findEmployeeById��������
	 * 
	 *
	 * @param id
	 * @return
	 */
	Employee findEmployeeById(int id);
	
	/**
	 * 
	 * findByEmployeeAccount��������
	 * 
	 *
	 * @param account
	 * @param password
	 * @return
	 */
	Employee findByEmployeeAccount(String account,String password);
	
	/**
	 * 
	 * findByEcample��������
	 * 
	 *
	 * @param page
	 * @param emp
	 * @return
	 */
	List<Employee> findByExample(Page page,Employee emp);
	
	/**
	 * 
	 * findAllEmployee��������
	 * 
	 *
	 * @param page
	 * @return
	 */
	List<Employee> findAllEmployee(Page page);
}
