/**
 *******************************************************************************
 * filename    : EmployeeAction.java
 * package     : com.zuxia.buildingsale.sys.action
 * createdate  : 2009-12-17 ����09:15:14
 * project     : Buildingsale
 * @version    : 1.0
 * @author     : zcq100
 * (c) Copyright 2009 
 *	�����ܸ�Ҫ��
 *  XXX
 *******************************************************************************
 */
package com.zuxia.buildingsale.sys.action;

import java.util.List;

import com.zuxia.buildingsale.business.entity.DataDict;
import com.zuxia.buildingsale.common.MyAction;
import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.house.entity.ShopInfo;
import com.zuxia.buildingsale.sys.entity.Employee;
import com.zuxia.buildingsale.sys.service.IEmployeeService;

/**
 * EmployeeAction��Ҫ˵��
 * ����������ѯԱ����Ϣ
 * 
 * @author zcq100
 */
public class EmployeeSearchAction extends MyAction {
	/**
	 * serialVersionUID���Ը���
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IEmployeeService employeeservice;
	private String name;
	private String account;
	private int sex;
	private String address;
	private int state;
	private int shopid;

	@Override
	public String execute() throws Exception {
		init();
		Employee emp = new Employee();
		//��������
		if(null!=name&&!name.equals("")){
			emp.setEmpName(name);
		}
		
		//�����˺�
		if(null!=account&&!account.equals("")){
			emp.setEmpAccount(account);
		}
		//���õ�ַ
		if(null!=address&&!address.equals("")){
			emp.setEmpAddress(address);
		}
		//�����Ա�
		if(sex==1||sex==0){
			emp.setEmpSex(sex);
		}
		//���õ���
		if(shopid!=0){
		ShopInfo shop = new ShopInfo();
		shop.setShopId(shopid);
		emp.setShopInfo(shop);
		}
		//����״̬
		if (state ==13||state==14) {
			DataDict dd = new DataDict();
			dd.setDdId(state);
			emp.setEmpState(dd);
		}
		Page page=new Page();
		System.out.println(emp);
		List<Employee> list=employeeservice.findByExample(page, emp);
		request.setAttribute("employeelist", list);
		request.setAttribute("page", page);
		System.out.println(page);
		return SUCCESS;
	}

	public IEmployeeService getEmployeeservice() {
		return employeeservice;
	}

	public void setEmployeeservice(IEmployeeService employeeservice) {
		this.employeeservice = employeeservice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getShopid() {
		return shopid;
	}

	public void setShopid(int shopid) {
		this.shopid = shopid;
	}

}
