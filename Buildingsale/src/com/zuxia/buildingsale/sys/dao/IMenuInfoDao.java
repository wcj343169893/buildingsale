/**
 *******************************************************************************
 * IMenuInfoDao.java
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
import com.zuxia.buildingsale.sys.entity.MenuInfo;

/**
 * IMenuInfoDao��Ҫ˵��
 * 
 *
 * @author zcq100
 */
public interface IMenuInfoDao extends IBaseCRUD<MenuInfo> {
	/**
	 * 
	 * findAll��������
	 * ��ѯ���еĲ˵���Ϣ
	 * @return
	 */
	List<MenuInfo> findAll();
}
