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
	 * ����д������
	 * findRoleMenuByRoleId��������
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
	 * ����д������
	 * delete��������
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
	 * ����д������
	 * findByid��������
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
	 * ����д������
	 * merge��������
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
	 * ����д������
	 * save��������
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