/**
 *******************************************************************************
 * filename    : MyAction.java
 * package     : com.zuxia.buildingsale.common
 * createdate  : 2009-12-16 ����06:30:39
 * project     : Buildingsale
 * @version    : 1.0
 * @author     : Administrator
 * (c) Copyright 2009 
 *	�����ܸ�Ҫ��
 *  XXX
 *******************************************************************************
 */
package com.zuxia.buildingsale.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * MyAction��Ҫ˵��
 * 
 *
 * @author Administrator
 */
public class MyAction extends ActionSupport {
	protected HttpServletRequest request;
	protected HttpServletResponse response;
	
	public void init(){
		request=ServletActionContext.getRequest();
		response=ServletActionContext.getResponse();
	}
	
}
