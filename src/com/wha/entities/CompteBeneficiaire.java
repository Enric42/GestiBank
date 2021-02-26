package com.wha.entities;

public class CompteBeneficiaire implements ICompte {

	private String libelle;
	private String rib;
	
	// Getters & Setters

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getRib() {
		return rib;
	}

	public void setRib(String rib) {
		this.rib = rib;
	}
}