package com.momo.struts.action;

import org.eclipse.jdt.internal.compiler.ast.ThisReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
	private Logger logger = LoggerFactory.getLogger(this.getClass());
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
		System.out.println("啦啦~");
		logger.info("[动态结果集]点击了t="+t);
		if("1".equals(t)) {
			logger.info("[动态结果集]进入If1");
			t = "dynamic1.jsp";
			flag = 1;
		} else if("2".equals(t)){
			logger.info("[动态结果集]进入If2");
			t = "dynamic2.jsp";
			flag = 2;
		}
		logger.info("[动态结果集]execute结束");
		return SUCCESS;
	}

}
