package tw.brad.j2ee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Brad14")
public class Brad14 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("Brad15?name=ok");
		RequestDispatcher dispatcher2 = request.getRequestDispatcher("Brad16");
		RequestDispatcher dispatcher3 = request.getRequestDispatcher("brad17.html");
		
		out.println("<h1>Brad Big Company</h1>");
		out.println("<hr />");
		
		dispatcher.include(request, response);
		
		out.println("<hr />");
		dispatcher2.include(request, response);
		out.println("<hr />");
		dispatcher3.include(request, response);
		
	}
}
