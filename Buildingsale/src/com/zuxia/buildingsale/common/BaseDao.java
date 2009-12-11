package com.zuxia.buildingsale.common;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class BaseDao extends HibernateDaoSupport {
	/**
	 * BaseDAO���췽��
	 */
	public BaseDao() {

	}
	/**  
	* ���ܣ�����hql����޸�
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
	* ���ܣ�����sql����޸�
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
	* ���ܣ�����hql���õ���¼����  
	*   
	* @param strhql  
	* @return int  
	*/
	@SuppressWarnings("unchecked")
	public int getTotalCount(String strhql) {
		List list = this.getHibernateTemplate().find(strhql);
		return list.size();
	}

	/**  
	* ���ܣ�����hql���õ���¼����  
	*   
	* @param strhql  
	* @param obj  
	* @return int  
	*/
	@SuppressWarnings("unchecked")
	public int getTotalCount(String strhql, Object obj) {
		List list = this.getHibernateTemplate().find(strhql,obj);
		return list.size();
	}

	/**  
	* ���ܣ�����hql���õ���¼����  
	* @param strhql  
	* @param params  
	* @return int  
	*/
	@SuppressWarnings("unchecked")
	public int getTotalCount(String strhql, List<Object> params) {
		
		List list = this.getHibernateTemplate().find(strhql,params.toArray());
		return list.size();
	}

	/**  
	* ���ܣ�����hql���õ���¼����  
	* @param hql  
	* @param params  
	* @return int  
	*/
	@SuppressWarnings("unchecked")
	public int getRecordCount(String hql,List params){
		
		Query query=this.getSession().createQuery(hql);
		Object param=null;
		for(int i=0;i<params.size();i++)
		{
			param=params.get(i);
			if(null!=param){
				query.setParameter(i, param);
			}
		}
		List list=query.list();
		return list.size();
	}
	
	
	/**  
	 * ���ܣ�����sql���õ���¼����  
	 *   
	 * @param strsql  
	 * @return int  
	 */
	@SuppressWarnings("unchecked")
	public int getTotalCountBySql(String strsql) {
		List list =  this.getSession().createSQLQuery(strsql).list();
		return list.size();
	}

	/**  
	* ���ܣ�����sql���õ���¼����
	* @param strsql  
	* @param param  
	* @return  
	*/
	
	@SuppressWarnings("unchecked")
	public int getTotalCountBySql(String strsql, List<String> params) {
		SQLQuery sqlQuery = this.getSession().createSQLQuery(strsql);
		 for(int i=0;i<params.size();i++){
			 sqlQuery.setParameter(i+1, params.get(i));
		 }
		List list = sqlQuery.list();
		return list.size();
	}

	/**  
	* ���ܣ����Ӽ�¼  
	*   
	* @param entity  
	*/
	public Serializable insert(Object entity) {
	 return	this.getHibernateTemplate().save(entity);
	}

	/**  
	* ���ܣ��޸ļ�¼  
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
	 * ���ܣ�ɾ����¼  
	 *   
	 * @param entity  
	 */
	public void delete(Object entity) {
		this.getHibernateTemplate().delete(entity);
	}

	/**  
	* ���ܣ�ɾ������  
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
	* ���ܣ�����ɾ������  
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
    @SuppressWarnings("unchecked")
	public void batchDelete(Class clazz,int[] id)
    {
    	for(int i=0;i<id.length;i++){
			System.out.println(this.getHibernateTemplate().get(clazz, id[i]));
			this.getHibernateTemplate().delete(this.getHibernateTemplate().get(clazz, id[i]));
		}
    }
	/**  
	* ���ܣ�ɾ�����е����еļ�¼  
	*   
	* @param clazz  
	*/
	@SuppressWarnings("unchecked")
	public void deleteAll(Class clazz) {
		//buxiaode
	}

	/**  
	* ���ܣ�ɾ����¼���е����еļ�¼  
	*   
	* @param entities  
	*/
	@SuppressWarnings("unchecked")
	public void deleteAll(Collection entities) {
		this.getHibernateTemplate().deleteAll(entities);
	}

	/**  
	* ���ܣ�ͨ��������ѯ��¼  
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
	* ���ܣ�ͨ��������ѯ��¼  
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
	* ���ܣ�ͨ��������ѯ��¼  
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
	* ���ܣ�ͨ���ؼ��ֺ�ֵ�����в�ѯ  
	*   
	* @param clazz  
	* @param keyName  
	* @param keyValue  
	* @return �õ���Object��List  
	*/
	@SuppressWarnings("unchecked")
	public Object loadByPk(Class clazz, String keyName, Object keyValue) {
		//������
		return null;
	}

	/**  
	* ���ܣ�����hql��ѯ��¼  
	*   
	* @param strhql  
	* @return List  
	*/
	@SuppressWarnings("unchecked")
	public List find(String strhql) {
		return this.getHibernateTemplate().find(strhql);
	}


	/**  
	* ���ܣ�����hql��ѯ��¼  
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
	* ���ܣ�����hql��ѯ��¼  
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
	* ���ܣ�����hql��ѯ��¼  
	*    
	* @param strhql  
	* @param name  
	* @param param  
	* @return List  
	*/
	@SuppressWarnings("unchecked")
	public List findByNamedParam(String strhql, String name, Object param) {
		//budong
		return null;
	}

	/**  
	* ���ܣ�SQL��ѯ  
	* @param strsql  
	* @return  
	*/
	@SuppressWarnings("unchecked")
	public List findBySql(String strsql) {
		return this.getSession().createSQLQuery(strsql).list();
	}

	/**  
	* ���ܣ���ѯ���������ļ�¼��  
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
	* ���ܣ���ҳ��ѯ  
	*   
	* @param Page ��ҳ������
	* @param   
	* @param strhql  
	* @return List  
	*/
	@SuppressWarnings("unchecked")
	public List query(Page page,String strhql) {
		// TODO;
		List list=null;
		//������ѯ
		Query query = this.getSession().createQuery(strhql);
		if(page!=null){
			//����query�ĵ�һ������
			query.setFirstResult(((page.getPageIndex()-1)*page.getPageRecordCount()));
			//����query����������
			query.setMaxResults(page.getPageRecordCount());
		}
		list = query.list();
		
		return list;
	}

	/**  
	* ���ܣ���ҳ��ѯ  
	*   
	* @param Page ��ҳ������ 
	* @param  
	* @param queryString  
	* @param obj  
	* @return List  
	*/
	@SuppressWarnings("unchecked")
	public List query(Page page, String strhql, Object obj) {
		// TODO;
		List list=null;
		//������ѯ
		Query query = this.getSession().createQuery(strhql);
		if(page!=null){
			//����query�ĵ�һ������
			query.setFirstResult(((page.getPageIndex()-1)*page.getPageRecordCount()));
			//����query����������
			query.setMaxResults(page.getPageRecordCount());
		}
		//���ò���
		query.setParameter(0, obj);
		list = query.list();
		
		return list;
	}

	/**  
	* ���ܣ���ҳ��ѯ  
	* @param Page ��ҳ������
	* @param 
	* @param strhql  
	* @param params  
	* @return  
	*/
	@SuppressWarnings("unchecked")
	public List query(Page page, String strhql, List params) {
		// TODO;
		List list=null;
		//������ѯ
		Query query = this.getSession().createQuery(strhql);
		if(page!=null){
			//����query�ĵ�һ������
			query.setFirstResult(((page.getPageIndex()-1)*page.getPageRecordCount()));
			//����query����������
			query.setMaxResults(page.getPageRecordCount());
		}
		//���ò���
		 for(int i=0;i<params.size();i++){
			 query.setParameter(i, params.get(i));
		 }
		list = query.list();
	
		return list;
	}

	/**  
	* ���ܣ���ҳ��ѯ  
	*   
	* @param pageNo  
	* @param pageSize  
	* @param strsql  
	* @return List  
	*/
	@SuppressWarnings("unchecked")
	public List queryBySql(Page page, String strsql) {
		// TODO;
		List list=null;
		//������ѯ
		Query query = this.getSession().createSQLQuery(strsql);
		if(page!=null){
			//����query�ĵ�һ������
			query.setFirstResult(((page.getPageIndex()-1)*page.getPageRecordCount()));
			//����query����������
			query.setMaxResults(page.getPageRecordCount());
		}
		list = query.list();
		
		return list;
	}

	/**  
	* ���ܣ���ҳ��ѯ  
	* @param pageNo  
	* @param pageSize  
	* @param strsql  
	* @param params  
	* @return  
	*/
	@SuppressWarnings("unchecked")
	public List queryBySql(Page page, String strsql, List params) {
		// TODO;
		List list=null;
		//������ѯ
		Query query = this.getSession().createSQLQuery(strsql);
		if(page!=null){
			//����query�ĵ�һ������
			query.setFirstResult(((page.getPageIndex()-1)*page.getPageRecordCount()));
			//����query����������
			query.setMaxResults(page.getPageRecordCount());
		}
		//���ò���
		 for(int i=0;i<params.size();i++){
			 query.setParameter(i, params.get(i));
		 }
		list = query.list();
		
		return list;
	}

	/**  
	* ���ܣ�ִ��SQL��䣬��Ҫ�Ǹ�����ɾ����¼��SQL��䣬����Ҫ����ֵ��  
	*   
	* @param strsql  
	*/
	public int excuteSql(String strsql,Object[] val) {
		return this.getHibernateTemplate().bulkUpdate(strsql,val);
	}
	
	/**
	 * <dl>
	 * <b>������:batchDelete</b>
	 * <dd>�������ã�����ɾ������
	 * <dd>��д��ע��(����������дԭ�򡢽����ע)
	 * <dd>����������(������������������������� �C ��ѡ)
	 * <dd>ִ�����̣�(�����������������ִ������ �C ��ѡ)
	 * <dd>���÷�����(�����������������ʹ�÷��� �C ��ѡ)
	 * <dd>ע�����(�����������������ע������ �C ��ѡ) 
	 * <dd>@param cls            ɾ���������class
	 * <dd>@param keyProperty    ɾ�����������������
	 * <dd>@param idStr          ɾ������ı���ַ��� for example  '1,2,4,34,23'
	 * <dd>@return               int
	 * </dl>
	*/
	@SuppressWarnings("unchecked")
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
