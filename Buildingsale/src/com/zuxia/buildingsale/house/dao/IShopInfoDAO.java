/**
 *******************************************************************************
 * IHouseInfoDAO.java
 * com.zuxia.buildingsale.house.dao
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
package com.zuxia.buildingsale.house.dao;

import java.util.List;

import com.zuxia.buildingsale.common.IBaseCRUD;
import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.house.entity.ShopInfo;

public interface IShopInfoDAO extends IBaseCRUD<ShopInfo> {
	/**
	 * findAll�������� ��ѯ���е���¥��
	 * 
	 *
	 * @param page ��ҳ��Ϣ
	 * @return List
	 */
	public List<ShopInfo> findAll(Page page);
}
