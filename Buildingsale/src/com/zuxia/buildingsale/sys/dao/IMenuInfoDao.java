/**
 *******************************************************************************
 * IMenuInfoDao.java
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
import com.zuxia.buildingsale.sys.entity.MenuInfo;

/**
 * IMenuInfoDao概要说明
 * 
 *
 * @author zcq100
 */
public interface IMenuInfoDao extends IBaseCRUD<MenuInfo> {
	/**
	 * 
	 * findAll方法概述
	 * 查询所有的菜单信息
	 * @return 菜单信息的集合
	 */
	List<MenuInfo> findAll();
	
	/**
	 * 
	 * findAll方法概述<br/>
	 * 分页查找页面中的所有菜单信息
	 * @param page	分页对象
	 * @return	菜单信息的集合
	 */
	List<MenuInfo> findAll(Page page);
	
	/**
	 * 
	 * findByMenuInfoNo方法概述
	 * 根据菜单编号查找菜单信息
	 * @param no 菜单编号
	 * @return	菜单信息的集合
	 */
	MenuInfo findByMenuInfoNo(String no);
	
	/**
	 * 
	 * findByMenuInfoName方法概述
	 * 根基菜单名称查询菜单信息
	 * @param name 菜单名字
	 * @return	菜单信息
	 */
	MenuInfo findByMenuInfoName(String name);
	
	/**
	 * 
	 * findByMenuInfoParent方法概述
	 * 根据父级菜单编号查询所有的菜单信息
	 * @param no	父级菜单的编号
	 * @return	菜单信息的集合
	 */
	List<MenuInfo> findByMenuInfoParent(String no);
	
}
