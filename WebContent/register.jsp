<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>struts异常处理实例——注册</title>
</head>
<body>
<s:property value="exception.message"/><br/>
<s:form action="register.momo" method="post">
	<s:textfield name="username" label="用户名"/>
	<s:password name="password" label="密码"/>
	<s:password name="pwdretype" label="确认密码"/>
	<s:submit value="注册"/>
</s:form>
</body>
</html>