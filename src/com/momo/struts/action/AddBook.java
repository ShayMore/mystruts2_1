package com.momo.struts.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class AddBook extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	private String bookName; 		//书名
	private double bookPrice; 		//价格
	private String bookPress; 		//出版社
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getBookPress() {
		return bookPress;
	}
	public void setBookPress(String bookPress) {
		this.bookPress = bookPress;
	}
	
	public String add(){
		System.out.println("AddBook add");
		ActionContext actionContext = ActionContext.getContext();
		actionContext.getSession().put("bookName", bookName);
		actionContext.getSession().put("bookPrice", bookPrice);
		actionContext.getSession().put("bookPress", bookPress);
		return SUCCESS;		
	}

	public String execute(){
		System.out.println("AddBook execute");
		ActionContext actionContext = ActionContext.getContext();
		actionContext.getSession().put("bookName", bookName);
		actionContext.getSession().put("bookPrice", bookPrice);
		actionContext.getSession().put("bookPress", bookPress);
		return SUCCESS;		
	}
}
