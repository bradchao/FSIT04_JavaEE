<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="tw.brad.j2ee.Member"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Member member = (Member)application.getAttribute("member");
	out.println(member.getName() + ":" +member.getAge());
	member.setAge(member.getAge()+1);
	//application.setAttribute("x", x);
%>
</body>
</html>