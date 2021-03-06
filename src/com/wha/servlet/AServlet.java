package com.wha.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public abstract class AServlet extends HttpServlet {
	
    protected Boolean verifierTypeUtilisateur(HttpSession session, String typeUtilisateur) {
		if(session.getAttribute("typeUtilisateur").equals(typeUtilisateur))
			return true;
		return false;
	}
    
    protected String[] getPath(HttpServletRequest request) {
    	String[] paths = request.getRequestURI().split("/");
    	if(paths.length > 3) {
    		return paths;
    	}
    	return null;
    }

    protected void redirect(HttpServletRequest request, HttpServletResponse response, String redir) throws IOException, ServletException {
		this.getServletContext().getRequestDispatcher(redir).forward(request, response);
	}
}