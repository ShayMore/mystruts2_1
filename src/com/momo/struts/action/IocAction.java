package com.momo.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 间接访问Servlet API  Ioc的方式  ：*不推荐*
 * @author MoYalan
 *
 */
@SuppressWarnings("serial")
public class IocAction extends ActionSupport implements ServletRequestAware,ServletResponseAware {
	
	private String bookName; 		//书名
	private double bookPrice; 		//价格
	private String bookPress; 		//出版社
	private HttpServletRequest request;
	private HttpServletResponse response;

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
	
	@Override
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;		
	}

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

	public String aaa() {
		System.out.println("IocAction");
		HttpSession session = request.getSession();
		session.setAttribute("bookName", bookName);
		session.setAttribute("bookPrice", bookPrice);
		session.setAttribute("bookPress", bookPress);
		return SUCCESS;
	}

}
