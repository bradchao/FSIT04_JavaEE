package tw.brad.j2ee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Brad28")
public class Brad28 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String account = request.getParameter("account");
		String passwd = request.getParameter("passwd");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = 
					DriverManager.getConnection(
						"jdbc:mysql://localhost/brad", "root", "root");
			Statement stmt = conn.createStatement();
			String sql = "SELECT * FROM member WHERE account = '" + account + "'";
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				String hPasswd = rs.getString("passwd");
				if (BradAPI.ckPasswd(passwd, hPasswd)) {
					// OK
					out.print("Login SUCCESS");
				}else {
					// xx
					out.println("Login Failure");
				}
			}else {
				// no data
			}
			
			
			
		}catch(Exception e) {
			
		}
		
		
		
		
		
		
		
	
	
	}
}
