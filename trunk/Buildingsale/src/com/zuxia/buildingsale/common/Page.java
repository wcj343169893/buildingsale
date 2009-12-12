package com.zuxia.buildingsale.common;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Page implements Serializable {

	private int pageRecordCount = 20;// 每页显示的记录数量(默认值)
	private int pageIndex = 1;// 当前页码
	private int totalRecordCount = 0;// 总记录数
	private int pageCount = 1;// 总的页面数量

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

	public int getPageRecordCount() {
		return pageRecordCount;
	}

	public void setPageRecordCount(int pageRecordCount) {
		this.pageRecordCount = pageRecordCount;
	}

	public int getPageIndex() {
		return pageIndex;
	}

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
}
