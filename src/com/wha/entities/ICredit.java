package com.wha.entities;

public interface ICredit extends IOperation {

	public Compte getCompteDestination();
	public void setCompteDestination(Compte compteDestination);
}