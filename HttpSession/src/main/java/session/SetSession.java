package session;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class SetSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		String s1 = request.getParameter("book1");
		String s2 = request.getParameter("book2");
		String s3 = request.getParameter("book3");
		HttpSession hs = request.getSession();
		hs.setAttribute("b1", s1);
		hs.setAttribute("b2", s2);
		hs.setAttribute("b3", s3);
		PrintWriter pw = response.getWriter();
		pw.println("<html><body bgcolor=red font-size=50px>");
		pw.println("<h1>Your Books selected to cart:</h1>");
		pw.println("<a href=get>Next</a>");
		pw.println("</body></html>");
	}
}
