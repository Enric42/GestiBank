package com.wha.entities;

public class CompteBeneficiaire implements ICompte {

	private String libelle;
	private String rib;
	private Boolean proprietaire;
	
	
	public CompteBeneficiaire (String libelle, String rib) {
		this.setLibelle(libelle);
		this.setRib(rib);
		this.setProprietaire(proprietaire);
	}
	
	public CompteBeneficiaire () {
	}

	
	
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
	
	public Boolean getProprietaire() {
		return proprietaire;
	}
	
	public void setProprietaire(Boolean proprietaire) {
		this.proprietaire = proprietaire;
	}
}

