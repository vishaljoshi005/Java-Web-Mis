package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.FacultyBean;
import dao.FacultyRegDao;

/**
 * Servlet implementation class FacultyRegister
 */
@WebServlet("/facultyregister")
public class FacultyRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FacultyRegister() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		
		FacultyBean faculty = new FacultyBean();
		
		faculty.setTitle(request.getParameter("title"));
		faculty.setFacultyName(request.getParameter("facultyName"));
		faculty.setEmployeeCode(request.getParameter("employeeCode"));
		
		faculty.setSubject(request.getParameter("subject"));
		faculty.setOfficialAddress(request.getParameter("officialAddress"));
		faculty.setHomeAddress(request.getParameter("homeAddress"));
		
		faculty.setPhone(request.getParameter("phone"));
		faculty.setPancard(request.getParameter("pancard"));
		faculty.setMobile(request.getParameter("mobile"));
		
		faculty.setBankName(request.getParameter("bankName"));
		faculty.setBranchName(request.getParameter("branchName"));
		faculty.setIfsc(request.getParameter("ifsc"));
				
		faculty.setAccount(Long.valueOf(request.getParameter("account")));
		faculty.setDesignation(request.getParameter("designation"));
		faculty.setFacultyType(request.getParameter("facultyType"));
		
		
		if(FacultyRegDao.facultyRegistration(faculty)) {
			System.out.println("Added Successfully");
			request.setAttribute("facultyStatus", "true");
			request.getRequestDispatcher("addfaculty.jsp").forward(request, response);
		}else {
			request.setAttribute("facultyStatus", "false");
			request.getRequestDispatcher("addfaculty.jsp").forward(request, response);
			System.out.println("Something gone wrong");
		}
	}

}
