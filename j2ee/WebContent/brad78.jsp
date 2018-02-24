<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="org.apache.commons.fileupload.servlet.*"%>
<%@page import="org.apache.commons.fileupload.disk.*"%>
<%@page import="java.io.*, java.util.*" %>
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
	
	ServletFileUpload upload = new ServletFileUpload(factory);
	List<FileItem> items = upload.parseRequest(request);
	
	int i = 1;
	for (FileItem item : items){
		String name = item.getName();
		long size = item.getSize();
		
		if (size > 0){
			String fname = item.getFieldName();
		
			out.println(name + ":" + size + "<br>");
			item.write(new File(uploadPath, "brad" + i++ + ".png"));
		}
	}
	
%>