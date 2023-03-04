                      /*  ResultSet Enhancements   */
/*
 * ResultSet is  an object that encapsulate set of rows from database.
 * ResultSet is generated based on SQL query.
 * ResultSet pointer point to before first record.
 * It is divided into 2 type---
 * 1) ResultSet types
     => a) Type_Foraward_only   (b) Type_Scroll_Insensitive  (c) Type_Scroll_Senstive
 * 2) Concurrency Types
     => a) Concur_Read_Only    (b) Concur_Updatale
 *
 *Using ResultSet Enhancements features we can do following operation----
 *1)moving cursor in a Scroll_able ResultSet
 *2)inserting record with methods
 *3)deleting record with methods
 *4)updating record with methods.
 **/

           // moving cursor in ScrollAble ResultSet
package jdbc;
import java.sql.*;
public class ResultSetEnhancement
{
	public static void main(String[] args)
	{
       	try {
       		Class.forName("oracle.jdbc.driver.OracleDriver");
       		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
       			 "system","Jitendra");
       		Statement stmt = con.createStatement
       				(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
       		ResultSet rs = stmt.executeQuery("select* from emp");
       		rs.absolute(5);
//       		System.out.print(rs.getInt("rollno")+"\t");
//       		System.out.print(rs.getString("name")+"\t");
//       		System.out.print(rs.getInt("marks")+"\t");
       		System.out.println(rs.getInt(1));
       		System.out.println(rs.getString(2));
       		System.out.println(rs.getInt(3));
       	}catch(Exception e)
       	{
       		System.out.println(e);
       	}}}





