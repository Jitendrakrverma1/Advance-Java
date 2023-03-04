package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;
public class UserInputInJDBC 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter your rollno:");
		int rollno = sc.nextInt();
		System.out.println("Enter your name:");
		String name = sc.nextLine();
		System.out.println("Enter your marks:");
		int marks = sc.nextInt();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
					"system","Jitendra");
			PreparedStatement pstmt = con.prepareStatement("insert into emp values(?,?,?)");
			pstmt.setInt(1,rollno);
			pstmt.setString(2, name);
			pstmt.setInt(3, marks);
			pstmt.executeUpdate();
			System.out.println("one record inserted successfully.......");
		} catch (Exception e) {
			System.err.println(e);
		}
	 sc.close();	
	}
}
