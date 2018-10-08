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
 * Servlet Filter implementation class SaveBillFilter
 */
@WebFilter("/savebill")
public class SaveBillFilter implements Filter {

    /**
     * Default constructor. 
     */
    public SaveBillFilter() {
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

		// pass the request along the filter chain
		//chain.doFilter(request, response);
		       
		String date= request.getParameter("date");
		String facultyCode=request.getParameter("facultyCode");
		String sheetNumber=request.getParameter("sheetNumber");
		
		String semester=request.getParameter("semester");
		String paperNumber=request.getParameter("paperNumber");
		String type=request.getParameter("type");
		
		String batch=request.getParameter("batch");
		String time=request.getParameter("time");
		String hours=request.getParameter("hours");
		String rate=request.getParameter("rate");
		
		 if(date != null && !date.trim().isEmpty()){
		    	if(facultyCode != null && !facultyCode.trim().isEmpty()) {
		    		if(sheetNumber != null && !sheetNumber.trim().isEmpty()) {
		    			if(semester != null && !semester.trim().isEmpty()) {
		    				if(paperNumber != null && !paperNumber.trim().isEmpty()) {
		    					if(type!= null && !type.trim().isEmpty()) {
		    						if(batch != null && !batch.trim().isEmpty()) {
		    							if(time != null && !time.trim().isEmpty()) {
		    								if(hours != null && !hours.trim().isEmpty()){
		    									if(rate != null && !rate.trim().isEmpty()) {
		    										chain.doFilter(request, response);
		    										}
		    									else {
		    										request.setAttribute("rateEmpty", "true");
										    	    RequestDispatcher rd=request.getRequestDispatcher("savebill.jsp");  
										    	    rd.include(request, response);  
		    									}
		    								}else {
		    									request.setAttribute("hoursEmpty", "true");
									    	    RequestDispatcher rd=request.getRequestDispatcher("savebill.jsp");  
									    	    rd.include(request, response);  
		    								}
		    							}else {
		    								request.setAttribute("timeEmpty", "true");
								    	    RequestDispatcher rd=request.getRequestDispatcher("savebill.jsp");  
								    	    rd.include(request, response);  
		    							}
		    						}else {
		    							request.setAttribute("batchEmpty", "true");
							    	    RequestDispatcher rd=request.getRequestDispatcher("savebill.jsp");  
							    	    rd.include(request, response);  
		    						}
		    					}else {
		    						request.setAttribute("typeEmpty", "true");
						    	    RequestDispatcher rd=request.getRequestDispatcher("savebill.jsp");  
						    	    rd.include(request, response);  
		    					}
		    					
		    				}else {
		    					request.setAttribute("paperNumberEmpty", "true");
					    	    RequestDispatcher rd=request.getRequestDispatcher("savebill.jsp");  
					    	    rd.include(request, response);  
		    				}
		    				
		    			}else {
		    				request.setAttribute("semesterEmpty", "true");
				    	    RequestDispatcher rd=request.getRequestDispatcher("alumni.jsp");  
				    	    rd.include(request, response);  
		    				
		    			}
		    			
		    		}else {
		    			request.setAttribute("sheetNumberEmpty", "true");
			    	    RequestDispatcher rd=request.getRequestDispatcher("savebill.jsp");  
			    	    rd.include(request, response);  
		    			
		    		}
		    		
		    	}else {
		    		request.setAttribute("facultyCodeEmpty", "true");
		    	    RequestDispatcher rd=request.getRequestDispatcher("savebill.jsp");  
		    	    rd.include(request, response);    		
		    	}
		    	// This should be inside the final if
		    	//	chain.doFilter(request, response);//sends request to next resource  
		    }  
		    else{
		    request.setAttribute("dateEmpty", "true");
		    RequestDispatcher rd=request.getRequestDispatcher("savebill.jsp");  
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
