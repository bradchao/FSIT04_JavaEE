package tw.brad.j2ee;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyRequestListener 
	implements ServletRequestListener {
	
	@Override
	public void requestInitialized(ServletRequestEvent event) {
		System.out.println("request1");
		ServletRequest request = event.getServletRequest();
		String remoteIP = request.getRemoteAddr();
		System.out.println(remoteIP);
	}
	@Override
	public void requestDestroyed(ServletRequestEvent arg0) {
		System.out.println("request2");
	}


	

}
