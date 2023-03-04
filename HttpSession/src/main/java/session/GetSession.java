package session;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import java.io.*;
public class GetSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException
	{
		HttpSession hs = request.getSession();
		String s1 = (String) hs.getAttribute("b1");
		String s2 = (String) hs.getAttribute("b2");
		String s3 = (String) hs.getAttribute("b3");
		PrintWriter pw = response.getWriter();
		pw.println("<html><body bgcolor=yellow font-size=50px>");
		pw.println("<h1><u>Selected Books: </u></h1>");
		if(s1!=null)
		{
			pw.println(s1+"<br>");
		}
		if(s2!=null)
		{
			pw.println(s2+"<br>");
		}
		if(s3!=null)
		{
			pw.println(s3+"<br>");
		}
		pw.println("</body></html>");		
	}
}
