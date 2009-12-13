/**
 *******************************************************************************
 * ShopInfoServiceImpl.java
 * com.zuxia.buildingsale.house.service.impl
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
package com.zuxia.buildingsale.house.service.impl;

import java.util.List;

import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.house.dao.IShopInfoDAO;
import com.zuxia.buildingsale.house.entity.ShopInfo;
import com.zuxia.buildingsale.house.form.ShopInfoForm;
import com.zuxia.buildingsale.house.service.IShopInfoService;
import com.zuxia.buildingsale.sys.entity.Employee;

/**
 * ShopInfoServiceImpl��Ҫ˵��
 * 
 * 
 * @author zcq100 chaojun
 */
public class ShopInfoServiceImpl implements IShopInfoService {
	private IShopInfoDAO shopInfoDAO;

	/**
	 * shopInfoDAO���Ե�get����
	 * 
	 * @return the shopInfoDAO
	 */
	public IShopInfoDAO getShopInfoDAO() {
		return shopInfoDAO;
	}

	/**
	 * shopInfoDAO���Ե�set����
	 * 
	 * @param shopInfoDAO
	 *            the shopInfoDAO to set
	 */
	public void setShopInfoDAO(IShopInfoDAO shopInfoDAO) {
		this.shopInfoDAO = shopInfoDAO;
	}

	@Override
	public int addShopInfo(ShopInfoForm shopInfoForm, Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteShopInfo(int shopInfoId) {
		return shopInfoDAO.delete(shopInfoDAO.findByid(shopInfoId));
	}

	@Override
	public int editShopInfo(ShopInfoForm shopInfoForm, Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ShopInfo> findAll(Page page) {
		return shopInfoDAO.findAll(page);
	}

}
