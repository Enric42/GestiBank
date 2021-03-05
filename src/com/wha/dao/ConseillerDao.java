package com.wha.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.wha.entities.Client;
import com.wha.entities.Conseiller;

public class ConseillerDao implements IDao<Conseiller> {

	public ConseillerDao() {
		// TODO Auto-generated constructor stub
	}

	public void createConseiller(Conseiller conseiller) {
		
	}
	
	public Conseiller loadConseiller(String login, String password) {
		return null;
	}

	public void updateConseiller(Conseiller conseiller) {
		
	}

	public void deleteConseiller(String matricule) {
		
	}

	public Conseiller loadConseillerByMatricule(String matricule) {
		return null;
	}

	public List<Conseiller> loadConseillers() {
		List<Conseiller> conseillers = new ArrayList<Conseiller>();
		return conseillers;
	}
	
	public Conseiller getConseillerByLogin(String login, String password) throws SQLException {
		Conseiller conseiller = null;
		PreparedStatement prepareRequete = IDao.connect.prepareStatement("select a.*, u.* from utilisateurs u inner join agent a on u.id = a.id_utilisateur where u.login = ? and u.password = ?");
		prepareRequete.setString(1,login);
		prepareRequete.setString(2,password);
		ResultSet result = prepareRequete.executeQuery();
		if(result.next()) {
			conseiller = new Conseiller();
			conseiller.setLogin(result.getString("login"));
			conseiller.setPassword(result.getString("password"));
			conseiller.setMatricule(result.getString("matricule"));
			conseiller.setNom(result.getString("nom"));
			conseiller.setPrenom(result.getString("prenom"));
			conseiller.setTelephone(result.getString("telephone"));
			conseiller.setMail(result.getString("mail"));
			conseiller.setDebutContrat(result.getDate("dateDebutContrat"));
		}
		System.out.println("conseiller");
		return conseiller;
	}

	@Override
	public Conseiller find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Conseiller create(Conseiller object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Conseiller update(Conseiller obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Conseiller obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Conseiller> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}