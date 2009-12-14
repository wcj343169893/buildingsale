package com.zuxia.buildingsale.business.dao.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.zuxia.buildingsale.business.dao.IDataDictTypeDAO;
import com.zuxia.buildingsale.business.entity.DataDictType;
import com.zuxia.buildingsale.common.BaseDao;
import com.zuxia.buildingsale.common.Page;

/**
 * A data access object (DAO) providing persistence and search support for
 * DataDictType entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.zuxia.buildingsale.business.entity.DataDictType
 * @author MyEclipse Persistence Tools
 */

public class DataDictTypeDAOImpl extends BaseDao implements IDataDictTypeDAO {
	private static final Log log = LogFactory.getLog(DataDictTypeDAOImpl.class);
	// property constants
	public static final String DDT_TYPE = "ddtType";
	public static final String DDT_NAME = "ddtName";

	@Override
	public int delete(DataDictType obj) {
		try {
			super.delete(obj);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	@Override
	public DataDictType findByid(Integer id) {
		DataDictType dataDictType = (DataDictType) super.getByPk(
				DataDictType.class, id);
		return dataDictType;
	}

	@Override
	public int merge(DataDictType obj) {
		try {
			super.update(obj);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	@Override
	public int save(DataDictType obj) {
		try {
			super.insert(obj);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	@Override
	public List<DataDictType> findAll(Page page) {
		String strhql = "from DataDictType";
		List<DataDictType> dataDictTypeList = super.query(page, strhql);
		return dataDictTypeList;
	}

}