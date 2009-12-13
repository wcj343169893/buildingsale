/**
 *******************************************************************************
 * filename    : IMenuService.java
 * package     : com.zuxia.buildingsale.sys.service
 * createdate  : 2009-12-13 ����05:28:31
 * project     : Buildingsale
 * @version    : 1.0
 * @author     : Administrator
 * (c) Copyright 2009 
 *	�����ܸ�Ҫ��
 *  �˵�������ӿ�
 *******************************************************************************
 */
package com.zuxia.buildingsale.sys.service;

import java.util.List;

import com.zuxia.buildingsale.sys.entity.Employee;
import com.zuxia.buildingsale.sys.entity.MenuInfo;
import com.zuxia.buildingsale.sys.entity.RoleInfo;

/**
 * IMenuService��Ҫ˵��
 * @author Administrator
 */
public interface IMenuService {
	/**
	 * 
	 * addRoleMenu��������
	 * ����ɫ��Ӳ˵�
	 * @param roleid ��ɫid 
	 * @param menuid �˵���Ϣid
	 * @return ״̬��Ϣ(1,�ɹ�,0,ʧ��)	
	 */
	int addRoleMenu(int roleid,int[] menuid);
	/**
	 * 
	 * addEmployeeMenu��������
	 * ��Ա����Ӳ˵�
	 *
	 * @param empid
	 * @param menuid �˵���Ϣid
	 * @return ״̬��Ϣ(1,�ɹ�,0,ʧ��)	
	 */
	int addEmployeeMenu(int empid,int[] menuid);
	/**
	 * 
	 * deleteRoleMenu��������
	 * ɾ����ɫ�˵�
	 * @param roleMenuId ��ɫĿ¼id
	 * @return ״̬��Ϣ(1,�ɹ�,0,ʧ��)	
	 */
	int deleteRoleMenu(int roleMenuId[]);
	/**
	 * 
	 * deleteEmpMenu��������
	 * ɾ��Ա���˵�
	 * @param empmenuId Ա����ɫid
	 * @return ״̬��Ϣ(1,�ɹ�,0,ʧ��)	
	 */
	int deleteEmpMenu(int empmenuId[]);
	/**
	 * 
	 * findByEmpId��������
	 * ��ѯԱ���Ĳ˵�
	 * @param id	Ա����id
	 * @return	�˵���Ϣ�ļ���
	 */
	List<MenuInfo> findByEmpId(int id);
	/**
	 * 
	 * findByRoleId��������
	 * ��ѯ��ɫ�Ĳ˵�
	 * @param id ��ɫ��id
	 * @return �˵���Ϣ�ļ���
	 */
	List<MenuInfo> findByRoleId(int id);
	/**
	 * 
	 * findRoleByMenuId��������
	 * ���ݲ˵���ѯ��ɫ
	 * @param id �˵�id
	 * @return ��ɫ�ļ���
	 */
	List<RoleInfo> findRoleByMenuId(int id);
	/**
	 * 
	 * findEmployeeByMenuId��������
	 * ���ݲ˵���ѯԱ����Ϣ
	 * @param id �˵�id
	 * @return Ա���ļ���
	 */
	List<Employee> findEmployeeByMenuId(int id);
	/**
	 * 
	 * hasRoleMenu��������
	 * ��ɫ�Ƿ��в˵�Ȩ��
	 * @param roleid ��ɫid
	 * @param menuid �˵���Ϣid
	 * @return �Ƿ���ڲ˵�Ȩ��
	 */
	boolean hasRoleMenu(int roleid,int menuid);
	/**
	 * 
	 * hasEmpMenu��������
	 * Ա���Ƿ��в˵�Ȩ��
	 *
	 * @param empid Ա��id
	 * @param menuid �˵���Ϣid
	 * @return �Ƿ���ڲ˵�Ȩ��
	 */
	boolean hasEmpMenu(int empid,int menuid);
}
