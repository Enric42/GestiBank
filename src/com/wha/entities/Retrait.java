package com.wha.entities;

import java.util.Date;

public class Retrait implements IOperation, IDebit {
	private final static String LIBELLE = "Retrait";

	private Compte compteSource;
	private Float montant;
	private Date date;

	public Boolean isCreditPourCompte(Compte compte) {
		return false;
	}

	public Boolean isDebitPourCompte(Compte compte) {
		return true;
	}

	public Float getMontantCreditPourCompte(Compte compte) {
		return 0f;
	}

	public Float getMontantDebitPourCompte(Compte compte) {
		return montant;
	}

	public Float getMontantPourCompte(Compte compte) {
		return -montant;
	}
	
	// Getters & Setters

	public Compte getCompteSource() {
		return compteSource;
	}

	public void setCompteSource(Compte compteSource) {
		this.compteSource = compteSource;
	}

	public Float getMontant() {
		return -getMontantDebit();
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
		return montant;
	}

	public Float getMontantCredit() {
		return 0f;
	}

	public Boolean getIsCredit() {
		return false;
	}

	public Boolean getIsDebit() {
		return true;
	}
}