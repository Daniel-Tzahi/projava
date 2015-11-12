package danielc;
import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class tar3Servlet extends HttpServlet {
			public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
			resp.setContentType("text/plain");
			resp.getWriter().println("1 + 1 == " + (1+1));
	}
}
