package com.zuxia.buildingsale.house.dao.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.zuxia.buildingsale.common.BaseDao;
import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.house.dao.IHouseInfoDAO;
import com.zuxia.buildingsale.house.entity.HouseInfo;

public class HouseInfoDAOImpl extends BaseDao implements IHouseInfoDAO {
	private static final Log log = LogFactory.getLog(HouseInfoDAOImpl.class);
	// property constants
	public static final String HOUSE_FLOORS = "houseFloors";
	public static final String HOUSE_NO = "houseNo";
	public static final String HOUSE_BUILD_AREA = "houseBuildArea";
	public static final String HOUSE_BUILD_PRICE = "houseBuildPrice";
	public static final String HOUSE_DEAL_BUILD_PRICE = "houseDealBuildPrice";
	public static final String HOUSE_USE_AREA = "houseUseArea";
	public static final String HOUSE_USE_PRICE = "houseUsePrice";
	public static final String HOUSE_DEAL_USE_PRICE = "houseDealUsePrice";
	public static final String HOUSE_DEAL_PRICE = "houseDealPrice";
	public static final String HOUSE_DECORATION = "houseDecoration";

	/**
	 * （重写方法） findHouseInfoByState方法概述
	 * 
	 * 
	 * @param page
	 * @param houseType
	 * @return
	 */
	@Override
	public List<HouseInfo> findByState(Page page, int houseType) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * （重写方法） findHouseInfoByType方法概述
	 * 
	 * 
	 * @param page
	 * @param houseType
	 * @return
	 */
	@Override
	public List<HouseInfo> findByType(Page page, int houseType) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * （重写方法） findHouseInfoByUnit方法概述
	 * 
	 * 
	 * @param page
	 * @param unitId
	 * @return
	 */
	@Override
	public List<HouseInfo> findByUnit(Page page, int unitId) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * （重写方法） delete方法概述
	 * 
	 * 
	 * @param obj
	 * @return
	 */
	@Override
	public int delete(HouseInfo obj) {
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
	public HouseInfo findByid(Integer id) {
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
	public int merge(HouseInfo obj) {
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
	public int save(HouseInfo obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * （重写方法） findAll方法概述
	 * 
	 * 
	 * @param page
	 * @return
	 */
	@Override
	public List<HouseInfo> findAll(Page page) {
		// TODO Auto-generated method stub
		return null;
	}

}