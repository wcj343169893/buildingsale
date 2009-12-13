package com.zuxia.buildingsale.sys.dao.impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.zuxia.buildingsale.common.BaseDao;
import com.zuxia.buildingsale.sys.dao.IMenuItemDao;
import com.zuxia.buildingsale.sys.entity.MenuItem;

public class MenuItemDAOImpl extends BaseDao implements IMenuItemDao {
	private static final Log log = LogFactory.getLog(MenuItemDAOImpl.class);
	public static final String MI_URL = "miUrl";
	public static final String MI_REMARK = "miRemark";
	/** 
	 * （重写方法）
	 * delete方法概述
	 * @param obj
	 * @return
	 */
	@Override
	public int delete(MenuItem obj) {
		try {
			super.delete(obj);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}
	/** 
	 * （重写方法）
	 * findByid方法概述
	 * @param id
	 * @return
	 */
	@Override
	public MenuItem findByid(Integer id) {
		return (MenuItem) getByPk(MenuItem.class, id);
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
	public int merge(MenuItem obj) {
		try {
			update(obj);
			return 1;
		} catch (Exception e) {
			return 0;
		}
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
	public int save(MenuItem obj) {
		try {
			insert(obj);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}
	/** 
	 * （重写方法）
	 * findByMenuId方法概述
	 * 
	 *
	 * @param id
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<MenuItem> findByMenuId(int id) {
		return find("from MenuItem where miId=?",id);
	}

	
}