package com.zuxia.buildingsale.dao;
/**
 * 
 * ICommCRUD��Ҫ˵��
 * 
 *
 * @author Administrator
 * @param <T>
 */
public interface ICommCRUD<T> {
	/**
	 * ����µĶ���
	 * 
	 * @param obj
	 *            ����
	 */
	void save(T obj);

	/**
	 * ɾ������
	 * 
	 * @param obj
	 */
	void delete(T obj);

	/**
	 * ������״̬�Ķ��󱣴�
	 * 
	 * @param obj
	 */
	void merge(T obj);

	/**
	 * ����ID�õ�����
	 * 
	 * @param id
	 *            �����ID
	 * @return
	 */
	T findById(int id);
}
