package filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class AdminLoginFilter
 */
@WebFilter("/login")
public class AdminLoginFilter implements Filter {

    /**
     * Default constructor. 
     */
    public AdminLoginFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		String username = request.getParameter("userName");
		String password = request.getParameter("passWord");
		if(username!=null && !username.trim().isEmpty()) {
			if(password!=null && !password.trim().isEmpty()) {
				// pass the request along the filter chain
				chain.doFilter(request, response);
			}else {
				request.setAttribute("passwordEmpty", "true");
				RequestDispatcher rd=request.getRequestDispatcher("index.jsp");  
	    	    rd.include(request, response); 
			}
			}else {
				request.setAttribute("usernameEmpty", "true");
				RequestDispatcher rd=request.getRequestDispatcher("index.jsp");  
	    	    rd.include(request, response); 
			}
		}

	

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
