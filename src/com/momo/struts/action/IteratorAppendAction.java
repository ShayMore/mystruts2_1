package com.momo.struts.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Iterator和Append标签对应的测试Action
 * @author MoYalan
 *
 */
public class IteratorAppendAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<String> list1;
	private List<String> list2;
	private List<String> list3;
	
	public List<String> getList1() {
		return list1;
	}
	public List<String> getList2() {
		return list2;
	}
	public List<String> getList3() {
		return list3;
	}
	
	public String execute() {
		list1 = new ArrayList<String>();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		
		list2 = new ArrayList<String>();
		list1.add("A");
		list1.add("B");
		list1.add("C");
		
		list3 = new ArrayList<String>();
		list1.add("你");
		list1.add("我");
		list1.add("他");
		
		return SUCCESS;
	}

}
