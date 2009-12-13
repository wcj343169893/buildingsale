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
	/**
	 * 
	 * findAll��������
	 * ��ҳ��ѯ���еĽ�ɫ�˵���Ϣ
	 * @param page ��ҳ����
	 * @return	��ɫ�˵���Ϣ����ļ���
	 */
	List<RoleMenu> findAll(Page page);
	/**
	 * 
	 * findByRoleId��������
	 * ���ݽ�ɫID��ѯ���еĽ�ɫ�˵���Ϣ
	 * @param roleId	��ɫ���
	 * @return	��ɫ�˵���Ϣ�ļ���
	 */
	List<RoleMenu> findByRoleId(int roleId);
	
	/**
	 * 
	 * findByMenuId��������
	 * ���ݲ˵��ı�Ų�ѯ���еĽ�ɫ�˵���Ϣ
	 * @param menuId	�˵��ı��
	 * @return	��ɫ�˵���Ϣ�ļ���
	 */
	List<RoleMenu> findByMenuId(int menuId);
}
