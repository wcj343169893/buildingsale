/**
 *******************************************************************************
 * IEmpRoleDao.java
 * com.zuxia.buildingsale.sys.dao
 * (c) Copyright 2009 
 *	2009-12-11
 *��������������
 *  Buildingsale
 *�����ܸ�Ҫ��
 *  Ա����ɫ��Ϣ����ز�����DAO�ӿ�
 *�����ߣ�
 *  zcq100
 *******************************************************************************
 */
package com.zuxia.buildingsale.sys.dao;

import java.util.List;
import com.zuxia.buildingsale.common.IBaseCRUD;
import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.sys.entity.EmpRole;

/**
 * IEmpRoleDao��Ҫ˵��
 * 
 *
 * @author zcq100
 */
public interface IEmpRoleDao extends IBaseCRUD<EmpRole> {
	/**
	 * 
	 * findAll��������
	 * ��ҳ�������е�Ա����ɫ��Ϣ
	 * @param page	��ҳ����
	 * @return	Ա����ɫ��Ϣ�ļ���
	 */
	List<EmpRole> findAll(Page page);
	/**
	 * 
	 * findByEmpId��������
	 *����Ա���ı�Ų���Ա����ɫ��Ϣ
	 * @param id	Ա���ı��
	 * @return	Ա����ɫ��Ϣ�ļ���
	 */
	List<EmpRole> findByEmpId(int id);
	/**
	 * 
	 * findByRoleId��������
	 * ���ݽ�ɫ��Ų���Ա����ɫ��Ϣ
	 * @param id ��ɫ���
	 * @return Ա����ɫ��Ϣ�ļ���
	 */
	List<EmpRole> findByRoleId(int id);
}
