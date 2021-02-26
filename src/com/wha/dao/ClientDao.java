package com.wha.dao;

import java.util.ArrayList;
import java.util.List;

import com.wha.entities.Client;

public class ClientDao {

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
	
	public Client loadClient(String login, String password) {
		return null;
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
}