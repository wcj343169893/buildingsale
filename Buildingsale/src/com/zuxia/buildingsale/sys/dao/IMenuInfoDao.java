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
import com.zuxia.buildingsale.common.Page;
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
	 * @return �˵���Ϣ�ļ���
	 */
	List<MenuInfo> findAll();
	
	/**
	 * 
	 * findAll��������<br/>
	 * ��ҳ����ҳ���е����в˵���Ϣ
	 * @param page	��ҳ����
	 * @return	�˵���Ϣ�ļ���
	 */
	List<MenuInfo> findAll(Page page);
	
	/**
	 * 
	 * findByMenuInfoNo��������
	 * ���ݲ˵���Ų��Ҳ˵���Ϣ
	 * @param no �˵����
	 * @return	�˵���Ϣ�ļ���
	 */
	MenuInfo findByMenuInfoNo(String no);
	
	/**
	 * 
	 * findByMenuInfoName��������
	 * �����˵����Ʋ�ѯ�˵���Ϣ
	 * @param name �˵�����
	 * @return	�˵���Ϣ
	 */
	MenuInfo findByMenuInfoName(String name);
	
	/**
	 * 
	 * findByMenuInfoParent��������
	 * ���ݸ����˵���Ų�ѯ���еĲ˵���Ϣ
	 * @param no	�����˵��ı��
	 * @return	�˵���Ϣ�ļ���
	 */
	List<MenuInfo> findByMenuInfoParent(String no);
	
}
