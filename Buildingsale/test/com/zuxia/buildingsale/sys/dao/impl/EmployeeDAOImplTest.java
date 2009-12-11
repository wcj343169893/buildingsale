/**
 *******************************************************************************
 * EmployeeDAOImplTest.java
 * com.zuxia.buildingsale.sys.dao.impl
 * (c) Copyright 2009 
 *	2009-12-11
 *＜所属工程名＞
 *  Buildingsale
 *＜功能概要＞
 *  XXX
 *＜作者＞
 *  zcq100
 *******************************************************************************
 */
package com.zuxia.buildingsale.sys.dao.impl;

import junit.framework.TestCase;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * EmployeeDAOImplTest概要说明
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
