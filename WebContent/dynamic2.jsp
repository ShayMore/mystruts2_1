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
Dynamic2.jsp<br/>
flag:<s:property value="flag"/>
<s:if test="%{flag==1}">
	<div>type=2</div>
</s:if>
<s:elseif test="%{flag==2}">
	<div>type=1</div>
</s:elseif>
<s:debug></s:debug>
</body>
</html>