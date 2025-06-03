package com.bank.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DefaultServlet
 */
@WebServlet("/")
public class DefaultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DefaultServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.sendRedirect("login.jsp");
		//
		  response.setContentType("text/html");
		//request.getRequestDispatcher("login.jsp").forward(request, response);
	  PrintWriter out=  response.getWriter();
	  
	  out.println("<html>");
	  out.println("<body>");
	  
	  out.println("<p>");
	  out.println("siidesh hk");
	  out.println("</p>");
	  out.println("</body>");
	  
	  out.println("</html>");
	  
	 
	  
	}

	

}
