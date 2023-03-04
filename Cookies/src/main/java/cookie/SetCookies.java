                           /* Session Tracking with Cookies */
/*A cookie is piece of information that stored in client side to maintain client state info. 
 * 1) It have jakarta.servlet.http.Cookie package :-
 *     (a) public Cookie(String, String); ------constructor to create cookie.
 *  2)Methods:-
 *      setMaxAge(); getMaxAge(); getName(); setValue(); getValue();   
 * 3) jakarta.servlet.http.HttpServletRequest package:-
 *     (a) public abstract Cookie[] getCookies() ;  -----retrieve all cookies from client.   
 * 4) jakarta.servlet.http.HttpServletRespose package:-
 *     (a) public abstract void addCookie(Cookie); -----to add cookie to client system.    
 *     */
package cookie;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SetCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	  {
		String s1 = request.getParameter("book1");
		String s2 = request.getParameter("book2");
		String s3 = request.getParameter("book3");
		if (s1 != null) {
			Cookie c1 = new Cookie("book1", s1);
			response.addCookie(c1);
		}
		if (s2 != null) {
			Cookie c2 = new Cookie("book2", s2);
			response.addCookie(c2);
		}
		if (s3 != null) {
			Cookie c3 = new Cookie("book3", s3);
			response.addCookie(c3);
		}
		PrintWriter pw = response.getWriter();
		pw.println("<html><body bgcolor=yellow text=red><center>");
		pw.println("<h1>Your Books are added to cart Successfully.</h1>");
		pw.println("<a href=get>Next</a>");
		pw.println("</center></body></html>");
	}
}
