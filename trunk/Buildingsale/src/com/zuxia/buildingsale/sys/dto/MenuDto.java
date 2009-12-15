/**
 *******************************************************************************
 * filename    : MenuDto.java
 * package     : com.zuxia.buildingsale.sys.dto
 * createdate  : 2009-12-14 下午03:15:16
 * project     : Buildingsale
 * @version    : 1.0
 * @author     : Administrator
 * (c) Copyright 2009 
 *	＜功能概要＞
 *  XXX
 *******************************************************************************
 */
package com.zuxia.buildingsale.sys.dto;

import java.util.List;

import com.zuxia.buildingsale.sys.entity.MenuInfo;

/**
 * MenuDto概要说明
 * 
 *
 * @author Administrator
 */
public class MenuDto {
	MenuInfo level1;   //一级菜单
	List<MenuInfo> level2;//子级菜单
	public MenuInfo getLevel1() {
		return level1;
	}
	public void setLevel1(MenuInfo level1) {
		this.level1 = level1;
	}
	public List<MenuInfo> getLevel2() {
		return level2;
	}
	public void setLevel2(List<MenuInfo> level2) {
		this.level2 = level2;
	}
	
}
