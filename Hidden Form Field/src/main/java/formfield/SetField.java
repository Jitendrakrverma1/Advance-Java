package formfield;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import java.io.*;

public class SetField extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
	   String s1 = request.getParameter("book1");
	   String s2 = request.getParameter("book2");
	   String s3 = request.getParameter("book3");
	   
	   PrintWriter pw = response.getWriter();
	   pw.println("<html><body bgcolor=yellow><h1>");
	   pw.println("<form action=get>");
	   pw.println("<input type=hidden name=book1 value="+s1+">");
	   pw.println("<input type=hidden name=book2 value="+s2+">");
	   pw.println("<input type=hidden name=book3 value="+s3+">");
	   pw.println("<h2>Your books are added to cart:</h1>");
	   pw.println("<input type=submit value=next>");
	   pw.println("</form></h1></body></html>");
	}
}
