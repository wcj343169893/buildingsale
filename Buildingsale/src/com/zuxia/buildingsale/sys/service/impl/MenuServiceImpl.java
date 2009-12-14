/**
 *******************************************************************************
 * filename    : MenuServiceImpl.java
 * package     : com.zuxia.buildingsale.sys.service.impl
 * createdate  : 2009-12-13 下午06:22:02
 * project     : Buildingsale
 * @version    : 1.0
 * @author     : zcq100
 * (c) Copyright 2009 
 *	＜功能概要＞
 * 该类实现了用户和角色的不同菜单管理功能
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
 * MenuServiceImpl概要说明
 * @author zcq100
 */
public class MenuServiceImpl implements IMenuService {
	private IRoleMenuDao rolemenudao;
	private IEmpMenuDao empmenudao;
	private IEmpRoleDao emproledao;
	/**
	 * 
	 * addEmployeeMenu方法概述
	 * 添加员工菜单信息
	 * @param empid 员工id
	 * @param menuid 菜单id
	 * @return	操作状态(1,成功,0,失败)
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
	 * addRoleMenu方法概述
	 * 添加角色菜单
	 *
	 * @param roleid 角色id	
	 * @param menuid 菜单id
	 * @return 操作状态(1,成功,0,失败)
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
			//删除所有的员工菜单关系
			empmenudao.delete(empmenu);
		}
		//添加员工菜单关系
		addEmployeeMenu(empid, menuids);
		return 1;
	}

	@Override
	public int updateRoleMenu(int roleid,int[] menuids) {
		List<RoleMenu> list=rolemenudao.findByRoleId(roleid);
		for(RoleMenu rolemenu:list){
			//删除制定员工所有的菜单关系
			rolemenudao.delete(rolemenu);
		}
		//重新添加员工菜单关系
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
		List<RoleMenu> list=rolemenudao.findByRoleId(id);	//查找角色所有的菜单关系信息
		List<MenuInfo> menuinfos=new ArrayList<MenuInfo>();	
		for(RoleMenu rolemenu:list){	
			menuinfos.add(rolemenu.getMenuInfo());			//添加菜单信息到menuinfos
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
		//查询到所有的角色菜单信息
		List<RoleMenu> list=rolemenudao.findByMenuId(id);
		List<RoleInfo> roleInfos=new ArrayList<RoleInfo>();
		for(RoleMenu rolemenu:list){
			//添加角色信息
			roleInfos.add(rolemenu.getRoleInfo());
		}
		return roleInfos;
	}

	@Override
	public boolean hasEmpMenu(int empid, int menuid) {
		//检查用户所属的组是否存在菜单权限
		{
			List<EmpRole> emproles=emproledao.findByEmpId(empid);
			for(EmpRole emprole:emproles){
				RoleInfo role=emprole.getRoleInfo();
				if(hasRoleMenu(role.getRoleId(), menuid))
					return true;
			}
		}
		//检查用户是否存在菜单权限
		{
			List<EmpMenu> list=empmenudao.findByEmpId(empid);
			for(EmpMenu empmenu:list){
				if(menuid==empmenu.getMenuInfo().getMenuId()){
					System.out.println("员工"+empid+"-"+menuid+"菜单关系已经存在");
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean hasRoleMenu(int roleid, int menuid) {
		//得到角色所有的菜单信息
		List<RoleMenu> list=rolemenudao.findByRoleId(roleid);
		for(RoleMenu rolemenu:list){
			//查找角色指定的菜单是否存在
			if(menuid==rolemenu.getMenuInfo().getMenuId()){
				System.out.println("角色"+roleid+"-"+menuid+"菜单关系已经存在");
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
