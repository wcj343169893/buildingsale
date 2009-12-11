package com.zuxia.buildingsale.sys.dao.impl;

import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zuxia.buildingsale.common.BaseDao;
import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.sys.dao.IRoleInfoDao;
import com.zuxia.buildingsale.sys.entity.RoleInfo;

/**
 * A data access object (DAO) providing persistence and search support for
 * RoleInfo entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.zuxia.buildingsale.sys.entity.RoleInfo
 * @author MyEclipse Persistence Tools
 */

public class RoleInfoDAOImpl extends BaseDao implements IRoleInfoDao {
	private static final Log log = LogFactory.getLog(RoleInfoDAOImpl.class);
	// property constants
	public static final String ROLE_NAME = "roleName";
	public static final String ROLE_REMARK = "roleRemark";
	/** 
	 * （重写方法）
	 * findAll方法概述
	 * 
	 *
	 * @param page
	 * @return
	 */
	@Override
	public List<RoleInfo> findAll(Page page) {
		// TODO Auto-generated method stub
		return null;
	}
	/** 
	 * （重写方法）
	 * findAll方法概述
	 * 
	 *
	 * @return
	 */
	@Override
	public List<RoleInfo> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	/** 
	 * （重写方法）
	 * delete方法概述
	 * 
	 *
	 * @param obj
	 * @return
	 */
	@Override
	public int delete(RoleInfo obj) {
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
	public RoleInfo findByid(Integer id) {
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
	public int merge(RoleInfo obj) {
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
	public int save(RoleInfo obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}