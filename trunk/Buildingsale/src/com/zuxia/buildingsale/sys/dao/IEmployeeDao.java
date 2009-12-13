/**
 *******************************************************************************
 * IEmployeeDao.java
 * com.zuxia.buildingsale.sys.dao.impl
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
import com.zuxia.buildingsale.sys.entity.Employee;

/**
 * IEmployeeDao概要说明
 * 
 *
 * @author zcq100
 */
public interface IEmployeeDao extends IBaseCRUD<Employee> {
	/**
	 * 
	 * findAll方法概述
	 * 分页查找所有的雇员
	 *
	 * @param page 分页信息
	 * @return 员工集合
	 */
	List<Employee> findAll(Page page);
	
	/**
	 * findEmployeeByExample方法概述
	 * 根据员工信息查询符合要求的员工
	 * @param page	分页条件
	 * @param emp	员工信息
	 * @return	员工对象的集合
	 */
	List<Employee> findEmployeeByExample(Page page,Employee emp);
	/**
	 * 
	 * findByEmployeeAccount方法概述
	 * 根据员工账号的道员工信息
	 *
	 * @param account	员工账户
	 * @return	员工信息
	 */
	Employee findByEmployeeAccount(String account);
	
	/**
	 * 
	 * isExistAccount方法概述
	 * 判断用户账户是否存在
	 * @param accoutn 用户账户
	 * @return 
	 */
	boolean isExistAccount(String account);
}
