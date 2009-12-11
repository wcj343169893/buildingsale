package com.zuxia.buildingsale.sys.dao.impl;

import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zuxia.buildingsale.dao.IMenuInfoDao;
import com.zuxia.buildingsale.sys.entity.MenuInfo;

/**
 * A data access object (DAO) providing persistence and search support for
 * MenuInfo entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.zuxia.buildingsale.sys.entity.MenuInfo
 * @author MyEclipse Persistence Tools
 */

public class MenuInfoDAOImpl extends HibernateDaoSupport implements IMenuInfoDao {
	private static final Log log = LogFactory.getLog(MenuInfoDAOImpl.class);
	// property constants
	public static final String MENU_NO = "menuNo";
	public static final String MENU_NAME = "menuName";
	public static final String MENU_PARENT = "menuParent";
	public static final String MENU_URL = "menuUrl";
	public static final String MENU_TARGET = "menuTarget";
	public static final String MENU_IMG = "menuImg";
	public static final String MENU_DESC = "menuDesc";
	public static final String MENU_REMARK = "menuRemark";

	protected void initDao() {
		// do nothing
	}

	/** 
	 * ����д������
	 * save��������
	 * 
	 *
	 * @param transientInstance
	 */
	public void save(MenuInfo transientInstance) {
		log.debug("saving MenuInfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/** 
	 * ����д������
	 * delete��������
	 * 
	 *
	 * @param persistentInstance
	 */
	public void delete(MenuInfo persistentInstance) {
		log.debug("deleting MenuInfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/** 
	 * ����д������
	 * findById��������
	 * 
	 *
	 * @param id
	 * @return
	 */
	public MenuInfo findById(java.lang.Integer id) {
		log.debug("getting MenuInfo instance with id: " + id);
		try {
			MenuInfo instance = (MenuInfo) getHibernateTemplate().get(
					"com.zuxia.buildingsale.entity.MenuInfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/** 
	 * ����д������
	 * findByExample��������
	 * 
	 *
	 * @param instance
	 * @return
	 */
	public List findByExample(MenuInfo instance) {
		log.debug("finding MenuInfo instance by example");
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

	/** 
	 * ����д������
	 * findByProperty��������
	 * 
	 *
	 * @param propertyName
	 * @param value
	 * @return
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding MenuInfo instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from MenuInfo as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/** 
	 * ����д������
	 * findByMenuNo��������
	 * 
	 *
	 * @param menuNo
	 * @return
	 */
	public List findByMenuNo(Object menuNo) {
		return findByProperty(MENU_NO, menuNo);
	}

	/** 
	 * ����д������
	 * findByMenuName��������
	 * 
	 *
	 * @param menuName
	 * @return
	 */
	public List findByMenuName(Object menuName) {
		return findByProperty(MENU_NAME, menuName);
	}

	/** 
	 * ����д������
	 * findByMenuParent��������
	 * 
	 *
	 * @param menuParent
	 * @return
	 */
	public List findByMenuParent(Object menuParent) {
		return findByProperty(MENU_PARENT, menuParent);
	}

	/** 
	 * ����д������
	 * findByMenuUrl��������
	 * 
	 *
	 * @param menuUrl
	 * @return
	 */
	public List findByMenuUrl(Object menuUrl) {
		return findByProperty(MENU_URL, menuUrl);
	}

	/** 
	 * ����д������
	 * findByMenuTarget��������
	 * 
	 *
	 * @param menuTarget
	 * @return
	 */
	public List findByMenuTarget(Object menuTarget) {
		return findByProperty(MENU_TARGET, menuTarget);
	}

	/** 
	 * ����д������
	 * findByMenuImg��������
	 * 
	 *
	 * @param menuImg
	 * @return
	 */
	public List findByMenuImg(Object menuImg) {
		return findByProperty(MENU_IMG, menuImg);
	}

	/** 
	 * ����д������
	 * findByMenuDesc��������
	 * 
	 *
	 * @param menuDesc
	 * @return
	 */
	public List findByMenuDesc(Object menuDesc) {
		return findByProperty(MENU_DESC, menuDesc);
	}

	/** 
	 * ����д������
	 * findByMenuRemark��������
	 * 
	 *
	 * @param menuRemark
	 * @return
	 */
	public List findByMenuRemark(Object menuRemark) {
		return findByProperty(MENU_REMARK, menuRemark);
	}

	/** 
	 * ����д������
	 * findAll��������
	 * 
	 *
	 * @return
	 */
	public List findAll() {
		log.debug("finding all MenuInfo instances");
		try {
			String queryString = "from MenuInfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/** 
	 * ����д������
	 * merge��������
	 * 
	 *
	 * @param detachedInstance
	 * @return
	 */
	public MenuInfo merge(MenuInfo detachedInstance) {
		log.debug("merging MenuInfo instance");
		try {
			MenuInfo result = (MenuInfo) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/** 
	 * ����д������
	 * attachDirty��������
	 * 
	 *
	 * @param instance
	 */
	public void attachDirty(MenuInfo instance) {
		log.debug("attaching dirty MenuInfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/** 
	 * ����д������
	 * attachClean��������
	 * 
	 *
	 * @param instance
	 */
	public void attachClean(MenuInfo instance) {
		log.debug("attaching clean MenuInfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static IMenuInfoDao getFromApplicationContext(ApplicationContext ctx) {
		return (IMenuInfoDao) ctx.getBean("MenuInfoDAO");
	}
}