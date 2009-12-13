/**
 *******************************************************************************
 * IShopInfoService.java
 * com.zuxia.buildingsale.house.service
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
package com.zuxia.buildingsale.house.service;

import java.util.List;

import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.house.entity.ShopInfo;
import com.zuxia.buildingsale.house.form.ShopInfoForm;
import com.zuxia.buildingsale.sys.entity.Employee;

/**
 * IShopInfoService概要说明
 * 
 * 
 * @author zcq100 chaojun
 */
public interface IShopInfoService {
	/**
	 * findAll方法概述 查询所有的售楼部
	 * 
	 * 
	 * @param page
	 *            分页信息
	 * @return List
	 */
	public List<ShopInfo> findAll(Page page);

	public int addShopInfo(ShopInfoForm shopInfoForm, Employee employee);

	public int deleteShopInfo(int shopInfoId);

	public int editShopInfo(ShopInfoForm shopInfoForm, Employee employee);

}
