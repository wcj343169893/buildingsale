package com.zuxia.buildingsale.business.dao;

import java.util.List;

import com.zuxia.buildingsale.business.entity.DataDictType;
import com.zuxia.buildingsale.common.IBaseCRUD;
import com.zuxia.buildingsale.common.Page;

public interface IDataDictTypeDAO extends IBaseCRUD<DataDictType> {
	/**
	 * findAll�������� ��ѯ���е��ֵ�����
	 * 
	 * 
	 * @param page
	 * @return
	 */
	public List<DataDictType> findAll(Page page);
}
