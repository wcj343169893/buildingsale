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
	List<Employee> findAll(Page page);
}
