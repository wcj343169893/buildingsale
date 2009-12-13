/**
 *******************************************************************************
 * IShopInfoService.java
 * com.zuxia.buildingsale.house.service
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
package com.zuxia.buildingsale.house.service;

import java.util.List;

import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.house.entity.ShopInfo;
import com.zuxia.buildingsale.house.form.ShopInfoForm;
import com.zuxia.buildingsale.sys.entity.Employee;

/**
 * IShopInfoService��Ҫ˵��
 * 
 * 
 * @author zcq100 chaojun
 */
public interface IShopInfoService {
	/**
	 * findAll�������� ��ѯ���е���¥��
	 * 
	 * 
	 * @param page
	 *            ��ҳ��Ϣ
	 * @return List
	 */
	public List<ShopInfo> findAll(Page page);

	public int addShopInfo(ShopInfoForm shopInfoForm, Employee employee);

	public int deleteShopInfo(int shopInfoId);

	public int editShopInfo(ShopInfoForm shopInfoForm, Employee employee);

}
