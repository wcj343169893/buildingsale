package com.zuxia.buildingsale.house.entity;

import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


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

public class ShopInfoDAO extends HibernateDaoSupport {
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

	protected void initDao() {
		// do nothing
	}

	public void save(ShopInfo transientInstance) {
		log.debug("saving ShopInfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ShopInfo persistentInstance) {
		log.debug("deleting ShopInfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ShopInfo findById(java.lang.Integer id) {
		log.debug("getting ShopInfo instance with id: " + id);
		try {
			ShopInfo instance = (ShopInfo) getHibernateTemplate().get(
					"com.zuxia.buildingsale.entity.ShopInfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ShopInfo instance) {
		log.debug("finding ShopInfo instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding ShopInfo instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from ShopInfo as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByShopNo(Object shopNo) {
		return findByProperty(SHOP_NO, shopNo);
	}

	public List findByShopName(Object shopName) {
		return findByProperty(SHOP_NAME, shopName);
	}

	public List findByShopAddress(Object shopAddress) {
		return findByProperty(SHOP_ADDRESS, shopAddress);
	}

	public List findByShopTellOne(Object shopTellOne) {
		return findByProperty(SHOP_TELL_ONE, shopTellOne);
	}

	public List findByShopTellTwo(Object shopTellTwo) {
		return findByProperty(SHOP_TELL_TWO, shopTellTwo);
	}

	public List findByShopTellThree(Object shopTellThree) {
		return findByProperty(SHOP_TELL_THREE, shopTellThree);
	}

	public List findByShopTellFour(Object shopTellFour) {
		return findByProperty(SHOP_TELL_FOUR, shopTellFour);
	}

	public List findByShopRemark(Object shopRemark) {
		return findByProperty(SHOP_REMARK, shopRemark);
	}

	public List findAll() {
		log.debug("finding all ShopInfo instances");
		try {
			String queryString = "from ShopInfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ShopInfo merge(ShopInfo detachedInstance) {
		log.debug("merging ShopInfo instance");
		try {
			ShopInfo result = (ShopInfo) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ShopInfo instance) {
		log.debug("attaching dirty ShopInfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ShopInfo instance) {
		log.debug("attaching clean ShopInfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ShopInfoDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ShopInfoDAO) ctx.getBean("ShopInfoDAO");
	}
}