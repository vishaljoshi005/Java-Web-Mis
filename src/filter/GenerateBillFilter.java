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
 * Servlet Filter implementation class GenerateBillFilter
 */
@WebFilter("/generatebill")
public class GenerateBillFilter implements Filter {

    /**
     * Default constructor. 
     */
    public GenerateBillFilter() {
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
		
		String year1= request.getParameter("year");
		
		if(year1!=null && !year1.trim().isEmpty()) {
			if(year1.length()==4) {
				// pass the request along the filter chain
				chain.doFilter(request, response);
				System.out.println(year1.length());
			}else {
				request.setAttribute("yearEmpty",true);
				RequestDispatcher rd=request.getRequestDispatcher("/ebill");  
	    	    rd.forward(request, response); 			}
			}else {
				request.setAttribute("yearEmpty", true);
				RequestDispatcher rd=request.getRequestDispatcher("/ebill");  
	    	    rd.forward(request, response); 
			}
		}
		

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
