package danielc;
import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class tar3Servlet extends HttpServlet {
	int radius = 50;
	double pie = 3.14;
			public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
			resp.setContentType("text/plain");
			resp.getWriter().println("Area of circle with radius: " + (radius) + " is: " + ((radius * radius)*pie) + " squarecm.");
	}
}
