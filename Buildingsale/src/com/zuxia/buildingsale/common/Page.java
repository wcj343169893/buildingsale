package com.zuxia.buildingsale.common;

import java.io.Serializable;

/**
 * Page概要说明 分页信息
 *
 * @author chaojun
 */
@SuppressWarnings("serial")
public class Page implements Serializable {

	/**
	 * pageRecordCount属性概述 每页显示的记录数量(默认值20) 
	 * 
	 */
	private int pageRecordCount = 20;
	/**
	 * pageIndex属性概述 当前页码(默认值1)
	 * 
	 */
	private int pageIndex = 1;
	/**
	 * totalRecordCount属性概述 总记录数(默认值0)
	 * 
	 */
	private int totalRecordCount = 0;
	/**
	 * pageCount属性概述 总的页面数量(默认值1)
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
	 * getPageRecordCount方法概述 每页显示的记录数量(默认值20) 
	 * 
	 *
	 * @return
	 */
	public int getPageRecordCount() {
		return pageRecordCount;
	}

	/**
	 * setPageRecordCount方法概述 每页显示的记录数量(默认值20) 
	 * 
	 *
	 * @param pageRecordCount
	 */
	public void setPageRecordCount(int pageRecordCount) {
		this.pageRecordCount = pageRecordCount;
	}

	/**
	 * getPageIndex方法概述  当前页码(默认值1)
	 * 
	 *
	 * @return
	 */
	public int getPageIndex() {
		return pageIndex;
	}

	/** 
	 * setPageIndex方法概述  当前页码(默认值1)
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
		return "分页结果：("+this.getPageIndex()+"/"+this.getPageCount()+")[每页显示:"+this.getPageRecordCount()+",共查询到:"+this.getTotalRecordCount()+"]";
	}
}
