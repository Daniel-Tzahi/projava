package danielc;
import java.io.IOException;

import danielc.AdvancedMath;

import javax.servlet.http.*;

@SuppressWarnings({ "serial", "unused" })
public class tar3Servlet extends HttpServlet {
	
			public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
			resp.setContentType("text/html");

			AdvancedMath mathManager = new AdvancedMath();
			String resultStr = mathManager.getResults();
			resp.getWriter().println("Answer to Question 1:");
			resp.getWriter().println(resultStr);
			
			
	}
	

}