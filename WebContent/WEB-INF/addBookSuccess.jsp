<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
添加成功，信息如下：<br/>
	书名：<s:property value="#session.bookName"/><br/><br/>
	价格：<s:property value="#session.bookPrice"/><br/><br/>
	出版社：<s:property value="#session.bookPress"/>
</center>
</body>
</html>