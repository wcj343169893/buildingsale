/**
 *******************************************************************************
 * filename    : EmployeeAction.java
 * package     : com.zuxia.buildingsale.sys.action
 * createdate  : 2009-12-17 上午10:21:01
 * project     : Buildingsale
 * @version    : 1.0
 * @author     : Administrator
 * (c) Copyright 2009 
 *	＜功能概要＞
 *  XXX
 *******************************************************************************
 */
package com.zuxia.buildingsale.sys.action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import com.zuxia.buildingsale.sys.entity.Employee;
import com.zuxia.buildingsale.sys.service.IEmployeeService;

/**
 * EmployeeAction概要说明
 * 
 *
 * @author Administrator
 */
public class EmployeeAction implements ModelDriven<Employee>,Preparable{
	private IEmployeeService employeeservice;
	private Employee emp;
	private int id;
	
	/**
	 * 
	 * view方法概述
	 * 查看员工信息
	 *
	 * @return
	 */
	public String view(){
		return "employee.view";
	}
	
	public String edit(){
		return "employee.input";
	}
	
	
	/**
	 * 
	 * update方法概述
	 * 修改员工信息
	 *
	 * @return
	 */
	public String update(){
		if(id!=0){
			employeeservice.updateEmployee(emp);
		}else{
			employeeservice.addEmployee(emp);
			return "employee.list";
		}
		return "employee.home";
	}
	
	/**
	 * 
	 * delete方法概述
	 * 删除员工信息
	 * @return
	 */
	public String delete(){
		employeeservice.deleteEmployee(id);
		return "employee.list";
	}

	@Override
	public void prepare() throws Exception {
		if(id!=0){
			emp=employeeservice.findEmployeeById(id);
		}else{
			emp=new Employee();
		}
	}

	public IEmployeeService getEmployeeservice() {
		return employeeservice;
	}

	public void setEmployeeservice(IEmployeeService employeeservice) {
		this.employeeservice = employeeservice;
	}

	@Override
	public Employee getModel() {
		return emp;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	


	
}
