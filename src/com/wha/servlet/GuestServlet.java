package com.wha.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.wha.dao.ClientDao;
import com.wha.dao.ConseillerDao;
import com.wha.entities.Client;

import jakarta.servlet.RequestDispatcher;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/public/*"})
public class GuestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public GuestServlet() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String path = request.getRequestURI();
		System.out.println(path);
		switch (request.getRequestURI().split("/")[3]) {
			case "inscription" :
				System.out.println("inscription");
				sInscrire(request, response);
				break;
			case "/public/convertir":
				convertirDevise(request,response);
				break;
			default:
				System.out.println("404");
				redirigerPage404(request, response);
				}
		// TODO switch
		/*
		if (path == "/administrateur/creerConseiller") {
			creerConseiller(request, response);
		}
		*/
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String path = request.getRequestURI();

		// TODO switch
		/*
		if (path == "/administrateur/creerConseiller") {
			creerConseiller(request, response);
		}
		*/
	}
		
	private void sInscrire(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Champs entit� physique
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
			nom == null || nom.equals("") ||
			prenom == null || prenom.equals("") ||
			genre == null || genres.indexOf(genre) > 0 ||
			mail == null || mail.equals("") ||
			tel == null || tel.equals("") ||
			adresse == null || adresse.equals("") ||
			codePostal == null || codePostal.equals("") ||
			ville == null || ville.equals("")
		) {
			request.setAttribute("erreur", "Erreur");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/inscription.jsp");
			requestDispatcher.forward(request, response);
		}
		else {
			String nouvelleAdresse = adresse + "-" + codePostal + "-" + ville;
			ClientDao clientDao = new ClientDao();
			try {
				clientDao.createNewClient(nom, prenom, tel, mail, nouvelleAdresse);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			response.sendRedirect(request.getContextPath() + "/validationInscription.jsp");
		}
	}
	
	private void convertirDevise(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Float montant = Float.parseFloat(request.getParameter("montant"));
		String deviseEntree = request.getParameter("deviseEntree");
		String deviseSortie = request.getParameter("deviseSortie");
		
		if (deviseEntree == null || deviseEntree.equals("")) {
			deviseEntree = "EUR";
		}
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/conversionDevise.jsp");
		requestDispatcher.forward(request, response);
	}
	
	private void redirigerPage404(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	System.out.println("Redirection page 404");
		response.sendRedirect(request.getContextPath() + "/404.jsp");
	}
	
}