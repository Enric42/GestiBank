package com.wha.servlet;

import java.io.IOException;

import com.wha.dao.ClientDao;
import com.wha.dao.CompteDao;
import com.wha.entities.Conseiller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/conseiller/*"})
public class ConseillerServlet extends AServlet {
	private static final long serialVersionUID = 1L;

    /**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if (session != null) {
			if(verifierTypeUtilisateur(session, "conseiller")) {
				Conseiller conseiller = (Conseiller) session.getAttribute("utilisateur");
				if(getPath(request) != null) {
					switch (getPath(request)[3]) {
						default:
							redirect(request, response, "/404.jsp");
					}
				}
			}
			else {
				redirect(request, response, "/404.jsp");
			}
		}
		else {
			redirect(request, response, "/accueil.jsp");
		}
	}

    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if (session != null) {
			if(verifierTypeUtilisateur(session, "conseiller")) {
				Conseiller conseiller = (Conseiller) session.getAttribute("utilisateur");
				if(getPath(request) != null) {
					switch (getPath(request)[3]) {
						case "accueil":
							redirect(request, response, "/WEB-INF/accueils/conseiller.jsp");
							break;
						default:
							redirect(request, response, "/404.jsp");
					}
				}
			}
			else {
				redirect(request, response, "/404.jsp");
			}
		}
		else {
			redirect(request, response, "/accueil.jsp");
		}
	}

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