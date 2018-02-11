<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="error.jsp" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<sql:setDataSource driver="com.mysql.jdbc.Driver"
	url="jdbc:mysql://localhost/brad" 
	user="root" password="root" />

<c:if test="${!empty param.delid }">
	<sql:update>
		delete from member where id = ?
		<sql:param>${param.delid }</sql:param>
	</sql:update>
</c:if>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<sql:query var="result">select * from member</sql:query>
<table width="100%" border="1">
	<tr>
		<th>Id.</th>
		<th>Name</th>
		<th>Real Name</th>
		<th>Delete</th>
		<th>Edit</th>
	</tr>
	
	<script>
		function confirmDel(name){
			return confirm("Delete " + name + " ?");
		}
	</script>
	
	<c:forEach items="${result.rows }" var="row">
		<tr>
			<td>${row.id }</td>
			<td>${row.account }</td>
			<td>${row.realname }</td>
			<td><a href="?delid=${row.id }" 
				onclick="return confirmDel('${row.account }');">Delete</a></td>
			<td><a href="brad73.jsp?editid=${row.id }">Edit</a></td>
		</tr>
	</c:forEach>
	
</table>


</body>
</html>