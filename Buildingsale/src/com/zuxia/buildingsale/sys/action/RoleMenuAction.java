/**
 *******************************************************************************
 * filename    : RoleMenuAction.java
 * package     : com.zuxia.buildingsale.sys.action
 * createdate  : 2009-12-15 上午11:03:39
 * project     : Buildingsale
 * @version    : 1.0
 * @author     : Administrator
 * (c) Copyright 2009 
 *	＜功能概要＞
 *  XXX
 *******************************************************************************
 */
package com.zuxia.buildingsale.sys.action;

import org.apache.struts2.ServletActionContext;

import com.zuxia.buildingsale.sys.service.IMenuService;

/**
 * RoleMenuAction概要说明
 * 
 *
 * @author Administrator
 */
public class RoleMenuAction {
	private IMenuService menuservice;
	
	public String list(){
		ServletActionContext.getRequest().setAttribute("list",menuservice.findAllRoleMenu());
		return "view";
	}

	public IMenuService getMenuservice() {
		return menuservice;
	}

	public void setMenuservice(IMenuService menuservice) {
		this.menuservice = menuservice;
	}
	
	
}
