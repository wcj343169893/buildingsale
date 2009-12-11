/**
 *******************************************************************************
 * IBaseCRUD.java
 * com.zuxia.buildingsale.dao
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
package com.zuxia.buildingsale.common;

/**
 * IBaseCRUD��Ҫ˵��
 * 
 * 
 * @author zcq100
 */
public interface IBaseCRUD<T> {
	/**
	 * 
	 * findByid�������� ����ID�����
	 * 
	 * @param id
	 * @return
	 */
	T findByid(Integer id);

	/**
	 * 
	 * merge�������� �����޸Ĺ��Ķ���
	 * 
	 * @param obj
	 *            Ҫ��ӵĶ���
	 * @return 1�ɹ�0ʧ��
	 */
	int merge(T obj);

	/**
	 * 
	 * save�������� ����µĶ������ݿ�
	 * 
	 * @param obj
	 *            Ҫ����Ķ���
	 * @return 1�ɹ�0ʧ��
	 */
	int save(T obj);

	/**
	 * 
	 * delete�������� ɾ������
	 * 
	 * @param obj
	 *            Ҫɾ���Ķ���
	 * @return 1�ɹ�0ʧ��
	 */
	int delete(T obj);
}
