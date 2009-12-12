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
	 * ����д������ delete�������� ɾ��
	 * 
	 * 
	 * @param obj
	 * @return
	 */
	@Override
	public int delete(HouseType obj) {
		try {
			delete(obj);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	/**
	 * ����д������ findByid�������� ��������id��ѯ
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
	 * ����д������ merge�������� �޸�
	 * 
	 * 
	 * @param obj
	 * @return
	 */
	@Override
	public int merge(HouseType obj) {
		try {
			update(obj);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	/** 
	 * ����д������ save�������� ����
	 * 
	 * 
	 * @param obj
	 * @return
	 */
	@Override
	public int save(HouseType obj) {
		try {
			insert(obj);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	/**
	 * ����д������ findAll�������� ��ѯ����
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
}