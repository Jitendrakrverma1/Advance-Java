package vowels;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.*
;/**
 * Servlet implementation class CountVowelsServlet
 */
public class CountVowelsServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
    int count=0;
	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) 
			   throws ServletException, IOException
	{
		count++;
		PrintWriter pw = response.getWriter();
		pw.println("<html><body bgcolor=yellow>");
		pw.println("this page can be accessed:"+count+" times");
		pw.println("</body></html>");
	}
}
