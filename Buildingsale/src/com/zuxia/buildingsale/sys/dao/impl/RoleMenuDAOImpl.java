package com.zuxia.buildingsale.sys.dao.impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.zuxia.buildingsale.common.BaseDao;
import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.sys.dao.IRoleMenuDao;
import com.zuxia.buildingsale.sys.entity.RoleMenu;



public class RoleMenuDAOImpl extends BaseDao implements IRoleMenuDao{
	@SuppressWarnings("unused")
	private static final Log log = LogFactory.getLog(RoleMenuDAOImpl.class);



	public int delete(RoleMenu obj) {
		try {
			delete(obj);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}


	public RoleMenu findByid(Integer id) {
		return (RoleMenu) getByPk(RoleMenu.class, id);
	}


	public int merge(RoleMenu obj) {
		try {
			update(obj);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}


	public int save(RoleMenu obj) {
		try {
			insert(obj);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}


	public List<RoleMenu> findAll(Page page) {
		return query(page,"from RoleMenu order by rmId asc");
	}


	public List<RoleMenu> findByMenuId(int menuId) {
		return find("from RoleMenu model where model.menuInfo.menuId=?", menuId);
	}


	public List<RoleMenu> findByRoleId(int roleId) {
		return find("from RoleMenu model where model.roleInfo.roleId=?", roleId);
	}

	
}