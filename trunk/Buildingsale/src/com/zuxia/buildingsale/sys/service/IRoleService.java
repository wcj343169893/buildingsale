/**
 *******************************************************************************
 * filename    : IRoleService.java
 * package     : com.zuxia.buildingsale.sys.service
 * createdate  : 2009-12-13 ����05:28:42
 * project     : Buildingsale
 * @version    : 1.0
 * @author     : Administrator
 * (c) Copyright 2009 
 *	�����ܸ�Ҫ��
 *  Ա����ɫ��ϵ����
 *******************************************************************************
 */
package com.zuxia.buildingsale.sys.service;

/**
 * IRoleService��Ҫ˵��
 * 
 *
 * @author Administrator
 */
public interface IRoleService {
	/**
	 * 
	 * addEmployeeRole��������
	 * ��Ա����ӽ�ɫ
	 * @param empid Ա�����
	 * @param roleid ��ɫ���
	 * @return ״̬��Ϣ(1,�ɹ�,0,ʧ��)	
	 */
	int addEmployeeRole(int empid,int roleid);
	/**
	 * 
	 * deleleEmployeeRole��������
	 * ɾ����ɫ���е�Ա��
	 * @param empid Ա�����
	 * @param roleid ��ɫ���	
	 * @return ״̬��Ϣ(1,�ɹ�,0,ʧ��)	
	 */
	int deleleEmployeeRole(int empid,int roleid);
	/**
	 * 
	 * isRole��������
	 * �ж�Ա���Ƿ�����ĳ��ɫ
	 * @param empid	Ա�����
	 * @param roleid	��ɫ���
	 * @return	(��/��)
	 */
	boolean isRole(int empid,int roleid);
}
