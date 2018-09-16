package controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.StudentBean;
import dao.StudentRegDao;

/**
 * Servlet implementation class StudentRegister
 */
@WebServlet("/studentregister")
public class StudentRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentRegister() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		StudentBean student = new StudentBean();
		student.setFirstName(request.getParameter("firstName"));
		student.setLastName(request.getParameter("lastName"));
		student.setGender(request.getParameter("gender"));
		student.setFatherName(request.getParameter("fatherName"));
		student.setMotherName(request.getParameter("motherName"));
		student.setDob(Date.valueOf(request.getParameter("dob")));
		student.setAdmissionYear(request.getParameter("admissionYear"));
		student.setEmail(request.getParameter("email"));
		student.setContact(request.getParameter("contact"));
		student.setAddress(request.getParameter("address"));
		
		
		if(StudentRegDao.studentRegistration(student)) {
			System.out.println("Added Successfully");
			request.setAttribute("studentStatus", "true");
			request.getRequestDispatcher("student.jsp").forward(request, response);
		}else {
			request.setAttribute("studentStatus", "false");
			request.getRequestDispatcher("student.jsp").forward(request, response);
			System.out.println("Something gone wrong");
		}
	}

}
