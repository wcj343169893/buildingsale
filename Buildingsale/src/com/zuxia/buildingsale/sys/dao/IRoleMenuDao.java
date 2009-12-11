/**
 *******************************************************************************
 * IRoleMenuDao.java
 * com.zuxia.buildingsale.sys.dao
 * (c) Copyright 2009 
 *	2009-12-11
 *＜所属工程名＞
 *  Buildingsale
 *＜功能概要＞
 *  XXX
 *＜作者＞
 *  zcq100
 *******************************************************************************
 */
package com.zuxia.buildingsale.sys.dao;

import java.util.List;

import com.zuxia.buildingsale.common.IBaseCRUD;
import com.zuxia.buildingsale.sys.entity.RoleMenu;

/**
 * IRoleMenuDao概要说明
 * @author zcq100
 */
public interface IRoleMenuDao extends IBaseCRUD<RoleMenu> {
	/**
	 * 
	 * findRoleMenuByRoleId方法概述
	 * 根据角色编号获得角色菜单
	 * @param id 角色编号
	 * @return 角色菜单的集合
	 */
	List<RoleMenu> findRoleMenuByRoleId(int id);
	
}
