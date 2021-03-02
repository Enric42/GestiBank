package com.wha.entities;

public class Compte implements ICompte {

	private Client client;
	private String rib;
	private ETypeCompte typeCompte;
	private Float seuil;
	private Float faciliteCaisse;
	private Boolean isValid;
	
	public Compte (Client client, String rib, ETypeCompte typeCompte, Float seuil, Float faciliteCaisse, Boolean isValid) {
		this.setClient(client);
		this.setRib(rib);
		this.setTypeCompte(typeCompte);
		this.setSeuil(seuil);
		this.setFaciliteCaisse(faciliteCaisse);
		this.setIsValid(isValid);
	}
	
	public void effectuerVirement(Float montant, ICompte compteDestination, String libelle) {
		
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