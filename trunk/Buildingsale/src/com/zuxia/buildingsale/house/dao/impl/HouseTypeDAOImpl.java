package com.zuxia.buildingsale.house.dao.impl;

import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zuxia.buildingsale.common.BaseDao;
import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.house.dao.IHouseTypeDAO;
import com.zuxia.buildingsale.house.entity.HouseInfo;
import com.zuxia.buildingsale.house.entity.HouseType;

/**
 * A data access object (DAO) providing persistence and search support for
 * HouseType entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.zuxia.buildingsale.house.entity.HouseType
 * @author MyEclipse Persistence Tools
 */

public class HouseTypeDAOImpl extends BaseDao implements IHouseTypeDAO {
	private static final Log log = LogFactory.getLog(HouseTypeDAOImpl.class);
	// property constants
	public static final String HT_NAME = "htName";
	public static final String HT_ROOM = "htRoom";
	public static final String HT_HALLL = "htHalll";
	public static final String HT_WC = "htWc";
	public static final String HT_COOK_ROOM = "htCookRoom";
	public static final String HT_TERRACE = "htTerrace";
	public static final String HT_GARDEN_AREA = "htGardenArea";
	public static final String HT_IMG = "htImg";

	/**
	 * （重写方法） delete方法概述 删除
	 * 
	 * 
	 * @param obj
	 * @return
	 */
	@Override
	public int delete(HouseType obj) {
		try {
			super.delete(obj);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	/**
	 * （重写方法） findByid方法概述 根据类型id查询
	 * 
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public HouseType findByid(Integer id) {
		return (HouseType) getByPk(HouseType.class, id);
	}

	/**
	 * （重写方法） merge方法概述 修改
	 * 
	 * 
	 * @param obj
	 * @return
	 */
	@Override
	public int merge(HouseType obj) {
		try {
			super.update(obj);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	/**
	 * （重写方法） save方法概述 保存
	 * 
	 * 
	 * @param obj
	 * @return
	 */
	@Override
	public int save(HouseType obj) {
		try {
			super.insert(obj);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	/**
	 * （重写方法） findAll方法概述 查询所有
	 * 
	 * 
	 * @param page
	 * @return
	 */
	@Override
	public List<HouseType> findAll(Page page) {
		List<HouseType> houseTypeList = query(page, "from HouseType");
		return houseTypeList;
	}

	@Override
	public List<HouseType> findAll() {
		List<HouseType> houseTypeList = super.find("from HouseType");
		return houseTypeList;
	}
}