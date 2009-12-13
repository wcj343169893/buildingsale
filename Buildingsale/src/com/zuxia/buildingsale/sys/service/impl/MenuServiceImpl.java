/**
 *******************************************************************************
 * filename    : MenuServiceImpl.java
 * package     : com.zuxia.buildingsale.sys.service.impl
 * createdate  : 2009-12-13 ����06:22:02
 * project     : Buildingsale
 * @version    : 1.0
 * @author     : Administrator
 * (c) Copyright 2009 
 *	�����ܸ�Ҫ��
 *  XXX
 *******************************************************************************
 */
package com.zuxia.buildingsale.sys.service.impl;

import java.util.List;

import com.zuxia.buildingsale.sys.dao.IRoleMenuDao;
import com.zuxia.buildingsale.sys.entity.Employee;
import com.zuxia.buildingsale.sys.entity.MenuInfo;
import com.zuxia.buildingsale.sys.entity.RoleInfo;
import com.zuxia.buildingsale.sys.entity.RoleMenu;
import com.zuxia.buildingsale.sys.service.IMenuService;

/**
 * MenuServiceImpl��Ҫ˵��
 * 
 *
 * @author Administrator
 */
public class MenuServiceImpl implements IMenuService {
	private IRoleMenuDao rolemenudao;
	
	@Override
	public int addEmployeeMenu(int empid, int[] menuid) {
		return 0;
	}

	@Override
	public int addRoleMenu(int roleid, int[] menuid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteEmpMenu(int[] empmenuId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteRoleMenu(int[] roleMenuId) {
		// TODO Auto-generated method stub
		return 0;
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
		//�õ���ɫ���еĲ˵���Ϣ
		List<RoleMenu> list=rolemenudao.findByRoleId(roleid);
		for(RoleMenu rolemenu:list){
			//���ҽ�ɫָ���Ĳ˵��Ƿ����
			if(menuid==rolemenu.getMenuInfo().getMenuId())
				return true;
		}
		return false;
	}

	public IRoleMenuDao getRolemenudao() {
		return rolemenudao;
	}

	public void setRolemenudao(IRoleMenuDao rolemenudao) {
		this.rolemenudao = rolemenudao;
	}

	
	
}
