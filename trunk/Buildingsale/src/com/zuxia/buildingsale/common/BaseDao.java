package com.zuxia.buildingsale.common;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * 
 * BaseDao概要说明<br/>
 * 该类封装了基本的dao方法<br/>
 * 提供了基本的查询<br/>
 * 支持分页
 * @author zcq100
 */
public class BaseDao extends HibernateDaoSupport {

	
	/**  
	* 功能：根据hql语句修改
	*   
	* @param strhql  
	* @return int  
	*/
	public int updateByHql(String hql){
		int row=0;
		try {
			row=this.getHibernateTemplate().bulkUpdate(hql);
		} catch (Exception e) {
			e.printStackTrace();
			row = 0;
		}
		return row;
	}
	
	public int deleteBySql(String sql){
		int row = 0;
		try{
			row=this.getSession().createSQLQuery(sql).executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
			row = 0;
		}
		return row;
	}
	/**  
	* 功能：根据sql语句修改
	*   
	* @param strhql  
	* @return int  
	*/
	public int updateBySql(String sql){
		int row;
		try {
			row=this.getSession().createSQLQuery(sql).executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			row = 0;
		}
		return row;
	}
	
	/**  
	* 功能：根据hql语句得到记录总数  
	*   
	* @param strhql  
	* @return int  
	*/
	@SuppressWarnings("unchecked")
	public int getTotalCount(String strhql) {
		List list = this.getHibernateTemplate().find("select count(*) "+strhql);
		return Integer.valueOf(list.get(0).toString());
	}

	/**  
	* 功能：根据hql语句得到记录总数  
	*   
	* @param strhql  select count(*) from 对象
	* @param obj 
	* @return int	记录的条数  
	*/
	@SuppressWarnings("unchecked")
	public int getTotalCount(String strhql, Object obj) {
		List list = this.getHibernateTemplate().find("select count(*) "+strhql,obj);
		return Integer.valueOf(list.get(0).toString());
	}

	/**  
	* 功能：根据hql语句得到记录总数  
	* @param strhql  
	* @param params  
	* @return int  
	*/
	@SuppressWarnings("unchecked")
	public int getTotalCount(String strhql, List<Object> params) {
		
		List list = this.getHibernateTemplate().find("select count(*) "+strhql,params.toArray());
		return Integer.valueOf(list.get(0).toString());
	}

	/**  
	* 功能：根据hql语句得到记录总数  
	* @param hql  
	* @param params  
	* @return int  
	*/
	public int getRecordCount(String hql,List params){
		
		Query query=this.getSession().createQuery("select count(*) "+hql);
		Object param=null;
		for(int i=0;i<params.size();i++)
		{
			param=params.get(i);
			if(null!=param){
				query.setParameter(i, param);
			}
		}
		List list=query.list();
		return Integer.valueOf(list.get(0).toString());
	}
	
	
	/**  
	 * 功能：根据sql语句得到记录总数  
	 *   
	 * @param strsql  
	 * @return int  
	 */
	@SuppressWarnings("unchecked")
	public int getTotalCountBySql(String strsql) {
		List list =  this.getSession().createSQLQuery("select count(*) "+strsql).list();
		return Integer.valueOf(list.get(0).toString());
	}

	/**  
	* 功能：根据sql语句得到记录总数
	* @param strsql  
	* @param param  
	* @return  
	*/
	
	@SuppressWarnings("unchecked")
	public int getTotalCountBySql(String strsql, List<String> params) {
		SQLQuery sqlQuery = this.getSession().createSQLQuery("select count(*) "+strsql);
		 for(int i=0;i<params.size();i++){
			 sqlQuery.setParameter(i+1, params.get(i));
		 }
		List list = sqlQuery.list();
		return Integer.valueOf(list.get(0).toString());
	}

	/**  
	* 功能：增加记录  
	*   
	* @param entity  
	*/
	public Serializable insert(Object entity) {
	 return	this.getHibernateTemplate().save(entity);
	}

	/**  
	* 功能：修改记录  
	*   
	* @param entity  
	*/
	public void update(Object entity) {
		try {
			this.getHibernateTemplate().update(entity);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	/**  
	 * 功能：删除记录  
	 *   
	 * @param entity  
	 */
	public void delete(Object entity) {
		this.getHibernateTemplate().delete(entity);
	}

	/**  
	* 功能：删除数据  
	*   
	* @param clazz  
	* @param id  
	*/
	@SuppressWarnings("unchecked")
	public void delete(Class clazz, int id) {
		Object obj = this.getHibernateTemplate().get(clazz, id);
		this.getHibernateTemplate().delete(obj);
	}

	/**  
	* 功能：批量删除数据  
	*   
	* @param clazz  
	* @param id  
	*/
	@SuppressWarnings("unchecked")
	public void batchDelete(Class clazz, long[] id) {
		for(int i=0;i<id.length;i++){
			System.out.println(this.getHibernateTemplate().get(clazz, id[i]));
			this.getHibernateTemplate().delete(this.getHibernateTemplate().get(clazz, id[i]));
		}
	}
	
	/**
	 * 
	 * batchDelete方法概述
	 * 
	 *
	 * @param clazz
	 * @param id
	 */
    public void batchDelete(Class clazz,int[] id)
    {
    	for(int i=0;i<id.length;i++){
			System.out.println(this.getHibernateTemplate().get(clazz, id[i]));
			this.getHibernateTemplate().delete(this.getHibernateTemplate().get(clazz, id[i]));
		}
    }
	/**  
	* 功能：删除表中的所有的记录  
	*   
	* @param clazz  
	*/
	@SuppressWarnings("unchecked")
	public void deleteAll(Class clazz) {
		//buxiaode
	}

	/**  
	* 功能：删除记录集中的所有的记录  
	*   
	* @param entities  
	*/
	@SuppressWarnings("unchecked")
	public void deleteAll(Collection entities) {
		this.getHibernateTemplate().deleteAll(entities);
	}

	/**  
	* 功能：通过主键查询记录  
	*   
	* @param clazz  
	* @param id  
	* @return Object  
	*/

	@SuppressWarnings("unchecked")
	public Object getByPk(Class clazz, int id) {
		return this.getHibernateTemplate().get(clazz, id);
	}

	/**  
	* 功能：通过主键查询记录  
	*   
	* @param clazz  
	* @param id  
	* @return Object  
	*/
	@SuppressWarnings("unchecked")
	public Object getByPk(Class clazz, long id) {
		return this.getHibernateTemplate().get(clazz, id);
	}

	/**  
	* 功能：通过主键查询记录  
	*   
	* @param clazz  
	* @param id  
	* @return Object  
	*/
	@SuppressWarnings("unchecked")
	public Object getByPk(Class clazz, String id) {
		return this.getHibernateTemplate().get(clazz, id);
	}

	/**  
	* 功能：通过关键字和值来进行查询  
	*   
	* @param clazz  
	* @param keyName  
	* @param keyValue  
	* @return 得到的Object是List  
	*/
	@SuppressWarnings("unchecked")
	public Object loadByPk(Class clazz, String keyName, Object keyValue) {
		return this.getHibernateTemplate().find("from "+clazz.getName()+" where "+keyName+"= "+keyValue);
	}

	/**  
	* 功能：根据hql查询记录  
	*   
	* @param strhql  
	* @return List  
	*/
	@SuppressWarnings("unchecked")
	public List find(String strhql) {
		return this.getHibernateTemplate().find(strhql);
	}


	/**  
	* 功能：根据hql查询记录  
	*   
	* @param strhql  
	* @param param  
	* @return List  
	*/
	@SuppressWarnings("unchecked")
	public List find(String strhql, Object param) {
		return this.getHibernateTemplate().find(strhql,param);
	}
	
	/**  
	* 功能：根据hql查询记录  
	*   
	* @param strhql  
	* @param param  
	* @return List  
	*/
	@SuppressWarnings("unchecked")
	public List find(String strhql, Object[] param) {
		return this.getHibernateTemplate().find(strhql,param);
	}

	/**  
	* 功能：根据hql查询记录  
	*    
	* @param strhql  HQL语句
	* @param name  	字段
	* @param param  	参数
	* @return List  	对象的集合
	*/
	@SuppressWarnings("unchecked")
	public List findByNamedParam(String strhql, String name, Object param) {
		return this.getHibernateTemplate().find(strhql+" where :"+name+"=?",param);
	}

	/**  
	* 功能：SQL查询  
	* @param strsql  
	* @return  
	*/
	@SuppressWarnings("unchecked")
	public List findBySql(String strsql) {
		return this.getSession().createSQLQuery(strsql).list();
	}

	/**  
	* 功能：查询符合条件的记录。  
	* @param strsql  
	* @param params  
	* @return  
	*/
	@SuppressWarnings("unchecked")
	public List findBySql(String strsql, List params) {
		SQLQuery sqlQuery = this.getSession().createSQLQuery(strsql);
		 for(int i=0;i<params.size();i++){
			 sqlQuery.setParameter(i, params.get(i));
		 }
		List list = sqlQuery.list();
		return list;
	}

	/**  
	* 功能：分页查询  
	*   
	* @param Page 分页辅助类
	* @param   
	* @param strhql  
	* @return List  
	*/
	@SuppressWarnings("unchecked")
	public List query(Page page,String strhql) {
		//得到记录总数
		int totalcount=getTotalCount(strhql);
		//设置page对象的记录总数
		page.setPage(totalcount);	
		List list=null;
		//创建查询
		Query query = this.getSession().createQuery(strhql);
		if(page!=null){
			//设置query的第一条数据
			query.setFirstResult(((page.getPageIndex()-1)*page.getPageRecordCount()));
			//设置query的数据条数
			query.setMaxResults(page.getPageRecordCount());
		}
		list = query.list();
		
		return list;
	}

	/**  
	* 功能：分页查询  
	*   
	* @param Page 分页辅助类 
	* @param  
	* @param queryString  
	* @param obj  
	* @return List  
	*/
	@SuppressWarnings("unchecked")
	public List query(Page page, String strhql, Object obj) {
		//得到记录总数
		int totalcount=getTotalCount(strhql,obj);
		//设置page对象的记录总数
		page.setPage(totalcount);	
		List list=null;
		//创建查询
		Query query = this.getSession().createQuery(strhql);
		if(page!=null){
			//设置query的第一条数据
			query.setFirstResult(((page.getPageIndex()-1)*page.getPageRecordCount()));
			//设置query的数据条数
			query.setMaxResults(page.getPageRecordCount());
		}
		//设置参数
		query.setParameter(0, obj);
		list = query.list();
		
		return list;
	}

	/**  
	* 功能：分页查询  
	* @param Page 分页辅助类
	* @param 
	* @param strhql  
	* @param params  
	* @return  
	*/
	@SuppressWarnings("unchecked")
	public List query(Page page, String strhql, List params) {
		//得到记录总数
		int totalcount=getTotalCount(strhql,params);
		//设置page对象的记录总数
		page.setPage(totalcount);	
		List list=null;
		//创建查询
		Query query = this.getSession().createQuery(strhql);
		if(page!=null){
			//设置query的第一条数据
			query.setFirstResult(((page.getPageIndex()-1)*page.getPageRecordCount()));
			//设置query的数据条数
			query.setMaxResults(page.getPageRecordCount());
		}
		//设置参数
		 for(int i=0;i<params.size();i++){
			 query.setParameter(i, params.get(i));
		 }
		list = query.list();
	
		return list;
	}

	/**  
	* 功能：分页查询  
	*   
	* @param pageNo  
	* @param pageSize  
	* @param strsql  
	* @return List  
	*/
	@SuppressWarnings("unchecked")
	public List queryBySql(Page page, String strsql) {
		//得到记录总数
		int totalcount=getTotalCountBySql(strsql);
		//设置page对象的记录总数
		page.setPage(totalcount);	
		List list=null;
		//创建查询
		Query query = this.getSession().createSQLQuery(strsql);
		if(page!=null){
			//设置query的第一条数据
			query.setFirstResult(((page.getPageIndex()-1)*page.getPageRecordCount()));
			//设置query的数据条数
			query.setMaxResults(page.getPageRecordCount());
		}
		list = query.list();
		
		return list;
	}

	/**  
	* 功能：分页查询  
	* @param pageNo  
	* @param pageSize  
	* @param strsql  
	* @param params  
	* @return  
	*/
	@SuppressWarnings("unchecked")
	public List queryBySql(Page page, String strsql, List params) {
		//得到记录总数
		int totalcount=getTotalCountBySql(strsql,params);
		//设置page对象的记录总数
		page.setPage(totalcount);
		List list=null;
		//创建查询
		Query query = this.getSession().createSQLQuery(strsql);
		if(page!=null){
			//设置query的第一条数据
			query.setFirstResult(((page.getPageIndex()-1)*page.getPageRecordCount()));
			//设置query的数据条数
			query.setMaxResults(page.getPageRecordCount());
		}
		//设置参数
		 for(int i=0;i<params.size();i++){
			 query.setParameter(i, params.get(i));
		 }
		list = query.list();
		
		return list;
	}

	/**  
	* 功能：执行SQL语句，主要是更新与删除记录的SQL语句，不需要返回值的  
	*   
	* @param strsql  
	*/
	@SuppressWarnings("unchecked")
	public int excuteSql(String strsql,Object[] val) {
		return this.getHibernateTemplate().bulkUpdate(strsql,val);
	}
	
	/**
	 * <dl>
	 * <b>方法名:batchDelete</b>
	 * <dd>方法作用：批量删除处理
	 * <dd>重写备注：(这里描述重写原因、结果或备注)
	 * <dd>适用条件：(这里描述这个方法的适用条件 – 可选)
	 * <dd>执行流程：(这里描述这个方法的执行流程 – 可选)
	 * <dd>适用方法：(这里描述这个方法的使用方法 – 可选)
	 * <dd>注意事项：(这里描述这个方法的注意事项 – 可选) 
	 * <dd>@param cls            删除的类对象class
	 * <dd>@param keyProperty    删除对象的主键属性名
	 * <dd>@param idStr          删除对象的编号字符串 for example  '1,2,4,34,23'
	 * <dd>@return               int
	 * </dl>
	*/
	public int batchDelete(Class cls,String keyProperty,String idStr){
		int res=0;
		StringBuffer sbHql=new StringBuffer("delete from");
		sbHql.append(" "+cls.getSimpleName());
		sbHql.append(" where "+cls.getSimpleName());
		sbHql.append("."+keyProperty);
		sbHql.append(" in("+idStr+")");
		String hql=sbHql.toString();
		res=this.getHibernateTemplate().bulkUpdate(hql);
		return res;
	}
	
}
