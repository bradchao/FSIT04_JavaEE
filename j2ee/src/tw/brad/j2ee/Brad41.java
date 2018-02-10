package tw.brad.j2ee;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
		name = "Brad41OK",
		urlPatterns= {"/Brad42", "/Brad43", "/iii123/good"},
		initParams={
				@WebInitParam(name="x", value="123"),
				@WebInitParam(name="y", value="456")
			}
		)
public class Brad41 extends HttpServlet {
	private ServletConfig servletConfig;
	private ServletContext servletContext;

	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("init()");
		
		servletConfig = getServletConfig();
		servletContext = getServletContext();
		
		String x = servletConfig.getInitParameter("x");
		String y = servletConfig.getInitParameter("y");
		String name = servletConfig.getServletName();
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("servlet name = " + name);

		String test = servletConfig.getInitParameter("file-upload");
		System.out.println("test = " + test);
		
		
		String realPath = servletContext.getRealPath("/");
		System.out.println(realPath);
		
		Set<String> paths = servletContext.getResourcePaths("/");
		for (String path : paths) {
			System.out.println(path);
		}
		
		
		
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("UTF-8");
	
		out.println("Hello, OK");
		
	}

}
