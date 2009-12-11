package com.zuxia.buildingsale.sys.dao.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import com.zuxia.buildingsale.common.BaseDao;
import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.dao.IEmployeeDao;
import com.zuxia.buildingsale.sys.entity.Employee;


/**
 * 
 * EmployeeDAO��Ҫ˵��
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
	 * ����д������
	 * findAll��������
	 * 
	 *
	 * @param page
	 * @return
	 */
	@Override
	public List<Employee> findAll(Page page) {
		// TODO Auto-generated method stub
		return null;
	}
	/** 
	 * ����д������
	 * del��������
	 * 
	 *
	 * @param obj
	 */
	@Override
	public void del(Employee obj) {
		// TODO Auto-generated method stub
		
	}
	/** 
	 * ����д������
	 * findById��������
	 * 
	 *
	 * @param id
	 * @return
	 */
	@Override
	public Employee findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	/** 
	 * ����д������
	 * merge��������
	 * 
	 *
	 * @param obj
	 * @return
	 */
	@Override
	public Employee merge(Employee obj) {
		// TODO Auto-generated method stub
		return null;
	}
	/** 
	 * ����д������
	 * save��������
	 * 
	 *
	 * @param obj
	 */
	@Override
	public void save(Employee obj) {
		// TODO Auto-generated method stub
		
	}
	

}