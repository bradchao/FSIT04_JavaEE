<%@page import="java.util.Date"%>
<%@page import="java.util.Locale"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Locale locale = request.getLocale();
%>
Country: <%= locale.getCountry() %><br />
Country: <%= locale.getDisplayCountry() %><br />
Country: <%= locale.getLanguage() %><br />
<hr />
<fmt:setLocale value="zh_TW"/>
<fmt:setBundle basename="res"/>
<h1><fmt:message key="companyName" /></h1>
<fmt:message key="hello" /> <fmt:message key="world" /> 
<hr>
<fmt:setLocale value="en_US"/>
<fmt:setBundle basename="res"/>
<h1><fmt:message key="companyName" /></h1>
<fmt:message key="hello" /> <fmt:message key="world" /> 
<hr>
<%
	Date now = new Date();
	out.println(now + "<br />");
	pageContext.setAttribute("now", now);
%>
<fmt:setTimeZone value="Asia/Tokyo"/>
<fmt:formatDate value="${now }" type="both" dateStyle="long"/><br />
<fmt:setTimeZone value="Europe/Berlin" />
<fmt:formatDate value="${now }" pattern="yyyy-MM-dd HH:mm:ss" type="both" dateStyle="long"/><br />
Default: <fmt:formatNumber value="1234567.440123" maxFractionDigits="1" /><br />
沒有千分位: <fmt:formatNumber value="1234567.890123" groupingUsed="false"/><br />
Default: <fmt:formatNumber value="1234567.890123" 
	maxIntegerDigits="6" type="CURRENCY" currencyCode="JPY" /><br />



</body>
</html>