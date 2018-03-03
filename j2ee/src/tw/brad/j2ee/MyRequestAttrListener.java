package tw.brad.j2ee;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyRequestAttrListener 
	implements ServletRequestAttributeListener {

	@Override
	public void attributeAdded(ServletRequestAttributeEvent event) {
		String name = event.getName();
		Object obj = event.getValue();
		if (obj instanceof Integer) {
			Integer value = (Integer)obj;
			System.out.println("add => " +name + ":" + value );
		}
		
		
		
	}

	@Override
	public void attributeRemoved(ServletRequestAttributeEvent event) {
		
	}

	@Override
	public void attributeReplaced(ServletRequestAttributeEvent event) {
		
		try {
		ServletRequest request = event.getServletRequest();
		String name = event.getName();
		System.out.println("===> " + name);
		Integer obj = (Integer)event.getValue();
		System.out.println(name + ":" + obj);
		}catch(Exception ee) {
			System.out.println(ee.toString());
		}
//		if (obj instanceof Integer) {
//			Integer value = (Integer)obj;
//			System.out.println("replace: before => " +name + ":" + value );
//			System.out.println("replace: after =>" +(Integer)request.getAttribute(name));
//		}
	}
	

}
