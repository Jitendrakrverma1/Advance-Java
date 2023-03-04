package filter;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class CounterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		ServletContext cs = request.getServletContext();
		int count = (int) cs.getAttribute("views");
		PrintWriter pw = response.getWriter();
		pw.println("<html><body bgcolor=red text=green><h1>");
		pw.println("homepage.html accessed:"+count+"times.");
		pw.println("</hq></body></html>");
	}
}
