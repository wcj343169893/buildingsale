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

import com.zuxia.buildingsale.sys.dao.IEmpRoleDao;
import com.zuxia.buildingsale.sys.entity.EmpRole;
import com.zuxia.buildingsale.sys.entity.Employee;
import com.zuxia.buildingsale.sys.entity.RoleInfo;
import com.zuxia.buildingsale.sys.service.IRoleService;

/**
 * RoleServiceImpl概要说明
 * @author zcq100
 */
public class RoleServiceImpl implements IRoleService {
	private IEmpRoleDao emproledao;
	
	@Override
	public int addEmployeeRole(int empid, int roleid) {
		if(isRole(empid, roleid)){
			System.out.println("关系已经存在");
			return 0;
		}
		//添加新的EmpRole对象
		EmpRole emprole=new EmpRole();
		Employee emp=new Employee();
		emp.setEmpId(empid);
		emprole.setEmployee(emp);
		RoleInfo roleinfo=new RoleInfo();
		roleinfo.setRoleId(roleid);
		emprole.setRoleInfo(roleinfo);
		return emproledao.save(emprole);
	}

	@Override
	public int deleleEmployeeRole(int empid, int roleid) {
		List<EmpRole> list=emproledao.findByEmpId(empid);
		for(EmpRole emprole:list){
			//查找员工的所有角色
			if(roleid==emprole.getRoleInfo().getRoleId())
				//删除员工角色信息
				return emproledao.delete(emprole);
		}
		return 0;
	}

	@Override
	public boolean isRole(int empid, int roleid) {
		List<EmpRole> list=emproledao.findByEmpId(empid);
		//查找验工的所有角色
		for(EmpRole emprole:list){
			//判断角色是否存在
			if(roleid==emprole.getRoleInfo().getRoleId())
				return true;
		}
		return false;
	}

	public IEmpRoleDao getEmproledao() {
		return emproledao;
	}

	public void setEmproledao(IEmpRoleDao emproledao) {
		this.emproledao = emproledao;
	}

	
}
