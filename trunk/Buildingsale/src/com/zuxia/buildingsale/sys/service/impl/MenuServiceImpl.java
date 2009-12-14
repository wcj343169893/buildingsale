/**
 *******************************************************************************
 * filename    : MenuServiceImpl.java
 * package     : com.zuxia.buildingsale.sys.service.impl
 * createdate  : 2009-12-13 ����06:22:02
 * project     : Buildingsale
 * @version    : 1.0
 * @author     : zcq100
 * (c) Copyright 2009 
 *	�����ܸ�Ҫ��
 * ����ʵ�����û��ͽ�ɫ�Ĳ�ͬ�˵�������
 *******************************************************************************
 */
package com.zuxia.buildingsale.sys.service.impl;

import java.util.ArrayList;
import java.util.List;
import com.zuxia.buildingsale.sys.dao.IEmpMenuDao;
import com.zuxia.buildingsale.sys.dao.IEmpRoleDao;
import com.zuxia.buildingsale.sys.dao.IRoleMenuDao;
import com.zuxia.buildingsale.sys.entity.EmpMenu;
import com.zuxia.buildingsale.sys.entity.EmpRole;
import com.zuxia.buildingsale.sys.entity.Employee;
import com.zuxia.buildingsale.sys.entity.MenuInfo;
import com.zuxia.buildingsale.sys.entity.RoleInfo;
import com.zuxia.buildingsale.sys.entity.RoleMenu;
import com.zuxia.buildingsale.sys.service.IMenuService;

/**
 * MenuServiceImpl��Ҫ˵��
 * @author zcq100
 */
public class MenuServiceImpl implements IMenuService {
	private IRoleMenuDao rolemenudao;
	private IEmpMenuDao empmenudao;
	private IEmpRoleDao emproledao;
	/**
	 * 
	 * addEmployeeMenu��������
	 * ���Ա���˵���Ϣ
	 * @param empid Ա��id
	 * @param menuid �˵�id
	 * @return	����״̬(1,�ɹ�,0,ʧ��)
	 */
	protected int addEmployeeMenu(int empid,int menuid) {
		if(hasEmpMenu(empid, menuid)){
			return 0;
		}
		Employee emp=new Employee();
		emp.setEmpId(empid);
		MenuInfo menuinfo=new MenuInfo();
		menuinfo.setMenuId(menuid);
		EmpMenu empmenu=new EmpMenu();
		empmenu.setEmployee(emp);
		empmenu.setMenuInfo(menuinfo);
		return empmenudao.save(empmenu);
	}
	
	/**
	 * 
	 * addRoleMenu��������
	 * ��ӽ�ɫ�˵�
	 *
	 * @param roleid ��ɫid	
	 * @param menuid �˵�id
	 * @return ����״̬(1,�ɹ�,0,ʧ��)
	 */
	protected  int  addRoleMenu(int roleid,int menuid) {
		if(hasRoleMenu(roleid, menuid)){
			return 0;
		}
		RoleInfo roleinfo=new RoleInfo();
		roleinfo.setRoleId(roleid);
		MenuInfo menuinfo=new MenuInfo();
		menuinfo.setMenuId(menuid);
		RoleMenu rolemenu=new RoleMenu();
		rolemenu.setMenuInfo(menuinfo);
		rolemenu.setRoleInfo(roleinfo);
		return rolemenudao.save(rolemenu);
	}
	
	@Override
	public int addEmployeeMenu(int empid, int[] menuids) {
		int result=0;
		for(int menuid:menuids){
			result+=addEmployeeMenu(empid,menuid);
		}
		if(result>0)
			return 1;
		return result;
	}

	@Override
	public int addRoleMenu(int roleid, int[] menuids) {
		int result=0;
		for(int menuid:menuids ){
			result=+addRoleMenu(roleid, menuid);
		}
		if(result>0)
			return 1;
		return 0;
	}

	@Override
	public int updateEmpMenu(int empid,int[] menuids) {
		List<EmpMenu> list=empmenudao.findByEmpId(empid);
		for(EmpMenu empmenu:list){
			//ɾ�����е�Ա���˵���ϵ
			empmenudao.delete(empmenu);
		}
		//���Ա���˵���ϵ
		addEmployeeMenu(empid, menuids);
		return 1;
	}

	@Override
	public int updateRoleMenu(int roleid,int[] menuids) {
		List<RoleMenu> list=rolemenudao.findByRoleId(roleid);
		for(RoleMenu rolemenu:list){
			//ɾ���ƶ�Ա�����еĲ˵���ϵ
			rolemenudao.delete(rolemenu);
		}
		//�������Ա���˵���ϵ
		addRoleMenu(roleid, menuids);
		return 1;
	}

	@Override
	public List<MenuInfo> findByEmpId(int id) {
		List<EmpMenu> list=empmenudao.findByEmpId(id);
		List<MenuInfo> menuinfos=new ArrayList<MenuInfo>();
		for(EmpMenu empmenu:list){
			menuinfos.add(empmenu.getMenuInfo());
		}
		return menuinfos;
	}

	@Override
	public List<MenuInfo> findByRoleId(int id) {
		List<RoleMenu> list=rolemenudao.findByRoleId(id);	//���ҽ�ɫ���еĲ˵���ϵ��Ϣ
		List<MenuInfo> menuinfos=new ArrayList<MenuInfo>();	
		for(RoleMenu rolemenu:list){	
			menuinfos.add(rolemenu.getMenuInfo());			//��Ӳ˵���Ϣ��menuinfos
		}
		return menuinfos;
	}

	@Override
	public List<Employee> findEmployeeByMenuId(int id) {
		List<EmpMenu> list=empmenudao.findByMenuId(id);
		List<Employee> employess=new ArrayList<Employee>();
		for(EmpMenu empmenu:list){
			employess.add(empmenu.getEmployee());
		}
		return employess;
	}

	@Override
	public List<RoleInfo> findRoleByMenuId(int id) {
		//��ѯ�����еĽ�ɫ�˵���Ϣ
		List<RoleMenu> list=rolemenudao.findByMenuId(id);
		List<RoleInfo> roleInfos=new ArrayList<RoleInfo>();
		for(RoleMenu rolemenu:list){
			//��ӽ�ɫ��Ϣ
			roleInfos.add(rolemenu.getRoleInfo());
		}
		return roleInfos;
	}

	@Override
	public boolean hasEmpMenu(int empid, int menuid) {
		//����û����������Ƿ���ڲ˵�Ȩ��
		{
			List<EmpRole> emproles=emproledao.findByEmpId(empid);
			for(EmpRole emprole:emproles){
				RoleInfo role=emprole.getRoleInfo();
				if(hasRoleMenu(role.getRoleId(), menuid))
					return true;
			}
		}
		//����û��Ƿ���ڲ˵�Ȩ��
		{
			List<EmpMenu> list=empmenudao.findByEmpId(empid);
			for(EmpMenu empmenu:list){
				if(menuid==empmenu.getMenuInfo().getMenuId()){
					System.out.println("Ա��"+empid+"-"+menuid+"�˵���ϵ�Ѿ�����");
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean hasRoleMenu(int roleid, int menuid) {
		//�õ���ɫ���еĲ˵���Ϣ
		List<RoleMenu> list=rolemenudao.findByRoleId(roleid);
		for(RoleMenu rolemenu:list){
			//���ҽ�ɫָ���Ĳ˵��Ƿ����
			if(menuid==rolemenu.getMenuInfo().getMenuId()){
				System.out.println("��ɫ"+roleid+"-"+menuid+"�˵���ϵ�Ѿ�����");
				return true;
			}
		}
		return false;
	}

	public IRoleMenuDao getRolemenudao() {
		return rolemenudao;
	}

	public void setRolemenudao(IRoleMenuDao rolemenudao) {
		this.rolemenudao = rolemenudao;
	}

	public IEmpMenuDao getEmpmenudao() {
		return empmenudao;
	}

	public void setEmpmenudao(IEmpMenuDao empmenudao) {
		this.empmenudao = empmenudao;
	}

	public IEmpRoleDao getEmproledao() {
		return emproledao;
	}

	public void setEmproledao(IEmpRoleDao emproledao) {
		this.emproledao = emproledao;
	}



	
	
}
