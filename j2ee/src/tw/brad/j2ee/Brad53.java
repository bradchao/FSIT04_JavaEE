package tw.brad.j2ee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Statement;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Brad53")
public class Brad53 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("UTF-8");
		
		ServletContext servletContext = request.getServletContext();
		String key1 = (String)servletContext.getAttribute("key1");
		out.print("key1 = " + key1);
		
		try {
			Connection conn = (Connection)servletContext.getAttribute("conn");
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("insert into member (account,passwd,realname) values ('kkk','mmm','ppp')");
			out.print("update OK");
		}catch(Exception e) {
			out.print(e.toString());
		}
		
		
		
		
	
	}

}
