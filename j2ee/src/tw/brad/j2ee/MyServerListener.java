package tw.brad.j2ee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Timer;
import java.util.TimerTask;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyServerListener 
	implements ServletContextListener {
	private Timer timer;
	private int i;

	@Override
	public void contextInitialized(ServletContextEvent event) {
		System.out.println("init");
		
		ServletContext servletContext = event.getServletContext();
		servletContext.setAttribute("key1", "value1");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost/brad","root","root");
			servletContext.setAttribute("conn", conn);
		
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
		//timer = new Timer();
		//timer.schedule(new MyTask(), 0, 3*1000);
	}

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		System.out.println("die");

		/*
		if (timer != null) {
			timer.cancel();
			timer.purge();
			timer = null;
		}
		*/
	}
	
	private class MyTask extends TimerTask {
		@Override
		public void run() {
			System.out.println("i = " + i++);
		}
	}
	
}
