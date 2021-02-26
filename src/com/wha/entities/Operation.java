package com.wha.entities;

import java.util.Date;

public class Operation implements IOperation {
	
	private Float montant;
	private Date date;
	private String libelle;
	private Compte compte;

	public Boolean isCreditPourCompte(Compte compte) {
		return this.compte.getRib().equals(compte.getRib()) ? getIsCredit() : false;
	}

	public Boolean isDebitPourCompte(Compte compte) {
		return this.compte.getRib().equals(compte.getRib()) ? getIsDebit() : false;
	}

	public Float getMontantCreditPourCompte(Compte compte) {
		return this.compte.getRib().equals(compte.getRib()) ? getMontantCredit() : 0f;
	}

	public Float getMontantDebitPourCompte(Compte compte) {
		return this.compte.getRib().equals(compte.getRib()) ? getMontantDebit() : 0f;
	}

	public Float getMontantPourCompte(Compte compte) {
		return isCreditPourCompte(compte) ? montant : isDebitPourCompte(compte) ? -montant : 0f;
	}
	
	// Getters & Setters
	
	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	public Float getMontant() {
		return montant;
	}

	public void setMontant(Float montant) {
		this.montant =  montant;
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
		return getIsDebit() ? Math.abs(montant) : 0f;
	}

	public Float getMontantCredit() {
		return getIsCredit() ? montant : 0f;
	}

	public Boolean getIsCredit() {
		return montant > 0 ? true : false;
	}

	public Boolean getIsDebit() {
		return montant < 0 ? true : false;
	}
}