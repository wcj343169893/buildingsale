/**
 *******************************************************************************
 * filename    : RoleMenuDaoTest.java
 * package     : com.zuxia.buildingsale.sys.dao.impl
 * createdate  : 2009-12-14 上午11:46:06
 * project     : Buildingsale
 * @version    : 1.0
 * @author     : student
 * (c) Copyright 2009 
 *	＜功能概要＞
 *  XXX
 *******************************************************************************
 */
package com.zuxia.buildingsale.sys.dao.impl;

import java.util.List;

import junit.framework.TestCase;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.sys.dao.IRoleMenuDao;
import com.zuxia.buildingsale.sys.entity.RoleMenu;

/**
 * RoleMenuDaoTest概要说明
 * 
 * 
 * @author student
 */
public class RoleMenuDaoImplTest extends TestCase {

	public void testFindByRoleId() {
		IRoleMenuDao rolemenudao = getBean();
		List<RoleMenu> list = rolemenudao.findByRoleId(1);
		for (RoleMenu rolemenu : list) {
			System.out.println(rolemenu);
		}
	}

	public void testFindAll() {
		IRoleMenuDao rolemenudao = getBean();
		Page page = new Page();
		page.setPageRecordCount(10);
		for (int i = 0; i < page.getPageCount(); i++) {
			List<RoleMenu> list = rolemenudao.findAll(page);
			System.out.println(page);
			for (RoleMenu rolemenu : list) {
				System.out.println(rolemenu);
			}
			System.out.println("************************************");
			page.setPageIndex(page.getPageIndex()+1);
		}
	}

	private IRoleMenuDao getBean() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:building-framework.xml");
		IRoleMenuDao rolemenudao = (IRoleMenuDao) context
				.getBean("RoleMenuDAOImpl");
		return rolemenudao;
	}
}
