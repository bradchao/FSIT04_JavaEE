package tw.brad.j2ee;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;

@WebListener
public class MySessionAttrListener 
	implements HttpSessionAttributeListener {

	@Override
	public void attributeAdded(HttpSessionBindingEvent arg0) {
		
		System.out.println("session attr add");
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent arg0) {
		
		System.out.println("session attr remove");
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent arg0) {
		
		System.out.println("session attr replace");
	}
	
	
	
	

}
