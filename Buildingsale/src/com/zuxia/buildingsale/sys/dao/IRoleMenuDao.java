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
import com.zuxia.buildingsale.sys.entity.RoleMenu;

/**
 * IRoleMenuDao��Ҫ˵��
 * @author zcq100
 */
public interface IRoleMenuDao extends IBaseCRUD<RoleMenu> {
	/**
	 * 
	 * findRoleMenuByRoleId��������
	 * ���ݽ�ɫ��Ż�ý�ɫ�˵�
	 * @param id ��ɫ���
	 * @return ��ɫ�˵��ļ���
	 */
	List<RoleMenu> findRoleMenuByRoleId(int id);
	
}
