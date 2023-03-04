package timeservlet;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

public class TimeServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    public TimeServlet() {
        super();}
    
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
	
		LocalTime lt = LocalTime.now();
		int h = lt.getHour();
		int m = lt.getMinute();
		PrintWriter pw = response.getWriter();
		pw.println("<html><body bgcolor=cyan text=yellow><h1>");
		pw.println("PresentTime:"+h+":"+m);
		pw.println("</h1></body></html>");
	}
}
