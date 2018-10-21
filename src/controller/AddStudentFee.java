package controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.StudentFeeBean;
import dao.AddFeeDao;

/**
 * Servlet implementation class AddStudentFee
 */
@WebServlet("/addfee")
public class AddStudentFee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddStudentFee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		StudentFeeBean fee = new StudentFeeBean();
		fee.setName(request.getParameter("name"));
		fee.setFatherName(request.getParameter("fatherName"));
		fee.setEnrollNumber(request.getParameter("enrollNumber"));
		fee.setSemester(Integer.parseInt(request.getParameter("semester")));
		fee.setDate(Date.valueOf(request.getParameter("date")));
		fee.setAmount(Integer.parseInt(request.getParameter("amount")));
		fee.setDdNumber(request.getParameter("ddNumber"));
		
		if(AddFeeDao.addFee(fee)) {
			System.out.println("Added Successfully");
			request.setAttribute("feeStatus", "true");
			request.getRequestDispatcher("fee.jsp").forward(request, response);
		}else {
			request.setAttribute("feeStatus", "false");
			request.getRequestDispatcher("fee.jsp").forward(request, response);
			System.out.println("Something gone wrong");
		}
		
	}

}
