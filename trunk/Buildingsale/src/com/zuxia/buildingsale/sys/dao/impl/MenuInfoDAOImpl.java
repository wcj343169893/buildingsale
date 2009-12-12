package com.zuxia.buildingsale.sys.dao.impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.zuxia.buildingsale.common.BaseDao;
import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.sys.dao.IMenuInfoDao;
import com.zuxia.buildingsale.sys.entity.MenuInfo;


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
	 * ����д������
	 * findAll��������
	 * 
	 *
	 * @return
	 */
	@Override
	public List<MenuInfo> findAll() {
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
	public int delete(MenuInfo obj) {
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
	public MenuInfo findByid(Integer id) {
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
	public int merge(MenuInfo obj) {
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
	public int save(MenuInfo obj) {
		// TODO Auto-generated method stub
		return 0;
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
	public List<MenuInfo> findAll(Page page) {
		// TODO Auto-generated method stub
		return null;
	}

	
}