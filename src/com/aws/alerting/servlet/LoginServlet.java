package com.aws.alerting.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aws.alerting.service.LoginService;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("served");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName = request.getParameter("email");
		String password = request.getParameter("password");
		System.out.println(userName);
		System.out.println(password);
		LoginService loginService = new LoginService();
		try {
			boolean isValid = loginService.checkLoginCredentials(userName, password);
			if(isValid)
			{
				HttpSession session = request.getSession();
				session.setAttribute("emailId", userName);
				response.sendRedirect("home.jsp");
			}
			else
			{
				response.sendRedirect("error.jsp");
			}
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			response.sendRedirect("error.jsp");
			e.printStackTrace();
		}
	}

}
