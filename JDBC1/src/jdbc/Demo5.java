                       /* program to retrieve data from database  */
package jdbc;
import java.sql.*;
public class Demo5 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", 
					"system", "Jitendra");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select* from emp");
			ResultSetMetaData rm = rs.getMetaData();
			int m = rm.getColumnCount();
			for (int i = 1; i <= m; i++) {
				System.out.println(rm.getColumnName(i) + "\t");
			}
			System.out.println();
			
			while (rs.next()) {
				for (int i = 1; i <= m; i++) {
					System.out.print(rs.getString(i) + "\t");
				}
				System.out.println();
			}
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}
