package com.zuxia.buildingsale.sys.dao.impl;

import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.zuxia.buildingsale.sys.entity.MenuInfo;


public class MenuInfoDAOImpl extends HibernateDaoSupport{
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

	
}