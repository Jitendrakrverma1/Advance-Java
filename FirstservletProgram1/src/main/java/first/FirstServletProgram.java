package first;
import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServletProgram extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    public FirstServletProgram() {
        super();
    }

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
		try 
		{
			PrintWriter pw = response.getWriter();
			pw.println("Welcome to servlet.....");
		}catch(Exception e)
		{
			System.err.println(e);
		}
	}
}
