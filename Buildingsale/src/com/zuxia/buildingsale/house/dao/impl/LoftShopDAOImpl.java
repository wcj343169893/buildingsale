package com.zuxia.buildingsale.house.dao.impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zuxia.buildingsale.common.BaseDao;
import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.house.dao.ILoftInfoDAO;
import com.zuxia.buildingsale.house.dao.ILoftShopDAO;
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

public class LoftShopDAOImpl extends BaseDao implements ILoftShopDAO {
	private static final Log log = LogFactory.getLog(LoftShopDAOImpl.class);

	/**
	 * （重写方法） delete方法概述 删除
	 * 
	 * 
	 * @param obj
	 * @return
	 */
	@Override
	public int delete(LoftShop obj) {
		try {
			super.delete(obj);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	/**
	 * （重写方法） findByid方法概述 根据id查询
	 * 
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public LoftShop findByid(Integer id) {
		return (LoftShop)getByPk(LoftShop.class,id);
	}

	/**
	 * （重写方法） merge方法概述 修改
	 * 
	 * 
	 * @param obj
	 * @return
	 */
	@Override
	public int merge(LoftShop obj) {
		try {
			super.update(obj);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	/**
	 * （重写方法） save方法概述 保存
	 * 
	 * 
	 * @param obj
	 * @return
	 */
	@Override
	public int save(LoftShop obj) {
		try {
			super.insert(obj);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

}