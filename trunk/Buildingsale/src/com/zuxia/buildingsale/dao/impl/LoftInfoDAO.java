package com.zuxia.buildingsale.dao.impl;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zuxia.buildingsale.entity.LoftInfo;

/**
 * A data access object (DAO) providing persistence and search support for
 * LoftInfo entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.zuxia.buildingsale.entity.LoftInfo
 * @author MyEclipse Persistence Tools
 */

public class LoftInfoDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(LoftInfoDAO.class);
	// property constants
	public static final String LOFT_NO = "loftNo";
	public static final String LOFT_NAME = "loftName";
	public static final String LOFT_ZONE = "loftZone";
	public static final String LOFT_ADDRESS = "loftAddress";
	public static final String LOFT_PRICE = "loftPrice";
	public static final String LLOFT_CAPACITY = "lloftCapacity";
	public static final String LOFT_GREEN = "loftGreen";
	public static final String LOFT_TRAFFIC = "loftTraffic";
	public static final String LOFT_FACILITY = "loftFacility";
	public static final String LOFT_REMARK = "loftRemark";

	protected void initDao() {
		// do nothing
	}

	public void save(LoftInfo transientInstance) {
		log.debug("saving LoftInfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(LoftInfo persistentInstance) {
		log.debug("deleting LoftInfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public LoftInfo findById(java.lang.Integer id) {
		log.debug("getting LoftInfo instance with id: " + id);
		try {
			LoftInfo instance = (LoftInfo) getHibernateTemplate().get(
					"com.zuxia.buildingsale.entity.LoftInfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(LoftInfo instance) {
		log.debug("finding LoftInfo instance by example");
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
		log.debug("finding LoftInfo instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from LoftInfo as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByLoftNo(Object loftNo) {
		return findByProperty(LOFT_NO, loftNo);
	}

	public List findByLoftName(Object loftName) {
		return findByProperty(LOFT_NAME, loftName);
	}

	public List findByLoftZone(Object loftZone) {
		return findByProperty(LOFT_ZONE, loftZone);
	}

	public List findByLoftAddress(Object loftAddress) {
		return findByProperty(LOFT_ADDRESS, loftAddress);
	}

	public List findByLoftPrice(Object loftPrice) {
		return findByProperty(LOFT_PRICE, loftPrice);
	}

	public List findByLloftCapacity(Object lloftCapacity) {
		return findByProperty(LLOFT_CAPACITY, lloftCapacity);
	}

	public List findByLoftGreen(Object loftGreen) {
		return findByProperty(LOFT_GREEN, loftGreen);
	}

	public List findByLoftTraffic(Object loftTraffic) {
		return findByProperty(LOFT_TRAFFIC, loftTraffic);
	}

	public List findByLoftFacility(Object loftFacility) {
		return findByProperty(LOFT_FACILITY, loftFacility);
	}

	public List findByLoftRemark(Object loftRemark) {
		return findByProperty(LOFT_REMARK, loftRemark);
	}

	public List findAll() {
		log.debug("finding all LoftInfo instances");
		try {
			String queryString = "from LoftInfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public LoftInfo merge(LoftInfo detachedInstance) {
		log.debug("merging LoftInfo instance");
		try {
			LoftInfo result = (LoftInfo) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(LoftInfo instance) {
		log.debug("attaching dirty LoftInfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(LoftInfo instance) {
		log.debug("attaching clean LoftInfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static LoftInfoDAO getFromApplicationContext(ApplicationContext ctx) {
		return (LoftInfoDAO) ctx.getBean("LoftInfoDAO");
	}
}