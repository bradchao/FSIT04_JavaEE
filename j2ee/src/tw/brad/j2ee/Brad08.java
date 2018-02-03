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

		
		// Output
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter pw = response.getWriter();
		pw.append("<form>")
			.append("<input type='text' name='x' />")
			.append("<select name='op'>")
			.append("<option value='1'>+</option>")
			.append("<option value='2'>-</option>")
			.append("<option value='3'>x</option>")
			.append("<option value='4'>/</option>")
			.append("</select>")
			.append("<input type='text' name='y' />")
			.append("<input type='submit' value='=' />")
			.append("</form>");
		
		
		
	}


}
