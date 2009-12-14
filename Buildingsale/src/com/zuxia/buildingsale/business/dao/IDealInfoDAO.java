package com.zuxia.buildingsale.business.dao;

import java.util.List;

import com.zuxia.buildingsale.business.entity.DealInfo;
import com.zuxia.buildingsale.common.IBaseCRUD;
import com.zuxia.buildingsale.common.Page;

public interface IDealInfoDAO extends IBaseCRUD<DealInfo> {
	/**
	 * findAll�������� ��ѯ����
	 * 
	 *
	 * @param page
	 * @return
	 */
	public List<DealInfo> findAll(Page page);

	/**
	 * findByEmpId�������� ����Ա��id��ѯ
	 * 
	 *
	 * @param page
	 * @param empId
	 * @return
	 */
	public List<DealInfo> findByEmpId(Page page, int empId);

	/** 
	 * findByHouseId�������� ���ݷ���id��ѯ
	 * 
	 *
	 * @param page
	 * @param houseId
	 * @return
	 */
	public List<DealInfo> findByHouseId(Page page, int houseId);

	/**
	 * findByClientId�������� ���ݿͻ�id��ѯ
	 * 
	 *
	 * @param page
	 * @param clientId
	 * @return
	 */
	public List<DealInfo> findByClientId(Page page, int clientId);

	/**
	 * findByPayStyle�������� ���ݸ��ʽ��ѯ
	 * 
	 *
	 * @param page
	 * @param dealPayStyle
	 * @return
	 */
	public List<DealInfo> findByPayStyle(Page page, int dealPayStyle);

	/**
	 * findByState�������� ���ݽ���״̬��ѯ
	 * 
	 *
	 * @param page
	 * @param dealState
	 * @return
	 */
	public List<DealInfo> findByState(Page page, int dealState);
}
