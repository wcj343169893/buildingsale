package com.zuxia.buildingsale.business.dao;

import java.sql.Timestamp;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zuxia.buildingsale.business.entity.DealInfo;

/**
 * A data access object (DAO) providing persistence and search support for
 * DealInfo entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.zuxia.buildingsale.business.entity.DealInfo
 * @author MyEclipse Persistence Tools
 */

public class DealInfoDAOImpl extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(DealInfoDAOImpl.class);
	// property constants
	public static final String DEAL_HOUSE_PRICE = "dealHousePrice";
	public static final String DEAL_DEED_TAX = "dealDeedTax";
	public static final String DEAL_TRAD_TAX = "dealTradTax";
	public static final String DEAL_META_TAX = "dealMetaTax";
	public static final String DEAL_LAND_TAX = "dealLandTax";
	public static final String DEAL_FIVE_OPEN = "dealFiveOpen";
	public static final String DEAL_BIG_BUILD = "dealBigBuild";
	public static final String DEAL_PAWN_PRICE = "dealPawnPrice";
	public static final String DEAL_PAWN_TAX = "dealPawnTax";
	public static final String DEAL_PAWN_TRAD_TAX = "dealPawnTradTax";
	public static final String DEAL_ALL_PRICE = "dealAllPrice";
	public static final String DEAL_BOOK_MONEY = "dealBookMoney";

	protected void initDao() {
		// do nothing
	}

	public void save(DealInfo transientInstance) {
		log.debug("saving DealInfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(DealInfo persistentInstance) {
		log.debug("deleting DealInfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public DealInfo findById(java.lang.Integer id) {
		log.debug("getting DealInfo instance with id: " + id);
		try {
			DealInfo instance = (DealInfo) getHibernateTemplate().get(
					"com.zuxia.buildingsale.entity.DealInfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(DealInfo instance) {
		log.debug("finding DealInfo instance by example");
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
		log.debug("finding DealInfo instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from DealInfo as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByDealHousePrice(Object dealHousePrice) {
		return findByProperty(DEAL_HOUSE_PRICE, dealHousePrice);
	}

	public List findByDealDeedTax(Object dealDeedTax) {
		return findByProperty(DEAL_DEED_TAX, dealDeedTax);
	}

	public List findByDealTradTax(Object dealTradTax) {
		return findByProperty(DEAL_TRAD_TAX, dealTradTax);
	}

	public List findByDealMetaTax(Object dealMetaTax) {
		return findByProperty(DEAL_META_TAX, dealMetaTax);
	}

	public List findByDealLandTax(Object dealLandTax) {
		return findByProperty(DEAL_LAND_TAX, dealLandTax);
	}

	public List findByDealFiveOpen(Object dealFiveOpen) {
		return findByProperty(DEAL_FIVE_OPEN, dealFiveOpen);
	}

	public List findByDealBigBuild(Object dealBigBuild) {
		return findByProperty(DEAL_BIG_BUILD, dealBigBuild);
	}

	public List findByDealPawnPrice(Object dealPawnPrice) {
		return findByProperty(DEAL_PAWN_PRICE, dealPawnPrice);
	}

	public List findByDealPawnTax(Object dealPawnTax) {
		return findByProperty(DEAL_PAWN_TAX, dealPawnTax);
	}

	public List findByDealPawnTradTax(Object dealPawnTradTax) {
		return findByProperty(DEAL_PAWN_TRAD_TAX, dealPawnTradTax);
	}

	public List findByDealAllPrice(Object dealAllPrice) {
		return findByProperty(DEAL_ALL_PRICE, dealAllPrice);
	}

	public List findByDealBookMoney(Object dealBookMoney) {
		return findByProperty(DEAL_BOOK_MONEY, dealBookMoney);
	}

	public List findAll() {
		log.debug("finding all DealInfo instances");
		try {
			String queryString = "from DealInfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public DealInfo merge(DealInfo detachedInstance) {
		log.debug("merging DealInfo instance");
		try {
			DealInfo result = (DealInfo) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(DealInfo instance) {
		log.debug("attaching dirty DealInfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(DealInfo instance) {
		log.debug("attaching clean DealInfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static DealInfoDAOImpl getFromApplicationContext(ApplicationContext ctx) {
		return (DealInfoDAOImpl) ctx.getBean("DealInfoDAO");
	}
}