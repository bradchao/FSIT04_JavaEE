package tw.brad.j2ee;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Brad05")
public class Brad05 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doTask(request, response, "doGet");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doTask(request, response, "doPost");
	}

	private void doTask(HttpServletRequest request, HttpServletResponse response,
			String what) 
			throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter pw = response.getWriter();
		pw.write("Hello, 您好:" + what + "<br />");
		
		Enumeration<String> params = request.getParameterNames();
		while (params.hasMoreElements()) {
			String key = params.nextElement();
			String value = request.getParameter(key);
			pw.write(key + ":" + value  + "<br />");
			System.out.println(value);
		}
		
		
		
		
		
		pw.flush();
		pw.close();
		
		
		
		
	}
	
}
