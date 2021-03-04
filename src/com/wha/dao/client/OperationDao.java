package com.wha.dao.client;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.wha.dao.IDao;
import com.wha.entities.IOperation;
import com.wha.entities.Operation;

public class OperationDao {

	public OperationDao() {
		// TODO Auto-generated constructor stub
	}

	public List<? extends IOperation> loadCompteBeneficiaireByCompteId(Integer compteId) {
		List<? extends IOperation> operations = new ArrayList<Operation>();
		return operations;
	}
	
	
	public List<Operation> loadOperationByCompteId(int compteId) throws SQLException {
		List<Operation> listeOperations = new ArrayList<Operation>();
		String request = "SELECT montant, date, idCompte, libelle, typeOperation FROM V_Operations WHERE idCompte = " + compteId;
		ResultSet result = IDao.connect.createStatement().executeQuery(request);
		while(result.next()) {
			Operation operation = new Operation();
			operation.setMontant(result.getFloat("montant"));
			operation.setDate(result.getDate("date"));
			operation.setLibelle(result.getString("libelle"));
			listeOperations.add(operation);
		}
		return listeOperations;
	}
}