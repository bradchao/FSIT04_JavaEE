<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*, java.io.*" %>
<%@ page import="java.util.*" %>
<%@ page errorPage="brad49.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	int a =10, b = 0;
	try{
		out.println(a / b);
	}catch(Exception e){
		out.println("ERROR");
//		response.sendError(
//				HttpServletResponse.SC_BAD_REQUEST, "message");
		response.sendRedirect("brad49.jsp?");
	}
%>


</body>
</html>