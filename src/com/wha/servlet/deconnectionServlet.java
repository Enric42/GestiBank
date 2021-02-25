package com.wha.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class DeconnectionServlet
 */
public class deconnectionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */

	@Override
	protected void service (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session = request.getSession(false);
		session.invalidate ();
		System.out.println("session invalidée");
		response.sendRedirect(request.getContextPath() + "/fin.jsp");			// Renvoie vers la page qui annonce la déconnexion
		System.out.println("redirigé vers la fin.jsp");
	}
		
	@Override
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
		{
			service(request, response);     
		}
		
	}


