package com.zuxia.buildingsale.dao.impl;

import java.util.Date;
import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zuxia.buildingsale.entity.Employee;

/**
 * A data access object (DAO) providing persistence and search support for
 * Employee entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.zuxia.buildingsale.entity.Employee
 * @author MyEclipse Persistence Tools
 */

public class EmployeeDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(EmployeeDAO.class);
	// property constants
	public static final String EMP_NO = "empNo";
	public static final String EMP_ACCOUNT = "empAccount";
	public static final String EMP_PASS = "empPass";
	public static final String EMP_NAME = "empName";
	public static final String EMP_PID = "empPid";
	public static final String EMP_SEX = "empSex";
	public static final String EMP_TELL = "empTell";
	public static final String EMP_ADDRESS = "empAddress";
	public static final String EMP_EMAIL = "empEmail";
	public static final String EMP_REMARK = "empRemark";

	protected void initDao() {
		// do nothing
	}

	public void save(Employee transientInstance) {
		log.debug("saving Employee instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Employee persistentInstance) {
		log.debug("deleting Employee instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Employee findById(java.lang.Integer id) {
		log.debug("getting Employee instance with id: " + id);
		try {
			Employee instance = (Employee) getHibernateTemplate().get(
					"com.zuxia.buildingsale.entity.Employee", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Employee instance) {
		log.debug("finding Employee instance by example");
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
		log.debug("finding Employee instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Employee as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByEmpNo(Object empNo) {
		return findByProperty(EMP_NO, empNo);
	}

	public List findByEmpAccount(Object empAccount) {
		return findByProperty(EMP_ACCOUNT, empAccount);
	}

	public List findByEmpPass(Object empPass) {
		return findByProperty(EMP_PASS, empPass);
	}

	public List findByEmpName(Object empName) {
		return findByProperty(EMP_NAME, empName);
	}

	public List findByEmpPid(Object empPid) {
		return findByProperty(EMP_PID, empPid);
	}

	public List findByEmpSex(Object empSex) {
		return findByProperty(EMP_SEX, empSex);
	}

	public List findByEmpTell(Object empTell) {
		return findByProperty(EMP_TELL, empTell);
	}

	public List findByEmpAddress(Object empAddress) {
		return findByProperty(EMP_ADDRESS, empAddress);
	}

	public List findByEmpEmail(Object empEmail) {
		return findByProperty(EMP_EMAIL, empEmail);
	}

	public List findByEmpRemark(Object empRemark) {
		return findByProperty(EMP_REMARK, empRemark);
	}

	public List findAll() {
		log.debug("finding all Employee instances");
		try {
			String queryString = "from Employee";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Employee merge(Employee detachedInstance) {
		log.debug("merging Employee instance");
		try {
			Employee result = (Employee) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Employee instance) {
		log.debug("attaching dirty Employee instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Employee instance) {
		log.debug("attaching clean Employee instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static EmployeeDAO getFromApplicationContext(ApplicationContext ctx) {
		return (EmployeeDAO) ctx.getBean("EmployeeDAO");
	}
}