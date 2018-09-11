package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ViewAlumniDao;

/**
 * Servlet implementation class DeleteAlumni
 */
@WebServlet("/deletealumni")
public class DeleteAlumni extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteAlumni() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        int id = Integer.parseInt(request.getParameter("id"));
        
        if(ViewAlumniDao.deleteAlumni(id)) {
        	request.getSession().setAttribute("deleteAlumniStatus",true);
		    response.sendRedirect("./viewalumni?page=1");
		
        }else {
        	request.getSession().setAttribute("deleteAlumniStatus",false);
        	response.sendRedirect("./viewalumni?page=1");
        }
	}


}
