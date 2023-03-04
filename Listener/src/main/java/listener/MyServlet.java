package listener;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.sql.Connection;

public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		ServletContext cs = request.getServletContext();
		Connection con = (Connection) cs.getAttribute("oracle");
		PrintWriter pw = response.getWriter();
		pw.println("<html><body bgcolor=yellow> <h1>");
		pw.println("Connection obtained succefully....");
		pw.println("</h1></body></html>");
	}
}
