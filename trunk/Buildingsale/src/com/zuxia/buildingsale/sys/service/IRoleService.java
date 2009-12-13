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

/**
 * IRoleService概要说明
 * 
 *
 * @author Administrator
 */
public interface IRoleService {
	/**
	 * 
	 * addEmployeeRole方法概述
	 * 给员工添加角色
	 * @param empid 员工编号
	 * @param roleid 角色编号
	 * @return 状态信息(1,成功,0,失败)	
	 */
	int addEmployeeRole(int empid,int roleid);
	/**
	 * 
	 * deleleEmployeeRole方法概述
	 * 删除角色组中的员工
	 * @param empid 员工编号
	 * @param roleid 角色编号	
	 * @return 状态信息(1,成功,0,失败)	
	 */
	int deleleEmployeeRole(int empid,int roleid);
	/**
	 * 
	 * isRole方法概述
	 * 判断员工是否属于某角色
	 * @param empid	员工编号
	 * @param roleid	角色编号
	 * @return	(是/否)
	 */
	boolean isRole(int empid,int roleid);
}
