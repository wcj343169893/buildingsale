/**
 *******************************************************************************
 * IBaseCRUD.java
 * com.zuxia.buildingsale.dao
 * (c) Copyright 2009 
 *	2009-12-11
 *＜所属工程名＞
 *  Buildingsale
 *＜功能概要＞
 *  基本的CRUD类
 *＜作者＞
 *  zcq100
 *******************************************************************************
 */
package com.zuxia.buildingsale.business.dao;

/**
 * IBaseCRUD概要说明
 * 
 *
 * @author zcq100
 */
public interface IBaseCRUD<T> {

	/**
	 * 
	 * findById方法概述
	 * 根据Id查询到对象
	 *
	 * @param id
	 * @return
	 */
	T findById(Integer id);

	/**
	 * 
	 * merge方法概述
	 * 保存一个修改过的对象
	 *
	 * @param obj
	 * @return
	 */
	T merge(T obj);

	/**
	 * 删除一个对象
	 * del方法概述
	 * 
	 *
	 * @param obj
	 */
	void del(T obj);

	/**
	 * 
	 * save方法概述
	 * 添加一个对象
	 *
	 * @param obj
	 */
	void save(T obj);
}
