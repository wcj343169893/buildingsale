/**
 *******************************************************************************
 * filename    : EmployeeServiceTest.java
 * package     : com.zuxia.buildingsale.sys.service.impl
 * createdate  : 2009-12-16 下午05:46:38
 * project     : Buildingsale
 * @version    : 1.0
 * @author     : Administrator
 * (c) Copyright 2009 
 *	＜功能概要＞
 *  XXX
 *******************************************************************************
 */
package com.zuxia.buildingsale.sys.service.impl;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zuxia.buildingsale.business.entity.DataDict;
import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.sys.dao.IEmployeeDao;
import com.zuxia.buildingsale.sys.entity.Employee;
import com.zuxia.buildingsale.sys.service.IEmployeeService;

import junit.framework.TestCase;

/**
 * EmployeeServiceTest概要说明
 * @author zcq100
 */
public class EmployeeServiceTest extends TestCase {
	public void testFindAll(){
		IEmployeeService employeeservice=getBean();
		Page page=new Page();
		List<Employee> list=employeeservice.findAllEmployee(page);
		System.out.println(page);
		for(Employee emp:list){
			System.out.println(emp);
		}
	}
	
	public void testAddEmployee(){
		IEmployeeService employeeservice=getBean();
		Employee emp=new Employee();
		emp.setEmpAccount("zcq");
		emp.setEmpName("xiaozhang");
		emp.setEmpNo("xxxxxxxxx");
		emp.setEmpPass("123456");
		emp.setEmpPid("123456789098765432");
		emp.setEmpSex(1);
		DataDict dd=new DataDict();
		dd.setDdId(13);
		emp.setEmpState(dd);
		employeeservice.addEmployee(emp);
		
	}
	
	public void testDeleteEmployee(){
		IEmployeeService employeeservice=getBean();
		employeeservice.deleteEmployee(1);
	}
	
	private IEmployeeService getBean() {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("classpath:building-framework.xml");
		IEmployeeService employeeservice=(IEmployeeService) context.getBean("EmployeeServiceImpl");
		return employeeservice;
	}
}
