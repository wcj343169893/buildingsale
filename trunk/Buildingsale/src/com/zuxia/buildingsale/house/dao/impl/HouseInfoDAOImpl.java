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
	 * ����д������ findHouseInfoByState�������� ����״̬��ѯ
	 * 
	 * 
	 * @param page
	 * @param houseType ����״̬
	 * @return
	 */
	@Override
	public List<HouseInfo> findByState(Page page, int houseState) {
		String hql = "from HouseInfo where dataDict.ddtId=?";
		List<HouseInfo> list = query(page, hql, houseState);
		return list;
	}

	/**
	 * ����д������ findHouseInfoByType�������� �������Ͳ�ѯ
	 * 
	 * 
	 * @param page
	 * @param houseType ��������
	 * @return
	 */
	@Override
	public List<HouseInfo> findByType(Page page, int houseType) {
		List<HouseInfo> list = query(page,
				"from HouseInfo where houseType.htId=?", houseType);
		return list;
	}

	/**
	 * ����д������ findHouseInfoByUnit�������� ��Ԫ
	 * 
	 * 
	 * @param page
	 * @param unitId ��Ԫ
	 * @return
	 */
	@Override
	public List<HouseInfo> findByUnit(Page page, int unitId) {
		List<HouseInfo> list = query(page, "from HouseInfo where unitId=?",
				unitId);
		return list;
	}

	/**
	 * ����д������ delete�������� ɾ��
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
	 * ����д������ findByid�������� ���ݷ���id��ѯ
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
	 * ����д������ merge�������� �޸�
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
	 * ����д������ save�������� ����
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
	 * ����д������ findAll�������� ��ѯ����
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