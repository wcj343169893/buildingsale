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
	 * （重写方法）
	 * delete方法概述
	 * 
	 *
	 * @param obj
	 * @return
	 */
	@Override
	public int delete(EmpRole obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	/** 
	 * （重写方法）
	 * findByid方法概述
	 * 
	 *
	 * @param id
	 * @return
	 */
	@Override
	public EmpRole findByid(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	 * （重写方法）
	 * merge方法概述
	 * 
	 *
	 * @param obj
	 * @return
	 */
	@Override
	public int merge(EmpRole obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	/** 
	 * （重写方法）
	 * save方法概述
	 * 
	 *
	 * @param obj
	 * @return
	 */
	@Override
	public int save(EmpRole obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	/** 
	 * （重写方法）
	 * findAll方法概述
	 * 
	 *
	 * @param page
	 * @return
	 */
	@Override
	public List<EmpRole> findAll(Page page) {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	 * （重写方法）
	 * findByEmpId方法概述
	 * 
	 *
	 * @param id
	 * @return
	 */
	@Override
	public List<EmpRole> findByEmpId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	 * （重写方法）
	 * findByRoleId方法概述
	 * 
	 *
	 * @param id
	 * @return
	 */
	@Override
	public List<EmpRole> findByRoleId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	// property constants

	
}