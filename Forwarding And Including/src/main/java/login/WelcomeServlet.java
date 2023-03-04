package login;

import jakarta.servlet.*;
import java.io.*;

public class WelcomeServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;

	public void service(ServletRequest request, ServletResponse response) 
			throws ServletException, IOException 
	{
		try {
			String s1 = request.getParameter("uname");
			PrintWriter pw = response.getWriter();
			pw.println("<html><body bgcolor=yellow text=green><h1>");
			pw.println("Welcome"+s1);
			pw.println("</h1></body></html>");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
