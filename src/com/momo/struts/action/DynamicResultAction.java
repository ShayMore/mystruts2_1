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
	private int flag;

	public String getT() {
		return t;
	}

	public void setT(String t) {
		this.t = t;
	}
	
	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public String execute() {
		if("1".equals(t)) {
			t = "dynamic1.jsp";
			flag = 1;
		} else if("2".equals(t)){
			t = "dynamic2.jsp";
			flag = 2;
		}
		return SUCCESS;
	}

}
