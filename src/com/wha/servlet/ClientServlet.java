package com.wha.servlet;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import com.wha.entities.Client;
import com.wha.entities.Compte;
import com.wha.entities.CompteBeneficiaire;
import com.wha.entities.Virement;

@WebServlet(urlPatterns = {"/client/*"})
public class ClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
     * @see HttpServlet#HttpServlet()
     */
    public ClientServlet() {
        super();
    }
    
    private String getPath(HttpServletRequest request) {
    	String tmp = null;
    	String[] paths = request.getRequestURI().split("/");
    	if(paths.length > 3) {
    		tmp = paths[3];
    	}
    	return tmp;
    }
    
    /**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    	if(request.getSession(false) != null) {
			HttpSession tmpSession = request.getSession(false);
			if(getPath(request) != null) {
				switch (getPath(request)) {
				case "nouveauVirement": {
					//effectuerVirement(request, response);
					redirect(request, response, "/accueilClient.jsp");
					break;
				}
				case "supprimerConseiller":
					redirect(request, response, "/accueilClient.jsp");
					break;
				case "ajouterCompteBeneficiaire":
					redirect(request, response, "/accueilClient.jsp");
					break;
				default:
					redirect(request, response, "/accueilClient.jsp");
					break;
			}
			}else
				redirect(request, response, "/accueilClient.jsp");
		}else {
			redirect(request, response, "/accueil.jsp");
		}
    };
    
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		if(request.getSession(false) != null) {
			HttpSession tmpSession = request.getSession(false);
			if(getPath(request) != null) {
				switch (getPath(request)) {
					case "comptes":
						Client client = (Client) tmpSession.getAttribute("utilisateur");
						tmpSession.setAttribute("comptes", client.getComptes());
						redirect(request, response, "/accueilClient.jsp");
						break;
					case "compte":
						break;
				}
			}else
				redirect(request, response, "/accueilClient.jsp");
		}else {
			redirect(request, response, "/accueil.jsp");
		}
    }
	
	private void redirect(HttpServletRequest request, HttpServletResponse response, String redir) throws IOException {
		response.sendRedirect(request.getContextPath() + redir);
	}
    


	private void ajouterCompteBeneficiaire(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String libelle = request.getParameter("libelle");
		String rib = request.getParameter("rib");
		if (libelle.equals(null) || libelle.equals("") ||
				rib.equals(null) || rib.equals("")) {
			request.setAttribute("erreur", "vous avez mal renseigne les champs");
			request.getRequestDispatcher("/ajouterCompteBeneficiaire.jsp").forward(request, response);
		}else {
			CompteBeneficiaire newBeneficiaire = new CompteBeneficiaire();
			newBeneficiaire.setLibelle(libelle);
			newBeneficiaire.setRib(rib);
		}
		response.sendRedirect(request.getContextPath() + "/Client/confirmationCreationBeneficiaire");
	}

	private void effectuerVirement(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String compteEmetteur = request.getParameter("CmptEmetteur");
		String compteRecepteur = request.getParameter("CmptRecepteur");
		String libelleVirement = request.getParameter("LiblVirement");
		String montantVirement = request.getParameter("MontVirement");
		if (compteEmetteur.equals(null) || compteEmetteur.equals("") ||
			compteRecepteur.equals(null) || compteRecepteur.equals("") ||
			montantVirement.equals(null) || montantVirement.equals("")) {
			request.setAttribute("erreur","vous avez mal renseignee les champs");
			request.getRequestDispatcher("/virement.jsp").forward(request, response);
		}
		if(libelleVirement.equals(null)) { libelleVirement = "";}
		
		Virement v = new Virement();
		v.setCompteDestination(null);
		v.setCompteSource(null);
		v.setLibelle(null);
		v.setMontant(null);
		v.setDate(new Date());
		}



	private void getcompte(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String rib = request.getParameter("rib");
		HttpSession session = request.getSession(false);
		if (session == null ) {response.sendRedirect(request.getContextPath() + "/404.jsp");}
		Client user = (Client) session.getAttribute("utilisateur");
		List<Compte> comptes = user.getComptes();
		Compte theCompte = user.consulterCompte(rib);
		request.setAttribute("compte", theCompte);
		request.getRequestDispatcher("compte.jsp").forward(request, response);
		
	}

	private void getComptes(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		HttpSession session = request.getSession(false);
		if (session == null ) {response.sendRedirect(request.getContextPath() + "/404.jsp");}
		Client user = (Client) session.getAttribute("utilisateur");
		List<Compte> comptes = user.getComptes();
		request.setAttribute("comptes", comptes);
		request.getRequestDispatcher("comptes.jsp").forward(request, response);
	}

    
    
    
    
    private void supprimerCompteBeneficiaire(HttpServletRequest request, HttpServletResponse response) throws ServletException,  IOException {
		String rib = request.getParameter("rib");
		HttpSession session = request.getSession(false);
		if (session == null ) {response.sendRedirect(request.getContextPath() + "/404.jsp");}
		Client user = (Client) session.getAttribute("utilisateur");
		user.supprimerCompteBeneficiaire(rib);
		response.sendRedirect(request.getContextPath() + "/client/beneficiaireSupprimerAvecSucce");
	}
    

}
