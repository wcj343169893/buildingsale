package com.zuxia.buildingsale.dao.impl;

import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zuxia.buildingsale.entity.HouseInfo;

/**
 * A data access object (DAO) providing persistence and search support for
 * HouseInfo entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.zuxia.buildingsale.entity.HouseInfo
 * @author MyEclipse Persistence Tools
 */

public class HouseInfoDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(HouseInfoDAO.class);
	// property constants
	public static final String HOUSE_FLOORS = "houseFloors";
	public static final String HOUSE_NO = "houseNo";
	public static final String HOUSE_BUILD_AREA = "houseBuildArea";
	public static final String HOUSE_BUILD_PRICE = "houseBuildPrice";
	public static final String HOUSE_DEAL_BUILD_PRICE = "houseDealBuildPrice";
	public static final String HOUSE_USE_AREA = "houseUseArea";
	public static final String HOUSE_USE_PRICE = "houseUsePrice";
	public static final String HOUSE_DEAL_USE_PRICE = "houseDealUsePrice";
	public static final String HOUSE_DEAL_PRICE = "houseDealPrice";
	public static final String HOUSE_DECORATION = "houseDecoration";

	protected void initDao() {
		// do nothing
	}

	public void save(HouseInfo transientInstance) {
		log.debug("saving HouseInfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(HouseInfo persistentInstance) {
		log.debug("deleting HouseInfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public HouseInfo findById(java.lang.Integer id) {
		log.debug("getting HouseInfo instance with id: " + id);
		try {
			HouseInfo instance = (HouseInfo) getHibernateTemplate().get(
					"com.zuxia.buildingsale.entity.HouseInfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(HouseInfo instance) {
		log.debug("finding HouseInfo instance by example");
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
		log.debug("finding HouseInfo instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from HouseInfo as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByHouseFloors(Object houseFloors) {
		return findByProperty(HOUSE_FLOORS, houseFloors);
	}

	public List findByHouseNo(Object houseNo) {
		return findByProperty(HOUSE_NO, houseNo);
	}

	public List findByHouseBuildArea(Object houseBuildArea) {
		return findByProperty(HOUSE_BUILD_AREA, houseBuildArea);
	}

	public List findByHouseBuildPrice(Object houseBuildPrice) {
		return findByProperty(HOUSE_BUILD_PRICE, houseBuildPrice);
	}

	public List findByHouseDealBuildPrice(Object houseDealBuildPrice) {
		return findByProperty(HOUSE_DEAL_BUILD_PRICE, houseDealBuildPrice);
	}

	public List findByHouseUseArea(Object houseUseArea) {
		return findByProperty(HOUSE_USE_AREA, houseUseArea);
	}

	public List findByHouseUsePrice(Object houseUsePrice) {
		return findByProperty(HOUSE_USE_PRICE, houseUsePrice);
	}

	public List findByHouseDealUsePrice(Object houseDealUsePrice) {
		return findByProperty(HOUSE_DEAL_USE_PRICE, houseDealUsePrice);
	}

	public List findByHouseDealPrice(Object houseDealPrice) {
		return findByProperty(HOUSE_DEAL_PRICE, houseDealPrice);
	}

	public List findByHouseDecoration(Object houseDecoration) {
		return findByProperty(HOUSE_DECORATION, houseDecoration);
	}

	public List findAll() {
		log.debug("finding all HouseInfo instances");
		try {
			String queryString = "from HouseInfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public HouseInfo merge(HouseInfo detachedInstance) {
		log.debug("merging HouseInfo instance");
		try {
			HouseInfo result = (HouseInfo) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(HouseInfo instance) {
		log.debug("attaching dirty HouseInfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(HouseInfo instance) {
		log.debug("attaching clean HouseInfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static HouseInfoDAO getFromApplicationContext(ApplicationContext ctx) {
		return (HouseInfoDAO) ctx.getBean("HouseInfoDAO");
	}
}