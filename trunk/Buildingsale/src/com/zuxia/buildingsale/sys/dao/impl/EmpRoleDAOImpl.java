package com.zuxia.buildingsale.sys.dao.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.zuxia.buildingsale.common.BaseDao;
import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.sys.dao.IEmpRoleDao;
import com.zuxia.buildingsale.sys.entity.EmpRole;

public class EmpRoleDAOImpl extends BaseDao implements IEmpRoleDao{
	@SuppressWarnings("unused")
	private static final Log log = LogFactory.getLog(EmpRoleDAOImpl.class);

	/** 
	 * ����д������
	 * delete��������
	 * 
	 *
	 * @param obj
	 * @return
	 */
	@Override
	public int delete(EmpRole obj) {
		try {
			delete(obj);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	/** 
	 * ����д������
	 * findByid��������
	 * 
	 *
	 * @param id
	 * @return
	 */
	@Override
	public EmpRole findByid(Integer id) {
		return (EmpRole) getByPk(EmpRole.class, id);
	}

	/** 
	 * ����д������
	 * merge��������
	 * 
	 *
	 * @param obj
	 * @return
	 */
	@Override
	public int merge(EmpRole obj) {
		try {
			update(obj);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	/** 
	 * ����д������
	 * save��������
	 * 
	 *
	 * @param obj
	 * @return
	 */
	@Override
	public int save(EmpRole obj) {
		try {
			insert(obj);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	/** 
	 * ����д������
	 * findAll��������
	 * 
	 *
	 * @param page
	 * @return
	 */
	@Override
	public List<EmpRole> findAll(Page page) {
		List<EmpRole> list=query(page,"from EmpRole");
		return list;
	}

	/** 
	 * ����д������
	 * findByEmpId��������
	 * 
	 *
	 * @param id
	 * @return
	 */
	@Override
	public List<EmpRole> findByEmpId(int id) {
		List<EmpRole> list=find("from EmpRole model where model.employee.empId=?", id);
		return list;
	}

	/** 
	 * ����д������
	 * findByRoleId��������
	 * 
	 *
	 * @param id
	 * @return
	 */
	@Override
	public List<EmpRole> findByRoleId(int id) {
		List<EmpRole> list=find("from EmpRole model where model.roleInfo.roleId=?", id);
		return list;
	}
}