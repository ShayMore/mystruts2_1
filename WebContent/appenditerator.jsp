<%@ page language="java" contentType="text/html; charset=GBK"
    pageEncoding="GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:append var="myiterator">
	<s:param value="%{list1}"/>
	<s:param value="%{list2}"/>
	<s:param value="%{list3}"/>
</s:append>
<s:iterator value="%{#myiterator}">
	<s:property/>
</s:iterator>
<div>-----------------</div><br/>
<s:iterator value="%{list1}">
	<s:property/>
</s:iterator>
<s:iterator value="%{list2}">
	<s:property/>
</s:iterator>
<s:iterator value="%{list3}">
	<s:property/>
</s:iterator>
</body>
</html>