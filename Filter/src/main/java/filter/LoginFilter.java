                               /* Filter */
/*A filter is an object that can be declartively inserted in a container process.
 * Filter is a mechnsim by which we can plugin code in between rquest and response.
 * servlet support static dispatching and filter supports dynaming dispatchting.
 * filter same as servlet.
 * filter have life cycle method:-
 *    (a) init()   (b) doFilter()   (c) destroy()   
 * filter present in jakarta.servlet.Filter interface.
 */
package filter;
import jakarta.servlet.*;
import java.io.*;
import java.sql.*;

public class LoginFilter implements Filter 
{
	Connection con;
	public void init(FilterConfig fConfig) throws ServletException 
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
					"system","Jitendra");
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException 
	{
		try {
			String s1 = request.getParameter("uname");
			String s2 = request.getParameter("pword");
			PreparedStatement pstmt = con.prepareStatement
					("select* from unifo where uname=? and pword=?");
			pstmt.setString(1, s1);
			pstmt.setString(2, s2);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()){
				chain.doFilter(request, response);
			}
			else {
				PrintWriter pw = response.getWriter();
				pw.println("<html><body bgcolor=yellow text=red><h1>");
				pw.println("Invalid username/password");
				pw.println("</h1></body></html>");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void destroy() {
		try {
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
