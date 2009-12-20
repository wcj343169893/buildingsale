/**
 *******************************************************************************
 * IHouseTypeService.java
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
import com.zuxia.buildingsale.house.entity.HouseType;
import com.zuxia.buildingsale.house.form.HouseTypeForm;
import com.zuxia.buildingsale.sys.entity.Employee;

/**
 * IHouseTypeService��Ҫ˵��
 * 
 * 
 * @author zcq100 chaojun
 */
public interface IHouseTypeService {
	/**
	 * findAll�������� ��ѯ���еķ�������
	 * 
	 *@param page
	 *            ��ҳ��Ϣ
	 * @return List
	 */
	public List<HouseType> findAll(Page page);

	public List<HouseType> findAll();

	public int addHouseType(HouseTypeForm houseTypeForm, Employee employee);

	public int deleteHouseType(int houseTypeId);

	public int editHouseType(HouseTypeForm houseTypeForm, Employee employee);
}
