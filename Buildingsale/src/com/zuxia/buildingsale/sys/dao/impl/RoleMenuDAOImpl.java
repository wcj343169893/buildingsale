package com.zuxia.buildingsale.sys.dao.impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.zuxia.buildingsale.common.BaseDao;
import com.zuxia.buildingsale.sys.dao.IRoleMenuDao;
import com.zuxia.buildingsale.sys.entity.RoleMenu;



public class RoleMenuDAOImpl extends BaseDao implements IRoleMenuDao{
	@SuppressWarnings("unused")
	private static final Log log = LogFactory.getLog(RoleMenuDAOImpl.class);

	/** 
	 * （重写方法）
	 * findRoleMenuByRoleId方法概述
	 * 
	 *
	 * @param id
	 * @return
	 */
	@Override
	public List<RoleMenu> findRoleMenuByRoleId(int id) {
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
	public int delete(RoleMenu obj) {
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
	public RoleMenu findByid(Integer id) {
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
	public int merge(RoleMenu obj) {
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
	public int save(RoleMenu obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}