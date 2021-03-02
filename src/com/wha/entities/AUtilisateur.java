package com.wha.entities;

public abstract class AUtilisateur {

	private String login;
	private String password;
	private Integer id;
	
	abstract public void accederEspacePersonnalise();
	
	// Getters & Setters

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String part1, String part2) {
		String cap1 = part1.substring(0, 1).toUpperCase() + part1.substring(1);
		String cap2 = part2.substring(0, 1).toUpperCase() + part2.substring(1);
		this.login = cap1.concat(cap2);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}