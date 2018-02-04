package tw.brad.j2ee;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;


@WebServlet("/Brad13")
@MultipartConfig
public class Brad13 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter pw = response.getWriter();
		
		String uploadPath = getServletContext().getInitParameter("file-upload");
		System.out.println(uploadPath);

		
		Collection<Part> parts = request.getParts();
		for (Part upload : parts) {
			String header = upload.getHeader("content-disposition");
			String filename = BradAPI.getHeaderFilename(header);
			
			long size = upload.getSize();
			pw.write(filename + ":" + size + "<br />");
			
			try {
				BufferedInputStream bin = 
						new BufferedInputStream(upload.getInputStream()); 
				byte[] buf = bin.readAllBytes();
				bin.close();
				
				FileOutputStream fout = 
					new FileOutputStream(new File(uploadPath, filename));
				fout.write(buf);
				fout.flush();
				fout.close();
			}catch(Exception e) {
				
			}
			
		}

		pw.flush();
		pw.close();

	}
}
