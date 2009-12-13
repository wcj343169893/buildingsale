package com.zuxia.buildingsale.sys.action;

import java.io.ByteArrayInputStream;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zuxia.buildingsale.common.RandomImageUtil;

public class RandomImageAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ByteArrayInputStream inputStream;

	public ByteArrayInputStream getInputStream() {
		return inputStream;
	}

	public void setInputStream(ByteArrayInputStream inputStream) {
		this.inputStream = inputStream;
	}   
	
	public String execute(){
		RandomImageUtil rdnu=RandomImageUtil.Instance();  
        this.setInputStream(rdnu.getImage());//取得带有随机字符串的图片  
        ActionContext.getContext().getSession().put("random", rdnu.getString());//取得随机字符串放入HttpSession  
        return SUCCESS;   
	}
	
}
