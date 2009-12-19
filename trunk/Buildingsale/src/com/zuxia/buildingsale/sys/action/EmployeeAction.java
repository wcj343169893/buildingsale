/**
 *******************************************************************************
 * filename    : EmployeeAction.java
 * package     : com.zuxia.buildingsale.sys.action
 * createdate  : 2009-12-17 ����10:21:01
 * project     : Buildingsale
 * @version    : 1.0
 * @author     : Administrator
 * (c) Copyright 2009 
 *	�����ܸ�Ҫ��
 *  XXX
 *******************************************************************************
 */
package com.zuxia.buildingsale.sys.action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import com.zuxia.buildingsale.sys.entity.Employee;
import com.zuxia.buildingsale.sys.service.IEmployeeService;

/**
 * EmployeeAction��Ҫ˵��
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
	 * view��������
	 * �鿴Ա����Ϣ
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
	 * update��������
	 * �޸�Ա����Ϣ
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
	 * delete��������
	 * ɾ��Ա����Ϣ
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
