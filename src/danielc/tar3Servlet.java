package danielc;
import java.io.IOException;

import javax.servlet.http.*;

import danielc.tar3;

@SuppressWarnings({ "serial", "unused" })
public class tar3Servlet extends HttpServlet {
	
			int radius = 50;
			double num = Math.PI;
			
			String line1= new String ("Area of circle with radius: " + (radius) + " is: " + (int)((radius * radius)*num) + " squarecm.");
			String line2= new String ();
			String line3= new String ();
			String result= new String (line1 +"<br>" + line2 +"<br>" + line3 + "<br>");
			
			public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
			resp.setContentType("text/plain");
			resp.getWriter().println("Answer to Question 1:");
			resp.getWriter().println(result);
			
			
	}
	

}