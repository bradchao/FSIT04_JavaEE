<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	pageContext.setAttribute("x", 123);
%>
<c:out value="Hello, World" /><br />
<c:out value="${'Hello, World2' }" /><br />
<c:out value="${x }" default="no value" /><br />
<c:out value="${y }" default="no value" />
<c:set var="var1" value="value1" />
Var1: ${var1 }<br />


</body>
</html>