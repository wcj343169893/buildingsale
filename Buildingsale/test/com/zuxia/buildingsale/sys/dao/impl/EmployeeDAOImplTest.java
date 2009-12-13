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

import java.util.List;

import junit.framework.TestCase;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zuxia.buildingsale.common.Page;
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
		IEmployeeDao employeedao = getBean();
		Page page=new Page();
		List<Employee> list=employeedao.findAll(page);
		System.out.println(page);
		for(Employee emp:list){
			System.out.println(emp.getEmpName()+","+emp.getEmpAccount());
		}
	}

	public void testFindEmployeeByExample(){
		IEmployeeDao employeedao = getBean();
		Page page=new Page();
		Employee example=new Employee();
		example.setEmpName("��");
		example.setEmpPid("123123123123123123");
		List<Employee> list=employeedao.findEmployeeByExample(page, example);
		System.out.println(page);
		for(Employee emp:list){
			System.out.println(emp.getEmpName()+","+emp.getEmpAccount());
		}
		assertNotNull("�鵽���û�����Ϣ", list);
	}
	
	/**
	 * 
	 * testIsExistAccount��������
	 * �����˺��Ƿ����
	 */
	public  void testIsExistAccount(){
		IEmployeeDao employeedao = getBean();
		assertTrue(employeedao.isExistAccount("xingba"));
	}
	
	/**
	 * 
	 * testFindByid��������
	 * ����id�õ��˻�
	 *
	 */
	public void testFindByid(){
		IEmployeeDao employeedao = getBean();
		System.out.println(employeedao.findByid(1).getEmpName());
	}
	
	/**
	 * getBean��������
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
