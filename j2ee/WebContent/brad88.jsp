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
	out.println("isNew1 = " + session.isNew() +"<br>");
	String cid = request.changeSessionId();
	String nid = session.getId();
	out.println("cid = " + cid + "<br>");
	out.println("nid = " + nid + "<br>");
	out.println("isNew2 = " + session.isNew()+"<br>");
	out.println("key1 = " + session.getAttribute("key1") + "<br/>");
	
%>
${key2 }
</body>
</html>