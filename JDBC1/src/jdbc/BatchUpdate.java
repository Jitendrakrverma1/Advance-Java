                                 /* Batch Updates */

/*This feature allows to execute more than one SQL query at a time.
 *It is also known as batch processing.

 * Methods in Batch Update:-
 * 1) addBatch():- used to add SQL Query.
 * 2) executeBatch() :- used to execute all SQL queries.
 */
package jdbc;
import java.sql.*;
public class BatchUpdate 
{
	public static void main(String[] args)
	{
	  	try {
	  		Class.forName("oracle.jdbc.driver.OracleDriver");
	  		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
	  				"system","Jitendra");
	  		Statement stmt = con.createStatement();
	  		stmt.addBatch("insert into emp values(9,'Anoop1',60)");
	  		stmt.addBatch("update emp set marks=90 where rollno=5");
	  		stmt.addBatch("delete from emp where rollno=2");
	  		stmt.executeBatch();
	  		System.out.println("Bacted updated.....");
	  	}catch(Exception e){
	  		System.err.println(e);
	  	}
	}
}
