package com.wha.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Conseiller extends AUtilisateur implements IEntitePhysique {

	private String matricule;
	private String nom;
	private String prenom;
	private Date debutContrat;
	private String telephone;
	private String mail;
	private String adresse;
	private int situationMatrimoniale;
	
	private List<Client> clients = new ArrayList<Client>();
	
	private List<Client> prospects = new ArrayList<Client>();

	public void ouvrirCompteClient(Client client) {
	}

	@Override
	public void accederEspacePersonnalise() {
		
	}
	
	// Getters & Setters

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public Date getDebutContrat() {
		return debutContrat;
	}

	public void setDebutContrat(Date debutContrat) {
		this.debutContrat = debutContrat;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getSituationMatrimoniale() {
		return situationMatrimoniale;
	}

	public void setSituationMatrimoniale(int situationMatrimoniale) {
		this.situationMatrimoniale = situationMatrimoniale;
	}

}