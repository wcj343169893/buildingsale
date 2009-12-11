package com.zuxia.buildingsale.sys.dao.impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zuxia.buildingsale.sys.entity.EmpRole;

/**
 * A data access object (DAO) providing persistence and search support for
 * EmpRole entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.zuxia.buildingsale.sys.entity.EmpRole
 * @author MyEclipse Persistence Tools
 */

public class EmpRoleDAOImpl extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(EmpRoleDAOImpl.class);

	// property constants

	protected void initDao() {
		// do nothing
	}

	public void save(EmpRole transientInstance) {
		log.debug("saving EmpRole instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(EmpRole persistentInstance) {
		log.debug("deleting EmpRole instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EmpRole findById(java.lang.Integer id) {
		log.debug("getting EmpRole instance with id: " + id);
		try {
			EmpRole instance = (EmpRole) getHibernateTemplate().get(
					"com.zuxia.buildingsale.entity.EmpRole", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(EmpRole instance) {
		log.debug("finding EmpRole instance by example");
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
		log.debug("finding EmpRole instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from EmpRole as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all EmpRole instances");
		try {
			String queryString = "from EmpRole";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public EmpRole merge(EmpRole detachedInstance) {
		log.debug("merging EmpRole instance");
		try {
			EmpRole result = (EmpRole) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(EmpRole instance) {
		log.debug("attaching dirty EmpRole instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(EmpRole instance) {
		log.debug("attaching clean EmpRole instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static EmpRoleDAOImpl getFromApplicationContext(ApplicationContext ctx) {
		return (EmpRoleDAOImpl) ctx.getBean("EmpRoleDAO");
	}
}