                     /* Deleting Record with Methods  */
/* Methods:-
 * 1) deleteRow()  :- used to delete the record from database.
 **/
package jdbc;
import java.sql.*;
public class DeletingRecordWithMethods 
{
	public static void main(String[] args)
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
					"system","Jitendra");
			Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stmt.executeQuery("select rollno,name,marks from emp");
			rs.absolute(6);
			rs.deleteRow();
			System.out.println("One record deleted successfuy....");
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
