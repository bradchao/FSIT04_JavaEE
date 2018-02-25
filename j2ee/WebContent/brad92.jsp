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
	int test1 = (int)(Math.random()*49+1);
	//out.println(test1);
	
	request.setAttribute("test1", test1);
	//Integer test2 = (Integer)request.getAttribute("test1");
	//out.println(test2);
	//response.sendRedirect("brad93.jsp");
	
	request.getRequestDispatcher("brad93.jsp").forward(request, response);
	

%>
</body>
</html>