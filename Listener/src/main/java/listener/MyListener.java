package listener;
import java.sql.*;
import jakarta.servlet.*;

public class MyListener implements ServletContextListener 
{
      Connection con;
    public void contextInitialized(ServletContextEvent sce) 
    { 
    	try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
					"system","Jitendra");
			ServletContext cs = sce.getServletContext();
			cs.setAttribute("oracle",con);
		} catch (Exception e) {
			e.printStackTrace();
		} 
    }
    public void contextDestroyed(ServletContextEvent sce)  
    { 
        try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
}
