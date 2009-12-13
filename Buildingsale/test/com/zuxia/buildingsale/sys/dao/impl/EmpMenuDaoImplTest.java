/**
 *******************************************************************************
 * EmpMenuDaoImplTest.java
 * com.zuxia.buildingsale.sys.dao.impl
 * (c) Copyright 2009 
 *	2009-12-12
 *��������������
 *  Buildingsale
 *�����ܸ�Ҫ��
 *  XXX
 *�����ߣ�
 *  zcq100 chaojun
 *******************************************************************************
 */
package com.zuxia.buildingsale.sys.dao.impl;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.sys.dao.IEmpMenuDao;
import com.zuxia.buildingsale.sys.entity.EmpMenu;
import com.zuxia.buildingsale.sys.entity.Employee;
import com.zuxia.buildingsale.sys.entity.MenuInfo;

import junit.framework.TestCase;

/**
 * EmpMenuDaoImplTest��Ҫ˵��
 * 
 *
 * @author zcq100 chaojun
 */
public class EmpMenuDaoImplTest extends TestCase {
	/**
	 * 
	 * testSave��������
	 * ���Ա��Ȩ�޲���
	 *
	 */
	public void testSave(){
		IEmpMenuDao dao=getBean();
		EmpMenu empmenu=new EmpMenu();
		Employee emp=new Employee();
		emp.setEmpId(1);
		MenuInfo menuinfo=new MenuInfo();
		menuinfo.setMenuId(3);
		empmenu.setEmployee(emp);
		empmenu.setMenuInfo(menuinfo);
		int i=dao.save(empmenu);
		assertEquals(i, 1);
	}
	
	/**
	 * 
	 * testDelete��������
	 * ɾ������
	 *
	 */
	public void testDelete(){
		IEmpMenuDao dao=getBean();
		assertEquals(dao.delete(dao.findByid(1)),1);
	}
	
	/**
	 * 
	 * testFindAll��������
	 * �鿴Ա��Ȩ�޲���
	 *
	 */
	public void testFindAll(){
		IEmpMenuDao dao=getBean();
		Page page=new Page();
		List<EmpMenu> list=dao.findAll(page);
		System.out.println(page);
		for(EmpMenu empmenu:list){
			System.out.println(empmenu.getEmId()+","+empmenu.getEmployee().getEmpAccount()+","+empmenu.getMenuInfo().getMenuName());
		}
		assertNotNull(list);
	}
	
	/**
	 * 
	 * testFindByEmpId��������
	 * 
	 *
	 */
	public void testFindByEmpId(){
		IEmpMenuDao dao=getBean();
		List<EmpMenu> list=dao.findByEmpId(1);
		for(EmpMenu empmenu:list){
			System.out.println(empmenu.getEmId()+","+empmenu.getEmployee().getEmpAccount()+","+empmenu.getMenuInfo().getMenuName());
		}
		assertNotNull(list);
	}
	
	/**
	 * 
	 * testFindByMenuId��������
	 * 
	 *
	 */
	public void testFindByMenuId(){
		IEmpMenuDao dao=getBean();
		List<EmpMenu> list=dao.findByMenuId(1);
		for(EmpMenu empmenu:list){
			System.out.println(empmenu.getEmId()+","+empmenu.getEmployee().getEmpAccount()+","+empmenu.getMenuInfo().getMenuName());
		}
		assertNotNull(list);
	}
	
	private IEmpMenuDao getBean() {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("classpath:building-framework.xml");
		IEmpMenuDao empmenudao=(IEmpMenuDao) context.getBean("EmpMenuDAOImpl");
		return empmenudao;
	}
}
