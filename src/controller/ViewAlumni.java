package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.AlumniBean;
import dao.ViewAlumniDao;

/**
 * Servlet implementation class ViewAlumni
 */
@WebServlet("/viewalumni")
public class ViewAlumni extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewAlumni() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		
		int start=0;
		int recordsPerPage=12;
		String page=request.getParameter("page");  
		int currentPage=Integer.parseInt(page);
		
		if(currentPage==1) {
			// The value of the start remain 0 because the value of the first row of the mysql is 0 not 1
		}
		else {
			start=(currentPage*recordsPerPage)-recordsPerPage; //Records per page is 12
			//start+=1;
			System.out.println(start);
		}
		
		//To get the number of the rows
		int rows = ViewAlumniDao.getRows();
		int numOfPages = rows/recordsPerPage; //Records per page is 12 
		
		if(numOfPages%recordsPerPage>0) {
			numOfPages++;
		}
		
		// To fetch the alumni records
		List<AlumniBean> alumniRecords = ViewAlumniDao.getAlumni(start);
		if(alumniRecords.size()>0) {
			//Only then use c:if to show the data or the no records found
			// if there is data to display 
			request.setAttribute("alumniRecordsFound", "true");
			request.setAttribute("alumniRecords", alumniRecords);					
		}else {
			request.setAttribute("alumniRecordsFound", "false");
		}
		
		//For the traversal of the links to the records
		request.setAttribute("numOfPages", numOfPages);
		request.setAttribute("currentPage", currentPage);
		request.setAttribute("recordsPerPage", recordsPerPage);
		
		RequestDispatcher rd = request.getRequestDispatcher("viewsalumni.jsp");
		rd.forward(request, response);
	}


}
