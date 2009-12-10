package com.zuxia.buildingsale.dao.impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zuxia.buildingsale.entity.LoftShop;

/**
 * A data access object (DAO) providing persistence and search support for
 * LoftShop entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.zuxia.buildingsale.entity.LoftShop
 * @author MyEclipse Persistence Tools
 */

public class LoftShopDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(LoftShopDAO.class);

	// property constants

	protected void initDao() {
		// do nothing
	}

	public void save(LoftShop transientInstance) {
		log.debug("saving LoftShop instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(LoftShop persistentInstance) {
		log.debug("deleting LoftShop instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public LoftShop findById(java.lang.Integer id) {
		log.debug("getting LoftShop instance with id: " + id);
		try {
			LoftShop instance = (LoftShop) getHibernateTemplate().get(
					"com.zuxia.buildingsale.entity.LoftShop", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(LoftShop instance) {
		log.debug("finding LoftShop instance by example");
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
		log.debug("finding LoftShop instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from LoftShop as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all LoftShop instances");
		try {
			String queryString = "from LoftShop";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public LoftShop merge(LoftShop detachedInstance) {
		log.debug("merging LoftShop instance");
		try {
			LoftShop result = (LoftShop) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(LoftShop instance) {
		log.debug("attaching dirty LoftShop instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(LoftShop instance) {
		log.debug("attaching clean LoftShop instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static LoftShopDAO getFromApplicationContext(ApplicationContext ctx) {
		return (LoftShopDAO) ctx.getBean("LoftShopDAO");
	}
}