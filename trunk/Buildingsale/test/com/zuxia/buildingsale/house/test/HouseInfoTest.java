/**
 *******************************************************************************
 * HouseInfoTest.java
 * com.zuxia.buildingsale.house.test
 * (c) Copyright 2009 
 *	2009-12-12
 *＜所属工程名＞
 *  Buildingsale
 *＜功能概要＞
 *  XXX
 *＜作者＞
 *  zcq100 chaojun
 *******************************************************************************
 */
package com.zuxia.buildingsale.house.test;

import java.util.List;

import junit.framework.TestCase;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.house.dao.IHouseInfoDAO;
import com.zuxia.buildingsale.house.entity.HouseInfo;

/**
 * HouseInfoTest概要说明
 * 
 * 
 * @author zcq100 chaojun
 */
public class HouseInfoTest extends TestCase {

	public void testFindByState() {
		IHouseInfoDAO houseInfoDAO = getHouseInfoDAO();
		Page page = new Page();
		page.setPageIndex(1);

		List<HouseInfo> houseInfoList = houseInfoDAO.findAll(page);
		System.out.println(houseInfoList.size());
		for (HouseInfo houseInfo : houseInfoList) {
			System.out.println(houseInfo.getHouseNo());
		}
	}

	public void testFindByType() {
		IHouseInfoDAO houseInfoDAO = getHouseInfoDAO();
		System.out.println(houseInfoDAO);
		List<HouseInfo> houseInfoList = houseInfoDAO.findByType(new Page(), 1);
		for (HouseInfo houseInfo : houseInfoList) {
			System.out.println(houseInfo.getHouseNo());
		}
	}

	public void testFindAll() {
		IHouseInfoDAO houseInfoDAO = getHouseInfoDAO();
		System.out.println(houseInfoDAO);
		List<HouseInfo> houseInfoList = houseInfoDAO.findAll(new Page());
		for (HouseInfo houseInfo : houseInfoList) {
			System.out.println(houseInfo.getHouseId()+"---"+houseInfo.getHouseNo());
		}
	}

	public static IHouseInfoDAO getHouseInfoDAO() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:building-framework.xml");
		IHouseInfoDAO houseInfoDAO = (IHouseInfoDAO) context
				.getBean("HouseInfoDAOImpl");
		return houseInfoDAO;
	}
}
