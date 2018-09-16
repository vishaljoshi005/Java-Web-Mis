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
 * Servlet Filter implementation class StudentFilter
 */
@WebFilter("/studentregister")
public class StudentFilter implements Filter {

    /**
     * Default constructor. 
     */
    public StudentFilter() {
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
		String firstName=request.getParameter("firstName");
		String lastName=request.getParameter("lastName");
		String gender=request.getParameter("gender");
		String fatherName=request.getParameter("fatherName");
		String motherName=request.getParameter("motherName");
		String dob=request.getParameter("dob");
		String admissionYear=request.getParameter("admissionYear");
		String email=request.getParameter("email");
		String contact=request.getParameter("contact");
		String address=request.getParameter("address");
		
	    if(firstName != null && !firstName.trim().isEmpty()){
	    	if(lastName != null && !lastName.trim().isEmpty()) {
	    		if(gender != null && !gender.trim().isEmpty()) {
	    			if(fatherName != null && !fatherName.trim().isEmpty()) {
	    				if(motherName != null && !motherName.trim().isEmpty()) {
	    					if(dob != null && !dob.trim().isEmpty()) {
	    						if(admissionYear!= null && !admissionYear.trim().isEmpty()) {
	    							if(email != null && !email.trim().isEmpty()) {
	    								if(contact != null && !contact.trim().isEmpty()){
	    									if(address != null && !address.trim().isEmpty()) {
	    									chain.doFilter(request, response);
	    									}else {
	    										request.setAttribute("addressEmpty", "true");
									    	    RequestDispatcher rd=request.getRequestDispatcher("student.jsp");  
									    	    rd.include(request, response);  
	    									}
	    								}else {
	    									request.setAttribute("contactEmpty", "true");
								    	    RequestDispatcher rd=request.getRequestDispatcher("student.jsp");  
								    	    rd.include(request, response);  
	    								}
	    							}else {
	    								request.setAttribute("emailEmpty", "true");
							    	    RequestDispatcher rd=request.getRequestDispatcher("student.jsp");  
							    	    rd.include(request, response);  
	    							}
	    						}else {
	    							request.setAttribute("admissionYearEmpty", "true");
						    	    RequestDispatcher rd=request.getRequestDispatcher("student.jsp");  
						    	    rd.include(request, response);  
	    						}
	    					}else {
	    						request.setAttribute("dobEmpty", "true");
					    	    RequestDispatcher rd=request.getRequestDispatcher("student.jsp");  
					    	    rd.include(request, response);  
	    					}
	    					
	    				}else {
	    					request.setAttribute("motherNameEmpty", "true");
				    	    RequestDispatcher rd=request.getRequestDispatcher("student.jsp");  
				    	    rd.include(request, response);  
	    				}
	    				
	    			}else {
	    				request.setAttribute("fatherNameEmpty", "true");
			    	    RequestDispatcher rd=request.getRequestDispatcher("student.jsp");  
			    	    rd.include(request, response);  
	    				
	    			}
	    			
	    		}else {
	    			request.setAttribute("genderEmpty", "true");
		    	    RequestDispatcher rd=request.getRequestDispatcher("student.jsp");  
		    	    rd.include(request, response);  
	    			
	    		}
	    		
	    	}else {
	    		request.setAttribute("lastNameEmpty", "true");
	    	    RequestDispatcher rd=request.getRequestDispatcher("student.jsp");  
	    	    rd.include(request, response);    		
	    	}
	    	// This should be inside the final if
	    	//	chain.doFilter(request, response);//sends request to next resource  
	    }  
	    else{
	    request.setAttribute("firstNameEmpty", "true");
	    RequestDispatcher rd=request.getRequestDispatcher("student.jsp");  
	    rd.include(request, response);  
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
