package tw.brad.j2ee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Brad50")
public class Brad50 extends HttpServlet {
	private int i;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("UTF-8");
		
		int a = 0; 
		while ( true) {
			a = (int)(Math.random()*6+1);
			System.out.println(a);
			if (a==6) {
				out.println("i got it:" + ++i);
				break;
			}else {
				try {
					Thread.sleep(1*1000);
				}catch(Exception e) {
					
				}
			}
		}
		
	}
}
