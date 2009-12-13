/**
 *******************************************************************************
 * filename    : RoleInfoServiceImpl.java
 * package     : com.zuxia.buildingsale.sys.service.impl
 * createdate  : 2009-12-13 下午06:22:30
 * project     : Buildingsale
 * @version    : 1.0
 * @author     : Administrator
 * (c) Copyright 2009 
 *	＜功能概要＞
 *  XXX
 *******************************************************************************
 */
package com.zuxia.buildingsale.sys.service.impl;

import java.util.List;

import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.sys.dao.IRoleInfoDao;
import com.zuxia.buildingsale.sys.entity.RoleInfo;
import com.zuxia.buildingsale.sys.service.IRoleInfoService;

/**
 * RoleInfoServiceImpl概要说明
 * 
 *
 * @author Administrator
 */
public class RoleInfoServiceImpl implements IRoleInfoService {
	private IRoleInfoDao roleinfodao;
	
	@Override
	public int addRoleInfo(String name, String remark) {
		RoleInfo roleinfo=new RoleInfo();
		roleinfo.setRoleName(name);
		roleinfo.setRoleRemark(remark);
		return roleinfodao.save(roleinfo);
	}

	@Override
	public int deleteRoleInfo(int id) {
		RoleInfo roleinfo=roleinfodao.findByid(id);
		return roleinfodao.delete(roleinfo);
	}

	@Override
	public List<RoleInfo> findAllRoleInfo(Page page) {
		return roleinfodao.findAll(page);
	}

	@Override
	public RoleInfo findById(int roleid) {
		return roleinfodao.findByid(roleid);
	}

	@Override
	public int updateRoleInfo(RoleInfo example) {
		return roleinfodao.merge(example);
	}

	public IRoleInfoDao getRoleinfodao() {
		return roleinfodao;
	}

	public void setRoleinfodao(IRoleInfoDao roleinfodao) {
		this.roleinfodao = roleinfodao;
	}

	
}
