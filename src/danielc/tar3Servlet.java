package danielc;
import java.io.IOException;

import danielc.AdvancedMath;

import javax.servlet.http.*;

@SuppressWarnings({ "serial", "unused" })
public class tar3Servlet extends HttpServlet {
		String result;
		
	  public String getResult(){
	       return this.result;
	  }
			public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
			resp.setContentType("text/html");

			
			resp.getWriter().println("Answer to Question 1:");
			resp.getWriter().println(result);
			
			
	}
	

}