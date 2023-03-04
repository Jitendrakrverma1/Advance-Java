package jdbc;
import java.sql.*;
public class CallableStatement {

	public static void main(String[] args) 
	{
      try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", 
				"system", "Jitendra");
		java.sql.CallableStatement cstmt = con.prepareCall("{call insertpro(?,?,?)}");
		cstmt.setInt(1, Integer.parseInt(args[0]));
		cstmt.setString(2, args[1]);
		cstmt.setInt(3, Integer.parseInt(args[2]));
		cstmt.execute();
		System.out.println("one record inserted succefuuly...");
		
				
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      
	}

}
