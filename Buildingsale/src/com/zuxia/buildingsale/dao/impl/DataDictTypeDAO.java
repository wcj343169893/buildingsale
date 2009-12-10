package com.zuxia.buildingsale.dao.impl;

import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zuxia.buildingsale.entity.DataDictType;

/**
 * A data access object (DAO) providing persistence and search support for
 * DataDictType entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.zuxia.buildingsale.entity.DataDictType
 * @author MyEclipse Persistence Tools
 */

public class DataDictTypeDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(DataDictTypeDAO.class);
	// property constants
	public static final String DDT_TYPE = "ddtType";
	public static final String DDT_NAME = "ddtName";

	protected void initDao() {
		// do nothing
	}

	public void save(DataDictType transientInstance) {
		log.debug("saving DataDictType instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(DataDictType persistentInstance) {
		log.debug("deleting DataDictType instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public DataDictType findById(java.lang.Integer id) {
		log.debug("getting DataDictType instance with id: " + id);
		try {
			DataDictType instance = (DataDictType) getHibernateTemplate().get(
					"com.zuxia.buildingsale.entity.DataDictType", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(DataDictType instance) {
		log.debug("finding DataDictType instance by example");
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
		log.debug("finding DataDictType instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from DataDictType as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByDdtType(Object ddtType) {
		return findByProperty(DDT_TYPE, ddtType);
	}

	public List findByDdtName(Object ddtName) {
		return findByProperty(DDT_NAME, ddtName);
	}

	public List findAll() {
		log.debug("finding all DataDictType instances");
		try {
			String queryString = "from DataDictType";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public DataDictType merge(DataDictType detachedInstance) {
		log.debug("merging DataDictType instance");
		try {
			DataDictType result = (DataDictType) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(DataDictType instance) {
		log.debug("attaching dirty DataDictType instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(DataDictType instance) {
		log.debug("attaching clean DataDictType instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static DataDictTypeDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (DataDictTypeDAO) ctx.getBean("DataDictTypeDAO");
	}
}