package com.wha.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.wha.dao.ClientDao;
import com.wha.dao.ConseillerDao;

import jakarta.servlet.RequestDispatcher;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/administrateur/*"})
public class ConseillerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ConseillerServlet() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		verifierTypeUtilisateur(request, response);
		
		String path = request.getRequestURI();

		HttpSession session = request.getSession(false);
		if (session == null) {
			response.sendRedirect(request.getContextPath() + "/404.jsp");
		}
		String typeUtilisateur = (String) session.getAttribute("typeUtilisateur"); 
		if (typeUtilisateur.equals("administrateur")) {
			response.sendRedirect(request.getContextPath() + "/404.jsp");
		}

		// TODO switch
		/**/
		if (path == "/administrateur/creerConseiller") {
			creerConseiller(request, response);
		}
		/**/
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		verifierTypeUtilisateur(request, response);
		
		String path = request.getRequestURI();

		// TODO switch
		/**/
		if (path == "/administrateur/creerConseiller") {
			creerConseiller(request, response);
		}
		/**/
	}
	
	private void verifierTypeUtilisateur(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if (session == null) {
			response.sendRedirect(request.getContextPath() + "/404.jsp");
		}
		String typeUtilisateur = (String) session.getAttribute("typeUtilisateur"); 
		if (typeUtilisateur.equals("conseiller")) {
			response.sendRedirect(request.getContextPath() + "/404.jsp");
		}
	}
	
//Liste methodes Alex -------------------------------------------------------------------------------------------------------------------
	
	
	private void validerProspect(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ClientDao clientDao = new ClientDao();
		Integer clientId = Integer.getInteger(request.getParameter("clientId"));
		
		response.sendRedirect(request.getContextPath() + "/conseiller/validationProspect.jsp");
	}
	
	private void voirListeClient(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ClientDao clientDao = new ClientDao();

		response.sendRedirect(request.getContextPath() + "/conseiller/listeClient.jsp");
	}
	
	private void voirClient(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ClientDao clientDao = new ClientDao();
		Integer clientId = Integer.getInteger(request.getParameter("clientId"));

		response.sendRedirect(request.getContextPath() + "/conseiller/client.jsp");
	}
	
	private void voirCompteOperations(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CompteDao compteDao = new CompteDao();
		String rib = (String) request.getParameter("rib");
		
		response.sendRedirect(request.getContextPath() + "/conseiller/compte.jsp");
	}
}


/*
validerProspect(Integer ClientId)
voirListeClient()
voirClient(Integer ClientId)
voirCompteOperations(String rib)

Integer clientId = (Integer) request.getParameter(clientId);
String rib = (String) request.getParameter("rib");

Integer clientId = Integer.getInteger(request.getParameter("clientId"));
Integer id = (Integer) request.getAttribute("id");
*/

