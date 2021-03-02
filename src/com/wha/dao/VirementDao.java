package com.wha.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.wha.entities.Compte;
import com.wha.entities.Virement;

public class VirementDao implements IDao<Virement> {

	public VirementDao() {
		System.out.println(IDao.connect);
	}
	@Override
	public Virement find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Virement create(Virement object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Virement update(Virement obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Virement obj) {
		// TODO Auto-generated method stub
	}

	//getVirementCli -> ope debit -> comptedestination.
	
	@Override
	public ArrayList<Virement> findAll() {
		ArrayList<Virement> listeVirements = new ArrayList<Virement>();
		try {
			ResultSet result = IDao.connect.createStatement().executeQuery(null);
			while(result.next()) {
				listeVirements.add(null
						
					);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private Virement createVirement(Compte compteSource) {
		return null;
	}
}