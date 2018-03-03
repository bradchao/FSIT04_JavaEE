package tw.brad.j2ee;

import java.util.Date;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class MySessionListener
	implements HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent event) {
		System.out.println("session create" + new Date().toString());
		
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent event) {
		System.out.println("session die:" + new Date().toString());
		
	}

	
	
}
