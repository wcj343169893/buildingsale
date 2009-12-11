package com.zuxia.buildingsale.business.dao;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zuxia.buildingsale.business.entity.ClientInfo;

/**
 * A data access object (DAO) providing persistence and search support for
 * ClientInfo entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.zuxia.buildingsale.business.entity.ClientInfo
 * @author MyEclipse Persistence Tools
 */

public class ClientInfoDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(ClientInfoDAO.class);
	// property constants
	public static final String CLIENT_NAME = "clientName";
	public static final String CLIENT_SEX = "clientSex";
	public static final String CLIENT_TELL1 = "clientTell1";
	public static final String CLIENT_TELL2 = "clientTell2";
	public static final String CLIENT_TELL3 = "clientTell3";
	public static final String CLIENT_EMAIL = "clientEmail";
	public static final String CLIENT_ADDRESS = "clientAddress";
	public static final String CLIENT_PID = "clientPid";
	public static final String CLIENT_REMARK = "clientRemark";

	protected void initDao() {
		// do nothing
	}

	public void save(ClientInfo transientInstance) {
		log.debug("saving ClientInfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ClientInfo persistentInstance) {
		log.debug("deleting ClientInfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ClientInfo findById(java.lang.Integer id) {
		log.debug("getting ClientInfo instance with id: " + id);
		try {
			ClientInfo instance = (ClientInfo) getHibernateTemplate().get(
					"com.zuxia.buildingsale.entity.ClientInfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ClientInfo instance) {
		log.debug("finding ClientInfo instance by example");
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
		log.debug("finding ClientInfo instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from ClientInfo as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByClientName(Object clientName) {
		return findByProperty(CLIENT_NAME, clientName);
	}

	public List findByClientSex(Object clientSex) {
		return findByProperty(CLIENT_SEX, clientSex);
	}

	public List findByClientTell1(Object clientTell1) {
		return findByProperty(CLIENT_TELL1, clientTell1);
	}

	public List findByClientTell2(Object clientTell2) {
		return findByProperty(CLIENT_TELL2, clientTell2);
	}

	public List findByClientTell3(Object clientTell3) {
		return findByProperty(CLIENT_TELL3, clientTell3);
	}

	public List findByClientEmail(Object clientEmail) {
		return findByProperty(CLIENT_EMAIL, clientEmail);
	}

	public List findByClientAddress(Object clientAddress) {
		return findByProperty(CLIENT_ADDRESS, clientAddress);
	}

	public List findByClientPid(Object clientPid) {
		return findByProperty(CLIENT_PID, clientPid);
	}

	public List findByClientRemark(Object clientRemark) {
		return findByProperty(CLIENT_REMARK, clientRemark);
	}

	public List findAll() {
		log.debug("finding all ClientInfo instances");
		try {
			String queryString = "from ClientInfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ClientInfo merge(ClientInfo detachedInstance) {
		log.debug("merging ClientInfo instance");
		try {
			ClientInfo result = (ClientInfo) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ClientInfo instance) {
		log.debug("attaching dirty ClientInfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ClientInfo instance) {
		log.debug("attaching clean ClientInfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ClientInfoDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ClientInfoDAO) ctx.getBean("ClientInfoDAO");
	}
}