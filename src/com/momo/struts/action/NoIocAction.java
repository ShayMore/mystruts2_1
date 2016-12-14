package com.momo.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 直接访问Servlet API  非Ioc的方式：* 推荐*
 * @author MoYalan
 *
 */
@SuppressWarnings("serial")
public class NoIocAction extends ActionSupport {
	
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
	
	public String execute() {
		System.out.println("NoIocAction");
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		session.setAttribute("bookName", bookName);
		session.setAttribute("bookPrice", bookPrice);
		session.setAttribute("bookPress", bookPress);
		return SUCCESS;
	}
}
