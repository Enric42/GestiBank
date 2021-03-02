package com.wha.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.wha.entities.Compte;

public class CompteDao implements IDao<Compte>{
	
	private String request;

	public CompteDao() {
		System.out.println(IDao.connect);
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

	@Override
	public Compte find(int rib) {
		Compte compte = null;
		try {
			ResultSet result = IDao.connect.createStatement().executeQuery(this.request);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return compte;
	}

	@Override
	public Compte create(Compte object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Compte update(Compte obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Compte obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Compte> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}