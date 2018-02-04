package tw.brad.j2ee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Brad23")
public class Brad23 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		//request.setCharacterEncoding("UTF-8");
		
		String account = request.getParameter("account");
		String passwd = request.getParameter("passwd");
		String realname = request.getParameter("realname");
		
		if (account != null) {
			testMySQL(account, passwd, realname);
		}
	}

	private void testMySQL(String account, String passwd, String realname) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = 
				DriverManager.getConnection(
					"jdbc:mysql://localhost/brad", "root", "root");
			Statement stmt = conn.createStatement();
			String sql = "INSERT INTO member (account,passwd,realname)" +
					" VALUES ('" + account + "','" + passwd + "','" + realname +"')";
			stmt.executeUpdate(sql);
			stmt.close();
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
