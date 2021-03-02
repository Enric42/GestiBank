package com.wha.entities;

public interface IDebit extends IOperation {

	public Compte getCompteSource();
	public void setCompteSource(Compte compteSource);
}