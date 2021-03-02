package com.wha.dao;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		ClientDao clientDao = new ClientDao();
		String tmp = "nothing";
		try {
			tmp = clientDao.getPasswordByLogin("maxime");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(tmp);
	}

}
