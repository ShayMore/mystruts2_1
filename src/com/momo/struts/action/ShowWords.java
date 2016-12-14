package com.momo.struts.action;

import com.momo.struts.exceptions.MyException;
import com.opensymphony.xwork2.ActionSupport;

public class ShowWords extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String words;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWords() {
		return words;
	}
	public void setWords(String words) {
		this.words = words;
	}
	
	
	public String input(){
		if("".equals(name)) {
			throw new MyException("没有输入内容");
		} else {
			words = "欢迎您 " + name;
			return SUCCESS;
		}
	}

}
