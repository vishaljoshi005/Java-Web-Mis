package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.StudentFeeBean;
import dao.AddFeeDao;

/**
 * Servlet implementation class ShowFee
 */
@WebServlet("/searchfee")
public class ShowFee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowFee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		int semester = Integer.parseInt(request.getParameter("semester"));
		
		// To fetch the alumni records
				List<StudentFeeBean> feeRecords = AddFeeDao.getFee(semester);
				if(feeRecords.size()>0) {
					//Only then use c:if to show the data or the no records found
					// if there is data to display 
					request.setAttribute("feeRecordsFound", "true");
					request.setAttribute("feeRecords", feeRecords);					
				}else {
					request.setAttribute("feeRecordsFound", "false");
				}
				
				RequestDispatcher rd = request.getRequestDispatcher("showfee.jsp");
				rd.forward(request, response);
	}

}
