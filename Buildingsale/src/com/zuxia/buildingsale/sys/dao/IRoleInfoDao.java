/**
 *******************************************************************************
 * IRoleInfoDao.java
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
import com.zuxia.buildingsale.sys.entity.RoleInfo;

/**
 * IRoleInfoDao概要说明
 * 
 *
 * @author zcq100
 */
public interface IRoleInfoDao extends IBaseCRUD<RoleInfo> {
	/**
	 * 
	 * findAll方法概述
	 * 分页查找角色信息
	 *
	 * @param page	分页对象
	 * @return
	 */
	List<RoleInfo> findAll(Page page);
	
	/**
	 * 
	 * findAll方法概述
	 * 查找所有的角色信息
	 *
	 * @return
	 */
	List<RoleInfo> findAll();
}
