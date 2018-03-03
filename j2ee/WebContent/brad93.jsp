<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
I am brad93<br />
<%
	//Integer test1 = (Integer)request.getAttribute("test1");
	//out.println(test1);
	
	request.setAttribute("test1", 200);
	request.setAttribute("test1", 300);
	
	pageContext.setAttribute("test1", 100);
	session.setAttribute("test1", 200);
	application.setAttribute("test1", 300);
%>
page: ${pageScope.test1 }<br />
request: ${requestScope.test1 }<br />
session: ${sessionScope.test1 }<br />
application: ${applicationScope.test1 }<br />

</body>
</html>