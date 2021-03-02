package com.wha.servlet;

import java.io.IOException;
import java.sql.SQLException;

import com.wha.dao.ClientDao;
import com.wha.dao.ConseillerDao;
import com.wha.dao.AdministrateurDao;
import com.wha.entities.Client;
import com.wha.entities.Conseiller;
import com.wha.entities.Administrateur;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/connection/*"})
public class traiterLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public traiterLoginServlet() {
        super();
    }

    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		String identifiant = (String) request.getParameter("login");
		String motDePasse = (String) request.getParameter("motDePasse");
		String typeUtilisateur = (String) request.getParameter("whois");
		
		switch(typeUtilisateur) {
			case "administrateur":
				AdministrateurDao administrateurDao = new AdministrateurDao();
				Administrateur administrateur = null;
				// Administrateur administrateur = AdministrateurDao.getAdministrateurByLogin(identifiant, motDePasse);
				if (administrateur == null) {
					redirigerPageErreurConnexion(request, response);
				}
				else {
					HttpSession session = request.getSession(true);
					session.setAttribute("typeUtilisateur", "administrateur");
					session.setAttribute("utilisateur", administrateur);
					System.out.println("Connexion de l'administrateur réussie. Bienvenue " + identifiant);
					response.sendRedirect(request.getContextPath() + "/accueilAdmin.jsp");
				}
				break;
			case "conseiller":
				ConseillerDao conseillerDao = new ConseillerDao();
				Conseiller conseiller = null;
				// Conseiller conseiller = conseillerDao.getConseillerByLogin(identifiant, motDePasse);
				if (conseiller == null) {
					redirigerPageErreurConnexion(request, response);
				}
				else {
					HttpSession session = request.getSession(true);
					session.setAttribute("typeUtilisateur", "conseiller");
					session.setAttribute("utilisateur", conseiller);
					System.out.println("Connexion du conseiller réussie. Bienvenue " + identifiant);
					response.sendRedirect(request.getContextPath() + "/accueilConseiller.jsp");
				}
				break;
			default:
				ClientDao clientDao = new ClientDao();
				Client client = null;
				try {
					client = clientDao.getClientByLogin(identifiant, motDePasse);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (client == null) {
					redirigerPageErreurConnexion(request, response);
				}
				else {
					HttpSession session = request.getSession(true);
					session.setAttribute("typeUtilisateur", "client");
					session.setAttribute("utilisateur", client);
					System.out.println("Connexion de l'administrateur réussie. Bienvenue " + identifiant);
					response.sendRedirect(request.getContextPath() + "/accueilClient.jsp");
				}
		}
	}
    
    private void redirigerPageErreurConnexion(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	System.out.println("Connexion impossible : identifiant ou mot de passe incorrect");
		response.sendRedirect(request.getContextPath() + "/erreur.html");
    }
}