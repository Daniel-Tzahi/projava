package danielc;
import java.io.IOException;

import danielc.AdvancedMath;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class tar3Servlet extends HttpServlet {
	
			public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
			resp.setContentType("text/html");

			AdvancedMath mathManager = new AdvancedMath();
			String resultStr = mathManager.getResults();
			
			resp.getWriter().println(resultStr);
			
			
	}
	

}