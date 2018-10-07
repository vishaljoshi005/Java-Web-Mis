package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.FacultyBean;
import dao.GetFacultyDao;


/**
 * Servlet implementation class Ebill
 */
@WebServlet("/ebill")
public class Ebill extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ebill() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
        boolean billAddedStatus=false;
		
		if(null!=request.getSession().getAttribute("billStatus")) {
			System.out.println(request.getSession().getAttribute("billStatus"));
			billAddedStatus= (boolean)request.getSession().getAttribute("billStatus");
			request.getSession().setAttribute("deleteAlumniStatus", null);
			if(billAddedStatus) {
				request.setAttribute("billAddedStatus","true");
			}else {
				request.setAttribute("billAddedStatus","false");
			}
		}
		
		
		
		// To fetch the faculty name records
				List<FacultyBean> facultyRecords = GetFacultyDao.getName();
				if(facultyRecords.size()>0) {
					//Only then use c:if to show the data or the no records found
					// if there is data to display 
					request.setAttribute("facultyRecordsFound", "true");
					request.setAttribute("facultyRecords", facultyRecords);					
				}else {
					request.setAttribute("facultyRecordsFound", "false");
				}
				
				RequestDispatcher rd = request.getRequestDispatcher("facultybill.jsp");
				rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
