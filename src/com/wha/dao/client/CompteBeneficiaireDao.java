package com.wha.dao.client;

import java.util.ArrayList;
import java.util.List;

import com.wha.entities.CompteBeneficiaire;

public class CompteBeneficiaireDao {

	public CompteBeneficiaireDao() {
		
	}
	
	public List<CompteBeneficiaire> loadCompteBeneficiaireByClientId(Integer clientId) {
		List<CompteBeneficiaire> comptesBeneficiaires = new ArrayList<CompteBeneficiaire>();
		return comptesBeneficiaires;
	}
	
	public void createCompteBeneficiaire(String clientId, String rib) {
		
	}
	
	public void deleteCompteBeneficiaire(String clientId, String rib) {
		
	}
}