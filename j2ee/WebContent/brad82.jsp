<%@page import="javax.mail.internet.InternetAddress"%>
<%@page import="javax.mail.internet.MimeMessage"%>
<%@page import="java.util.Properties"%>
<%@page import="javax.mail.*"%>
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
	
	Properties props = new Properties();
	props.put("mail.smtp.host", "ms7.hinet.net");
	
	Session session2  = Session.getDefaultInstance(props);
	
	try{
		Message message = new MimeMessage(session2);
		message.setFrom(new InternetAddress("bradcafe@gmail.com"));
		message.setRecipient(Message.RecipientType.TO, 
				new InternetAddress("bradcafe@gmail.com")
				);
		message.setText("Hello, Test");
		message.setSubject("Hello, Subject");
		Transport.send(message);
		out.println("OK");
	}catch(Exception e){
		out.println("Exception:" +e.toString());
	}
	
	
	
	
	
	
	
	
	



%>



</body>
</html>