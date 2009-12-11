package com.zuxia.buildingsale.dao;
/**
 * 
 * ICommCRUD概要说明
 * 
 *
 * @author Administrator
 * @param <T>
 */
public interface ICommCRUD<T> {
	/**
	 * 添加新的对象
	 * 
	 * @param obj
	 *            对象
	 */
	void save(T obj);

	/**
	 * 删除对象
	 * 
	 * @param obj
	 */
	void delete(T obj);

	/**
	 * 将游离状态的对象保存
	 * 
	 * @param obj
	 */
	void merge(T obj);

	/**
	 * 根据ID得到对象
	 * 
	 * @param id
	 *            对象的ID
	 * @return
	 */
	T findById(int id);
}
