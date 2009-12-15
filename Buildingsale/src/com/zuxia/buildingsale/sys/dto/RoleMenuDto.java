/**
 *******************************************************************************
 * filename    : RoleMenuDto.java
 * package     : com.zuxia.buildingsale.sys.dto
 * createdate  : 2009-12-14 ����04:39:29
 * project     : Buildingsale
 * @version    : 1.0
 * @author     : zcq100
 * (c) Copyright 2009 
 *	�����ܸ�Ҫ��
 * ��ɫ�˵�Ȩ��DTO����
 *******************************************************************************
 */
package com.zuxia.buildingsale.sys.dto;

import java.util.List;

import com.zuxia.buildingsale.sys.entity.MenuInfo;
import com.zuxia.buildingsale.sys.entity.RoleInfo;

/**
 * RoleMenuDto��Ҫ˵��
 * 
 *
 * @author zcq100
 */
public class RoleMenuDto {
	RoleInfo role;
	List<MenuInfo> menu;
	
	
	public RoleInfo getRole() {
		return role;
	}
	public void setRole(RoleInfo role) {
		this.role = role;
	}
	public List<MenuInfo> getMenu() {
		return menu;
	}
	public void setMenu(List<MenuInfo> menu) {
		this.menu = menu;
	}
	@Override
	public String toString() {
		return "RoleMenuDto [menu=" + menu + ", role=" + role + "]";
	}
	
}
