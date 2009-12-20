/**
 *******************************************************************************
 * IHouseTypeDAO.java
 * com.zuxia.buildingsale.house.dao
 * (c) Copyright 2009 
 *	2009-12-11
 *��������������
 *  Buildingsale
 *�����ܸ�Ҫ��
 *  XXX
 *�����ߣ�
 *  zcq100 chaojun
 *******************************************************************************
 */
package com.zuxia.buildingsale.house.dao;

import java.util.List;

import com.zuxia.buildingsale.common.IBaseCRUD;
import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.house.entity.HouseType;

/**
 * IHouseTypeDAO��Ҫ˵��
 * 
 * 
 * @author zcq100 chaojun
 */
public interface IHouseTypeDAO extends IBaseCRUD<HouseType> {
	/**
	 * findAll�������� ��ѯ���еķ�������
	 * 
	 *@param page ��ҳ��Ϣ
	 * @return List
	 */
	public List<HouseType> findAll(Page page);
	public List<HouseType> findAll();
}
