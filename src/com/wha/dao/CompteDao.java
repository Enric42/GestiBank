package com.wha.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.wha.entities.Client;
import com.wha.entities.Compte;
import com.wha.entities.TypeCompte;

public class CompteDao implements IDao<Compte>{
	
	private String request;
	
	/**
	 * Cherche en base de donnée la liste de tous les comptes que possède un client et lui retourne.
	 * @param client
	 * @return List<Compte>
	 * @throws SQLException
	 */
	public List<Compte> loadCompteByClientId(Client client) throws SQLException {
		List<Compte> listeComptes = new ArrayList<Compte>();
		TypeCompte tpCompte = null;
		this.request = "SELECT * FROM compte WHERE id_client = " + client.getId();
		ResultSet result = IDao.connect.createStatement().executeQuery(request);
		while(result.next()) {
			if(result.getInt("id_type_compte") != 0)
				tpCompte = new TypeCompteDao().find(result.getInt("id_type_compte"));
			
			switch (result.getInt("id_type_compte")) {
			case 1: {
				listeComptes.add(new Compte(
					client,
					result.getString("rib"),
					tpCompte,
					result.getBoolean("is_valid")
				));
				break;
			}
			default:
				listeComptes.add(new Compte(
					client,
					result.getString("rib"),
					tpCompte,
					result.getFloat("seuil"),
					result.getFloat("facilite_caisse"),
					result.getBoolean("is_valid")
				));
			}
		}
		return listeComptes;
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