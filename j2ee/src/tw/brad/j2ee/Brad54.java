package tw.brad.j2ee;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.servlet.AsyncContext;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/Brad54",
		asyncSupported=true)
public class Brad54 extends HttpServlet {
	private ExecutorService executorService = 
			Executors.newFixedThreadPool(1);
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext servletContext = request.getServletContext();
		List<AsyncContext> asyncs = 
				(List<AsyncContext>)servletContext.getAttribute("asyncs");
	
		MyAsyncListener asyncListener = 
				(MyAsyncListener)servletContext.getAttribute("asyncListener");
		
		AsyncContext async = request.startAsync();
		async.addListener(asyncListener);
		asyncs.add(async);
		async.setTimeout(5*1000);
		executorService.submit(new MyRunnable(async));
		
	
	}
	
	private class MyRunnable implements Runnable {
		private AsyncContext async;
		public MyRunnable(AsyncContext async) {
			this.async = async;
		}
		@Override
		public void run() {
			try {
				Thread.sleep(10*1000);
				
				PrintWriter out = async.getResponse().getWriter();
				out.print("OK:" + (int)(Math.random()*49+1));
				async.complete();
				
				
			}catch(Exception e) {
				
			}
		}
	}
	
	

}
