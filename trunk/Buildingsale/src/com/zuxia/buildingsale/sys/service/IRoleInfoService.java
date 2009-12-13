/**
 *******************************************************************************
 * filename    : IRoleInfoService.java
 * package     : com.zuxia.buildingsale.sys.service
 * createdate  : 2009-12-13 下午05:27:52
 * project     : Buildingsale
 * @version    : 1.0
 * @author     : zcq100
 * (c) Copyright 2009 
 *	＜功能概要＞
 *  角色服务类接口
 *******************************************************************************
 */
package com.zuxia.buildingsale.sys.service;

import java.util.List;

import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.sys.entity.RoleInfo;

/**
 * IRoleInfoService概要说明
 * 
 *
 * @author zcq100
 */
public interface IRoleInfoService {
	
	/**
	 * 
	 * addRoleInfo方法概述
	 * 添加角色信息
	 *
	 * @param name 角色名字
	 * @param remark 备注信息
	 * @return 状态信息(1,成功,0,失败)
	 */
	int addRoleInfo(String name,String remark);
	/**
	 * 
	 * deleteRoleInfo方法概述
	 * 删除角色信息
	 * @param id	角色编号
	 * @return 状态信息(1,成功,0,失败)	
	 */
	int deleteRoleInfo(int id);
	/**
	 * 
	 * upodateRoleInfo方法概述
	 * 更新角色信息
	 * @param example	橘色信息
	 * @return  状态信息(1,成功,0,失败)	
	 */
	int updateRoleInfo(RoleInfo example);
	/**
	 * 
	 * findById方法概述
	 * 根据编号获得角色信息
	 * @param roleid 角色信息编号
	 * @return	角色信息对象
	 */
	RoleInfo findById(int roleid);
	/**
	 * 
	 * findAllRoleInfo方法概述
	 * 分页查找所有的角色信息 
	 * @param page	分页对象
	 * @return	角色信息的集合
	 */
	List<RoleInfo> findAllRoleInfo(Page page);
}
