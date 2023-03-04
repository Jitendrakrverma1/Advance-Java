// program to demonstrate how to retrive data from database
package jdbc;
import java.sql.*;
import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class RetriveDataFromDatabase 
{
	public static void main(String[] args) 
	{
      try 
      {
		Class.forName("oracle.jdbc.driver.OracleDriver"); // loading driver
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "Jitendra"); //creating connection
		Statement stmt = con.createStatement();// create statement
		ResultSet rs = stmt.executeQuery("select*from student"); // execute dml queries
		java.sql.ResultSetMetaData rm =rs.getMetaData(); // get data from database 
		int n =rm.getColumnCount(); // get total number of column
		for(int i=1;i<=n;i++)
		{
			System.out.print(rm.getColumnName(i)+"\t");
		}
		System.out.println();
		while(rs.next())
		{
		   for(int i=1;i<=n;i++)
		   {
			   System.out.print(rs.getString(i)+"\t");
		   }
		   System.out.println();
		}
      } 
      catch (Exception e)
      {
		System.err.print(e);
	 }
   }
}
