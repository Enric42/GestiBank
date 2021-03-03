package com.wha.entities;

public class Compte implements ICompte {

	private Client client;
	private String rib;
	private TypeCompte typeCompte;
	private Float seuil;
	private Float faciliteCaisse;
	private Boolean isValid;
	
	/**
	 * Création d'un compte possédant un seuil négatif
	 * @param client
	 * @param rib
	 * @param typeCompte
	 * @param seuil
	 * @param faciliteCaisse
	 * @param isValid
	 */
	public Compte (Client client, String rib, TypeCompte typeCompte, Float seuil, Float faciliteCaisse, Boolean isValid) {
		this.setClient(client);
		this.setRib(rib);
		this.setTypeCompte(typeCompte);
		this.setSeuil(seuil);
		this.setFaciliteCaisse(faciliteCaisse);
		this.setIsValid(isValid);
	}
	/**
	 * Création d'un compte courant
	 * @param client
	 * @param rib
	 * @param typeCompte
	 * @param isValid
	 */
	public Compte (Client client, String rib, TypeCompte typeCompte, Boolean isValid) {
		this.setClient(client);
		this.setRib(rib);
		this.setTypeCompte(typeCompte);
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

	public TypeCompte getTypeCompte() {
		return typeCompte;
	}

	public void setTypeCompte(TypeCompte typeCompte) {
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