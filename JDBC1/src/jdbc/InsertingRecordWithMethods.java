                           /* Inserting record with method in resultSet*/
/* Method for inserting record=>
 * 1) moveToInsertRow():- move cursor to insert a record.
 * 2) insertRow():-insert record in a database.
 **/

package jdbc;
import java.sql.*;
public class InsertingRecordWithMethods 
{
	public static void main(String[] args) 
	{
	  try {
		  Class.forName("oracle.jdbc.driver.OracleDriver");
		  Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe"
				  ,"system","Jitendra");
		  Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		  ResultSet rs = stmt.executeQuery("select rollno,name,marks from emp");
		  rs.moveToInsertRow();
		  rs.updateInt(1, 8);
		  rs.updateString(2, "Anoop");
		  rs.updateInt(3, 50);
		  rs.insertRow();
		  System.out.println("One record inserted successfully....");
		  
	  }catch(Exception e)
	  {
		  System.err.println(e);
	  }
	}
}
