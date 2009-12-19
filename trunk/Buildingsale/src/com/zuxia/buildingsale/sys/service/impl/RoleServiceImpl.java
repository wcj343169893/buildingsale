/**
 *******************************************************************************
 * filename    : RoleServiceImpl.java
 * package     : com.zuxia.buildingsale.sys.service.impl
 * createdate  : 2009-12-13 下午06:23:13
 * project     : Buildingsale
 * @version    : 1.0
 * @author     : zcq100
 * (c) Copyright 2009 
 *	＜功能概要＞
 *  XXX
 *******************************************************************************
 */
package com.zuxia.buildingsale.sys.service.impl;
import java.util.List;

import com.zuxia.buildingsale.sys.dao.IRoleInfoDao;
import com.zuxia.buildingsale.sys.entity.MenuInfo;
import com.zuxia.buildingsale.sys.entity.RoleInfo;
import com.zuxia.buildingsale.sys.service.IRoleService;

/**
 * RoleServiceImpl概要说明
 * @author zcq100
 */
public class RoleServiceImpl implements IRoleService {
	private IRoleInfoDao roleinfodao;

	public IRoleInfoDao getRoleinfodao() {
		return roleinfodao;
	}

	public void setRoleinfodao(IRoleInfoDao roleinfodao) {
		this.roleinfodao = roleinfodao;
	}

	@Override
	public boolean addRole(RoleInfo role) {
		return roleinfodao.save(role)==1?true:false;
	}

	@Override
	public boolean deleteRole(int id) {
		RoleInfo role=roleinfodao.findByid(id);
		return roleinfodao.delete(role)==1?true:false;
	}

	@Override
	public List<RoleInfo> findAll() {
		return roleinfodao.findAll();
	}

	@Override
	public boolean updateMenu(int roleid, int[] menuids) {
		RoleInfo role=roleinfodao.findByid(roleid);
		role.getEmployees().clear();
		for(int menuid:menuids){
			MenuInfo mi=new MenuInfo();
			mi.setMenuId(menuid);
			role.getMenus().add(mi);
		}
		if(1==roleinfodao.merge(role))
			return true;
		return false;
	}
	
	
}
