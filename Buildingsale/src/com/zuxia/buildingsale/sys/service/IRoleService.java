/**
 *******************************************************************************
 * filename    : IRoleService.java
 * package     : com.zuxia.buildingsale.sys.service
 * createdate  : 2009-12-13 ����05:28:42
 * project     : Buildingsale
 * @version    : 1.0
 * @author     : Administrator
 * (c) Copyright 2009 
 *	�����ܸ�Ҫ��
 *  Ա����ɫ��ϵ����
 *******************************************************************************
 */
package com.zuxia.buildingsale.sys.service;

import java.util.List;

import com.zuxia.buildingsale.sys.entity.RoleInfo;

/**
 * IRoleService��Ҫ˵��
 * 
 *
 * @author Administrator
 */
public interface IRoleService {
	/**
	 * 
	 * addRole��������
	 * 
	 *
	 * @param role
	 * @return
	 */
	boolean addRole(RoleInfo role);
	
	/**
	 * 
	 * deleteRole��������
	 * 
	 *
	 * @param id
	 * @return
	 */
	boolean deleteRole(int id);
	
	/**
	 * 
	 * findAll��������
	 * 
	 *
	 * @return
	 */
	List<RoleInfo> findAll();
	
	
	boolean updateMenu(int roleid,int[] menuids);
	
	
}
