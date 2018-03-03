package tw.brad.j2ee;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyServerListenerV1 
	implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("dieV1");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("OKv1");
	}
	

}
