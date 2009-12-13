/**
 *******************************************************************************
 * IMenuItemDao.java
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
import com.zuxia.buildingsale.sys.entity.MenuItem;

/**
 * IMenuItemDao��Ҫ˵��
 * 
 *
 * @author zcq100
 */
public interface IMenuItemDao extends IBaseCRUD<MenuItem> {
	/**
	 * 
	 * findByMenuId��������
	 * ���ݲ˵���Ż��ҳ���е�����
	 * @param id	�˵����
	 * @return	ҳ���е����Ӽ���
	 */
	public List<MenuItem> findByMenuId(int id);
}
