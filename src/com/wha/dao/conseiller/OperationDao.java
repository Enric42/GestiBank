package com.wha.dao.conseiller;

import java.util.ArrayList;
import java.util.List;

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
}