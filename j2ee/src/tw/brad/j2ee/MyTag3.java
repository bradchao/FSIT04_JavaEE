package tw.brad.j2ee;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MyTag3 extends SimpleTagSupport {
	StringWriter sw = new StringWriter();
	private String message;
	
	public void setMessage(String mesg) {message = mesg;}
	
	
	@Override
	public void doTag() throws JspException, IOException {
		super.doTag();
		
		
		if (message != null) {
			// use 參數
			JspWriter out = getJspContext().getOut();
			out.println(message);
		}else {
			// use body
			getJspBody().invoke(sw);
			getJspContext().getOut().println(sw.toString());
		}
		
		
		
	}
	

}
