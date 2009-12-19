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
import com.zuxia.buildingsale.sys.dto.MenuDto;
import com.zuxia.buildingsale.sys.entity.MenuInfo;

/**
 * IMenuInfoService概要说明
 * 
 *
 * @author zcq100
 */
public interface IMenuInfoService {
	
	boolean addMenu(MenuInfo menu);
	boolean deleteMenu(int id);
	List<MenuDto> findMenus();
	List<MenuInfo> findMenus(Page page);
}
