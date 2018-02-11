<%@page import="java.util.*"%>
<%@page import="tw.brad.beans.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%
	String[] names = {"Brad", "Peter", "OK"};
	request.setAttribute("usernames", names);
	
	LinkedList<String> list = new LinkedList<>();
	list.add("AAA");
	list.add("BBB");
	list.add("CCC");
	request.setAttribute("lists", list);
	
	HashMap<String,String> map = new HashMap<>();
	map.put("key1", "value1");
	map.put("key2", "value2");
	map.put("key3", "value3");
	request.setAttribute("maps", map);
	
	pageContext.setAttribute("var1", 111);
	request.setAttribute("var1", 222);
	session.setAttribute("var1", 333);
	application.setAttribute("var1", 444);
	
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
Name1: ${usernames[1] }<br />
List1: ${lists[param.index] }<br>
Map value: ${maps[param.key] }<br>
Map value: ${maps["key1"] }<br>
${10 + 3 }<br/>
${param.x > param.y }<br />
${10 > 3 }<br>
${ (param.x == "10") ? "Yes":"No" }<br>
PageContext: ${pageScope.var1 }<br/>
Request: ${requestScope.var1 }<br />
Session: ${sessionScope.var1 }<br/>
Application: ${applicationScope.var1 }<br />
Lottery: <%= BradAPI.getLottery() %><br />
Lottery EL: ${BradAPI.getLottery() }<br />
Ya: ${BradAPI.sayYa("Brad") }<br />
Ya: ${BradAPI.sayYa(param.name) }<br />





</body>
</html>