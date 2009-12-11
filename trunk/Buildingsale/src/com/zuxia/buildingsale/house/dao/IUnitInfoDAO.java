/**
 *******************************************************************************
 * IHouseInfoDAO.java
 * com.zuxia.buildingsale.house.dao
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
package com.zuxia.buildingsale.house.dao;

import java.util.List;

import com.zuxia.buildingsale.common.IBaseCRUD;
import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.house.entity.UnitInfo;

public interface IUnitInfoDAO extends IBaseCRUD<UnitInfo> {
	/**
	 * findByLoft�������� ��ѯ��Ԫ��Ϣ
	 * 
	 * 
	 * @param page
	 *            ��ҳ��Ϣ
	 * @param loftId
	 *            ¥��id
	 * @return List
	 */
	public List<UnitInfo> findByLoft(Page page, int loftId);

	/**
	 * findAll�������� ��ѯȫ����Ԫ��Ϣ
	 * 
	 * 
	 * @param page
	 *            ��ҳ��Ϣ
	 * @return List
	 */
	public List<UnitInfo> findAll(Page page);
}
