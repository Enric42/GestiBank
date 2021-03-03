package com.wha.entities;

public class TypeCompte{
	int id;
	String denomination;
	
	public TypeCompte(int id, String denomination) {
		this.setId(id);
		this.setDenomination(denomination);
	}
	
	private void setId(int id) {
		this.id = id;
	}
	private void setDenomination(String denomination) {
		this.denomination = denomination;
	}
	public int getId() {
		return this.id;
	}
	public String getDenomination() {
		return this.denomination;
	}
}