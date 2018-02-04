package tw.brad.j2ee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Brad27")
public class Brad27 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String passwd = "123456";
		String salt = BCrypt.gensalt();
		String newpasswd = BCrypt.hashpw(passwd, salt);
		out.println(newpasswd);
		
		if (BradAPI.ckPasswd("123456", newpasswd)) {
			out.println("OK");
		}else {
			out.println("XX");
		}
		
	}


	
	
}
