package tableservlet;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class TableServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    public TableServlet() {
        super(); }
    
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
		PrintWriter pw = response.getWriter();
		pw.println("<html><body bgcolor=red text=blue><table border=20>");
		for(int i=1; i<=100; i++)
		{
			pw.println("<tr><td>5</td>");
			pw.println("<td>X</td>");
			pw.println("<td>"+i+"</td>");
			pw.println("<td>=</td>");
			pw.println("<td>"+5*i+"</td></tr>");
		}	
		pw.println("</table></body></html>");
	}
}
