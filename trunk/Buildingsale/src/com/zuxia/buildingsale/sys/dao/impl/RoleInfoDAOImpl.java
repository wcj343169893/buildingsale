package com.zuxia.buildingsale.sys.dao.impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.zuxia.buildingsale.common.BaseDao;
import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.sys.dao.IRoleInfoDao;
import com.zuxia.buildingsale.sys.entity.RoleInfo;


public class RoleInfoDAOImpl extends BaseDao implements IRoleInfoDao {
	private static final Log log = LogFactory.getLog(RoleInfoDAOImpl.class);
	public static final String ROLE_NAME = "roleName";
	public static final String ROLE_REMARK = "roleRemark";
	/** 
	 * ����д������
	 * findAll��������
	 * 
	 *
	 * @param page
	 * @return
	 */
	@Override
	public List<RoleInfo> findAll(Page page) {
		return query(page,"from RoleInfo order by roleId asc");
	}
	/** 
	 * ����д������
	 * findAll��������
	 * 
	 *
	 * @return
	 */
	@Override
	public List<RoleInfo> findAll() {
		return find("from RoleInfo order by roleId asc");
	}
	
	/** 
	 * ����д������
	 * delete��������
	 * @param obj
	 * @return
	 */
	@Override
	public int delete(RoleInfo obj) {
		try {
			super.delete(obj);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}
	/** 
	 * ����д������
	 * findByid��������
	 * @param id
	 * @return
	 */
	@Override
	public RoleInfo findByid(Integer id) {
		return (RoleInfo) getByPk(RoleInfo.class, id);
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
	public int merge(RoleInfo obj) {
		try {
			update(obj);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	public int save(RoleInfo obj) {
		try {
			insert(obj);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	
}