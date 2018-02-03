package tw.brad.j2ee;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;


@WebServlet("/Brad02")
public class Brad02 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		Enumeration<String> headerNames =  request.getHeaderNames();
		while (headerNames.hasMoreElements()) {
			String header = headerNames.nextElement();
			System.out.println(header + ":");
			
			Enumeration<String> values = request.getHeaders(header);
			while (values.hasMoreElements()) {
				String value = values.nextElement();
				System.out.println(value);
			}
		}
		System.out.println("-------");
	}
}
