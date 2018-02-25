<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String sessionId = session.getId();
	out.println(sessionId + "<br>");
	out.println("isNew = " + session.isNew());

	session.setAttribute("key1", "value1");
	session.setAttribute("key2", "value2");
%>



</body>
</html>