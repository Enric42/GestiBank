package com.wha.entities;

public class Compte implements ICompte {

	private Client client;
	private String rib;
	private Boolean isValid;
	private ETypeCompte typeCompte;
	private Float seuil;
	private Float faciliteCaisse;
	
	public void effectuerVirement(Float montant, ICompte compteDestination, String libelle) {
		// TODO
		
	}
	
	// Getters & Setters
	
	public Client getClient() {
		return client;
	}
	
	public void setClient(Client client) {
		this.client = client;
	}

	public Boolean getIsValid() {
		return isValid;
	}

	public void setIsValid(Boolean isValid) {
		this.isValid = isValid;
	}

	public ETypeCompte getTypeCompte() {
		return typeCompte;
	}

	public void setTypeCompte(ETypeCompte typeCompte) {
		this.typeCompte = typeCompte;
	}

	public Float getSeuil() {
		return seuil;
	}

	public void setSeuil(Float seuil) {
		this.seuil = seuil;
	}

	public Float getFaciliteCaisse() {
		return faciliteCaisse;
	}

	public void setFaciliteCaisse(Float faciliteCaisse) {
		this.faciliteCaisse = faciliteCaisse;
	}

	public String getRib() {
		return rib;
	}

	public void setRib(String rib) {
		this.rib = rib;
	}
}