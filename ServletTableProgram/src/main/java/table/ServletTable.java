package table;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ServletTable
 */
public class ServletTable extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public ServletTable() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		try 
		{
			PrintWriter pw = response.getWriter();
			pw.println("<html><body bgcolor=green text=red><h1>");
			for(int i=1; i<=10; i++)
			{
				pw.println("<tr><td>5</td></tr>");
				pw.println("<td>X</td>");
				pw.println("<td>"+i+"</td>");
				pw.println("<td>=</td>");
				pw.println("<td>"+5*i+"</td></tr>");
			}
			pw.println("</h1></body></html>");
		}catch(Exception e)
		{
			System.err.println(e);
		}
	}

}
