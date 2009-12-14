/**
 *******************************************************************************
 * filename    : IMenuInfoService.java
 * package     : com.zuxia.buildingsale.sys.service
 * createdate  : 2009-12-13 ����05:27:41
 * project     : Buildingsale
 * @version    : 1.0
 * @author     : zcq100
 * (c) Copyright 2009 
 *	�˵���Ϣ������ӿ�
 *******************************************************************************
 */
package com.zuxia.buildingsale.sys.service;

import java.util.List;

import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.sys.entity.MenuInfo;

/**
 * IMenuInfoService��Ҫ˵��
 * 
 *
 * @author zcq100
 */
public interface IMenuInfoService {
	/**
	 * 
	 * addMenuInfo��������
	 * 
	 *
	 * @param menuinfo
	 * @return
	 */
	int addMenuInfo(MenuInfo menuinfo);
	
	/**
	 * 
	 * deleteMenuInfoByid��������
	 * 
	 *
	 * @param id
	 * @return
	 */
	int deleteMenuInfoByid(int id);
	
	/**
	 * 
	 * updateMenuInfo��������
	 * 
	 *
	 * @param menuinfo
	 * @return
	 */
	int updateMenuInfo(MenuInfo menuinfo);
	
	/**
	 * 
	 * findAllMenuInfo��������
	 * 
	 *
	 * @param page
	 * @return
	 */
	List<MenuInfo> findAllMenuInfo(Page page);
}