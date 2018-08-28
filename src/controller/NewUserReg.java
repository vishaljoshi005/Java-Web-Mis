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
							request.setAttribute("userStatus", "true");
							request.getRequestDispatcher("home.jsp").forward(request, response);

						} else {
							// Error while inserting data
							System.out.println("This is good in this case");
							request.setAttribute("usernameExist", "true");
							request.getRequestDispatcher("home.jsp").forward(request, response);
						}

					}else {
						//For the password that do not match
						request.setAttribute("unequalPassword", "true");
						request.getRequestDispatcher("home.jsp").forward(request, response);
					}
				}else {
					request.setAttribute("rePassword", "true");
					request.getRequestDispatcher("home.jsp").forward(request, response);
				}
			}else {
				// For the password empty
				request.setAttribute("passwordEmpty", "true");
				request.getRequestDispatcher("home.jsp").forward(request, response);
				
			}

		} else {
			//For the username empty
			request.setAttribute("usernameEmpty", "true");
			request.getRequestDispatcher("home.jsp").forward(request, response);
			System.out.println("else of the first if");
			// When all the above conditions are not met i.e they are empty null etc
		}

	}

}
