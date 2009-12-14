package com.zuxia.buildingsale.business.dao;

import java.util.List;

import com.zuxia.buildingsale.business.entity.DataDict;
import com.zuxia.buildingsale.common.IBaseCRUD;
import com.zuxia.buildingsale.common.Page;

public interface IDataDictDAO extends IBaseCRUD<DataDict> {
	/**
	 * findByDictType方法概述 根据字典类型查询字典
	 * 
	 *
	 * @param page
	 * @param dictType 字典类型
	 * @return
	 */
	public List<DataDict> findByDictType(Page page, int dictType);
	/**
	 * findAll方法概述 查询所有的字典信息
	 * 
	 *
	 * @param page
	 * @return
	 */
	public List<DataDict> findAll(Page page);
}
