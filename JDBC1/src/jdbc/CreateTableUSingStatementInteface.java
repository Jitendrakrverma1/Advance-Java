/*
 Methods of Connection Interface:-
 2) PreparedStatement  interface :- 
 3) CallableStatement interface
 1) Statement interface :- 
 execute():- used to execute DDL queries. (Create, Alter, Drop etc..) ,
 executeUpdate():- used to execute DML queries.(Insert, Update, Delete....etc.),
 executeQuery():- used to execute DQL queries ( Select....etc).
 */

// program to create a table.
package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTableUSingStatementInteface 
{
   public static void main(String[] args) 
   {
       try {
		      Class.forName("oracle.jdbc.driver.OracleDriver"); // loading driver
		      // create connection
		      Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Jitendra");
		      
		      //create table 
		      Statement stmt = con.createStatement();
		      
		      stmt.execute("create table student(rollno number(3), name varchar2(10), marks number(3))");
		      System.out.println("Table created successfully");
	      } 
       catch (Exception e) 
       {
		System.err.println(e);
	   }
	   
   }
}
