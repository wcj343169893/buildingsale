package com.zuxia.buildingsale.dao.impl;

import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zuxia.buildingsale.entity.HouseType;

/**
 * A data access object (DAO) providing persistence and search support for
 * HouseType entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.zuxia.buildingsale.entity.HouseType
 * @author MyEclipse Persistence Tools
 */

public class HouseTypeDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(HouseTypeDAO.class);
	// property constants
	public static final String HT_NAME = "htName";
	public static final String HT_ROOM = "htRoom";
	public static final String HT_HALLL = "htHalll";
	public static final String HT_WC = "htWc";
	public static final String HT_COOK_ROOM = "htCookRoom";
	public static final String HT_TERRACE = "htTerrace";
	public static final String HT_GARDEN_AREA = "htGardenArea";
	public static final String HT_IMG = "htImg";

	protected void initDao() {
		// do nothing
	}

	public void save(HouseType transientInstance) {
		log.debug("saving HouseType instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(HouseType persistentInstance) {
		log.debug("deleting HouseType instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public HouseType findById(java.lang.Integer id) {
		log.debug("getting HouseType instance with id: " + id);
		try {
			HouseType instance = (HouseType) getHibernateTemplate().get(
					"com.zuxia.buildingsale.entity.HouseType", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(HouseType instance) {
		log.debug("finding HouseType instance by example");
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
		log.debug("finding HouseType instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from HouseType as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByHtName(Object htName) {
		return findByProperty(HT_NAME, htName);
	}

	public List findByHtRoom(Object htRoom) {
		return findByProperty(HT_ROOM, htRoom);
	}

	public List findByHtHalll(Object htHalll) {
		return findByProperty(HT_HALLL, htHalll);
	}

	public List findByHtWc(Object htWc) {
		return findByProperty(HT_WC, htWc);
	}

	public List findByHtCookRoom(Object htCookRoom) {
		return findByProperty(HT_COOK_ROOM, htCookRoom);
	}

	public List findByHtTerrace(Object htTerrace) {
		return findByProperty(HT_TERRACE, htTerrace);
	}

	public List findByHtGardenArea(Object htGardenArea) {
		return findByProperty(HT_GARDEN_AREA, htGardenArea);
	}

	public List findByHtImg(Object htImg) {
		return findByProperty(HT_IMG, htImg);
	}

	public List findAll() {
		log.debug("finding all HouseType instances");
		try {
			String queryString = "from HouseType";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public HouseType merge(HouseType detachedInstance) {
		log.debug("merging HouseType instance");
		try {
			HouseType result = (HouseType) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(HouseType instance) {
		log.debug("attaching dirty HouseType instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(HouseType instance) {
		log.debug("attaching clean HouseType instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static HouseTypeDAO getFromApplicationContext(ApplicationContext ctx) {
		return (HouseTypeDAO) ctx.getBean("HouseTypeDAO");
	}
}