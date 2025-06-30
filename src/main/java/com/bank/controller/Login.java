package com.bank.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name=request.getParameter("name");
		String psw=request.getParameter("psw");
		
		System.out.println(" ==="+name+"===="+psw);
		  HttpSession session = request.getSession(); // Unique per user/browser
	        session.setAttribute("username", name);
	       // response.sendRedirect("login.jsp");
	        response.setContentType("text/html");
	        response.getWriter().println("<h2>Welcome " + name +session.getId()+ "</h2>");
	        
	        response.getWriter().println("<a href="+"welcome"+">Welcome " + name + "</h2>");
		
	}

}
