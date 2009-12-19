/**
 *******************************************************************************
 * filename    : MenuInfoServiceImpl.java
 * package     : com.zuxia.buildingsale.sys.service.impl
 * createdate  : 2009-12-19 下午08:23:05
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

import com.zuxia.buildingsale.sys.dto.MenuDto;
import com.zuxia.buildingsale.sys.service.IMenuInfoService;

import junit.framework.TestCase;

/**
 * MenuInfoServiceImpl概要说明
 * 
 * 
 * @author zcq100
 */
public class MenuInfoServiceTest extends TestCase {

	public void testFindMenu() {
		IMenuInfoService menuservice=getBean();
		List<MenuDto> menus=menuservice.findMenus();
		assertTrue(menus.size()>0);
	}

	private IMenuInfoService getBean(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:building-framework.xml");
		return (IMenuInfoService) context.getBean("MenuInfoService");
	}
}
