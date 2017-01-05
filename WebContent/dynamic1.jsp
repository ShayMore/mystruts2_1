<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Dynamic1.jsp<br/>
t:<s:property value="t"/><br/>
flag:<s:property value="flag"/><br/>
<s:if test="%{flag==1}">
	<div>type=${flag }${flag }${flag }${flag }</div>
</s:if>
<s:elseif test="%{flag==2}">
	<div>type=${flag }</div>
</s:elseif>
</body>
</html>