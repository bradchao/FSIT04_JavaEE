package tw.brad.j2ee;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Brad22")
public class Brad22 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String x = request.getParameter("x");
		String y = request.getParameter("y");
		String result = request.getParameter("result");
		
		//out.println(x + " + " + y + " = " + result);
		try {
			String html = loadView("mycal2.html");
			String outHtml = String.format(html, x, y, result);
			out.println(outHtml);
		}catch (Exception e) {
			out.println("Sever Busy");
		}

	}

	private String loadView(String file) throws Exception {
		String tempPath = getServletContext().getInitParameter("template-path");
		File viewFile = new File(tempPath, file);
		byte[] buf = new byte[(int)viewFile.length()];
		BufferedReader reader = new BufferedReader(new FileReader(viewFile));
		StringBuffer sb = new StringBuffer(); String line = null;
		while ((line = reader.readLine()) != null) {
			sb.append(line);
		}
		reader.close();
	
		return sb.toString();
	}
	
	
}
