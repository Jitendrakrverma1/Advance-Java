package filter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import java.io.*;

public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		PrintWriter pw = response.getWriter();
		pw.println("<html><body bgcolor=yellow text=green><h1>");
		pw.println("Welcome to .................");
		pw.println("</h1></body></html>");
		
	}
}
