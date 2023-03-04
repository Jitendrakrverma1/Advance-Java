package count;
import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
public class CountNmberOfViews extends GenericServlet 
{
	private static final long serialVersionUID = 1L;
	int count = 0; 
	
    public CountNmberOfViews() {
        super();}

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
	  count++;
	  PrintWriter pw = response.getWriter();
	  pw.println("<html><body bgcolor=cyan text=yellow><h1>");
	  pw.println("This page has been accessed- "+ count + " -times");
	  pw.println("</h1></body></html>");
	}
}
