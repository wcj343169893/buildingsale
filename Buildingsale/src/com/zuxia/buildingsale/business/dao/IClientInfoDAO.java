package com.zuxia.buildingsale.business.dao;

import java.util.List;

import com.zuxia.buildingsale.business.entity.ClientInfo;
import com.zuxia.buildingsale.common.IBaseCRUD;
import com.zuxia.buildingsale.common.Page;

public interface IClientInfoDAO extends IBaseCRUD<ClientInfo> {
	/**
	 * findByEmpId方法概述 根据员工id查询客户信息
	 * 
	 *@param page
	 * @param empId
	 *            客户信息
	 * @return
	 */
	public List<ClientInfo> findByEmpId(Page page, int empId);

	/**
	 * findAll方法概述 查询所有
	 * 
	 * 
	 * @param page
	 * @return
	 */
	public List<ClientInfo> findAll(Page page);

	/**
	 * findByServiceState方法概述 根据客户的状态查询
	 * 
	 * 
	 * @param page
	 * @param clientServiceState
	 *            客户的状态查询id
	 * @return
	 */
	public List<ClientInfo> findByServiceState(Page page, int clientServiceState);
}
