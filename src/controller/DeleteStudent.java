package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ViewStudentDao;

/**
 * Servlet implementation class DeleteStudent
 */
@WebServlet("/deletestudent")
public class DeleteStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		   int id = Integer.parseInt(request.getParameter("id"));
	        
	        if(ViewStudentDao.deleteStudent(id)) {
	        	request.getSession().setAttribute("deleteStudentStatus",true);
			    response.sendRedirect("./viewstudent?page=1");
			
	        }else {
	        	request.getSession().setAttribute("deleteStudentStatus",false);
	        	response.sendRedirect("./viewstudent?page=1");
	        }
	}

}
