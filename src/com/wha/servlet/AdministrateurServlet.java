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
public class AdministrateurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AdministrateurServlet() {
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
		if (typeUtilisateur.equals("administrateur")) {
			response.sendRedirect(request.getContextPath() + "/404.jsp");
		}
	}
	
	private void creerConseiller(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Champs utilisateur
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		
		// Champs conseiller
		String matricule = request.getParameter("matricule");
		
		// Champs entité physique
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String genre = request.getParameter("genre");
		String mail = request.getParameter("mail");
		String tel = request.getParameter("tel");
		String adresse = request.getParameter("adresse");
		String codePostal = request.getParameter("cp");
		String ville = request.getParameter("ville");
		
		List<String> genres = new ArrayList<String>();
		genres.add("Homme");
		genres.add("Femme");
		genres.add("Autre");
		
		if (
			login == null || login.equals("") ||
			password == null || password.equals("") ||
			matricule == null || matricule.equals("") ||
			nom == null || nom.equals("") ||
			prenom == null || prenom.equals("") ||
			genre == null || genres.indexOf(genre) > 0 ||
			mail == null || mail.equals("") ||
			tel == null || tel.equals("") ||
			adresse == null || adresse.equals("") ||
			codePostal == null || codePostal.equals("") ||
			ville == null || ville.equals("")
		) {
			request.setAttribute("erreur", "Aucun matricule n'est renseigné");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/creerConseiller.jsp");
			requestDispatcher.forward(request, response);
		}
		else {
			ConseillerDao conseillerDao = new ConseillerDao();
			response.sendRedirect(request.getContextPath() + "/administrateur/creerConseillerValidation.jsp");
		}
	}
	
	private void supprimerConseiller(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String matricule = request.getParameter("matricule");
		Integer id = (Integer) request.getAttribute("id");
		
		if (matricule == null || matricule.equals("")) {
			request.setAttribute("erreur", "Aucun matricule n'est renseigné");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/conseillers/supprimer.jsp");
			requestDispatcher.forward(request, response);
		}
		else {
			ConseillerDao conseillerDao = new ConseillerDao();
			response.sendRedirect(request.getContextPath() + "/administrateur/conseillers/supprimerValidation.jsp");
		}
	}
	
	private void voirListeConseillers(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ConseillerDao conseillerDao = new ConseillerDao();

		response.sendRedirect(request.getContextPath() + "/administrateur/conseillers.jsp");
	}
	
	private void voirListeProspects(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ClientDao clientDao = new ClientDao();
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/administrateur/prospects.jsp");
		requestDispatcher.forward(request, response);
	}
	
	private void assignerProspects(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id = (Integer) request.getAttribute("id");
		
		ClientDao clientDao = new ClientDao();
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/administrateur/prospects/assigner.jsp");
		requestDispatcher.forward(request, response);
	}
	
	private void assignerProspect(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer conseillerId = Integer.getInteger(request.getParameter("conseillerId"));
		Integer id = (Integer) request.getAttribute("id");
		
		if (conseillerId == null) {
			assignerProspects(request, response);
		}
		else {
			ClientDao clientDao = new ClientDao();
			ConseillerDao conseillerDao = new ConseillerDao();
			response.sendRedirect(request.getContextPath() + "/administrateur/prospects/assignerValidation.jsp");
		}
	}
}