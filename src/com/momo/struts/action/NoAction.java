package com.momo.struts.action;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class NoAction extends ActionSupport {
	
	private String page;
	
	
	public String getPage() {
		return page;
	}


	public void setPage(String page) {
		this.page = page;
	}


	public String execute() {
		return SUCCESS;
	}

}
