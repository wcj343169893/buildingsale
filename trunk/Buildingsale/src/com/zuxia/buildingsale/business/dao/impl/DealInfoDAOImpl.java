package com.zuxia.buildingsale.business.dao.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.zuxia.buildingsale.business.dao.IDealInfoDAO;
import com.zuxia.buildingsale.business.entity.DealInfo;
import com.zuxia.buildingsale.common.BaseDao;
import com.zuxia.buildingsale.common.Page;

/**
 * A data access object (DAO) providing persistence and search support for
 * DealInfo entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.zuxia.buildingsale.business.entity.DealInfo
 * @author MyEclipse Persistence Tools
 */

public class DealInfoDAOImpl extends BaseDao implements IDealInfoDAO {
	private static final Log log = LogFactory.getLog(DealInfoDAOImpl.class);
	// property constants
	public static final String DEAL_HOUSE_PRICE = "dealHousePrice";
	public static final String DEAL_DEED_TAX = "dealDeedTax";
	public static final String DEAL_TRAD_TAX = "dealTradTax";
	public static final String DEAL_META_TAX = "dealMetaTax";
	public static final String DEAL_LAND_TAX = "dealLandTax";
	public static final String DEAL_FIVE_OPEN = "dealFiveOpen";
	public static final String DEAL_BIG_BUILD = "dealBigBuild";
	public static final String DEAL_PAWN_PRICE = "dealPawnPrice";
	public static final String DEAL_PAWN_TAX = "dealPawnTax";
	public static final String DEAL_PAWN_TRAD_TAX = "dealPawnTradTax";
	public static final String DEAL_ALL_PRICE = "dealAllPrice";
	public static final String DEAL_BOOK_MONEY = "dealBookMoney";

	@Override
	public int delete(DealInfo obj) {
		try {
			super.delete(obj);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	@Override
	public DealInfo findByid(Integer id) {
		DealInfo dealInfo = (DealInfo) super.getByPk(DealInfo.class, id);
		return dealInfo;
	}

	@Override
	public int merge(DealInfo obj) {
		try {
			super.update(obj);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	@Override
	public int save(DealInfo obj) {
		try {
			super.insert(obj);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	@Override
	public List<DealInfo> findAll(Page page) {
		String strhql = "from DealInfo";
		List<DealInfo> dealInfoList = super.query(page, strhql);
		return dealInfoList;
	}

	@Override
	public List<DealInfo> findByClientId(Page page, int clientId) {
		String strhql = "from DealInfo where clientInfo.clientId=?";
		List<DealInfo> dealInfoList = super.query(page, strhql, clientId);
		return dealInfoList;
	}

	@Override
	public List<DealInfo> findByEmpId(Page page, int empId) {
		String strhql = "from DealInfo where employee.empId=?";
		List<DealInfo> dealInfoList = super.query(page, strhql, strhql);
		return dealInfoList;
	}

	@Override
	public List<DealInfo> findByHouseId(Page page, int houseId) {
		String strhql = "from DealInfo where houseInfo.houseId=?";
		List<DealInfo> dealInfoList = super.query(page, strhql, houseId);
		return dealInfoList;
	}

	@Override
	public List<DealInfo> findByPayStyle(Page page, int dealPayStyle) {
		String strhql = "from DealInfo where dataDictByDealPayStyle.ddId=?";
		List<DealInfo> dealInfoList = super.query(page, strhql, dealPayStyle);
		return dealInfoList;
	}

	@Override
	public List<DealInfo> findByState(Page page, int dealState) {
		String strhql = "from DealInfo where dataDictByDealState.ddId=?";
		List<DealInfo> dealInfoList = super.query(page, strhql, dealState);
		return dealInfoList;
	}

}