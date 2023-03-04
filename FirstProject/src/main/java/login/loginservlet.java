package login;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       Connection con;   // create con instance variable 
    public loginservlet() {
        super();
    }

    // It execute when first request comes
	public void init(ServletConfig config) throws ServletException 
	{
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Jitendra");			
		}catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
	}
	
 	public void destroy() 
 	{
 		try {
 			con.close();
 		}catch(SQLException e) {
 			e.printStackTrace();
 		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try 
		{
			String s1 = request.getParameter("uname");
			String s2 = request.getParameter("pword");
			
			PreparedStatement pstmt = con.prepareStatement("Select* from unifo where uname=? and pword=?");
			pstmt.setString(1, s1);
			pstmt.setString(2, s2);
			
			ResultSet rs = pstmt.executeQuery();
			
			PrintWriter pw = response.getWriter();
			pw.println("<html><body bgcolor=cyan text=blue><h1>");
			if(rs.next())
			{
				pw.println("Welcome"+s1);
			}
			else {
				pw.println("Invalid Username/password");
			}
		}catch(SQLException | IOException e)
		{
			e.printStackTrace();
		}
	}
}
