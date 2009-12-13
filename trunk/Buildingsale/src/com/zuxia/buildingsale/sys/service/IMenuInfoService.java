/**
 *******************************************************************************
 * filename    : IMenuInfoService.java
 * package     : com.zuxia.buildingsale.sys.service
 * createdate  : 2009-12-13 下午05:27:41
 * project     : Buildingsale
 * @version    : 1.0
 * @author     : zcq100
 * (c) Copyright 2009 
 *	菜单信息服务类接口
 *******************************************************************************
 */
package com.zuxia.buildingsale.sys.service;

import java.util.List;

import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.sys.entity.MenuInfo;

/**
 * IMenuInfoService概要说明
 * 
 *
 * @author zcq100
 */
public interface IMenuInfoService {
	/**
	 * 
	 * addMenuInfo方法概述
	 * 
	 *
	 * @param menuinfo
	 * @return
	 */
	int addMenuInfo(MenuInfo menuinfo);
	
	/**
	 * 
	 * deleteMenuInfoByid方法概述
	 * 
	 *
	 * @param id
	 * @return
	 */
	int deleteMenuInfoByid(int id);
	
	/**
	 * 
	 * updateMenuInfo方法概述
	 * 
	 *
	 * @param menuinfo
	 * @return
	 */
	int updateMenuInfo(MenuInfo menuinfo);
	
	/**
	 * 
	 * findAllMenuInfo方法概述
	 * 
	 *
	 * @param page
	 * @return
	 */
	List<MenuInfo> findAllMenuInfo(Page page);
}
