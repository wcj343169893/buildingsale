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
import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.sys.entity.RoleMenu;

/**
 * IRoleMenuDao概要说明
 * @author zcq100
 */
public interface IRoleMenuDao extends IBaseCRUD<RoleMenu> {
	/**
	 * 
	 * findAll方法概述
	 * 分页查询所有的角色菜单信息
	 * @param page 分页对象
	 * @return	角色菜单信息对象的集合
	 */
	List<RoleMenu> findAll(Page page);
	/**
	 * 
	 * findByRoleId方法概述
	 * 根据角色ID查询所有的角色菜单信息
	 * @param roleId	角色编号
	 * @return	角色菜单信息的集合
	 */
	List<RoleMenu> findByRoleId(int roleId);
	
	/**
	 * 
	 * findByMenuId方法概述
	 * 根据菜单的编号查询所有的角色菜单信息
	 * @param menuId	菜单的编号
	 * @return	角色菜单信息的集合
	 */
	List<RoleMenu> findByMenuId(int menuId);
}
