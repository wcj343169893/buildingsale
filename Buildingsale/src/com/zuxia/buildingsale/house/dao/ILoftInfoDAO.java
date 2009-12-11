/**
 *******************************************************************************
 * ILoftInfoDAO.java
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
import com.zuxia.buildingsale.house.entity.LoftInfo;

/**
 * ILoftInfoDAO��Ҫ˵��
 * 
 * 
 * @author zcq100 chaojun
 */
public interface ILoftInfoDAO extends IBaseCRUD<LoftInfo> {

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
	 * @param page  ��ҳ��Ϣ
	 * @return List
	 */
	public List<LoftInfo> findAll(Page page);
}
