package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.NewUserBean;
import dao.NewUserRegDao;

/**
 * Servlet implementation class NewUserReg
 */
@WebServlet("/newuser")
public class NewUserReg extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Made it to the servlet");
		PrintWriter out = response.getWriter();
		String username = request.getParameter("userName");
		String password = request.getParameter("passWord");
		String repassword = request.getParameter("rePassWord");

		HttpSession session = request.getSession();
		if (username != null && !username.trim().isEmpty()) {
			System.out.println(" first if");
			if (password != null && !password.trim().isEmpty()) {
				System.out.println(" SEcond if");
				if (repassword != null && !repassword.trim().isEmpty()) {
					System.out.println(" Third if");
					System.out.println(password.trim().getClass().getSimpleName());
					System.out.println(repassword.trim().getClass().getSimpleName());
					if (password.equals(repassword)) {
						System.out.println("After equals");
						if (NewUserRegDao.registration(username.trim(), password.trim())) {
							System.out.println("After the static method");
							session.setAttribute("userStatus", "true");
							response.sendRedirect("home.jsp");

						} else {
							// Error while inserting data
						}

					}
				}
			}

		} else {
			System.out.println("else of the first if");
			// When all the above conditions are not met i.e they are empty null etc
		}

	}

}
