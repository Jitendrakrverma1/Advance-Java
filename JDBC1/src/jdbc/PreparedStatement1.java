package jdbc;
import java.sql.*;
public class PreparedStatement1 {

	public static void main(String[] args)
	{
       try
       {
    	  Class.forName("oracle.jdbc.driver.OracleDriver");
    	  Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system"
    			  , "Jitendra");
    	  java.sql.PreparedStatement pstmt = con.prepareStatement("select marks from student where rollno=?");
    	  pstmt.setInt(1, Integer.parseInt(args[0]));
    	  ResultSet rs = pstmt.executeQuery();
    	  rs.next();
    	  System.out.println(rs.getInt(1));
       }catch(Exception e)
       {
    	   System.err.print(e);
       }
	}
}
