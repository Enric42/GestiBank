package com.wha.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.wha.entities.TypeCompte;

public class TypeCompteDao implements IDao<TypeCompte>{

	public TypeCompteDao() {
	}
	
	@Override
	public TypeCompte find(int id) {
		TypeCompte tmp = null;
		try {
			ResultSet result = IDao.connect.createStatement().executeQuery(
					"SELECT * FROM typeCompte WHERE id = " + id
				);
			if(result.next()) {
				tmp = new TypeCompte(
						result.getInt("id"),
						result.getString("denomination")
					);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tmp;
	}

	@Override
	public TypeCompte create(TypeCompte object) {
		return null;
	}

	@Override
	public TypeCompte update(TypeCompte obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(TypeCompte obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<TypeCompte> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
