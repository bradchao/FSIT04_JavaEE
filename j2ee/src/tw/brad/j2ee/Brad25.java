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

@WebServlet("/Brad25")
public class Brad25 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = 
					DriverManager.getConnection(
						"jdbc:mysql://localhost/brad", "root", "root");
			Statement stmt = conn.createStatement();
			String sql = "SELECT * FROM member";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String id = rs.getString("id");
				String account = rs.getString("account");
				String passwd = rs.getString("passwd");
				String realname = rs.getString("realname");
				
				out.println(id + ":" + account +":"+passwd +":"+realname + "<br />");
			}
			out.flush();
			
			
		}catch(Exception e) {
			out.print(e.toString());
		}
		
	}

}
