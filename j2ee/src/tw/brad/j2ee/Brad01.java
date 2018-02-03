package tw.brad.j2ee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Brad01
 */
@WebServlet("/Brad01")
public class Brad01 extends HttpServlet {
	private int i;
	
    public Brad01() {
        super();
        System.out.println("Brad01()");
    }

	protected void doGet(
			HttpServletRequest request, HttpServletResponse response) 
					throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		pw.append("Served at: ");
		pw.append("Hello, Brad:" + i++);
		pw.flush();
		System.out.println("OK");
	}

}
