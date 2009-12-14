package com.zuxia.buildingsale.business.dao;

import java.util.List;

import com.zuxia.buildingsale.business.entity.DataDict;
import com.zuxia.buildingsale.common.IBaseCRUD;
import com.zuxia.buildingsale.common.Page;

public interface IDataDictDAO extends IBaseCRUD<DataDict> {
	/**
	 * findByDictType�������� �����ֵ����Ͳ�ѯ�ֵ�
	 * 
	 *
	 * @param page
	 * @param dictType �ֵ�����
	 * @return
	 */
	public List<DataDict> findByDictType(Page page, int dictType);
	/**
	 * findAll�������� ��ѯ���е��ֵ���Ϣ
	 * 
	 *
	 * @param page
	 * @return
	 */
	public List<DataDict> findAll(Page page);
}
