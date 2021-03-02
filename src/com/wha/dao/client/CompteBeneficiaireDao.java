package com.wha.dao.client;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import com.wha.dao.Database;
import com.wha.entities.CompteBeneficiaire;

public class CompteBeneficiaireDao {

	private Connection connection;
	
	public CompteBeneficiaireDao() throws ClassNotFoundException {
		this.connection = Database.getInstance();
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