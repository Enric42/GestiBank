package com.wha.entities;

import java.util.Date;

public interface IOperation {

	public Float getMontant();
	public void setMontant(Float montant);
	public Date getDate();
	public void setDate(Date date);
	public String getLibelle();
	public void setLibelle(String libelle);
	public Float getMontantDebit();
	public Float getMontantCredit();
	public Boolean getIsCredit();
	public Boolean getIsDebit();
	
	public Boolean isCreditPourCompte(Compte compte);
	public Boolean isDebitPourCompte(Compte compte);
	public Float getMontantCreditPourCompte(Compte compte);
	public Float getMontantDebitPourCompte(Compte compte);
	public Float getMontantPourCompte(Compte compte);
}