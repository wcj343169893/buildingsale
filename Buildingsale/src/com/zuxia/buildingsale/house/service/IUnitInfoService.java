/**
 *******************************************************************************
 * IUnitInfoService.java
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
import com.zuxia.buildingsale.house.dto.LookUnitDTO;
import com.zuxia.buildingsale.house.entity.UnitInfo;
import com.zuxia.buildingsale.house.form.UnitInfoForm;
import com.zuxia.buildingsale.sys.entity.Employee;

/**
 * IUnitInfoService��Ҫ˵��
 * 
 * 
 * @author zcq100 chaojun
 */
public interface IUnitInfoService {
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

	public int addUnitInfo(UnitInfoForm unitInfoForm);

	public int editUnitInfo(UnitInfoForm unitInfoForm);

	public int deleteUnitInfo(int unitInfoId);

	public UnitInfo findById(int unitId);

	public LookUnitDTO findUnitDTO(int unitId);
}
