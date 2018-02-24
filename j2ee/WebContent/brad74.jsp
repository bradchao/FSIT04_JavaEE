<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<sql:setDataSource driver="com.mysql.jdbc.Driver"
	url="jdbc:mysql://localhost/brad" 
	user="root" password="root" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<sql:transaction>
	<sql:update var="n" 
		sql="insert into member (account,passwd,realname) values (?,?,?)">
		<sql:param>test1</sql:param>
		<sql:param>test11</sql:param>
		<sql:param>test111</sql:param>
	</sql:update>
	<sql:query var="lastid">
		select last_insert_id() as newId
	</sql:query>
</sql:transaction>

<c:if test="${n > 0 }">
last id: ${lastid.rows[0].newId }
</c:if>



</body>
</html>