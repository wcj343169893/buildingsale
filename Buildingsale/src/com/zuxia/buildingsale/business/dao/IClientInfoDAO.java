package com.zuxia.buildingsale.business.dao;

import java.util.List;

import com.zuxia.buildingsale.business.entity.ClientInfo;
import com.zuxia.buildingsale.common.IBaseCRUD;
import com.zuxia.buildingsale.common.Page;

public interface IClientInfoDAO extends IBaseCRUD<ClientInfo> {
	/**
	 * findByEmpId�������� ����Ա��id��ѯ�ͻ���Ϣ
	 * 
	 *@param page
	 * @param empId
	 *            �ͻ���Ϣ
	 * @return
	 */
	public List<ClientInfo> findByEmpId(Page page, int empId);

	/**
	 * findAll�������� ��ѯ����
	 * 
	 * 
	 * @param page
	 * @return
	 */
	public List<ClientInfo> findAll(Page page);

	/**
	 * findByServiceState�������� ���ݿͻ���״̬��ѯ
	 * 
	 * 
	 * @param page
	 * @param clientServiceState
	 *            �ͻ���״̬��ѯid
	 * @return
	 */
	public List<ClientInfo> findByServiceState(Page page, int clientServiceState);
}
