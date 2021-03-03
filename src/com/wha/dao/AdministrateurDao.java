package com.wha.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.wha.entities.Administrateur;
import com.wha.entities.Client;

public class AdministrateurDao implements IDao<Administrateur>{

	public AdministrateurDao() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Administrateur find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Administrateur create(Administrateur object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Administrateur update(Administrateur obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Administrateur obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Administrateur> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Administrateur getAdministrateurByLogin(String login, String password) throws SQLException {
		Administrateur tmp = null;
		PreparedStatement preparedStatement = IDao.connect.prepareStatement("select u.* from utilisateurs u inner join administrateur a on u.id = a.id_utilisateur where u.login = ? and u.password = ?");
		preparedStatement.setString(1, login);
		preparedStatement.setString(2, password);
		ResultSet result = preparedStatement.executeQuery();
		if(result.next()) {
			System.out.println("in");
			tmp = new Administrateur();
			tmp.setId(result.getInt("id"));
			tmp.setLogin(result.getString("login"));
			tmp.setPassword(result.getString("password"));
		}
		return tmp;
	}
	
}