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
	 * （重写方法） findHouseInfoByState方法概述 房屋状态查询
	 * 
	 * 
	 * @param page
	 * @param houseType 房屋状态
	 * @return
	 */
	@Override
	public List<HouseInfo> findByState(Page page, int houseState) {
		String hql = "from HouseInfo where dataDict.ddtId=?";
		List<HouseInfo> list = query(page, hql, houseState);
		return list;
	}

	/**
	 * （重写方法） findHouseInfoByType方法概述 房屋类型查询
	 * 
	 * 
	 * @param page
	 * @param houseType 房屋类型
	 * @return
	 */
	@Override
	public List<HouseInfo> findByType(Page page, int houseType) {
		List<HouseInfo> list = query(page,
				"from HouseInfo where houseType.htId=?", houseType);
		return list;
	}

	/**
	 * （重写方法） findHouseInfoByUnit方法概述 单元
	 * 
	 * 
	 * @param page
	 * @param unitId 单元
	 * @return
	 */
	@Override
	public List<HouseInfo> findByUnit(Page page, int unitId) {
		List<HouseInfo> list = query(page, "from HouseInfo where unitId=?",
				unitId);
		return list;
	}

	/**
	 * （重写方法） delete方法概述 删除
	 * 
	 * 
	 * @param obj
	 * @return
	 */
	@Override
	public int delete(HouseInfo obj) {
		try {
			super.delete(obj);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	/**
	 * （重写方法） findByid方法概述 根据房屋id查询
	 * 
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public HouseInfo findByid(Integer id) {
		return (HouseInfo) getByPk(HouseInfo.class, id);
	}

	/**
	 * （重写方法） merge方法概述 修改
	 * 
	 * 
	 * @param obj
	 * @return
	 */
	@Override
	public int merge(HouseInfo obj) {
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
	public int save(HouseInfo obj) {
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
	public List<HouseInfo> findAll(Page page) {
		List<HouseInfo> houseInfoList = query(page, "from HouseInfo");
		return houseInfoList;
	}

}