package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Demo1 {
	public static void main(String[] args)
	{
		try {
			Class c = Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con  = DriverManager.getConnection("jdbc:oracle:oci8:@xe",
					"system","Jitendra");
			System.out.println("Connection creted successfully..");
		}catch (Exception e) {
	         System.out.println(e);
		}
	}
}
