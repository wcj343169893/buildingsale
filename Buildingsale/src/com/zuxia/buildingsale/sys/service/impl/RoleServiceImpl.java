/**
 *******************************************************************************
 * filename    : RoleServiceImpl.java
 * package     : com.zuxia.buildingsale.sys.service.impl
 * createdate  : 2009-12-13 ����06:23:13
 * project     : Buildingsale
 * @version    : 1.0
 * @author     : zcq100
 * (c) Copyright 2009 
 *	�����ܸ�Ҫ��
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
 * RoleServiceImpl��Ҫ˵��
 * @author zcq100
 */
public class RoleServiceImpl implements IRoleService {
	private IEmpRoleDao emproledao;
	
	@Override
	public int addEmployeeRole(int empid, int roleid) {
		if(isRole(empid, roleid)){
			System.out.println("��ϵ�Ѿ�����");
			return 0;
		}
		//����µ�EmpRole����
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
			//����Ա�������н�ɫ
			if(roleid==emprole.getRoleInfo().getRoleId())
				//ɾ��Ա����ɫ��Ϣ
				return emproledao.delete(emprole);
		}
		return 0;
	}

	@Override
	public boolean isRole(int empid, int roleid) {
		List<EmpRole> list=emproledao.findByEmpId(empid);
		//�����鹤�����н�ɫ
		for(EmpRole emprole:list){
			//�жϽ�ɫ�Ƿ����
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
