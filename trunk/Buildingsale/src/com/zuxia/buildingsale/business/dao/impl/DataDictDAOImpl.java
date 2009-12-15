package com.zuxia.buildingsale.business.dao.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.zuxia.buildingsale.business.dao.IDataDictDAO;
import com.zuxia.buildingsale.business.entity.DataDict;
import com.zuxia.buildingsale.common.BaseDao;
import com.zuxia.buildingsale.common.Page;

/**
 * A data access object (DAO) providing persistence and search support for
 * DataDict entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.zuxia.buildingsale.business.entity.DataDict
 * @author MyEclipse Persistence Tools
 */

public class DataDictDAOImpl extends BaseDao implements IDataDictDAO {
	private static final Log log = LogFactory.getLog(DataDictDAOImpl.class);
	// property constants
	public static final String DD_VALUE = "ddValue";
	public static final String DD_REMARK = "ddRemark";

	@Override
	public int delete(DataDict obj) {
		try {
			super.delete(obj);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	@Override
	public DataDict findByid(Integer id) {
		DataDict dataDict = (DataDict) super.getByPk(DataDict.class, id);
		return dataDict;
	}

	@Override
	public int merge(DataDict obj) {
		try {
			super.update(obj);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	@Override
	public int save(DataDict obj) {
		try {
			super.insert(obj);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	@Override
	public List<DataDict> findAll(Page page) {
		String strhql = "from DataDict";
		List<DataDict> dataDictList = super.query(page, strhql);
		return dataDictList;
	}

	@Override
	public List<DataDict> findByDictType(Page page, int dictType) {
		String strhql = "from DataDict where dataDictType.ddtId=?";
		List<DataDict> dataDictList = super.query(page, strhql, dictType);
		return dataDictList;
	}

}