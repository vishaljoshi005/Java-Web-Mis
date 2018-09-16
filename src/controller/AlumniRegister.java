package controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.AlumniBean;
import dao.AlumniRegDao;

/**
 * Servlet implementation class AlumniRegister
 */
@WebServlet("/alumniregister")
public class AlumniRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AlumniRegister() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		AlumniBean alumni = new AlumniBean();
		alumni.setName(request.getParameter("name"));
		alumni.setGender(request.getParameter("gender"));
		alumni.setDob(Date.valueOf(request.getParameter("dob")));
		alumni.setBatch(request.getParameter("batch"));
		alumni.setEmail(request.getParameter("email"));
		alumni.setContact(request.getParameter("contact"));
		alumni.setBranch(request.getParameter("branch"));
		alumni.setOccupation(request.getParameter("occupation"));
		alumni.setLocation(request.getParameter("location"));
		
		if(AlumniRegDao.alumniRegistration(alumni)) {
			System.out.println("Added Successfully");
			request.setAttribute("alumniStatus", "true");
			request.getRequestDispatcher("alumni.jsp").forward(request, response);
		}else {
			request.setAttribute("alumniStatus", "false");
			request.getRequestDispatcher("alumni.jsp").forward(request, response);
			System.out.println("Something gone wrong");
		}
		
		
	}

}
