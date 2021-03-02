package com.wha.dao;

import java.util.ArrayList;
import java.util.List;

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