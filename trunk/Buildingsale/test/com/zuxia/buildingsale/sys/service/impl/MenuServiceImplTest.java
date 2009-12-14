/**
 *******************************************************************************
 * filename    : MenuServiceImplTest.java
 * package     : com.zuxia.buildingsale.sys.service.impl
 * createdate  : 2009-12-13 下午09:48:09
 * project     : Buildingsale
 * @version    : 1.0
 * @author     : zcq100
 * (c) Copyright 2009 
 *	＜功能概要＞
 *  XXX
 *******************************************************************************
 */
package com.zuxia.buildingsale.sys.service.impl;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zuxia.buildingsale.sys.entity.MenuInfo;
import com.zuxia.buildingsale.sys.service.IMenuService;

import junit.framework.TestCase;

/**
 * MenuServiceImplTest概要说明
 * 
 *
 * @author zcq100
 */
public class MenuServiceImplTest extends TestCase {
	public void testHasRoleMenu(){
		IMenuService menuservice=getEmpMenu();
		assertTrue(menuservice.hasRoleMenu(1, 1));
	}
	
	public void testAddEmployeeMenu(){
		IMenuService menuservice=getEmpMenu();
		int[] menuids={1,3,7,8,9,40};
		assertEquals(menuservice.addEmployeeMenu(1, menuids),1);
	}
	
	
	public void testAddRoleMenu(){
		IMenuService menuservice=getEmpMenu();
		int[] menuids={2,3,9,7,40};
		assertEquals(menuservice.addRoleMenu(1, menuids),1);
	}
	
	public void testFindByRoleId(){
		IMenuService menuservice=getEmpMenu();
		List<MenuInfo> list=menuservice.findByRoleId(6);
		for(MenuInfo menuinfo:list){
			System.out.println(menuinfo.getMenuId()+","+menuinfo.getMenuName());
		}
		assertNotNull(list);
	}
	
	
	public void testFindByEmployeeId(){
		IMenuService menuservice=getEmpMenu();
		List<MenuInfo> list=menuservice.findByEmpId(1);
		for(MenuInfo menuinfo:list){
			System.out.println(menuinfo.getMenuId()+","+menuinfo.getMenuName());
		}
		assertNotNull(list);
	}
	
	public void testUpdateRoleMenu(){
		IMenuService menuservice=getEmpMenu();
		menuservice.updateRoleMenu(1, new int[]{1,2,3,4,5});
	}
	
	
	public void testUpdateEmpMenu(){
		IMenuService menuservice=getEmpMenu();
		menuservice.updateEmpMenu(1, new int[]{1,2,3,4,5,6});
	}
	
	
	public void testHasEmpMenu(){
		IMenuService menuservice=getEmpMenu();
		assertFalse(menuservice.hasEmpMenu(1,6));
	}
	
	private IMenuService getEmpMenu() {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("classpath:building-framework.xml");
		IMenuService menuService=(IMenuService) context.getBean("MenuServiceImpl");
		return menuService;
	}
}
