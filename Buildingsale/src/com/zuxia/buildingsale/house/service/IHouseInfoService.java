/**
 *******************************************************************************
 * IHouseInfoService.java
 * com.zuxia.buildingsale.house.service
 * (c) Copyright 2009 
 *	2009-12-12
 *��������������
 *  Buildingsale
 *�����ܸ�Ҫ��
 *  XXX
 *�����ߣ�
 *  zcq100 chaojun
 *******************************************************************************
 */
package com.zuxia.buildingsale.house.service;

import java.util.List;

import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.house.entity.HouseInfo;
import com.zuxia.buildingsale.house.form.HouseInfoForm;
import com.zuxia.buildingsale.sys.entity.Employee;

/**
 * IHouseInfoService��Ҫ˵��
 * 
 * 
 * @author zcq100 chaojun
 */
public interface IHouseInfoService {
	/**
	 * findHouseInfoByUnitId�������� ���ݵ�Ԫ��ѯ����
	 * 
	 * 
	 * @param page
	 *            ��ҳ��Ϣ
	 * @param unitId
	 *            ��Ԫid
	 * @return List<HouseInfo>
	 */
	public List<HouseInfo> findByUnit(Page page, int unitId);

	/**
	 * findHouseInfoByHouseTypeCd�������� ���ݷ������Ͳ�ѯ����
	 * 
	 * 
	 * @param page
	 *            ��ҳ��Ϣ
	 * @param houseType
	 *            ��������
	 * @return List
	 */
	public List<HouseInfo> findByType(Page page, int houseType);

	/**
	 * findHouseInfoByDataDict�������� ���ݷ���״̬���Ͳ�ѯ
	 * 
	 * 
	 * @param page
	 *            ��ҳ��Ϣ
	 * @param houseState
	 *            ����״̬
	 * @return List
	 */
	public List<HouseInfo> findByState(Page page, int houseState);

	/**
	 * findAll�������� ��ѯ���з���
	 * 
	 * 
	 * @param page
	 *            page ��ҳ��Ϣ
	 * @return List
	 */
	public List<HouseInfo> findAll(Page page);

	public int addHouseInfo(HouseInfoForm houseInfoForm, Employee employee);

	public int deleteHouseInfo(int houseId);

	public int editHouseInfo(HouseInfoForm houseInfoForm, Employee employee);
}
