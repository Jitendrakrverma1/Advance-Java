      /* Method of Connection interface   */

//public abstract Statement createStatement() throws SQLException;
//public abstract PreparedStatement prepareStatement(java.lang.String) throws SQLException;
//public abstract CallableStatement prepareCall(java.lang.String) throws SQLException;

     /*  Statement Interface  */
   // it is used to execute static SQl queries.

           /* Method of statement interface*/
           // 1. execute() :- used to execute DDL queries. ex= create, alter,drop...
          //  2. executeUpdate() :- used to execute DML queries. ex= insert,delete,update..
          // 3. executeQuery()  :- used to execute DQL queries. ex= select...

 /*  PreparedStatement Interface  */
   // it is used to execute dynamic SQl queries.

 /*  CallableStatement Interface  */
   // it is used to execute PL/SQL queries.
package jdbc;
import java.sql.*;
public class Demo3
{
	public static void main(String[] args)
	{
		try {
	   Class.forName("oracle.jdbc.driver.OracleDriver");
	   Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
			   "system","Jitendra");
	   Statement stmt = con.createStatement();
	   stmt.execute("create table emp(rollno number(3),name varchar2(10), marks number(3))");
	   System.out.println("Table creted successfully...");
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
	}
}
