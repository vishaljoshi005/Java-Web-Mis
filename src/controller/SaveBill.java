package controller;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.BillBean;
import dao.SaveBillDao;
/**
 * Servlet implementation class SaveBill
 */
@WebServlet("/savebill")
public class SaveBill extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveBill() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		
		BillBean bill = new BillBean();
		Date date = Date.valueOf(request.getParameter("date"));
		SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE");
		
		
		bill.setFacultyCode(Integer.parseInt(request.getParameter("facultyCode")));
		bill.setDate(Date.valueOf(request.getParameter("date")));
		bill.setDay(simpleDateformat.format(date));
		
		
		bill.setSheetNumber(request.getParameter("sheetNumber"));
		bill.setSemester(request.getParameter("semester"));
		bill.setPaperNumber(request.getParameter("paperNumber"));
		
		
		bill.setType(request.getParameter("type"));
		bill.setBatch(request.getParameter("batch"));
		bill.setTime(request.getParameter("time"));
		
		
		bill.setHours(request.getParameter("hours"));
		bill.setRate(Integer.parseInt(request.getParameter("rate")));
		
		
		
		String name=SaveBillDao.getName(Integer.parseInt(request.getParameter("facultyCode")));
		
		if(name != null && !name.trim().isEmpty()){
			
			bill.setName(name);
			
			if(SaveBillDao.saveBill(bill)) {
				System.out.println("Added Successfully");
				request.getSession().setAttribute("billStatus",true);
			    response.sendRedirect("./ebill");
			}			
			else {
				request.getSession().setAttribute("billStatus",false);
	        	response.sendRedirect("./ebill");
			}
		}else {
			System.out.println("Error fetching name while adding bill data");
			response.sendRedirect("./ebill");
		}
		
			

		
	}

}
