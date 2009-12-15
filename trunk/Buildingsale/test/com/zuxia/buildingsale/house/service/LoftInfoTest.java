/**
 *******************************************************************************
 * filename    : LoftInfoTest.java
 * package     : com.zuxia.buildingsale.house.service
 * createdate  : 2009-12-14 ����05:44:20
 * project     : Buildingsale
 * @version    : 1.0
 * @author     : chaojun
 * (c) Copyright 2009 
 *	�����ܸ�Ҫ��
 *  XXX
 *******************************************************************************
 */
package com.zuxia.buildingsale.house.service;

import java.util.List;

import junit.framework.TestCase;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zuxia.buildingsale.business.dao.impl.DataDictDAOImpl;
import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.house.dao.ILoftInfoDAO;
import com.zuxia.buildingsale.house.dao.IShopInfoDAO;
import com.zuxia.buildingsale.house.dao.impl.LoftInfoDAOImpl;
import com.zuxia.buildingsale.house.dao.impl.ShopInfoDAOImpl;
import com.zuxia.buildingsale.house.entity.LoftInfo;
import com.zuxia.buildingsale.house.entity.ShopInfo;

/**
 * LoftInfoTest��Ҫ˵��
 * 
 * 
 * @author chaojun
 */
public class LoftInfoTest extends TestCase {
	/**
	 * testAddLoft_shop�������� �������ӳɹ�  loft_shop;��������
	 * 
	 *
	 */
	public void testAddLoft_shop() {
		LoftInfo loftInfo = new LoftInfo();
		ShopInfoDAOImpl shopInfoDAOImpl = (ShopInfoDAOImpl) getShopInfoDAO();
		List<ShopInfo> shopInfos = shopInfoDAOImpl.findAll(new Page());
		loftInfo.setShopInfos(shopInfos);
		loftInfo.setLoftAddress("������ɳƺ��������·");
		loftInfo.setLoftZone("������ɳƺ����");
		loftInfo.setLoftName("ƽ����԰");
		loftInfo.setLoftNo("PAJY_1");
		DataDictDAOImpl ddd = getDataDictDAO();
		loftInfo.setDataDictByLoftBuildType(ddd.findByid(1));//��������
		loftInfo.setDataDictByLoftComtyType(ddd.findByid(2));//��ҵ����

		LoftInfoDAOImpl lid = (LoftInfoDAOImpl) getLoftInfoDAO();
		int row = lid.save(loftInfo);
		System.out.println(row);
	}

	/**
	 * testDeleteLoft_shop�������� ɾ��  �ɹ�   loft_shop;����ɾ��
	 * 
	 *
	 */
	public void testDeleteLoft_shop() {
		LoftInfoDAOImpl lid = (LoftInfoDAOImpl) getLoftInfoDAO();
		LoftInfo loftInfo=lid.findByid(20);
		int row = lid.delete(loftInfo);
		System.out.println(row);
	}

	public static ILoftInfoDAO getLoftInfoDAO() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:building-framework.xml");
		ILoftInfoDAO loftInfoDAO = (ILoftInfoDAO) context
				.getBean("LoftInfoDAOImpl");
		return loftInfoDAO;
	}

	public static IShopInfoDAO getShopInfoDAO() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:building-framework.xml");
		IShopInfoDAO shopInfoDAO = (IShopInfoDAO) context
				.getBean("ShopInfoDAO");
		return shopInfoDAO;
	}

	public static DataDictDAOImpl getDataDictDAO() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:building-framework.xml");
		DataDictDAOImpl dataDictDAO = (DataDictDAOImpl) context
				.getBean("DataDictDAOImpl");
		return dataDictDAO;
	}

}
