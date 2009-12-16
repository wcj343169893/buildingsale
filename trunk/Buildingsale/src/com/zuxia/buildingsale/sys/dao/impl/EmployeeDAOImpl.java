package com.zuxia.buildingsale.sys.dao.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.zuxia.buildingsale.common.BaseDao;
import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.sys.dao.IEmployeeDao;
import com.zuxia.buildingsale.sys.entity.Employee;


/**
 * 
 * EmployeeDAO概要说明
 * 
 *
 * @author Administrator
 */
public  class EmployeeDAOImpl extends BaseDao implements IEmployeeDao{
	private static final Log log = LogFactory.getLog(EmployeeDAOImpl.class);
	// property constants
	public static final String EMP_NO = "empNo";
	public static final String EMP_ACCOUNT = "empAccount";
	public static final String EMP_PASS = "empPass";
	public static final String EMP_NAME = "empName";
	public static final String EMP_PID = "empPid";
	public static final String EMP_SEX = "empSex";
	public static final String EMP_TELL = "empTell";
	public static final String EMP_ADDRESS = "empAddress";
	public static final String EMP_EMAIL = "empEmail";
	public static final String EMP_REMARK = "empRemark";
	/** 
	 * （重写方法）
	 * findAll方法概述
	 * 
	 *
	 * @param page
	 * @return
	 */
	@Override
	public List<Employee> findAll(Page page) {
		return query(page, "from Employee modle1 order by modle1.empId asc");
	}
	/** 
	 * （重写方法）
	 * delete方法概述
	 * 
	 *
	 * @param obj
	 * @return
	 */
	@Override
	public int delete(Employee obj) {
		try {
			super.delete(obj);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}
	/** 
	 * （重写方法）
	 * findByid方法概述
	 * 
	 *
	 * @param id
	 * @return
	 */
	@Override
	public Employee findByid(Integer id) {
		return (Employee) getByPk(Employee.class, id);
	}
	/** 
	 * （重写方法）
	 * merge方法概述
	 * 
	 *
	 * @param obj
	 * @return
	 */
	@Override
	public int merge(Employee obj) {
		try {
			update(obj);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}
	/** 
	 * （重写方法）
	 * save方法概述
	 * 
	 *
	 * @param obj
	 * @return
	 */
	@Override
	public int save(Employee obj) {
		try {
			insert(obj);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}
	/** 
	 * （重写方法）
	 * findByEmployeeAccount方法概述
	 * 
	 *
	 * @param account
	 * @return
	 */
	@Override
	public Employee findByEmployeeAccount(String account) {
		List list=find("from Employee where empAccount=?", account);
		if(list.size()>0)
			return (Employee) list.get(0);
		return null;
	}
	/** 
	 * （重写方法）
	 * findEmployeeByExample方法概述<br/>
	 * 根据Employee的信息分页查询 
	 * @param page 分页对象
	 * @param emp	参考对象
	 * @return	查询到的Employee对象的集合
	 */
	@Override
	public List<Employee> findEmployeeByExample(Page page, Employee emp) {
		StringBuffer hql=new StringBuffer("from Employee model where 1=1 ");
		if(emp.getEmpAccount()!=null){
			hql.append("and model.empAccount like '%"+emp.getEmpAccount()+"%'");
		}
		if(emp.getEmpName()!=null){
			hql.append("and model.empName like '%"+emp.getEmpName()+"%'");
		}
		if(emp.getEmpNo()!=null){
			hql.append("and model.empNo like '%"+emp.getEmpNo()+"%'");
		}
		if(emp.getEmpSex()!=null){
			hql.append("and model.empSex ="+emp.getEmpSex());
		}
		if(emp.getEmpEmail()!=null){
			hql.append("and model.empEmail like '%"+emp.getEmpEmail()+"%'");
		}
		if(emp.getEmpPid()!=null){
			hql.append("and model.empPid = '"+emp.getEmpPid()+"'");
		}
		if(emp.getEmpAddress()!=null){
			hql.append("and model.empAddress = '"+emp.getEmpAddress()+"'");
		}
		if(emp.getEmpPass()!=null){
			hql.append("and model.empPass='"+emp.getEmpPass()+"'");
		}
		return query(page, hql.toString());
	}
	/** 
	 * （重写方法）
	 * isExistAccount方法概述
	 * 
	 *
	 * @param accoutn
	 * @return
	 */
	@Override
	public boolean isExistAccount(String account) {
		int result=getTotalCount("from Employee where empAccount=?", account);
		if(result==0)
			return false;
		return true;
	}
	
}