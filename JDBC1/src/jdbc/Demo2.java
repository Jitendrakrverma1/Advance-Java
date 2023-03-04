
// Connection with type 4 driver
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo2
{
	public static void main(String[] args)
	{
	   try {
		Class c = Class.forName("oracle.jdbc.driver.OracleDriver");
		   Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
				   "system","Jitendra");
		   System.out.println("Connection creted with type 4 driver....");
	} catch (Exception e) {
		System.err.print(e);
	 }
	}
}
