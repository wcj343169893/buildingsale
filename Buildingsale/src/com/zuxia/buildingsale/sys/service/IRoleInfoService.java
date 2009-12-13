/**
 *******************************************************************************
 * filename    : IRoleInfoService.java
 * package     : com.zuxia.buildingsale.sys.service
 * createdate  : 2009-12-13 ����05:27:52
 * project     : Buildingsale
 * @version    : 1.0
 * @author     : zcq100
 * (c) Copyright 2009 
 *	�����ܸ�Ҫ��
 *  ��ɫ������ӿ�
 *******************************************************************************
 */
package com.zuxia.buildingsale.sys.service;

import java.util.List;

import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.sys.entity.RoleInfo;

/**
 * IRoleInfoService��Ҫ˵��
 * 
 *
 * @author zcq100
 */
public interface IRoleInfoService {
	
	/**
	 * 
	 * addRoleInfo��������
	 * ��ӽ�ɫ��Ϣ
	 *
	 * @param name ��ɫ����
	 * @param remark ��ע��Ϣ
	 * @return ״̬��Ϣ(1,�ɹ�,0,ʧ��)
	 */
	int addRoleInfo(String name,String remark);
	/**
	 * 
	 * deleteRoleInfo��������
	 * ɾ����ɫ��Ϣ
	 * @param id	��ɫ���
	 * @return ״̬��Ϣ(1,�ɹ�,0,ʧ��)	
	 */
	int deleteRoleInfo(int id);
	/**
	 * 
	 * upodateRoleInfo��������
	 * ���½�ɫ��Ϣ
	 * @param example	��ɫ��Ϣ
	 * @return  ״̬��Ϣ(1,�ɹ�,0,ʧ��)	
	 */
	int updateRoleInfo(RoleInfo example);
	/**
	 * 
	 * findById��������
	 * ���ݱ�Ż�ý�ɫ��Ϣ
	 * @param roleid ��ɫ��Ϣ���
	 * @return	��ɫ��Ϣ����
	 */
	RoleInfo findById(int roleid);
	/**
	 * 
	 * findAllRoleInfo��������
	 * ��ҳ�������еĽ�ɫ��Ϣ 
	 * @param page	��ҳ����
	 * @return	��ɫ��Ϣ�ļ���
	 */
	List<RoleInfo> findAllRoleInfo(Page page);
}
