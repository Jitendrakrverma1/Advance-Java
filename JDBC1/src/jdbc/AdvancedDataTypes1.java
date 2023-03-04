                    /* Advanced Data Types */
/*Advanced DataTypes:-
 * 1)BLOB :- Binary large object :- used to store and retrieve large amount of 
 *                                  binary data as a single entity from database.
 * 2)CLOB :- Character large object :-used to store and retrieve large amount of 
 *                                  character data as a single entity from database.
 **/
package jdbc;
import java.io.FileInputStream;
import java.sql.*;
import java.sql.PreparedStatement;
public class AdvancedDataTypes1 
{
	public static void main(String[] args)
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con  = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe"
					,"system","Jitendra");
			PreparedStatement pstmt = con.prepareStatement("insert into images values(?,?)");
			pstmt.setString(1, args[0]);
			FileInputStream fs = new FileInputStream(args[1]);
			pstmt.setBinaryStream(2, fs,fs.available());
			pstmt.executeUpdate();
			System.out.println("one images inserted successfully......");
		}catch(Exception e)
		{
			System.err.println(e);
		}
	}
}
