package com.momo.struts.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 动态result
 * @author MoYalan
 *
 */
public class DynamicResultAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String t;

	public String getT() {
		return t;
	}

	public void setT(String t) {
		this.t = t;
	}
	
	public String execute() {
		if("1".equals(t)) {
			t = "dynamic1.jsp";
		} else if("2".equals(t)){
			t = "dynamic2.jsp";
		}
		return SUCCESS;
	}

}
