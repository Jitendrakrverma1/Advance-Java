/* Cached RowSet */
/* Cached RowSet is disconnected object. */
package jdbc;
import java.sql.SQLException;
import javax.sql.rowset.CachedRowSet;
import oracle.jdbc.rowset.OracleCachedRowSet;
public class CahedRowSet {
	public static void main(String[] args) 
	{
		try {
			CachedRowSet cs = new OracleCachedRowSet();
			cs.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
			cs.setUsername("system");
			cs.setPassword("Jitendra");
			cs.setCommand("select* from emp");
			cs.execute();
			while(cs.next())
			{
				System.out.println(cs.getInt("rollno")+" ");
				System.out.println(cs.getString("name")+" ");
			    System.out.println(cs.getInt("marks")+" ");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
