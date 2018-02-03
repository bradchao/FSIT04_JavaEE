package tw.brad.j2ee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Brad07")
public class Brad07 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int x, y, op, result;
		x = y = op = result = 0;
		String opString = "?";
		
		try {
			x = Integer.parseInt(request.getParameter("x"));
			y = Integer.parseInt(request.getParameter("y"));
			op = Integer.parseInt(request.getParameter("op"));
			
			switch (op) {
				case 1: result = x + y; opString="+"; break;
				case 2: result = x - y; opString="-"; break;
				case 3: result = x * y; opString="x"; break;
				case 4: result = x / y; opString="/"; break;
			}
			
		}catch (Exception e) {
			
		}
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter pw = response.getWriter();
		pw.write(x + opString + y + " = " + result);
		pw.flush();
		pw.close();
		
	}

}
