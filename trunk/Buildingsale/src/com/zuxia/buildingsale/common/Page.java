package com.zuxia.buildingsale.common;

import java.io.Serializable;

/**
 * Page��Ҫ˵�� ��ҳ��Ϣ
 *
 * @author chaojun
 */
@SuppressWarnings("serial")
public class Page implements Serializable {

	/**
	 * pageRecordCount���Ը��� ÿҳ��ʾ�ļ�¼����(Ĭ��ֵ20) 
	 * 
	 */
	private int pageRecordCount = 20;
	/**
	 * pageIndex���Ը��� ��ǰҳ��(Ĭ��ֵ1)
	 * 
	 */
	private int pageIndex = 1;
	/**
	 * totalRecordCount���Ը��� �ܼ�¼��(Ĭ��ֵ0)
	 * 
	 */
	private int totalRecordCount = 0;
	/**
	 * pageCount���Ը��� �ܵ�ҳ������(Ĭ��ֵ1)
	 * 
	 */
	private int pageCount = 1;

	public void setPage(int totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
		if (this.pageRecordCount > 100 || this.pageRecordCount < 0) {
			this.pageRecordCount = 100;
		}
		this.pageCount = this.totalRecordCount / this.pageRecordCount;
		if (this.totalRecordCount % this.pageRecordCount != 0) {
			this.pageCount++;
		}
		if (this.pageCount < 1) {
			this.pageCount = 1;
		}
		// this.pageIndex = pageIndex;
		if (this.pageIndex < 1) {
			this.pageIndex = 1;
		}
		if (this.pageIndex > this.pageCount) {
			this.pageIndex = this.pageCount;
		}
	}

	/**
	 * getPageRecordCount�������� ÿҳ��ʾ�ļ�¼����(Ĭ��ֵ20) 
	 * 
	 *
	 * @return
	 */
	public int getPageRecordCount() {
		return pageRecordCount;
	}

	/**
	 * setPageRecordCount�������� ÿҳ��ʾ�ļ�¼����(Ĭ��ֵ20) 
	 * 
	 *
	 * @param pageRecordCount
	 */
	public void setPageRecordCount(int pageRecordCount) {
		this.pageRecordCount = pageRecordCount;
	}

	/**
	 * getPageIndex��������  ��ǰҳ��(Ĭ��ֵ1)
	 * 
	 *
	 * @return
	 */
	public int getPageIndex() {
		return pageIndex;
	}

	/** 
	 * setPageIndex��������  ��ǰҳ��(Ĭ��ֵ1)
	 * 
	 *
	 * @param pageIndex
	 */
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public int getTotalRecordCount() {
		return totalRecordCount;
	}

	public void setTotalRecordCount(int totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	
	public String toString(){
		return "��ҳ�����("+this.getPageIndex()+"/"+this.getPageCount()+")[ÿҳ��ʾ:"+this.getPageRecordCount()+",����ѯ��:"+this.getTotalRecordCount()+"]";
	}
}
