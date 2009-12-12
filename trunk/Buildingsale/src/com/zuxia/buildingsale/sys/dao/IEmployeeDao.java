/**
 *******************************************************************************
 * IEmployeeDao.java
 * com.zuxia.buildingsale.sys.dao.impl
 * (c) Copyright 2009 
 *	2009-12-11
 *��������������
 *  Buildingsale
 *�����ܸ�Ҫ��
 *  XXX
 *�����ߣ�
 *  zcq100
 *******************************************************************************
 */
package com.zuxia.buildingsale.sys.dao;

import java.util.List;

import com.zuxia.buildingsale.common.IBaseCRUD;
import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.sys.entity.Employee;

/**
 * IEmployeeDao��Ҫ˵��
 * 
 *
 * @author zcq100
 */
public interface IEmployeeDao extends IBaseCRUD<Employee> {
	/**
	 * 
	 * findAll��������
	 * ��ҳ�������еĹ�Ա
	 *
	 * @param page ��ҳ��Ϣ
	 * @return Ա������
	 */
	List<Employee> findAll(Page page);
	
	/**
	 * 
	 * findByEmployeeAccount��������
	 * ����Ա���˺ŵĵ�Ա����Ϣ
	 *
	 * @param account	Ա���˻�
	 * @return	Ա����Ϣ
	 */
	Employee findByEmployeeAccount(String account);
}