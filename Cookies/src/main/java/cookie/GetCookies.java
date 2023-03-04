package cookie;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class GetCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException
	{
	  	PrintWriter pw = response.getWriter();
	  	pw.println("<html><body bgcolor=green text=red><center>");
	  	pw.println("<h1><u>Selected books:</u></h1>");
	  	Cookie[] c1 = request.getCookies();
	  	for(Cookie c:c1)
	  	{
	  		pw.println(c.getValue()+"<br>");
	  	}
	  	pw.println("</center></body></html>");
	}
}
