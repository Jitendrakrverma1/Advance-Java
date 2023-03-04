package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnUsingType4Driver {

	public static void main(String[] args) {
     
		try {
			// loading a JdbcDriver
			  Class.forName("oracle.jdbc.driver.OracleDriver");
			 // create a database connection
			 Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe"
					   , "system", "Jitendra");
			 System.out.println("Connection created succcessfully..");
		   }
		catch(Exception e) 
		{
			System.err.println(e);
		}
	}

}
