package tw.brad.j2ee;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MyTag2 extends SimpleTagSupport {
	
	@Override
	public void doTag() throws JspException, IOException {
		super.doTag();
	
		StringWriter sw = new StringWriter();
		
		JspContext context = getJspContext();
		JspWriter out = context.getOut();
		
		JspFragment body = getJspBody();
		body.invoke(sw);
		
		String mesg = sw.toString();
		out.println("Hello, " + mesg.toUpperCase());
		
		
		
		
		
		
		
		
	}

}
