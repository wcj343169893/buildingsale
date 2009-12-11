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
import com.zuxia.buildingsale.house.entity.HouseInfo;

/**
 * IHouseInfoDAO��Ҫ˵��
 * 
 *
 * @author zcq100 chaojun
 */
public interface IHouseInfoDAO extends IBaseCRUD<HouseInfo> {
	
	/**
	 * findHouseInfoByUnitId�������� ���ݵ�Ԫ��ѯ����
	 * 
	 *
	 * @param page ��ҳ��Ϣ
	 * @param unitId ��Ԫid
	 * @return List<HouseInfo> 
	 */
	public List<HouseInfo> findHouseInfoByUnit(Page page,int unitId);
	/**
	 * findHouseInfoByHouseTypeCd�������� ���ݷ������Ͳ�ѯ����
	 * 
	 *
	 * @param page ��ҳ��Ϣ
	 * @param houseType ��������
	 * @return List
	 */
	public List<HouseInfo> findHouseInfoByType(Page page,int houseType);
	/**
	 * findHouseInfoByDataDict�������� ���ݷ���״̬���Ͳ�ѯ
	 * 
	 *
	 * @param page ��ҳ��Ϣ
	 * @param houseType ����״̬
	 * @return List
	 */
	public List<HouseInfo> findHouseInfoByState(Page page ,int houseType);
}
