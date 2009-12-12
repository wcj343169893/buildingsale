/**
 *******************************************************************************
 * IRoleMenuDao.java
 * com.zuxia.buildingsale.sys.dao
 * (c) Copyright 2009 
 *	2009-12-11
 *��������������
 *  Buildingsale
 *�����ܸ�Ҫ��
 *  XXX
 *�����ߣ�
 *  zcq100
 *******************************************************************************
 */
package com.zuxia.buildingsale.sys.dao;

import java.util.List;

import com.zuxia.buildingsale.common.IBaseCRUD;
import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.sys.entity.RoleMenu;

/**
 * IRoleMenuDao��Ҫ˵��
 * @author zcq100
 */
public interface IRoleMenuDao extends IBaseCRUD<RoleMenu> {
	List<RoleMenu> findAll(Page page);
	List<RoleMenu> findByRoleId(int roleId);
	List<RoleMenu> findByMenuId(int menuId);
}
