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

/**
 * EmployeeDAOImplTest��Ҫ˵��
 * 
 *
 * @author zcq100
 */
public class EmployeeDAOImplTest extends TestCase{
	public void testFindAll(){
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("classpath:building-framework.xml");
		EmployeeDAOImpl employeedaoimpl=(EmployeeDAOImpl) context.getBean("EmployeeDAOImpl");
		System.out.println(employeedaoimpl.findByid(1).getEmpName());
	}
}
