/**
 *******************************************************************************
 * filename    : EmployeeServiceImplTest.java
 * package     : com.zuxia.buildingsale.sys.dao.impl
 * createdate  : 2009-12-13 ����06:48:43
 * project     : Buildingsale
 * @version    : 1.0
 * @author     : Administrator
 * (c) Copyright 2009 
 *	�����ܸ�Ҫ��
 *  XXX
 *******************************************************************************
 */
package com.zuxia.buildingsale.sys.service.impl;

import java.util.Date;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.zuxia.buildingsale.business.entity.DataDict;
import com.zuxia.buildingsale.sys.entity.Employee;
import com.zuxia.buildingsale.sys.service.IEmployeeService;

import junit.framework.TestCase;

/**
 * EmployeeServiceImplTest��Ҫ˵��
 * 
 *
 * @author Administrator
 */
public class EmployeeServiceImplTest extends TestCase {
	
	/**
	 * 
	 * testFindByEmployeeAccount��������
	 * ���Ե�½
	 */
	public void testFindByEmployeeAccount(){
		IEmployeeService employeeservice=getBean();
		Employee emp=employeeservice.findByEmployeeAccount("parddu", "123456");
		assertNotNull(emp);
	}
	
	public void testAddEmployee(){
		IEmployeeService employeeservice=getBean();
		Employee emp=new Employee();
		emp.setEmpAccount("zhangchengqiang");
		emp.setEmpName("�ų�ǿ");
		emp.setEmpPass("123456");
		emp.setEmpSex(1);
		emp.setEmpPid("123456789012345678");
		DataDict dd=new DataDict();
		dd.setDdId(13);
		emp.setDataDict(dd);
		emp.setEmpBirthday(new Date());
		emp.setEmpEmail("zcq100@126.com");
		emp.setEmpAddress("�����У�ɳƺ����������·");
		emp.setEmpRemark("��ͨ�û�");
		emp.setEmpTell("13629796731");
		assertEquals(employeeservice.addEmployee(emp),1);
	}

	private IEmployeeService getBean() {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("classpath:building-framework.xml");
		IEmployeeService employeeservice=(IEmployeeService) context.getBean("EmployeeServiceImpl");
		return employeeservice;
	}
}
