package com.zuxia.buildingsale.sys.dao.impl;

import java.util.List;

import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.sys.entity.Employee;

public interface IEmployeeDao {

	/** 
	 * ����д������
	 * save��������
	 * 
	 *
	 * @param transientInstance
	 */
	public void save(Employee transientInstance);

	/** 
	 * ����д������
	 * delete��������
	 * 
	 *
	 * @param persistentInstance
	 */
	public void delete(Employee persistentInstance);

	/** 
	 * ����д������
	 * findById��������
	 * 
	 *
	 * @param id
	 * @return
	 */
	public Employee findById(java.lang.Integer id);

	/** 
	 * ����д������
	 * findByExample��������
	 * 
	 *
	 * @param instance
	 * @return
	 */
	public List findByExample(Employee instance);

	/** 
	 * ����д������
	 * findByProperty��������
	 * 
	 *
	 * @param propertyName
	 * @param value
	 * @return
	 */
	public List findByProperty(String propertyName, Object value);

	/** 
	 * ����д������
	 * findByEmpNo��������
	 * 
	 *
	 * @param empNo
	 * @return
	 */
	public List findByEmpNo(Object empNo);

	/** 
	 * ����д������
	 * findByEmpAccount��������
	 * 
	 *
	 * @param empAccount
	 * @return
	 */
	public List findByEmpAccount(Object empAccount);

	/** 
	 * ����д������
	 * findByEmpPass��������
	 * 
	 *
	 * @param empPass
	 * @return
	 */
	public List findByEmpPass(Object empPass);

	/** 
	 * ����д������
	 * findByEmpName��������
	 * 
	 *
	 * @param empName
	 * @return
	 */
	public List findByEmpName(Object empName);

	/** 
	 * ����д������
	 * findByEmpPid��������
	 * 
	 *
	 * @param empPid
	 * @return
	 */
	public List findByEmpPid(Object empPid);

	/** 
	 * ����д������
	 * findByEmpSex��������
	 * 
	 *
	 * @param empSex
	 * @return
	 */
	public List findByEmpSex(Object empSex);

	/** 
	 * ����д������
	 * findByEmpTell��������
	 * 
	 *
	 * @param empTell
	 * @return
	 */
	public List findByEmpTell(Object empTell);

	/** 
	 * ����д������
	 * findByEmpAddress��������
	 * 
	 *
	 * @param empAddress
	 * @return
	 */
	public List findByEmpAddress(Object empAddress);

	/** 
	 * ����д������
	 * findByEmpEmail��������
	 * 
	 *
	 * @param empEmail
	 * @return
	 */
	public List findByEmpEmail(Object empEmail);

	/** 
	 * ����д������
	 * findByEmpRemark��������
	 * 
	 *
	 * @param empRemark
	 * @return
	 */
	public List findByEmpRemark(Object empRemark);

	/** 
	 * ����д������
	 * findAll��������
	 * 
	 *
	 * @return
	 */
	public List findAll();

	/** 
	 * ����д������
	 * findAll��������
	 * 
	 *
	 * @param page
	 * @return
	 */
	public List findAll(Page page);

	/** 
	 * ����д������
	 * merge��������
	 * 
	 *
	 * @param detachedInstance
	 * @return
	 */
	public Employee merge(Employee detachedInstance);

	/** 
	 * ����д������
	 * attachDirty��������
	 * 
	 *
	 * @param instance
	 */
	public void attachDirty(Employee instance);

	/** 
	 * ����д������
	 * attachClean��������
	 * 
	 *
	 * @param instance
	 */
	public void attachClean(Employee instance);

}