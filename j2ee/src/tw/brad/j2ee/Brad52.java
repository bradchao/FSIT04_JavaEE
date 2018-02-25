package tw.brad.j2ee;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.AsyncContext;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/Brad52",
	asyncSupported=true)
public class Brad52 extends HttpServlet {
	
	@Override
	public void init() throws ServletException {
		super.init();
		ServletContext servletContext = getServletContext();
		List<AsyncContext> asyncs = new LinkedList<>();
		servletContext.setAttribute("asyncs", asyncs);
		
		MyAsyncListener asyncListener = new MyAsyncListener();
		servletContext.setAttribute("asyncListener",asyncListener);
	}
	
	
	
	protected void doGet(
			HttpServletRequest request, HttpServletResponse response) 
					throws ServletException, IOException {
		System.out.println("add1");
		ServletContext servletContext = getServletContext();
		List<AsyncContext> asyncs = (List)servletContext.getAttribute("asyncs");
		
		MyAsyncListener asyncListener = 
				(MyAsyncListener)servletContext.getAttribute("asyncListener");
		
		synchronized (asyncs) {
			AsyncContext async = request.startAsync();
			async.addListener(asyncListener);
			async.setTimeout(10000);
			
		
			asyncs.add(async);
			System.out.println("add2");
		}

		
		
		
		
		
	}



}
