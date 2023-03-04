package filter;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;

public class CounterFilter extends HttpFilter {
	private static final long serialVersionUID = 1L;
	int count=0;
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
			throws IOException, ServletException
	{
		count++;
		ServletContext cs = request.getServletContext();
		cs.setAttribute("views", count);
		chain.doFilter(request, response);
	}
}
