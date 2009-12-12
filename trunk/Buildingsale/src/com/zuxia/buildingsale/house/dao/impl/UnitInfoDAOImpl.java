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
	 * ����д������ delete�������� ɾ��
	 * 
	 * 
	 * @param obj
	 * @return
	 */
	@Override
	public int delete(UnitInfo obj) {
		try {
			delete(obj);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	/**
	 * ����д������ findByid�������� ����id��ѯ
	 * 
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public UnitInfo findByid(Integer id) {
		return (UnitInfo) getByPk(UnitInfo.class, id);
	}

	/**
	 * ����д������ merge�������� �޸�
	 * 
	 * 
	 * @param obj
	 * @return
	 */
	@Override
	public int merge(UnitInfo obj) {
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
	public int save(UnitInfo obj) {
		try {
			insert(obj);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	/**
	 * ����д������ findByLoft�������� ����¥�̲�ѯ��Ԫ
	 * 
	 * 
	 * @param page
	 * @param loftId ¥��id
	 * @return
	 */
	@Override
	public List<UnitInfo> findByLoft(Page page, int loftId) {
		String strhql="from UnitInfo where loftInfo.loftId=?";
		List<UnitInfo> unitInfoList=query(page, strhql, loftId);
		return unitInfoList;
	}

	/**
	 * ����д������ findAll�������� ��ѯ����
	 * 
	 * 
	 * @param page
	 * @return
	 */
	@Override
	public List<UnitInfo> findAll(Page page) {
		String strhql="from UnitInfo";
		List<UnitInfo> unitInfoList=query(page, strhql);
		return unitInfoList;
	}
}