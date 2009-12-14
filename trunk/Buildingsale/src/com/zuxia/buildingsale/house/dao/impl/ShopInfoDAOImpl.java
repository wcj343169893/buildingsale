package com.zuxia.buildingsale.house.dao.impl;

import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zuxia.buildingsale.common.BaseDao;
import com.zuxia.buildingsale.common.Page;
import com.zuxia.buildingsale.house.dao.IShopInfoDAO;
import com.zuxia.buildingsale.house.entity.ShopInfo;

/**
 * A data access object (DAO) providing persistence and search support for
 * ShopInfo entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.zuxia.buildingsale.house.entity.ShopInfo
 * @author MyEclipse Persistence Tools
 */

public class ShopInfoDAOImpl extends BaseDao implements IShopInfoDAO {
	private static final Log log = LogFactory.getLog(ShopInfoDAOImpl.class);
	// property constants
	public static final String SHOP_NO = "shopNo";
	public static final String SHOP_NAME = "shopName";
	public static final String SHOP_ADDRESS = "shopAddress";
	public static final String SHOP_TELL_ONE = "shopTellOne";
	public static final String SHOP_TELL_TWO = "shopTellTwo";
	public static final String SHOP_TELL_THREE = "shopTellThree";
	public static final String SHOP_TELL_FOUR = "shopTellFour";
	public static final String SHOP_REMARK = "shopRemark";

	/**
	 * ����д������ delete�������� ɾ��
	 * 
	 * 
	 * @param obj
	 * @return
	 */
	@Override
	public int delete(ShopInfo obj) {
		try {
			super.delete(obj);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	/**
	 * ����д������ findByid�������� ����id��ѯ
	 * 
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public ShopInfo findByid(Integer id) {
		return (ShopInfo) getByPk(ShopInfo.class, id);
	}

	/**
	 * ����д������ merge�������� �޸�
	 * 
	 * 
	 * @param obj
	 * @return
	 */
	@Override
	public int merge(ShopInfo obj) {
		try {
			super.update(obj);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	/**
	 * ����д������ save�������� ����
	 * 
	 * 
	 * @param obj
	 * @return
	 */
	@Override
	public int save(ShopInfo obj) {
		try {
			super.insert(obj);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	/**
	 * ����д������ findAll�������� ��ѯ����
	 * 
	 * 
	 * @param page
	 * @return
	 */
	@Override
	public List<ShopInfo> findAll(Page page) {
		String strhql = "from ShopInfo";
		List<ShopInfo> shopInfoList = query(page, strhql);
		return shopInfoList;
	}
}