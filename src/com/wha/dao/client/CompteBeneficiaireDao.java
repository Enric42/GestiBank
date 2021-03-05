package com.wha.dao.client;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;

import java.util.ArrayList;
import java.util.List;

import com.wha.dao.Database;
import com.wha.dao.IDao;
import com.wha.entities.CompteBeneficiaire;

public class CompteBeneficiaireDao implements IDao<CompteBeneficiaire> {
	
	public CompteBeneficiaireDao() throws ClassNotFoundException {
		
	}
	
	public List<CompteBeneficiaire> loadCompteBeneficiaireByClientId(Integer clientId) throws SQLException {
		List<CompteBeneficiaire> comptesBeneficiaires = new ArrayList<CompteBeneficiaire>();
		PreparedStatement preparedStatement = IDao.connect.prepareStatement(
				"select compte_rib, libelle, id_utilisateur, propietaire FROM V_compte_beneficiaire"
				+ "where id_utilisateur = ?");
		preparedStatement.setInt(1, clientId);
		ResultSet results = preparedStatement.executeQuery();
		while(results.next()) {
			CompteBeneficiaire compte = new CompteBeneficiaire(
					results.getString("libelle"),
					results.getString("rib"),
					results.getBoolean("propietaire")
			);
			comptesBeneficiaires.add(compte);
		}
		return comptesBeneficiaires;
	}
	
	public void createCompteBeneficiaire(Integer clientId, String libelle, String rib) throws SQLException {
		PreparedStatement preparedStatement = IDao.connect.prepareStatement(
				"Insert INTO client_has_beneficiaires"
				+ "(compte_rib, id_utilisateur, libelle)"
				+ " values (?, ?, ?)");
		preparedStatement.setString(1, rib);
		preparedStatement.setInt(2, clientId);
		preparedStatement.setString(3, libelle);
		preparedStatement.executeUpdate();
		
	}
	
	public void deleteCompteBeneficiaire(String clientId, String rib) {
		
	}

	@Override
	public CompteBeneficiaire find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CompteBeneficiaire create(CompteBeneficiaire object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CompteBeneficiaire update(CompteBeneficiaire obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(CompteBeneficiaire obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<CompteBeneficiaire> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}