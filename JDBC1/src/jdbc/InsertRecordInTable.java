/*
   used executeUpdate() method...............
 */

package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertRecordInTable 
{
	public static void main(String[] args) 
	{
		try {
			
       Class.forName("oracle.jdbc.driver.OracleDriver");
       Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Jitendra");
       Statement stmt = con.createStatement();
       stmt.executeUpdate("insert into student values(1,'Venktesh',88)");
       System.out.println("One Record insered successfuuly.....");
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
	}
}
