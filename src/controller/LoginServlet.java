package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.LoginDao;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L; 

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("userName");
		String password = request.getParameter("passWord");
		if (username != null && !username.isEmpty() && password != null && !password.isEmpty()){
				if(LoginDao.validate(username, password)) {
					System.out.println("made it here");
					response.sendRedirect("home.html");
				}
				else {
					RequestDispatcher rd=request.getRequestDispatcher("index.html");  
			        rd.include(request,response);  
			}
		
	}
}
}



