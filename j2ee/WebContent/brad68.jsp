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
	String[] names = {"Brad", "Tony", "Andy", "Mary", "John", "Vincent", "Kevin"};
	pageContext.setAttribute("names", names);
	
%>

<table width="100%" border="1">
	<tr>
		<th>index</th>
		<th>Name</th>
		<th>Count</th>
		<th>is last</th>
		<th>is first</th>
	</tr>

	<c:forEach var="name" items="${names }"
		varStatus="status"
		begin="0" end="100" step="1">	
		<tr>
			<td>${status.index }</td>
			<td>${name }</td>
			<td>${status.count }</td>
			<td>${status.last }</td>
			<td>${status.first }</td>
		</tr>
	</c:forEach>
	
</table>


</body>
</html>