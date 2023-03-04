
                           /* Update record with method */
package jdbc;
import java.sql.*;
public class UpdateableRecordWithMethods 
{
	public static void main(String[] args)
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");	
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
					"system","Jitendra");
			Statement stmt = con.createStatement
					(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stmt.executeQuery("select rollno,name,marks from emp");
			rs.absolute(6);
			rs.updateInt(3, 41);
			rs.updateRow();
			System.out.println("One reord updated successfully......");
			
		}catch(Exception e)
		{
			System.err.println(e);
		}
	}
}
