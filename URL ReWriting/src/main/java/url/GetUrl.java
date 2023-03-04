package url;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class GetUrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		String s1 = request.getParameter("book1");
		String s2 = request.getParameter("book2");
		String s3 = request.getParameter("book3");
		PrintWriter pw = response.getWriter();
		pw.println("<html><body bgcolor=yellow text=red>");
		pw.println("<h1>selected Books:</h1>");
		if(!s1.equals("null"))
		{
			pw.println(s1+"<br>");	
		}
		if(!s2.equals("null"))
		{
			pw.println(s2+"<br>");	
		}
		if(!s3.equals("null"))
		{
			pw.println(s3+"<br>");	
		}
		pw.println("</body></html>");
	}
}
