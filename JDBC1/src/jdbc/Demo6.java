                    /* PreparedStatement interface */
package jdbc;
import java.sql.*;
import java.sql.PreparedStatement;
public class Demo6 
{
	public static void main(String[] args)
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
					"system","Jitendra");
			PreparedStatement pstmt = con.prepareStatement
					("insert into emp values(?,?,?)");
			pstmt.setInt(1,Integer.parseInt(args[0]));
			pstmt.setString(2,args[1]);
			pstmt.setInt(3,Integer.parseInt(args[2]));
			pstmt.executeUpdate();
			System.out.println("One record insertd successulfuuy....");
		}catch(Exception e)
		{
			System.err.println(e);
		}
	} 
}
