
/* Servlet Forwarding and including  */
package login;

import jakarta.servlet.*;
import java.io.*;

public class LoginServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		try {
			String s1 = request.getParameter("uname");
			String s2 = request.getParameter("pword");

			ServletContext cs = getServletContext();

			if (s1.equals("abc") && s2.equals("xyz")) {
				RequestDispatcher rp = cs.getRequestDispatcher("/welcome");
				rp.forward(request, response);
			} else {
				PrintWriter pw = response.getWriter();
				pw.println("<font color=red>");
				pw.println("Invalid Username/Invaid Password</font>");
				RequestDispatcher rp1 = cs.getRequestDispatcher("/login.html");
				rp1.include(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
