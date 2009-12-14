package com.zuxia.buildingsale.business.dao;

import java.util.List;

import com.zuxia.buildingsale.business.entity.DealInfo;
import com.zuxia.buildingsale.common.IBaseCRUD;
import com.zuxia.buildingsale.common.Page;

public interface IDealInfoDAO extends IBaseCRUD<DealInfo> {
	/**
	 * findAll方法概述 查询所有
	 * 
	 *
	 * @param page
	 * @return
	 */
	public List<DealInfo> findAll(Page page);

	/**
	 * findByEmpId方法概述 根据员工id查询
	 * 
	 *
	 * @param page
	 * @param empId
	 * @return
	 */
	public List<DealInfo> findByEmpId(Page page, int empId);

	/** 
	 * findByHouseId方法概述 根据房屋id查询
	 * 
	 *
	 * @param page
	 * @param houseId
	 * @return
	 */
	public List<DealInfo> findByHouseId(Page page, int houseId);

	/**
	 * findByClientId方法概述 根据客户id查询
	 * 
	 *
	 * @param page
	 * @param clientId
	 * @return
	 */
	public List<DealInfo> findByClientId(Page page, int clientId);

	/**
	 * findByPayStyle方法概述 根据付款方式查询
	 * 
	 *
	 * @param page
	 * @param dealPayStyle
	 * @return
	 */
	public List<DealInfo> findByPayStyle(Page page, int dealPayStyle);

	/**
	 * findByState方法概述 根据交易状态查询
	 * 
	 *
	 * @param page
	 * @param dealState
	 * @return
	 */
	public List<DealInfo> findByState(Page page, int dealState);
}
