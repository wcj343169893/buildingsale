/**
 *******************************************************************************
 * filename    : EmployeeServiceImpl.java
 * package     : com.zuxia.buildingsale.sys.service.impl
 * createdate  : 2009-12-13 下午06:21:02
 * project     : Buildingsale
 * @version    : 1.0
 * @author     : Administrator
 * (c) Copyright 2009 
 *	＜功能概要＞
 * 员工服务的实现类
 *******************************************************************************
 */
package com.zuxia.buildingsale.sys.service.impl;

import java.util.List;
import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.sys.dao.IEmployeeDao;
import com.zuxia.buildingsale.sys.entity.Employee;
import com.zuxia.buildingsale.sys.entity.MenuInfo;
import com.zuxia.buildingsale.sys.entity.RoleInfo;
import com.zuxia.buildingsale.sys.service.IEmployeeService;

/**
 * EmployeeServiceImpl概要说明
 * 
 *
 * @author Administrator
 */
public class EmployeeServiceImpl implements IEmployeeService {
	private IEmployeeDao employeedao;
	
	@Override
	public int addEmployee(Employee emp) {
		int result=employeedao.save(emp);
		return result;
	}

	@Override
	public int deleteEmployee(int id) {
		Employee emp=employeedao.findByid(id);
		return employeedao.delete(emp);
	}

	@Override
	public List<Employee> findAllEmployee(Page page) {
		return employeedao.findAll(page);
	}

	@Override
	public List<Employee> findByExample(Page page, Employee emp) {
		return employeedao.findEmployeeByExample(page, emp);
	}

	/**
	 *
	 */
	@Override
	public Employee findByEmployeeAccount(String account, String password) {
		Employee emp=new Employee();
		emp.setEmpAccount(account);
		emp.setEmpPass(password);
		List<Employee> list=findByExample(new Page(), emp);
		if(list.size()>0)
			return list.get(0);
		return null;
	}

	@Override
	public Employee findEmployeeById(int id) {
		return employeedao.findByid(id);
	}

	@Override
	public int updateEmployee(Employee emp) {
		return employeedao.merge(emp);
	}

	public IEmployeeDao getEmployeedao() {
		return employeedao;
	}

	public void setEmployeedao(IEmployeeDao employeedao) {
		this.employeedao = employeedao;
	}

	@Override
	public boolean isExistsAccount(String account) {
		return employeedao.isExistAccount(account);
	}

	@Override
	public boolean updateMenu(int empid, int[] menuids) {
		Employee emp=employeedao.findByid(empid);
		emp.getMenus().clear();
		for(int menuid:menuids){
			MenuInfo mi=new MenuInfo();
			mi.setMenuId(menuid);
			emp.getMenus().add(mi);
		}
		if(1==employeedao.merge(emp))
			return true;
		return false;
	}

	@Override
	public boolean updateRole(int empid, int[] roles) {
		Employee emp=employeedao.findByid(empid);
		emp.getRoles().clear();
		for(int roleid:roles){
			RoleInfo ri=new RoleInfo();
			ri.setRoleId(roleid);
			emp.getRoles().add(ri);
		}
		if(1==employeedao.merge(emp))
			return true;
		return false;
	}

	
}
