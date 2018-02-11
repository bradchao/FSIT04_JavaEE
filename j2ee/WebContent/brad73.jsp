<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page errorPage="error.jsp" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:if test="${empty param.editid and empty param.id }">
	<c:redirect url="brad72.jsp" />
</c:if>

<sql:setDataSource driver="com.mysql.jdbc.Driver"
	url="jdbc:mysql://localhost/brad" 
	user="root" password="root" />

<c:if test="${!empty param.id }">
	<sql:update>
		update member set account=?,passwd=?,realname=? where id=?
		<sql:param>${param.account }</sql:param>
		<sql:param>${param.passwd }</sql:param>
		<sql:param>${param.realname }</sql:param>
		<sql:param>${param.id }</sql:param>
	</sql:update>
	<c:redirect url="brad72.jsp" />
</c:if>

<sql:query var="result">
	select * from member where id = ?
	<sql:param>${param.editid }</sql:param>	
</sql:query>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form>
	<input type="hidden" name="id" value="${result.rows[0].id }" />
	Account: <input name="account" value="${result.rows[0].account }" /><br />
	Password: <input type="password" name="passwd" value="" /><br />
	RealName: <input name="realname" value="${result.rows[0].realname }" /><br />
	<input type="submit" value="Update" /><br />

</form>


</body>
</html>