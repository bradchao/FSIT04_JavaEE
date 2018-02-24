<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@page import="java.io.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int maxFileSize = 8 * 1024 * 1024;
	int maxMemSize = 8 * 1024 * 1024;


	String uploadPath = 	
		pageContext.getServletContext().getInitParameter("file-upload");

	DiskFileItemFactory factory = new DiskFileItemFactory();
	factory.setSizeThreshold(maxMemSize);
	factory.setRepository(new File("c:/brad"));
	
	
	
	


	





%>