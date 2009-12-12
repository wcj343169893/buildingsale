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

import java.util.List;

import junit.framework.TestCase;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.sys.dao.IEmployeeDao;
import com.zuxia.buildingsale.sys.entity.Employee;

/**
 * EmployeeDAOImplTest概要说明
 * 
 *
 * @author zcq100
 */
public class EmployeeDAOImplTest extends TestCase{
	public void testFindAll(){
		IEmployeeDao employeedao = getBean();
		Page page=new Page();
		List<Employee> list=employeedao.findAll(page);
		System.out.println(page);
		for(Employee emp:list){
			System.out.println(emp.getEmpName()+","+emp.getEmpAccount());
		}
	}

	
	public void testFindByid(){
		IEmployeeDao employeedao = getBean();
		System.out.println(employeedao.findByid(1).getEmpName());
	}
	
	/**
	 * getBean方法概述
	 * 
	 *
	 * @return
	 */
	private IEmployeeDao getBean() {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("classpath:building-framework.xml");
		IEmployeeDao employeedao=(IEmployeeDao) context.getBean("EmployeeDAOImpl");
		return employeedao;
	}
}
