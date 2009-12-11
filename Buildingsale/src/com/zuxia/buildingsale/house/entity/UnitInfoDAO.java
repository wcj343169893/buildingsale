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
 * UnitInfo entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.zuxia.buildingsale.house.entity.UnitInfo
 * @author MyEclipse Persistence Tools
 */

public class UnitInfoDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(UnitInfoDAO.class);
	// property constants
	public static final String UNIT_NO = "unitNo";
	public static final String UNIT_NAME = "unitName";
	public static final String UNIT_HOUSE_NUMBER = "unitHouseNumber";
	public static final String UNIT_FLOOR_NUMBER = "unitFloorNumber";
	public static final String UNIT_TERM = "unitTerm";

	protected void initDao() {
		// do nothing
	}

	public void save(UnitInfo transientInstance) {
		log.debug("saving UnitInfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(UnitInfo persistentInstance) {
		log.debug("deleting UnitInfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public UnitInfo findById(java.lang.Integer id) {
		log.debug("getting UnitInfo instance with id: " + id);
		try {
			UnitInfo instance = (UnitInfo) getHibernateTemplate().get(
					"com.zuxia.buildingsale.entity.UnitInfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(UnitInfo instance) {
		log.debug("finding UnitInfo instance by example");
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
		log.debug("finding UnitInfo instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from UnitInfo as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByUnitNo(Object unitNo) {
		return findByProperty(UNIT_NO, unitNo);
	}

	public List findByUnitName(Object unitName) {
		return findByProperty(UNIT_NAME, unitName);
	}

	public List findByUnitHouseNumber(Object unitHouseNumber) {
		return findByProperty(UNIT_HOUSE_NUMBER, unitHouseNumber);
	}

	public List findByUnitFloorNumber(Object unitFloorNumber) {
		return findByProperty(UNIT_FLOOR_NUMBER, unitFloorNumber);
	}

	public List findByUnitTerm(Object unitTerm) {
		return findByProperty(UNIT_TERM, unitTerm);
	}

	public List findAll() {
		log.debug("finding all UnitInfo instances");
		try {
			String queryString = "from UnitInfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public UnitInfo merge(UnitInfo detachedInstance) {
		log.debug("merging UnitInfo instance");
		try {
			UnitInfo result = (UnitInfo) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(UnitInfo instance) {
		log.debug("attaching dirty UnitInfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(UnitInfo instance) {
		log.debug("attaching clean UnitInfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static UnitInfoDAO getFromApplicationContext(ApplicationContext ctx) {
		return (UnitInfoDAO) ctx.getBean("UnitInfoDAO");
	}
}