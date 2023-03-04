package session;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.sql.Date;
public class Session1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		PrintWriter pw = response.getWriter();
		HttpSession hs = request.getSession();
		pw.println("<html><body bgcolor=yellow text=black><h1>");
		pw.println("sessionId: "+hs.getId()+"<br>");
		pw.println("Last accessed Time: "+new Date(hs.getLastAccessedTime())+"<br>");
		pw.println("Creation Time: "+new Date(hs.getCreationTime())+"<br>");
		pw.println("Time Interval: "+hs.getMaxInactiveInterval()+"<br>");
		pw.println("</h1></body></html>");
	}
}
