package com.zuxia.buildingsale.dao.impl;

import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zuxia.buildingsale.entity.DataDict;

/**
 * A data access object (DAO) providing persistence and search support for
 * DataDict entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.zuxia.buildingsale.entity.DataDict
 * @author MyEclipse Persistence Tools
 */

public class DataDictDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(DataDictDAO.class);
	// property constants
	public static final String DD_VALUE = "ddValue";
	public static final String DD_REMARK = "ddRemark";

	protected void initDao() {
		// do nothing
	}

	public void save(DataDict transientInstance) {
		log.debug("saving DataDict instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(DataDict persistentInstance) {
		log.debug("deleting DataDict instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public DataDict findById(java.lang.Integer id) {
		log.debug("getting DataDict instance with id: " + id);
		try {
			DataDict instance = (DataDict) getHibernateTemplate().get(
					"com.zuxia.buildingsale.entity.DataDict", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(DataDict instance) {
		log.debug("finding DataDict instance by example");
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
		log.debug("finding DataDict instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from DataDict as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByDdValue(Object ddValue) {
		return findByProperty(DD_VALUE, ddValue);
	}

	public List findByDdRemark(Object ddRemark) {
		return findByProperty(DD_REMARK, ddRemark);
	}

	public List findAll() {
		log.debug("finding all DataDict instances");
		try {
			String queryString = "from DataDict";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public DataDict merge(DataDict detachedInstance) {
		log.debug("merging DataDict instance");
		try {
			DataDict result = (DataDict) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(DataDict instance) {
		log.debug("attaching dirty DataDict instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(DataDict instance) {
		log.debug("attaching clean DataDict instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static DataDictDAO getFromApplicationContext(ApplicationContext ctx) {
		return (DataDictDAO) ctx.getBean("DataDictDAO");
	}
}