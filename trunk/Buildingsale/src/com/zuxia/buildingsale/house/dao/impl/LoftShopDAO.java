package com.zuxia.buildingsale.house.dao.impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zuxia.buildingsale.common.BaseDao;
import com.zuxia.buildingsale.house.dao.ILoftInfoDAO;
import com.zuxia.buildingsale.house.entity.LoftInfo;
import com.zuxia.buildingsale.house.entity.LoftShop;


/**
 * A data access object (DAO) providing persistence and search support for
 * LoftShop entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.zuxia.buildingsale.house.entity.LoftShop
 * @author MyEclipse Persistence Tools
 */

public class LoftShopDAO extends BaseDao implements ILoftInfoDAO {
	private static final Log log = LogFactory.getLog(LoftShopDAO.class);

	/** 
	 * （重写方法）
	 * delete方法概述
	 * 
	 *
	 * @param obj
	 * @return
	 */
	@Override
	public int delete(LoftInfo obj) {
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
	public LoftInfo findByid(Integer id) {
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
	public int merge(LoftInfo obj) {
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
	public int save(LoftInfo obj) {
		// TODO Auto-generated method stub
		return 0;
	}

}