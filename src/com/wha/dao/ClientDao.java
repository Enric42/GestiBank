package com.wha.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.wha.entities.Client;

public class ClientDao implements IDao<Client>{

	public ClientDao() {
		// TODO Auto-generated constructor stub
	}

	public void createNewClient(String nom, String prenom, String tel, String mail, String adresse) throws SQLException {
		//clients sans mdp et avec valid False
		int tmp = getLastClientId();
		System.out.println(tmp);
		if(tmp != 0) {
			//voir generated keys pour l'id
			Client tmpClient = new Client(tmp, nom, prenom, tel, mail, adresse);
			Client tmp2 = create(tmpClient);
			System.out.println(tmp2.getLogin());
			System.out.println("Succès lors de la création de l'utilisateur");
		}else
			System.out.println("Erreur lors de la création de l'utilisateur");
	}
	
	private int getLastClientId() throws SQLException {
		ResultSet result = IDao.connect.createStatement().executeQuery(
				"select MAX(id) from utilisateurs"
			);
		int tmp = 0;
		if(result.next()) {
			tmp = result.getInt(1);
		}
		tmp += 1;
		return tmp;
	}
	
	public Client getClientByLogin(String login, String password) throws SQLException {
		Client tmp = null;
		ResultSet result = IDao.connect.createStatement().executeQuery(
				"select c.*, u.* from utilisateurs u inner join client c on u.id = c.id_utilisateur where u.login = '" + login + "' and u.password = '" + password +  "'"
			);
		if(result.next()) {
			tmp = new Client(
					result.getInt("id_utilisateur"),
					result.getString("nom"),
					result.getString("password"),
					result.getString("prenom"),
					result.getString("telephone"),
					result.getString("mail"),
					result.getString("adresse"),
					result.getBoolean("isValid"),
					0
				);
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

	public List<Client> loadProspectsWithoutConseiller() throws SQLException{
		List<Client> inscriptionsClient = new ArrayList<Client>();
		Client tmp = null;
		ResultSet result = IDao.connect.createStatement().executeQuery(
				"select c.*, u.* from utilisateurs u inner join client c on u.id = c.id_utilisateur where c.agent_utilisateur_id is null"
			);
		if(result.next()) {
			tmp = new Client(
					result.getInt("id_utilisateur"),
					result.getString("nom"),
					result.getString("password"),
					result.getString("prenom"),
					result.getString("telephone"),
					result.getString("mail"),
					result.getString("adresse"),
					result.getBoolean("isValid"),
					0
				);
			inscriptionsClient.add(tmp);
		}
		return inscriptionsClient;		
	}

	@Override
	public Client find(int id) {
		Client tmp = null;
		try{
			ResultSet result = IDao.connect.createStatement().executeQuery(
				"select c.*, u.* from utilisateurs u inner join client c on u.id = c.id_utilisateur where c.id_utilisateur = " + id
			);
			if(result.next()) {
				tmp = new Client(
						result.getInt("id_utilisateur"),
						result.getString("nom"),
						result.getString("password"),
						result.getString("prenom"),
						result.getString("telephone"),
						result.getString("mail"),
						result.getString("adresse"),
						result.getBoolean("isValid"),
						0
					);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return tmp;
	}

	@Override
	public Client create(Client object) {
		System.out.println(object.getId());
		Client tmp = null;
		try {
			PreparedStatement prepare1 = IDao.connect.prepareStatement(
					"INSERT into utilisateurs(login, password) values (?,?)"
				);
			PreparedStatement prepare2 = IDao.connect.prepareStatement(
					"INSERT into client(id_utilisateur, isValid, adresse, nom, prenom, mail, telephone, situation_id) values (?, ?, ?, ?, ?, ?, ?, ?)"
				);
			prepare1.setString(1, object.getLogin());
			prepare1.setString(2, object.getPassword());
			
			prepare2.setInt(1, object.getId());
			prepare2.setBoolean(2, object.getIsValid());
			prepare2.setString(3, object.getAdresse());
			prepare2.setString(4, object.getNom());
			prepare2.setString(5, object.getPrenom());
			prepare2.setString(6, object.getMail());
			prepare2.setString(7, object.getTelephone());
			prepare2.setInt(8, object.getSituationMatrimoniale());
			
			prepare1.executeUpdate();
			prepare2.executeUpdate();
			
			tmp = this.find(object.getId());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tmp;
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

	@SuppressWarnings("null")
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
						result.getString("password"),
						result.getString("prenom"),
						result.getString("telephone"),
						result.getString("mail"),
						result.getString("adresse"),
						null,
						0
					));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listeClients;
	}
}