package com.wha.entities;

import java.util.Date;

//besoins admin + gestion 
public class Virement implements IOperation, ICredit, IDebit{

	private Compte compteSource;
	private Compte compteDestination;
	private Float montant;
	private Date date;
	private String libelle;
	
	private boolean isCredit = true;
	
	public Virement() {
		//cree ton obj -> valeur
		//isDebit de Ioperation -> true or false
		//Compte courant -> test
	}
	
	//besoins client
	
	public Boolean isCreditPourCompte(Compte compte) {
		return compteDestination.getRib().equals(compte.getRib());
	}

	public Boolean isDebitPourCompte(Compte compte) {
		return compteSource.getRib().equals(compte.getRib());
	}

	public Float getMontantCreditPourCompte(Compte compte) {
		return isCreditPourCompte(compte) ? montant : 0f;
	}

	public Float getMontantDebitPourCompte(Compte compte) {
		return isDebitPourCompte(compte) ? montant : 0f;
	}

	public Float getMontantPourCompte(Compte compte) {
		return isCreditPourCompte(compte) ? montant : -montant;
	}
	
	// Getters & Setters

	public Compte getCompteSource() {
		return compteSource;
	}

	public void setCompteSource(Compte compteSource) {
		this.compteSource = compteSource;
	}

	public Compte getCompteDestination() {
		return compteDestination;
	}

	public void setCompteDestination(Compte compteDestination) {
		this.compteDestination = compteDestination;
	}

	public Float getMontant() {
		return montant;
	}

	public void setMontant(Float montant) {
		this.montant = montant;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle; 
	}

	public Float getMontantDebit() {
		return montant;
	}

	public Boolean getIsCredit() {
		return true;
	}

	public Boolean getIsDebit() {
		return true;
	}

	@Override
	public Float getMontantCredit() {
		// TODO Auto-generated method stub
		return null;
	}
}