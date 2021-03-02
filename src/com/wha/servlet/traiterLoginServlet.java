package com.wha.servlet;

import java.io.IOException;
import java.sql.SQLException;

import com.wha.dao.ClientDao;
import com.wha.entities.Client;

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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String identifiant = (String) request.getParameter("login");			// Utilisateur à saisir
		String motDePasse = (String) request.getParameter("motDePasse");		// Mot de passe à saisir
		String typeUtilisateur = (String) request.getParameter("whois");
		
		switch(typeUtilisateur) {
			case "client":
				ClientDao clientDao = new ClientDao();
				Client tmpCli = null;
				try {
					tmpCli = clientDao.getClientByLogin(identifiant, motDePasse);
				} catch (SQLException e) {
					e.printStackTrace();
				}
				if(clientDao == null)
					response.sendRedirect(request.getContextPath() + "/erreur.html");
				break;
		}
		
		if (identifiant.equals("client") && motDePasse.equals("client"))
		{
			HttpSession session= request.getSession(true);
			session.setAttribute("utilisateur", "Client");
			System.out.println("Connexion réussie. Bienvenue " + identifiant);			//Si client, renvoi vers page client
			response.sendRedirect(request.getContextPath() + "/accueilClient.jsp");			
		}
		
		else if (identifiant.equals("conseil") && motDePasse.equals("conseil"))
		{
			HttpSession session= request.getSession(true);
			session.setAttribute("utilisateur", "Conseiller");
			System.out.println("Connexion réussie. Bienvenue " + identifiant);			////Si conseiller, renvoi vers page conseiller
			response.sendRedirect(request.getContextPath() + "/accueilConseiller.jsp");			
		}
		
		else if (identifiant.equals("admin") && motDePasse.equals("admin"))
		{
			HttpSession session= request.getSession(true);
			session.setAttribute("utilisateur", "Administrateur");
			System.out.println("Connexion réussie. Bienvenue " + identifiant);			////Si administrateur, renvoi vers page admin
			response.sendRedirect(request.getContextPath() + "/accueilAdmin.jsp");			
		}
		
		else
		{
			System.out.println("Connexion impossible : identifiant ou mot de passe incorrect");		// Si pas ok
			response.sendRedirect(request.getContextPath() + "/erreur.html");
		}
	}


}