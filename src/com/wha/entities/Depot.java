package com.wha.entities;

import java.util.Date;

public class Depot implements IOperation, ICredit {
	private final static String LIBELLE = "Dépot";

	private Compte compteDestination;
	private Float montant;
	private Date date;

	public Boolean isCreditPourCompte(Compte compte) {
		return true;
	}

	public Boolean isDebitPourCompte(Compte compte) {
		return false;
	}

	public Float getMontantCreditPourCompte(Compte compte) {
		return montant;
	}

	public Float getMontantDebitPourCompte(Compte compte) {
		return 0f;
	}

	public Float getMontantPourCompte(Compte compte) {
		return montant;
	}
	
	// Getters & Setters

	public Compte getCompteDestination() {
		return compteDestination;
	}

	public void setCompteDestination(Compte compteDestination) {
		this.compteDestination = compteDestination;
	}
	
	public Float getMontant() {
		return getMontantCredit();
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
		return LIBELLE;
	}
	
	public void setLibelle(String libelle) {}

	public Float getMontantDebit() {
		return 0f;
	}

	public Float getMontantCredit() {
		return montant;
	}
	
	public Boolean getIsCredit() {
		return true;
	}
	
	public Boolean getIsDebit() {
		return false;
	}
}