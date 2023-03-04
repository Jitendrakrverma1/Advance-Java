                          /* JDBC RowSet  */
/* JDBC RowSet is connected object remaining all disconnected object*/
package jdbc;
import oracle.jdbc.rowset.OracleJDBCRowSet;
public class JdbcRowSet 
{
 @SuppressWarnings("resource")
public static void main(String[] args)
  {
	  try {
		  OracleJDBCRowSet js = new OracleJDBCRowSet();
		  js.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		  js.setUsername("system");
		  js.setPassword("Jitendra");
		  js.setCommand("select*from emp");
		  js.execute();
		  while(js.next()){
			  System.out.println(js.getInt("rollno")+"\t");
			  System.out.println(js.getString("name")+"\t");
			  System.out.println(js.getInt("marks")+"\t");
		  }
	  }catch(Exception e)
	  {
	    System.err.println(e);	  
	  }
   }
}
