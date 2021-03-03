package com.wha.servlet;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.wha.entities.Client;
import com.wha.entities.Compte;
import com.wha.entities.CompteBeneficiaire;
import com.wha.entities.Conseiller;
import com.wha.entities.Virement;

@WebServlet("/client/*")
public class ClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ClientServlet() {
        
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    	String path = request.getRequestURI();
    	if(path.equals("/Client/nouveauVirement") ){
    		effectuerVirement(request, response);
    	}else if (path.equals("/Client/supprimerConseiller")) {
    		supprimerCompteBeneficiaire(request, response);
    	}else if (path.equals("/Client/ajouterCompteBeneficiaire") ){
    		ajouterCompteBeneficiaire(request, response);
    	}else {response.sendRedirect(request.getContextPath() + "/404.jsp");}
    };
    


	private void ajouterCompteBeneficiaire(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String libel = request.getParameter("libelle");
		String rib = request.getParameter("rib");
		if (libel.equals(null) || libel.equals("") ||
				rib.equals(null) || rib.equals("")) {
			request.setAttribute("erreur", "vous avez mal renseigne les champs");
			request.getRequestDispatcher("/ajouterCompteBeneficiaire.jsp").forward(request, response);
		}else {
			CompteBeneficiaire newBeneficiaire = new CompteBeneficiaire();
			newBeneficiaire.setLibelle(libel);
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
		if(libelleVirement.equals(null)) { 
			libelleVirement = "";
		
		Virement v = new Virement();
		v.setCompteDestination(null);
		v.setCompteSource(null);
		v.setLibelle(null);
		v.setMontant(null);
		v.setDate(new Date());
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    	String path = request.getRequestURI();
    	if(path.equals("/Client/getConseiller")) {
    		getConseiller(request, response);
    	}else if (path.equals("/Client/consulterComptes")) {
    		getComptes(request, response);
    	}else if(path.equals("/Client/")){
    		getcompte(request, response);
    	}else {response.sendRedirect(request.getContextPath() + "/404.jsp");}
    }

	private void getcompte(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String rib = request.getParameter("rib");
		HttpSession session = request.getSession(false);
		if (session == null ) {response.sendRedirect(request.getContextPath() + "/404.jsp");}
		Client user = (Client) 
		session.getAttribute("utilisateur");
		List<Compte> comptes = user.getComptes();
		Compte theCompte = null;
		for(Compte compte : comptes) {
			if(rib.equals(compte.getRib())) {
				theCompte = compte;
			}
		}
		request.setAttribute("compte", theCompte);
		request.getRequestDispatcher("compte.jsp").forward(request, response);
		
	}

	private void getComptes(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		HttpSession session = request.getSession(false);
		if (session == null ) {response.sendRedirect(request.getContextPath() + "/404.jsp");}
		Client user = (Client) 
		session.getAttribute("utilisateur");
		List<Compte> comptes = user.getComptes();
		request.setAttribute("comptes", comptes);
		request.getRequestDispatcher("comptes.jsp").forward(request, response);
	}

	private void getConseiller(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		HttpSession session = request.getSession(false);
		if (session == null ) {response.sendRedirect(request.getContextPath() + "/404.jsp");}
		Client user = (Client)
		session.getAttribute("utilisateur");
		Conseiller conseiller = user.getConseiller();
		request.setAttribute("conseiller", conseiller);
		request.getRequestDispatcher("monconseiller.jsp").forward(request, response);
	};
    
    
    
    
    private void supprimerCompteBeneficiaire(HttpServletRequest request, HttpServletResponse response) throws ServletException,  IOException {
		String rib = request.getParameter("rib");
		HttpSession session = request.getSession(false);
		if (session == null ) {response.sendRedirect(request.getContextPath() + "/404.jsp");}
		Client user = (Client) session.getAttribute("utilisateur");
		user.supprimerCompteBeneficiaire(rib);
		response.sendRedirect(request.getContextPath() + "/Client/beneficiaireSupprimerAvecSucce");
	}
    

}
