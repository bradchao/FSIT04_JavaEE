<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	//tw.brad.beans.Member member2 = new tw.brad.beans.Member();
	//member2.setId("001");
	//member2.setName("Brad");
%>

<jsp:useBean id="member" class="tw.brad.beans.Member" />
<jsp:setProperty name="member" property="id" value="001"/>
<jsp:setProperty name="member" property="name" value="Brad"/>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

Welcome, 
<jsp:getProperty property="name" name="member"/>

</body>
</html>