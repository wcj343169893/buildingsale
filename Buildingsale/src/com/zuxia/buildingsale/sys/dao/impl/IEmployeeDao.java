package com.zuxia.buildingsale.sys.dao.impl;

import java.util.List;

import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.sys.entity.Employee;

public interface IEmployeeDao {

	/** 
	 * （重写方法）
	 * save方法概述
	 * 
	 *
	 * @param transientInstance
	 */
	public void save(Employee transientInstance);

	/** 
	 * （重写方法）
	 * delete方法概述
	 * 
	 *
	 * @param persistentInstance
	 */
	public void delete(Employee persistentInstance);

	/** 
	 * （重写方法）
	 * findById方法概述
	 * 
	 *
	 * @param id
	 * @return
	 */
	public Employee findById(java.lang.Integer id);

	/** 
	 * （重写方法）
	 * findByExample方法概述
	 * 
	 *
	 * @param instance
	 * @return
	 */
	public List findByExample(Employee instance);

	/** 
	 * （重写方法）
	 * findByProperty方法概述
	 * 
	 *
	 * @param propertyName
	 * @param value
	 * @return
	 */
	public List findByProperty(String propertyName, Object value);

	/** 
	 * （重写方法）
	 * findByEmpNo方法概述
	 * 
	 *
	 * @param empNo
	 * @return
	 */
	public List findByEmpNo(Object empNo);

	/** 
	 * （重写方法）
	 * findByEmpAccount方法概述
	 * 
	 *
	 * @param empAccount
	 * @return
	 */
	public List findByEmpAccount(Object empAccount);

	/** 
	 * （重写方法）
	 * findByEmpPass方法概述
	 * 
	 *
	 * @param empPass
	 * @return
	 */
	public List findByEmpPass(Object empPass);

	/** 
	 * （重写方法）
	 * findByEmpName方法概述
	 * 
	 *
	 * @param empName
	 * @return
	 */
	public List findByEmpName(Object empName);

	/** 
	 * （重写方法）
	 * findByEmpPid方法概述
	 * 
	 *
	 * @param empPid
	 * @return
	 */
	public List findByEmpPid(Object empPid);

	/** 
	 * （重写方法）
	 * findByEmpSex方法概述
	 * 
	 *
	 * @param empSex
	 * @return
	 */
	public List findByEmpSex(Object empSex);

	/** 
	 * （重写方法）
	 * findByEmpTell方法概述
	 * 
	 *
	 * @param empTell
	 * @return
	 */
	public List findByEmpTell(Object empTell);

	/** 
	 * （重写方法）
	 * findByEmpAddress方法概述
	 * 
	 *
	 * @param empAddress
	 * @return
	 */
	public List findByEmpAddress(Object empAddress);

	/** 
	 * （重写方法）
	 * findByEmpEmail方法概述
	 * 
	 *
	 * @param empEmail
	 * @return
	 */
	public List findByEmpEmail(Object empEmail);

	/** 
	 * （重写方法）
	 * findByEmpRemark方法概述
	 * 
	 *
	 * @param empRemark
	 * @return
	 */
	public List findByEmpRemark(Object empRemark);

	/** 
	 * （重写方法）
	 * findAll方法概述
	 * 
	 *
	 * @return
	 */
	public List findAll();

	/** 
	 * （重写方法）
	 * findAll方法概述
	 * 
	 *
	 * @param page
	 * @return
	 */
	public List findAll(Page page);

	/** 
	 * （重写方法）
	 * merge方法概述
	 * 
	 *
	 * @param detachedInstance
	 * @return
	 */
	public Employee merge(Employee detachedInstance);

	/** 
	 * （重写方法）
	 * attachDirty方法概述
	 * 
	 *
	 * @param instance
	 */
	public void attachDirty(Employee instance);

	/** 
	 * （重写方法）
	 * attachClean方法概述
	 * 
	 *
	 * @param instance
	 */
	public void attachClean(Employee instance);

}