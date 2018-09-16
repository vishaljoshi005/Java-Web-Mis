package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import bean.StudentBean;

import dao.ViewStudentDao;

/**
 * Servlet implementation class ViewStudent
 */
@WebServlet("/viewstudent")
public class ViewStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
response.setContentType("text/html;charset=UTF-8");
		
		boolean deleteStatus=false;
		
		if(null!=request.getSession().getAttribute("deleteStudentStatus")) {
			System.out.println(request.getSession().getAttribute("deleteStudentStatus"));
			deleteStatus= (boolean)request.getSession().getAttribute("deleteStudentStatus");
			request.getSession().setAttribute("deleteStudentStatus", null);
			if(!deleteStatus) {
				request.setAttribute("deleteStatus","true");
			}else {
				request.setAttribute("deleteStatus","false");
			}
		}
		
		
		
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
		int rows = ViewStudentDao.getRows();
		int numOfPages = rows/recordsPerPage; //Records per page is 12 
		
		if(numOfPages%recordsPerPage>0) {
			numOfPages++;
		}
		
		// To fetch the alumni records
		List<StudentBean> studentRecords = ViewStudentDao.getStudent(start);
		if(studentRecords.size()>0) {
			//Only then use c:if to show the data or the no records found
			// if there is data to display 
			request.setAttribute("studentRecordsFound", "true");
			request.setAttribute("studentRecords", studentRecords);					
		}else {
			request.setAttribute("studentRecordsFound", "false");
		}
		
		//For the traversal of the links to the records
		request.setAttribute("numOfPages", numOfPages);
		request.setAttribute("currentPage", currentPage);
		request.setAttribute("recordsPerPage", recordsPerPage);
		
		RequestDispatcher rd = request.getRequestDispatcher("viewstudent.jsp");
		rd.forward(request, response);
	}

}
