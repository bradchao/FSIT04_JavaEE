package tw.brad.j2ee;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Brad32")
public class Brad32 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("image/jpeg");
		String uploadPath = 
				getServletContext().getInitParameter("file-upload");
		
		BufferedImage bimg = 
				ImageIO.read(new File(uploadPath, "coffee.jpg"));
		Graphics2D g2d = bimg.createGraphics();
		
		Font font = new Font(null, Font.BOLD+Font.ITALIC, 48);
		
		AffineTransform tran = new AffineTransform();
		tran.rotate(Math.toRadians(45), 100, 0);
		Font newFont = font.deriveFont(tran);
				
		g2d.setFont(newFont);
		g2d.setColor(Color.GREEN);
		g2d.drawString("資策會專屬,歡迎盜連", 100, 200);
		
		File outFile = new File(uploadPath, "coffee1.jpg");
		OutputStream out = response.getOutputStream();
		ImageIO.write(bimg, "jpeg", out);
		ImageIO.write(bimg, "jpeg", outFile);
		out.flush();
		out.close();
		
		
		
		
		
		
		
	
	
	
	}
}
