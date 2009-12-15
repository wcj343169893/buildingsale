/**
 *******************************************************************************
 * filename    : MenuServiceImpl.java
 * package     : com.zuxia.buildingsale.sys.service.impl
 * createdate  : 2009-12-13 下午06:22:02
 * project     : Buildingsale
 * @version    : 1.0
 * @author     : zcq100
 * (c) Copyright 2009 
 *	＜功能概要＞
 * 该类实现了用户和角色的不同菜单管理功能
 *******************************************************************************
 */
package com.zuxia.buildingsale.sys.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.zuxia.buildingsale.sys.dao.IRoleInfoDao;
import com.zuxia.buildingsale.sys.dto.RoleMenuDto;
import com.zuxia.buildingsale.sys.entity.Employee;
import com.zuxia.buildingsale.sys.entity.MenuInfo;
import com.zuxia.buildingsale.sys.entity.RoleInfo;
import com.zuxia.buildingsale.sys.service.IMenuService;

/**
 * MenuServiceImpl概要说明
 * @author zcq100
 */
public class MenuServiceImpl implements IMenuService {
	private IRoleInfoDao roleinfodao;

	@Override
	public int addEmployeeMenu(int empid, int[] menuid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addRoleMenu(int roleid, int[] menuid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<RoleMenuDto> findAllRoleMenu() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MenuInfo> findByEmpId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MenuInfo> findByRoleId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findEmployeeByMenuId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RoleInfo> findRoleByMenuId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasEmpMenu(int empid, int menuid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasRoleMenu(int roleid, int menuid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int updateEmpMenu(int empid, int[] menuIds) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateRoleMenu(int roleid, int[] menuIds) {
		// TODO Auto-generated method stub
		return 0;
	}

}
