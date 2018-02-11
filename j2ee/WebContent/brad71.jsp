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
	
<sql:update var="count">
insert into member (account,passwd,realname) values (?,?,?)
<sql:param>III</sql:param>
<sql:param>1234</sql:param>
<sql:param>III ok</sql:param>
</sql:update>	
${count }
<c:if test="${count >= 1 }">Insert OK</c:if>


	


</body>
</html>