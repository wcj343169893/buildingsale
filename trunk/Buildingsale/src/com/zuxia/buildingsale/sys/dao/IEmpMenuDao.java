/**
 *******************************************************************************
 * IEmpMenu.java
 * com.zuxia.buildingsale.sys.dao
 * (c) Copyright 2009 
 *	2009-12-11
 *��������������
 *  Buildingsale
 *�����ܸ�Ҫ��
 *  Ա���˵���Ϣ��صĽӿ�
 *�����ߣ�
 *  zcq100
 *******************************************************************************
 */
package com.zuxia.buildingsale.sys.dao;

import java.util.List;
import com.zuxia.buildingsale.common.IBaseCRUD;
import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.sys.entity.EmpMenu;

/**
 * IEmpMenu��Ҫ˵��
 * 
 *
 * @author zcq100
 */
public interface IEmpMenuDao extends IBaseCRUD<EmpMenu> {
	/**
	 * 
	 * findAll��������
	 * ��ҳ��ѯ���еĽ�ɫ�˵���Ϣ
	 * @param page	��ҳ����
	 * @return	�˵���ɫ��Ϣ����
	 */
	List<EmpMenu> findAll(Page page);
	/**
	 * 
	 * findByEmpId��������
	 * ����Ա����ŵõ����еĽ�ɫ�˵���Ϣ
	 * @param id	Ա�����
	 * @return	�˵���Ϣ����
	 */
	List<EmpMenu> findByEmpId(int id);
	/**
	 * 
	 * findByMenuId��������
	 * ���ݲ˵���ŵõ����е�Ա���˵���Ϣ
	 * @param id	�˵��ı��
	 * @return	�˵�Ա����Ϣ
	 */
	List<EmpMenu> findByMenuId(int id);
	
}
