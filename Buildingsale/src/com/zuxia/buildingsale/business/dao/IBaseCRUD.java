/**
 *******************************************************************************
 * IBaseCRUD.java
 * com.zuxia.buildingsale.dao
 * (c) Copyright 2009 
 *	2009-12-11
 *��������������
 *  Buildingsale
 *�����ܸ�Ҫ��
 *  ������CRUD��
 *�����ߣ�
 *  zcq100
 *******************************************************************************
 */
package com.zuxia.buildingsale.business.dao;

/**
 * IBaseCRUD��Ҫ˵��
 * 
 *
 * @author zcq100
 */
public interface IBaseCRUD<T> {

	/**
	 * 
	 * findById��������
	 * ����Id��ѯ������
	 *
	 * @param id
	 * @return
	 */
	T findById(Integer id);

	/**
	 * 
	 * merge��������
	 * ����һ���޸Ĺ��Ķ���
	 *
	 * @param obj
	 * @return
	 */
	T merge(T obj);

	/**
	 * ɾ��һ������
	 * del��������
	 * 
	 *
	 * @param obj
	 */
	void del(T obj);

	/**
	 * 
	 * save��������
	 * ���һ������
	 *
	 * @param obj
	 */
	void save(T obj);
}
