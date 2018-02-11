<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="error.jsp" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource driver="com.mysql.jdbc.Driver"
	url="jdbc:mysql://localhost/brad" 
	user="root" password="root" />
<sql:query var="result" sql="select * from member" />
<c:forEach items="${result.rows }" var="row">
${row.id } : ${row.account } : ${row.realname }<br />
</c:forEach>

<hr />

<sql:query var="result">
select * from member order by account
</sql:query>
<c:forEach items="${result.rows }" var="row">
${row.id } : ${row.account } : ${row.realname }<br />
</c:forEach>

	
	
	


</body>
</html>