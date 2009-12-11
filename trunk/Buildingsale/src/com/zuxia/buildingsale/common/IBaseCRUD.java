/**
 *******************************************************************************
 * IBaseCRUD.java
 * com.zuxia.buildingsale.dao
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
package com.zuxia.buildingsale.common;

/**
 * IBaseCRUD概要说明
 * 
 * 
 * @author zcq100
 */
public interface IBaseCRUD<T> {
	/**
	 * 
	 * findByid方法概述 根据ID查对象
	 * 
	 * @param id
	 * @return
	 */
	T findByid(Integer id);

	/**
	 * 
	 * merge方法概述 保存修改过的对象
	 * 
	 * @param obj
	 *            要添加的对象
	 * @return 1成功0失败
	 */
	int merge(T obj);

	/**
	 * 
	 * save方法概述 添加新的对象到数据库
	 * 
	 * @param obj
	 *            要保存的对象
	 * @return 1成功0失败
	 */
	int save(T obj);

	/**
	 * 
	 * delete方法概述 删除对象
	 * 
	 * @param obj
	 *            要删除的对象
	 * @return 1成功0失败
	 */
	int delete(T obj);
}
