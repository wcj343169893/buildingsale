package com.zuxia.buildingsale.house.dao.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.zuxia.buildingsale.common.BaseDao;
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

public class UnitInfoDAO extends BaseDao implements IUnitInfoDAO {
	private static final Log log = LogFactory.getLog(UnitInfoDAO.class);
	// property constants
	public static final String UNIT_NO = "unitNo";
	public static final String UNIT_NAME = "unitName";
	public static final String UNIT_HOUSE_NUMBER = "unitHouseNumber";
	public static final String UNIT_FLOOR_NUMBER = "unitFloorNumber";
	public static final String UNIT_TERM = "unitTerm";

	/**
	 * ����д������ delete��������
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
	 * ����д������ findByid��������
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
	 * ����д������ merge��������
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
	 * ����д������ save��������
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
}