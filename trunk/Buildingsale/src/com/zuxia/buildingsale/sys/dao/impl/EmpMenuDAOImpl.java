package com.zuxia.buildingsale.sys.dao.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.zuxia.buildingsale.common.BaseDao;
import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.sys.dao.IEmpMenuDao;
import com.zuxia.buildingsale.sys.entity.EmpMenu;


public class EmpMenuDAOImpl extends BaseDao implements IEmpMenuDao {
	@SuppressWarnings("unused")
	private static final Log log = LogFactory.getLog(EmpMenuDAOImpl.class);

	/** 
	 * ����д������
	 * delete��������
	 * 
	 *
	 * @param obj
	 * @return
	 */
	@Override
	public int delete(EmpMenu obj) {
		try {
			super.delete(obj);
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
	public EmpMenu findByid(Integer id) {
		return (EmpMenu) getByPk(EmpMenu.class, id);
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
	public int merge(EmpMenu obj) {
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
	public int save(EmpMenu obj) {
		try {
			insert(obj);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	/** 
	 * ����д������
	 * findAll��������
	 * 
	 *
	 * @param page
	 * @return
	 */
	@Override
	public List<EmpMenu> findAll(Page page) {
		List<EmpMenu> list=query(page, "from EmpMenu");
		return list;
	}

	/** 
	 * ����д������
	 * findByEmpId��������
	 * 
	 *
	 * @param id
	 * @return
	 */
	@Override
	public List<EmpMenu> findByEmpId(int id) {
		List<EmpMenu> list=find("from EmpMenu model where model.employee.empId=?", id);
		return list;
	}

	/** 
	 * ����д������
	 * findByMenuId��������
	 * 
	 *
	 * @param id
	 * @return
	 */
	@Override
	public List<EmpMenu> findByMenuId(int id) {
		List<EmpMenu> list=find("from EmpMenu model where model.menuInfo.menuId=?", id);
		return list;
	}

	
}