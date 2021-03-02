package com.wha.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.wha.entities.Client;

public class ClientDao implements IDao<Client>{

	public ClientDao() {
		// TODO Auto-generated constructor stub
	}

	public void createClient(Client client) {
		
	}

	public void updateClient(Client client) {
		
	}

	public Client loadClientById(Integer id) {
		// isValid == true
		return null;
	}

	public Client loadProspectById(Integer id) {
		// isValid == false
		return null;
	}
	
	public String getPasswordByLogin(String login) throws SQLException {
		String tmp = null;
		ResultSet result = IDao.connect.createStatement().executeQuery(
				"select password from utilisateurs where login = '" + login + "'"
			);
		if(result.next()) {
			tmp = result.getString("password");
		}
		return tmp;
	}

	public List<Client> loadClientsByConseillerMatricule(String matricule) {
		// isValid == true
		List<Client> clients = new ArrayList<Client>();
		return clients;
	}

	public List<Client> loadProspectsByConseillerMatricule(String matricule) {
		// isValid == false
		List<Client> prospects = new ArrayList<Client>();
		return prospects;
	}

	public List<Client> loadProspectsWithoutConseiller() {
		// isValid == false
		List<Client> prospects = new ArrayList<Client>();
		return prospects;
	}

	@Override
	public Client find(int id) {
		return null;
	}

	@Override
	public Client create(Client object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client update(Client obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Client obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Client> findAll() {
		ArrayList<Client> listeClients = null;
		try {
			ResultSet result = IDao.connect.createStatement().executeQuery(
					"SELECT * FROM client"
				);
			while(result.next()) {
				listeClients.add(new Client(
						result.getInt("id_utilisateur"),
						result.getString("nom"),
						result.getString("prenom"),
						result.getString("telephone"),
						result.getString("mail"),
						result.getString("adresse"),
						null,
						null
					));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listeClients;
	}
}