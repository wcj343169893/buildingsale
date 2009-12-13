/**
 *******************************************************************************
 * filename    : IMenuService.java
 * package     : com.zuxia.buildingsale.sys.service
 * createdate  : 2009-12-13 下午05:28:31
 * project     : Buildingsale
 * @version    : 1.0
 * @author     : Administrator
 * (c) Copyright 2009 
 *	＜功能概要＞
 *  菜单服务类接口
 *******************************************************************************
 */
package com.zuxia.buildingsale.sys.service;

import java.util.List;

import com.zuxia.buildingsale.sys.entity.Employee;
import com.zuxia.buildingsale.sys.entity.MenuInfo;
import com.zuxia.buildingsale.sys.entity.RoleInfo;

/**
 * IMenuService概要说明
 * @author Administrator
 */
public interface IMenuService {
	/**
	 * 
	 * addRoleMenu方法概述
	 * 给角色添加菜单
	 * @param roleid 角色id 
	 * @param menuid 菜单信息id
	 * @return 状态信息(1,成功,0,失败)	
	 */
	int addRoleMenu(int roleid,int[] menuid);
	/**
	 * 
	 * addEmployeeMenu方法概述
	 * 给员工添加菜单
	 *
	 * @param empid
	 * @param menuid 菜单信息id
	 * @return 状态信息(1,成功,0,失败)	
	 */
	int addEmployeeMenu(int empid,int[] menuid);
	/**
	 * 
	 * deleteRoleMenu方法概述
	 * 删除角色菜单
	 * @param roleMenuId 角色目录id
	 * @return 状态信息(1,成功,0,失败)	
	 */
	int deleteRoleMenu(int roleMenuId[]);
	/**
	 * 
	 * deleteEmpMenu方法概述
	 * 删除员工菜单
	 * @param empmenuId 员工角色id
	 * @return 状态信息(1,成功,0,失败)	
	 */
	int deleteEmpMenu(int empmenuId[]);
	/**
	 * 
	 * findByEmpId方法概述
	 * 查询员工的菜单
	 * @param id	员工的id
	 * @return	菜单信息的集合
	 */
	List<MenuInfo> findByEmpId(int id);
	/**
	 * 
	 * findByRoleId方法概述
	 * 查询角色的菜单
	 * @param id 角色的id
	 * @return 菜单信息的集合
	 */
	List<MenuInfo> findByRoleId(int id);
	/**
	 * 
	 * findRoleByMenuId方法概述
	 * 根据菜单查询角色
	 * @param id 菜单id
	 * @return 角色的集合
	 */
	List<RoleInfo> findRoleByMenuId(int id);
	/**
	 * 
	 * findEmployeeByMenuId方法概述
	 * 根据菜单查询员工信息
	 * @param id 菜单id
	 * @return 员工的集合
	 */
	List<Employee> findEmployeeByMenuId(int id);
	/**
	 * 
	 * hasRoleMenu方法概述
	 * 角色是否有菜单权限
	 * @param roleid 角色id
	 * @param menuid 菜单信息id
	 * @return 是否存在菜单权限
	 */
	boolean hasRoleMenu(int roleid,int menuid);
	/**
	 * 
	 * hasEmpMenu方法概述
	 * 员工是否有菜单权限
	 *
	 * @param empid 员工id
	 * @param menuid 菜单信息id
	 * @return 是否存在菜单权限
	 */
	boolean hasEmpMenu(int empid,int menuid);
}
