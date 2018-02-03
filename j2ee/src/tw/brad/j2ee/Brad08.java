package tw.brad.j2ee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Brad08")
public class Brad08 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Input
		String xStr, yStr, rStr;
		int op;
		try {
			int x = Integer.parseInt(request.getParameter("x"));
			int y = Integer.parseInt(request.getParameter("y"));
			op = Integer.parseInt(request.getParameter("op"));
			int r = 0;
			
			switch (op) {
				case 1: r = x + y; break;
				case 2: r = x - y; break;
				case 3: r = x * y; break;
				case 4: r = x / y; break;
			}
			
			xStr = "" + x; yStr = "" + y; rStr = "" + r;
		}catch (Exception e) {
			xStr = yStr = rStr = "";
			op = 1;
		}
		
		
		// Output
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter pw = response.getWriter();
		pw.append("<form>")
			.append("<input type='text' name='x' value='" + xStr +"' />\n")
			.append("<select name='op'>")
			.append("<option value='1' " + (op==1?"selected":"") + ">+</option>")
			.append("<option value='2' " + (op==2?"selected":"") + ">-</option>")
			.append("<option value='3' " + (op==3?"selected":"") + ">x</option>")
			.append("<option value='4' " + (op==4?"selected":"") + ">/</option>")
			.append("</select>\n")
			.append("<input type='text' name='y' value='" + yStr + "' />\n")
			.append("<input type='submit' value='=' />\n")
			.append(rStr)
			.append("</form>");
		
		
		
	}


}
