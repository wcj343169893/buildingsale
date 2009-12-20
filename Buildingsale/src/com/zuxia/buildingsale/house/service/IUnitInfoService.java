/**
 *******************************************************************************
 * IUnitInfoService.java
 * com.zuxia.buildingsale.house.service
 * (c) Copyright 2009 
 *	2009-12-12
 *＜所属工程名＞
 *  Buildingsale
 *＜功能概要＞
 *  XXX
 *＜作者＞
 *  zcq100 chaojun
 *******************************************************************************
 */
package com.zuxia.buildingsale.house.service;

import java.util.List;

import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.house.dto.LookUnitDTO;
import com.zuxia.buildingsale.house.entity.UnitInfo;
import com.zuxia.buildingsale.house.form.UnitInfoForm;
import com.zuxia.buildingsale.sys.entity.Employee;

/**
 * IUnitInfoService概要说明
 * 
 * 
 * @author zcq100 chaojun
 */
public interface IUnitInfoService {
	/**
	 * findByLoft方法概述 查询单元信息
	 * 
	 * 
	 * @param page
	 *            分页信息
	 * @param loftId
	 *            楼盘id
	 * @return List
	 */
	public List<UnitInfo> findByLoft(Page page, int loftId);

	/**
	 * findAll方法概述 查询全部单元信息
	 * 
	 * 
	 * @param page
	 *            分页信息
	 * @return List
	 */
	public List<UnitInfo> findAll(Page page);

	public int addUnitInfo(UnitInfoForm unitInfoForm);

	public int editUnitInfo(UnitInfoForm unitInfoForm);

	public int deleteUnitInfo(int unitInfoId);

	public UnitInfo findById(int unitId);

	public LookUnitDTO findUnitDTO(int unitId);
}
