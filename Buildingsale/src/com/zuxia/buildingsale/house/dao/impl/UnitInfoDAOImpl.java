package com.zuxia.buildingsale.house.dao.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.zuxia.buildingsale.common.BaseDao;
import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.house.dao.IUnitInfoDAO;
import com.zuxia.buildingsale.house.entity.UnitInfo;

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

public class UnitInfoDAOImpl extends BaseDao implements IUnitInfoDAO {
	private static final Log log = LogFactory.getLog(UnitInfoDAOImpl.class);
	// property constants
	public static final String UNIT_NO = "unitNo";
	public static final String UNIT_NAME = "unitName";
	public static final String UNIT_HOUSE_NUMBER = "unitHouseNumber";
	public static final String UNIT_FLOOR_NUMBER = "unitFloorNumber";
	public static final String UNIT_TERM = "unitTerm";

	/**
	 * （重写方法） delete方法概述
	 * 
	 * 
	 * @param obj
	 * @return
	 */
	@Override
	public int delete(UnitInfo obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * （重写方法） findByid方法概述
	 * 
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public UnitInfo findByid(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * （重写方法） merge方法概述
	 * 
	 * 
	 * @param obj
	 * @return
	 */
	@Override
	public int merge(UnitInfo obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * （重写方法） save方法概述
	 * 
	 * 
	 * @param obj
	 * @return
	 */
	@Override
	public int save(UnitInfo obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	/** 
	 * （重写方法）
	 * findByLoft方法概述
	 * 
	 *
	 * @param page
	 * @param loftId
	 * @return
	 */
	@Override
	public List<UnitInfo> findByLoft(Page page, int loftId) {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	 * （重写方法）
	 * findAll方法概述
	 * 
	 *
	 * @param page
	 * @return
	 */
	@Override
	public List<UnitInfo> findAll(Page page) {
		// TODO Auto-generated method stub
		return null;
	}
}