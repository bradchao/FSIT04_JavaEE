<%@ tag dynamic-attributes="product" %>
<%@ tag import="java.util.*" %>
<%@ attribute name="user" required="true" %>
<%
	//out.println("<h1>Brad Big Company</h1>");
	
	HashMap<String,String> ps = 
		(HashMap<String,String>)jspContext.getAttribute("product");
	
	out.println("<tr>");
	//if ( ps.containsKey("name")){
		out.println("<td>" + ps.get("name") + "</td>");
	//}
		out.println("<td>" + ps.get("price") + "</td>");
	//out.println(ps.get("price"));
	out.println("</tr>");
%>