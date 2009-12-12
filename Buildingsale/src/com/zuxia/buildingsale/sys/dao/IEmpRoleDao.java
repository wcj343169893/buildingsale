/**
 *******************************************************************************
 * IEmpRoleDao.java
 * com.zuxia.buildingsale.sys.dao
 * (c) Copyright 2009 
 *	2009-12-11
 *＜所属工程名＞
 *  Buildingsale
 *＜功能概要＞
 *  员工角色信息的相关操作的DAO接口
 *＜作者＞
 *  zcq100
 *******************************************************************************
 */
package com.zuxia.buildingsale.sys.dao;

import java.util.List;
import com.zuxia.buildingsale.common.IBaseCRUD;
import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.sys.entity.EmpRole;

/**
 * IEmpRoleDao概要说明
 * 
 *
 * @author zcq100
 */
public interface IEmpRoleDao extends IBaseCRUD<EmpRole> {
	/**
	 * 
	 * findAll方法概述
	 * 分页查找所有的员工角色信息
	 * @param page	分页对象
	 * @return	员工角色信息的集合
	 */
	List<EmpRole> findAll(Page page);
	/**
	 * 
	 * findByEmpId方法概述
	 *根据员工的编号查找员工角色信息
	 * @param id	员工的编号
	 * @return	员工角色信息的集合
	 */
	List<EmpRole> findByEmpId(int id);
	/**
	 * 
	 * findByRoleId方法概述
	 * 根据角色编号查找员工角色信息
	 * @param id 角色编号
	 * @return 员工角色信息的集合
	 */
	List<EmpRole> findByRoleId(int id);
}
