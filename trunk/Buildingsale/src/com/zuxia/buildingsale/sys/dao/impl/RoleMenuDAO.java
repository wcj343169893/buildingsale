package com.zuxia.buildingsale.sys.dao.impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zuxia.buildingsale.sys.entity.RoleMenu;

/**
 * A data access object (DAO) providing persistence and search support for
 * RoleMenu entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.zuxia.buildingsale.sys.entity.RoleMenu
 * @author MyEclipse Persistence Tools
 */

public class RoleMenuDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(RoleMenuDAO.class);

	// property constants

	protected void initDao() {
		// do nothing
	}

	public void save(RoleMenu transientInstance) {
		log.debug("saving RoleMenu instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(RoleMenu persistentInstance) {
		log.debug("deleting RoleMenu instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public RoleMenu findById(java.lang.Integer id) {
		log.debug("getting RoleMenu instance with id: " + id);
		try {
			RoleMenu instance = (RoleMenu) getHibernateTemplate().get(
					"com.zuxia.buildingsale.entity.RoleMenu", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(RoleMenu instance) {
		log.debug("finding RoleMenu instance by example");
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
		log.debug("finding RoleMenu instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from RoleMenu as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all RoleMenu instances");
		try {
			String queryString = "from RoleMenu";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public RoleMenu merge(RoleMenu detachedInstance) {
		log.debug("merging RoleMenu instance");
		try {
			RoleMenu result = (RoleMenu) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(RoleMenu instance) {
		log.debug("attaching dirty RoleMenu instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(RoleMenu instance) {
		log.debug("attaching clean RoleMenu instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static RoleMenuDAO getFromApplicationContext(ApplicationContext ctx) {
		return (RoleMenuDAO) ctx.getBean("RoleMenuDAO");
	}
}