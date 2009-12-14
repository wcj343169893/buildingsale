package com.zuxia.buildingsale.business.dao.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.zuxia.buildingsale.business.dao.IClientInfoDAO;
import com.zuxia.buildingsale.business.entity.ClientInfo;
import com.zuxia.buildingsale.common.BaseDao;
import com.zuxia.buildingsale.common.Page;

public class ClientInfoDAOImpl extends BaseDao implements IClientInfoDAO {
	private static final Log log = LogFactory.getLog(ClientInfoDAOImpl.class);
	// property constants
	public static final String CLIENT_NAME = "clientName";
	public static final String CLIENT_SEX = "clientSex";
	public static final String CLIENT_TELL1 = "clientTell1";
	public static final String CLIENT_TELL2 = "clientTell2";
	public static final String CLIENT_TELL3 = "clientTell3";
	public static final String CLIENT_EMAIL = "clientEmail";
	public static final String CLIENT_ADDRESS = "clientAddress";
	public static final String CLIENT_PID = "clientPid";
	public static final String CLIENT_REMARK = "clientRemark";

	@Override
	public int delete(ClientInfo obj) {
		try {
			super.delete(obj);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	@Override
	public ClientInfo findByid(Integer id) {
		ClientInfo clientInfo = (ClientInfo) super
				.getByPk(ClientInfo.class, id);
		return clientInfo;
	}

	@Override
	public int merge(ClientInfo obj) {
		try {
			super.update(obj);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	@Override
	public int save(ClientInfo obj) {
		try {
			super.insert(obj);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	@Override
	public List<ClientInfo> findAll(Page page) {
		List<ClientInfo> clientInfoList = query(page, "from ClientInfo");
		return clientInfoList;
	}

	@Override
	public List<ClientInfo> findByEmpId(Page page, int empId) {
		String strhql = "from ClientInfo where employee.empId=?";
		List<ClientInfo> clientInfoList = query(page, strhql, empId);
		return clientInfoList;
	}

	@Override
	public List<ClientInfo> findByServiceState(Page page, int clientServiceState) {
		String strhql = "from ClientInfo where dataDict.ddId=?";
		List<ClientInfo> clientInfoList = query(page, strhql,
				clientServiceState);
		return clientInfoList;
	}

}