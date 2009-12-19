/**
 *******************************************************************************
 * filename    : IRoleService.java
 * package     : com.zuxia.buildingsale.sys.service
 * createdate  : 2009-12-13 下午05:28:42
 * project     : Buildingsale
 * @version    : 1.0
 * @author     : Administrator
 * (c) Copyright 2009 
 *	＜功能概要＞
 *  员工角色关系管理
 *******************************************************************************
 */
package com.zuxia.buildingsale.sys.service;

import java.util.List;

import com.zuxia.buildingsale.sys.entity.RoleInfo;

/**
 * IRoleService概要说明
 * 
 *
 * @author Administrator
 */
public interface IRoleService {
	/**
	 * 
	 * addRole方法概述
	 * 
	 *
	 * @param role
	 * @return
	 */
	boolean addRole(RoleInfo role);
	
	/**
	 * 
	 * deleteRole方法概述
	 * 
	 *
	 * @param id
	 * @return
	 */
	boolean deleteRole(int id);
	
	/**
	 * 
	 * findAll方法概述
	 * 
	 *
	 * @return
	 */
	List<RoleInfo> findAll();
	
	
	boolean updateMenu(int roleid,int[] menuids);
	
	
}
