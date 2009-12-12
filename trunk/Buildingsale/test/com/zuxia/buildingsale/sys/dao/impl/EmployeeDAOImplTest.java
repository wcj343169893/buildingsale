/**
 *******************************************************************************
 * EmployeeDAOImplTest.java
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
package com.zuxia.buildingsale.sys.dao.impl;

import junit.framework.TestCase;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zuxia.buildingsale.sys.dao.IEmployeeDao;
import com.zuxia.buildingsale.sys.entity.Employee;

/**
 * EmployeeDAOImplTest��Ҫ˵��
 * 
 *
 * @author zcq100
 */
public class EmployeeDAOImplTest extends TestCase{
	public void testFindAll(){
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("classpath:building-framework.xml");
		IEmployeeDao employeedao=(IEmployeeDao) context.getBean("EmployeeDAOImpl");
		Employee emp=employeedao.findByid(1);
		System.out.println(emp.getEmpName());
	}
}
