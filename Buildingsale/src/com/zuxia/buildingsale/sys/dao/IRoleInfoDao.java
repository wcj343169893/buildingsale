/**
 *******************************************************************************
 * IRoleInfoDao.java
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
import com.zuxia.buildingsale.sys.entity.RoleInfo;

/**
 * IRoleInfoDao��Ҫ˵��
 * 
 *
 * @author zcq100
 */
public interface IRoleInfoDao extends IBaseCRUD<RoleInfo> {
	/**
	 * 
	 * findAll��������
	 * ��ҳ���ҽ�ɫ��Ϣ
	 *
	 * @param page	��ҳ����
	 * @return
	 */
	List<RoleInfo> findAll(Page page);
	
	/**
	 * 
	 * findAll��������
	 * �������еĽ�ɫ��Ϣ
	 *
	 * @return
	 */
	List<RoleInfo> findAll();
}
