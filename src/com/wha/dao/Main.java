package com.wha.dao;

import java.sql.SQLException;
import java.util.List;

import com.wha.entities.Client;
import com.wha.entities.Compte;

public class Main {

	public static void main(String[] args) throws SQLException {
		ClientDao clientDao = new ClientDao();
		CompteDao dao = new CompteDao();
		Client tmp = null;
		
		//clientDao.createNewClient("tamere", "laltere", "0303030303", "a@b.fr", "allee du cul");
		List<Compte> listeComptes = null;
		try {
			tmp = clientDao.getClientByLogin("maxime", "bras");
			listeComptes = dao.loadCompteByClientId(tmp);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		for (Compte compte : listeComptes) {
			System.out.println(compte.getRib());
		}
	}

}
