package com.zuxia.buildingsale.sys.dao.impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zuxia.buildingsale.sys.entity.EmpMenu;

/**
 * A data access object (DAO) providing persistence and search support for
 * EmpMenu entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.zuxia.buildingsale.sys.entity.EmpMenu
 * @author MyEclipse Persistence Tools
 */

public class EmpMenuDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(EmpMenuDAO.class);

	// property constants

	protected void initDao() {
		// do nothing
	}

	public void save(EmpMenu transientInstance) {
		log.debug("saving EmpMenu instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(EmpMenu persistentInstance) {
		log.debug("deleting EmpMenu instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EmpMenu findById(java.lang.Integer id) {
		log.debug("getting EmpMenu instance with id: " + id);
		try {
			EmpMenu instance = (EmpMenu) getHibernateTemplate().get(
					"com.zuxia.buildingsale.entity.EmpMenu", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(EmpMenu instance) {
		log.debug("finding EmpMenu instance by example");
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
		log.debug("finding EmpMenu instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from EmpMenu as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all EmpMenu instances");
		try {
			String queryString = "from EmpMenu";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public EmpMenu merge(EmpMenu detachedInstance) {
		log.debug("merging EmpMenu instance");
		try {
			EmpMenu result = (EmpMenu) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(EmpMenu instance) {
		log.debug("attaching dirty EmpMenu instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(EmpMenu instance) {
		log.debug("attaching clean EmpMenu instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static EmpMenuDAO getFromApplicationContext(ApplicationContext ctx) {
		return (EmpMenuDAO) ctx.getBean("EmpMenuDAO");
	}
}