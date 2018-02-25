package tw.brad.j2ee;

import java.io.IOException;
import java.util.List;

import javax.servlet.AsyncContext;
import javax.servlet.AsyncEvent;
import javax.servlet.AsyncListener;

public class MyAsyncListener implements AsyncListener{

	@Override
	public void onComplete(AsyncEvent event) throws IOException {
		AsyncContext asyncContext = event.getAsyncContext();
		System.out.println("onComplete");
	}

	@Override
	public void onError(AsyncEvent event) throws IOException {
		AsyncContext asyncContext = event.getAsyncContext();
		List<AsyncContext> asyncs = (List)asyncContext.getRequest().getServletContext().getAttribute("asyncs");
		asyncs.remove(asyncContext);
		
	}

	@Override
	public void onStartAsync(AsyncEvent event) throws IOException {
		System.out.println("start...");
		
	}

	@Override
	public void onTimeout(AsyncEvent event) throws IOException {
		AsyncContext asyncContext = event.getAsyncContext();
		List<AsyncContext> asyncs = (List)asyncContext.getRequest().getServletContext().getAttribute("asyncs");
		asyncs.remove(asyncContext);
		System.out.println("Timeout...");
	}

}
