// program to take data from command line
package jdbc;
import java.sql.*;
public class PreparedStatement 
{
	public static void main(String[] args)
	{
	   try
	   {
		   Class.forName("oracle.jdbc.driver.OracleDriver");
		   Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system",
				   "Jitendra");
		   java.sql.PreparedStatement pstmt = con.prepareStatement("insert into student values(?,?,?)");
		   pstmt.setInt(1, Integer.parseInt(args[0]));
		   pstmt.setString(2, args[1]);
		   pstmt.setInt(3, Integer.parseInt(args[2]));
		   pstmt.executeUpdate();
		   System.out.print("One record insert successfully....");
	   }
	   catch(Exception e)
	   {
		   System.err.println(e);
	   }
	}
}
