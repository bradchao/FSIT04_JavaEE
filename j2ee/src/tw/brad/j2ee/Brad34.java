package tw.brad.j2ee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Set Cookie
@WebServlet("/Brad34")
public class Brad34 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter pw = response.getWriter();
		request.setCharacterEncoding("UTF-8");
		
		Cookie cookieRememmber = new Cookie("remember", "true");
		cookieRememmber.setMaxAge(1*60);
		response.addCookie(cookieRememmber);
		
		Cookie cookieAccount = new Cookie("account", "brad");
		cookieAccount.setMaxAge(1*60);
		response.addCookie(cookieAccount);
		
		Cookie cookiePasswd = new Cookie("passwd", "123456");
		cookiePasswd.setMaxAge(1*60);
		response.addCookie(cookiePasswd);
		
		
		
	
	
	}

}
