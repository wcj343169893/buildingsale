package com.zuxia.buildingsale.sys.dao.impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.zuxia.buildingsale.common.BaseDao;
import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.sys.dao.IMenuInfoDao;
import com.zuxia.buildingsale.sys.entity.MenuInfo;

@SuppressWarnings("unchecked")
public class MenuInfoDAOImpl extends BaseDao implements IMenuInfoDao{
	private static final Log log = LogFactory.getLog(MenuInfoDAOImpl.class);
	// property constants
	public static final String MENU_NO = "menuNo";
	public static final String MENU_NAME = "menuName";
	public static final String MENU_PARENT = "menuParent";
	public static final String MENU_URL = "menuUrl";
	public static final String MENU_TARGET = "menuTarget";
	public static final String MENU_IMG = "menuImg";
	public static final String MENU_DESC = "menuDesc";
	public static final String MENU_REMARK = "menuRemark";
	/** 
	 * （重写方法）
	 * findAll方法概述
	 * 
	 *
	 * @return
	 */
	@Override
	public List<MenuInfo> findAll() {
		return find("from MenuInfo order by menuNo asc");
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
	public int delete(MenuInfo obj) {
		try {
			delete(obj);
			return 1;
		} catch (Exception e) {
			log.info("删除角色信息失败");
			return 0;
		}
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
	public MenuInfo findByid(Integer id) {
		return (MenuInfo) getByPk(MenuInfo.class, id);
	}
	/** 
	 * （重写方法）
	 * merge方法概述
	 * @param obj
	 * @return
	 */
	@Override
	public int merge(MenuInfo obj) {
		try {
			update(obj);
			log.info("修改角色信息");
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}
	/** 
	 * （重写方法）
	 * save方法概述
	 * @param obj
	 * @return
	 */
	@Override
	public int save(MenuInfo obj) {
		try {
			insert(obj);
			log.info("添加新的角色信息");
			return 1;
		} catch (Exception e) {
			return 0;
		}
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
	public List<MenuInfo> findAll(Page page) {
		List<MenuInfo> list=query(page,"from MenuInfo order by menuNo asc");
		return list;
	}
	/** 
	 * （重写方法）
	 * findByMenuInfoName方法概述
	 * 
	 *
	 * @param name
	 * @return
	 */
	@Override
	public MenuInfo findByMenuInfoName(String name) {
		List<MenuInfo> list=find("from MenuInfo where menuName=?", name);
		if(list.size()>0){
			return list.get(0);
		}
		return null;
	}
	/** 
	 * （重写方法）
	 * findByMenuInfoNo方法概述
	 * 
	 *
	 * @param no
	 * @return
	 */
	@Override
	public MenuInfo findByMenuInfoNo(String no) {
		List<MenuInfo> list=find("from MenuInfo where menuNo=?", no);
		if(list.size()>0){
			return list.get(0);
		}
		return null;
	}
	/** 
	 * （重写方法）
	 * findByMenuInfoParent方法概述
	 * 
	 *
	 * @param no
	 * @return
	 */
	@Override
	public List<MenuInfo> findByMenuInfoParent(String no) {
		List<MenuInfo> list=find("from MenuInfo where menuParent=?", no);
		return list;
	}

	
}