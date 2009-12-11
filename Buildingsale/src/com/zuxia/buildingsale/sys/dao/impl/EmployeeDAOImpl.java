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
		return query(page, "from Employee modle1 order by modle1.empNo asc");
	}
	/** 
	 * ����д������
	 * delete��������
	 * 
	 *
	 * @param obj
	 * @return
	 */
	@Override
	public int delete(Employee obj) {
		try {
			delete(obj);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}
	/** 
	 * ����д������
	 * findByid��������
	 * 
	 *
	 * @param id
	 * @return
	 */
	@Override
	public Employee findByid(Integer id) {
		return (Employee) getByPk(this.getClass(), id);
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
	public int merge(Employee obj) {
		try {
			update(obj);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}
	/** 
	 * ����д������
	 * save��������
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
	 * ����д������
	 * findByEmployeeAccount��������
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
	
}