package com.wha.dao;

import java.sql.SQLException;

import com.wha.entities.Client;

public class Main {

	public static void main(String[] args) {
		ClientDao clientDao = new ClientDao();
		Client tmp = null;
		try {
			tmp = clientDao.getClientByLogin("maxime", "bras");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(tmp.getPassword());
	}

}
