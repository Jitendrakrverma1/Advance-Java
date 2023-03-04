package time;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

/**
 * Servlet implementation class LocalDateTime
 */
public class LocalDateTime extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public LocalDateTime() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		try {
			PrintWriter pw = response.getWriter();
			LocalTime lt = LocalTime.now();
			int n = lt.getHour();
			int m = lt.getMinute();
			int l = lt.getNano();
			pw.println("<html><body bgcolor=red><h1>");
			pw.println("present Time:"+ n +":"+m+":"+l);
			pw.println("</h1></body></html>");
		}catch(Exception e) {
			System.err.println(e);
		}
    }
}
