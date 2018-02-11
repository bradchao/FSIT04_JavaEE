<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!--  JSTL -->
<jsp:directive.page import="tw.brad.beans.Member" />
<%
	Member member = new Member();
	member.setId("002"); member.setName("Brad");
%>
<jsp:declaration>
	int i; String name;
</jsp:declaration>

<jsp:scriptlet>
	i = 10;
	name = "III";
</jsp:scriptlet>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
Member toString: <jsp:expression>member</jsp:expression><br />
<jsp:text>Hello, World</jsp:text>



</body>
</html>