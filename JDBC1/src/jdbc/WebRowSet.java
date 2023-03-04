                             /* Web RowSet */
package jdbc;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.SQLException;
import oracle.jdbc.rowset.OracleJDBCRowSet;
import oracle.jdbc.rowset.OracleWebRowSet;
public class WebRowSet 
{
	public static void main(String[] args) throws FileNotFoundException
	{
	  	try {
			  OracleJDBCRowSet or = new OracleJDBCRowSet();
			  or.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
			  or.setUsername("system");
			  or.setPassword("Jitendra");
			  or.setCommand("select* from emp");
			  or.execute();
			  FileOutputStream fos = new FileOutputStream("student.xml");
			((javax.sql.rowset.WebRowSet) or).writeXml(fos);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void writeXml(FileOutputStream fos) {
		// TODO Auto-generated method stub
		
	}
}
