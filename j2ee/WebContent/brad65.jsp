<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="member" class="tw.brad.beans.Member" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	pageContext.setAttribute("x", 123);
	int var3 = 234;
%>
<c:out value="Hello, World" /><br />
<c:out value="${'Hello, World2' }" /><br />
<c:out value="${x }" default="no value" /><br />
<c:out value="${y }" default="no value" />
<c:set var="var1" value="value1" scope="page" />
Var1: ${var1 }<br />
<c:set var="var2">123</c:set>
Var2: ${var2 }<br />
<c:set var="var3"><%= 345 %></c:set>
Var3: ${var3 }<br />
<c:set var="var4"><%
	out.println(456);
%></c:set>
Var3: ${var4 }<br />
<c:set target="${member }" property="id">004</c:set>
<c:set target="${member }" property="name">Brad</c:set>
${member }<br />
<c:remove var="var1" />
Var1: <c:out value="${var1 }" default="no data" />


</body>
</html>