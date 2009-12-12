/**
 *******************************************************************************
 * IEmpMenu.java
 * com.zuxia.buildingsale.sys.dao
 * (c) Copyright 2009 
 *	2009-12-11
 *＜所属工程名＞
 *  Buildingsale
 *＜功能概要＞
 *  员工菜单信息相关的接口
 *＜作者＞
 *  zcq100
 *******************************************************************************
 */
package com.zuxia.buildingsale.sys.dao;

import java.util.List;
import com.zuxia.buildingsale.common.IBaseCRUD;
import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.sys.entity.EmpMenu;

/**
 * IEmpMenu概要说明
 * 
 *
 * @author zcq100
 */
public interface IEmpMenuDao extends IBaseCRUD<EmpMenu> {
	/**
	 * 
	 * findAll方法概述
	 * 分页查询所有的角色菜单信息
	 * @param page	分页对象
	 * @return	菜单角色信息集合
	 */
	List<EmpMenu> findAll(Page page);
	/**
	 * 
	 * findByEmpId方法概述
	 * 根据员工编号得到所有的角色菜单信息
	 * @param id	员工编号
	 * @return	菜单信息集合
	 */
	List<EmpMenu> findByEmpId(int id);
	/**
	 * 
	 * findByMenuId方法概述
	 * 根据菜单编号得到所有的员工菜单信息
	 * @param id	菜单的编号
	 * @return	菜单员工信息
	 */
	List<EmpMenu> findByMenuId(int id);
	
}
