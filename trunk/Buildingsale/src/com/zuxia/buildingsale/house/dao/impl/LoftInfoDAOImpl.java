package com.zuxia.buildingsale.house.dao.impl;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zuxia.buildingsale.common.BaseDao;
import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.house.dao.ILoftInfoDAO;
import com.zuxia.buildingsale.house.entity.LoftInfo;

/**
 * A data access object (DAO) providing persistence and search support for
 * LoftInfo entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.zuxia.buildingsale.house.entity.LoftInfo
 * @author MyEclipse Persistence Tools
 */

public class LoftInfoDAOImpl extends BaseDao implements ILoftInfoDAO {
	private static final Log log = LogFactory.getLog(LoftInfoDAOImpl.class);
	// property constants
	public static final String LOFT_NO = "loftNo";
	public static final String LOFT_NAME = "loftName";
	public static final String LOFT_ZONE = "loftZone";
	public static final String LOFT_ADDRESS = "loftAddress";
	public static final String LOFT_PRICE = "loftPrice";
	public static final String LLOFT_CAPACITY = "lloftCapacity";
	public static final String LOFT_GREEN = "loftGreen";
	public static final String LOFT_TRAFFIC = "loftTraffic";
	public static final String LOFT_FACILITY = "loftFacility";
	public static final String LOFT_REMARK = "loftRemark";

	/**
	 * （重写方法） delete方法概述 删除
	 * 
	 * 
	 * @param obj
	 * @return
	 */
	@Override
	public int delete(LoftInfo obj) {
		try {
			super.delete(obj);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	/**
	 * （重写方法） findByid方法概述 根据楼盘id查询
	 * 
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public LoftInfo findByid(Integer id) {
		LoftInfo loftInfo=(LoftInfo) getByPk(LoftInfo.class, id);
		return loftInfo;
	}

	/**
	 * （重写方法） merge方法概述 修改
	 * 
	 * 
	 * @param obj
	 * @return
	 */
	@Override
	public int merge(LoftInfo obj) {
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
	public int save(LoftInfo obj) {
		try {
			super.insert(obj);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	/**
	 * （重写方法） findByBuildType方法概述 根据建筑类型查询
	 * 
	 * 
	 * @param page
	 * @param loftBuildType
	 *            建筑类型
	 * @return
	 */
	@Override
	public List<LoftInfo> findByBuildType(Page page, int loftBuildType) {
		String strhql = "from LoftInfo where dataDictByLoftBuildType.ddId=?";
		List<LoftInfo> loftInfoList = query(page, strhql, loftBuildType);
		return loftInfoList;
	}

	/**
	 * （重写方法） findByComtyType方法概述 物业类型查询
	 * 
	 * 
	 * @param page
	 * @param loftComtyType
	 *            物业类型
	 * @return
	 */
	@Override
	public List<LoftInfo> findByComtyType(Page page, int loftComtyType) {
		String strhql = "from LoftInfo where dataDictByLoftComtyType.ddId=?";
		List<LoftInfo> loftInfoList = query(page, strhql, loftComtyType);
		return loftInfoList;
	}

	/**
	 * （重写方法） findAll方法概述 查询所有
	 * 
	 * 
	 * @param page
	 * @return
	 */
	@Override
	public List<LoftInfo> findAll(Page page) {
		String strhql = "from LoftInfo";
		List<LoftInfo> loftInfoList = query(page, strhql);
		return loftInfoList;
	}

}