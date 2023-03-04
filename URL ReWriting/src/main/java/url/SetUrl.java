package url;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SetUrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		String s1 = request.getParameter("book1");
		String s2 = request.getParameter("book2");
		String s3 = request.getParameter("book3");
		PrintWriter pw = response.getWriter();
		pw.println("<html><body bgcolor=yellow text=red><center>");
		pw.println("<a href=get?book1="+s1+"&book2="+s2+"&book3="+s3+">next</a>");
		pw.println("</center></body></html>");
	}
}
