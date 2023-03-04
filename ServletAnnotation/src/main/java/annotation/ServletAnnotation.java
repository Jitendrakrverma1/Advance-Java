package annotation;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.*;
//@WebServlet("/servlet")
public class ServletAnnotation extends GenericServlet {
	private static final long serialVersionUID = 1L;

	public void service(ServletRequest request, ServletResponse response) 
			throws ServletException, IOException 
	{
	    try {
			PrintWriter pw = response.getWriter();
			pw.println("<html><body bgcolor=red text=green><h1>");
			pw.println("Welcome to Ayodhya for Ram temple....");
			pw.println("</h1></body></html>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
