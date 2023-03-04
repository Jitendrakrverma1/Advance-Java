package mime;
import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.*;

public class MIMETYPE extends GenericServlet {
	private static final long serialVersionUID = 1L;
	
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException 
	{
		response.setContentType("application/msword");
		PrintWriter pw = response.getWriter();
		pw.println("Welcome to ms word...");

	}
}
