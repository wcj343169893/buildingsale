/**
 *******************************************************************************
 * ILoftInfoService.java
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

import com.zuxia.buildingsale.business.entity.DataDict;
import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.house.entity.LoftInfo;
import com.zuxia.buildingsale.house.form.LoftInfoForm;
import com.zuxia.buildingsale.sys.entity.Employee;

/**
 * ILoftInfoService��Ҫ˵��
 * 
 * 
 * @author zcq100 chaojun
 */
public interface ILoftInfoService {
	/**
	 * findByComtyType�������� ������ҵ���Ͳ�ѯ
	 * 
	 * 
	 * @param page
	 *            ��ҳ��Ϣ
	 * @param loftComtyType
	 *            ��ҵ����
	 * @return List
	 */
	public List<LoftInfo> findByComtyType(Page page, int loftComtyType);

	/**
	 * findByBuildType�������� ���ݽ������Ͳ�ѯ¥��
	 * 
	 * 
	 * @param page
	 *            ��ҳ��Ϣ
	 * @param loftBuildType
	 *            ¥������
	 * @return List
	 */
	public List<LoftInfo> findByBuildType(Page page, int loftBuildType);

	/**
	 * findAll�������� ��ѯ����¥����Ϣ
	 * 
	 * 
	 * @param page
	 *            ��ҳ��Ϣ
	 * @return List
	 */
	public List<LoftInfo> findAll(Page page);

	public int addLoftInfo(LoftInfoForm loftInfoForm, Employee employee);

	public int deleteLoftInfo(int loftInfoId);

	public int editLoftInfo(LoftInfoForm loftInfoForm, Employee employee);

	/**
	 * findById�������� ����¥��id��ѯ
	 * 
	 * 
	 * @return
	 */
	public LoftInfo findById(int loftId);

	/**
	 * getComtyType�������� ��ȡ��ҵ����
	 * 
	 * 
	 * @return
	 */
	public List<DataDict> getComtyType();

	/**
	 * getComtyBuildType�������� ��ȡ��������
	 * 
	 * 
	 * @return
	 */
	public List<DataDict> getComtyBuildType();
}
