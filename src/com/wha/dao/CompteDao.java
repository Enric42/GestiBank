package com.wha.dao;

import java.util.ArrayList;
import java.util.List;

import com.wha.entities.Compte;

public class CompteDao {

	public CompteDao() {
		// TODO Auto-generated constructor stub
	}

	public List<Compte> loadCompteByClientId(Integer clientId) {
		List<Compte> comptes = new ArrayList<Compte>();
		return comptes;
	}

	public Compte loadCompteByRib(String rib) {
		return null;
	}
	
	public void createCompte(Compte compte) {
		
	}
}