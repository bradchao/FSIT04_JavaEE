<%@page import="org.json.JSONObject"%>
<%@page import="org.json.JSONArray"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:import 
	var="data"
	url="http://data.coa.gov.tw/Service/OpenData/ODwsv/ODwsvSuggestTravel.aspx" />

<%
	String strJSON = (String)pageContext.getAttribute("data");
	JSONArray root = new JSONArray(strJSON);
	
	for (int i=0; i<root.length(); i++){
		JSONObject row = root.getJSONObject(i);
		String id = row.getString("ID");
		String name = row.getString("Name");
	
		out.println(id + ":" + name + "<br>");
	}
%>


</body>
</html>