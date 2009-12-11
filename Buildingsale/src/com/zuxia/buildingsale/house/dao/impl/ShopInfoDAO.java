package com.zuxia.buildingsale.house.dao.impl;

import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zuxia.buildingsale.common.BaseDao;
import com.zuxia.buildingsale.house.dao.IShopInfoDAO;
import com.zuxia.buildingsale.house.entity.ShopInfo;


/**
 * A data access object (DAO) providing persistence and search support for
 * ShopInfo entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.zuxia.buildingsale.house.entity.ShopInfo
 * @author MyEclipse Persistence Tools
 */

public class ShopInfoDAO extends BaseDao implements IShopInfoDAO{
	private static final Log log = LogFactory.getLog(ShopInfoDAO.class);
	// property constants
	public static final String SHOP_NO = "shopNo";
	public static final String SHOP_NAME = "shopName";
	public static final String SHOP_ADDRESS = "shopAddress";
	public static final String SHOP_TELL_ONE = "shopTellOne";
	public static final String SHOP_TELL_TWO = "shopTellTwo";
	public static final String SHOP_TELL_THREE = "shopTellThree";
	public static final String SHOP_TELL_FOUR = "shopTellFour";
	public static final String SHOP_REMARK = "shopRemark";
	/** 
	 * （重写方法）
	 * delete方法概述
	 * 
	 *
	 * @param obj
	 * @return
	 */
	@Override
	public int delete(ShopInfo obj) {
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
	public ShopInfo findByid(Integer id) {
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
	public int merge(ShopInfo obj) {
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
	public int save(ShopInfo obj) {
		// TODO Auto-generated method stub
		return 0;
	}
}