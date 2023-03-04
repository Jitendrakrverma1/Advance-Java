
                    /*  Insert record in table */
package jdbc;
import java.sql.*;
public class Demo4 {
	public static void main(String[] args)
	{
		try {
	   Class.forName("oracle.jdbc.driver.OracleDriver");	
	   Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
			   "system","Jitendra");
	   Statement stmt = con.createStatement();
	    stmt.executeUpdate("insert into emp values(1,'Jitendra',10)");
	    stmt.executeUpdate("insert into emp values(2,'Jitendra1',11)");
	    stmt.executeUpdate("insert into emp values(3,'Jitendra2',12)");
	    stmt.executeUpdate("insert into emp values(4,'Jitendra3',13)");
	    stmt.executeUpdate("insert into emp values(5,'Jitendra4',14)");
	    System.out.println("one record inserted succesfully..");
		}
		catch(Exception e)
		{
			System.err.print(e);
		}
	}
}
