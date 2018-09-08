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
 * Servlet Filter implementation class AlumniFilter
 */
@WebFilter("/alumniregister")
public class AlumniFilter implements Filter {

    /**
     * Default constructor. 
     */
    public AlumniFilter() {
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
		String name=request.getParameter("name");
		String gender=request.getParameter("gender");
		String dob=request.getParameter("dob");
		String batch=request.getParameter("batch");
		String email=request.getParameter("email");
		String contact=request.getParameter("contact");
		String branch=request.getParameter("branch");
		String occupation=request.getParameter("occupation");
		String location=request.getParameter("location");
		
	    if(name != null && !name.trim().isEmpty()){
	    	if(gender != null && !gender.trim().isEmpty()) {
	    		if(dob != null && !dob.trim().isEmpty()) {
	    			if(batch != null && !batch.trim().isEmpty()) {
	    				if(email != null && !email.trim().isEmpty()) {
	    					
	    				}else {
	    					request.setAttribute("emailEmpty", "true");
				    	    RequestDispatcher rd=request.getRequestDispatcher("alumni.jsp");  
				    	    rd.forward(request, response);  
	    				}
	    				
	    			}else {
	    				request.setAttribute("batchEmpty", "true");
			    	    RequestDispatcher rd=request.getRequestDispatcher("alumni.jsp");  
			    	    rd.forward(request, response);  
	    				
	    			}
	    			
	    		}else {
	    			request.setAttribute("dobEmpty", "true");
		    	    RequestDispatcher rd=request.getRequestDispatcher("alumni.jsp");  
		    	    rd.forward(request, response);  
	    			
	    		}
	    		
	    	}else {
	    		request.setAttribute("genderEmpty", "true");
	    	    RequestDispatcher rd=request.getRequestDispatcher("alumni.jsp");  
	    	    rd.forward(request, response);  
	    		
	    	}
	    	// This should be inside the final if
	    	//	chain.doFilter(request, response);//sends request to next resource  
	    }  
	    else{
	    request.setAttribute("nameEmpty", "true");
	    RequestDispatcher rd=request.getRequestDispatcher("alumni.jsp");  
	    rd.forward(request, response);  
	    }  

		// pass the request along the filter chain
		//chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
