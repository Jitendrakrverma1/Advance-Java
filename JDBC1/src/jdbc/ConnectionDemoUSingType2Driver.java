// program to demonstrate the connection between java application and database using type-2 driver.

package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDemoUSingType2Driver 
{

	public static void main(String[] args) 
	{
		   try 
		   {
			
			Class c = Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:oci8:@xe","system","Jitendra");
			System.out.println("Connection Establish Successfullly");
		  } 
		   catch (Exception e) {
			System.err.println(e);
		}
	}

}
