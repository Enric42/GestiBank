package com.wha.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

	private static final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String url = "jdbc:sqlserver://localhost:1433;database=gestibank;";
    private static final String user = "anyblood";
    private static final String password = "Lepiaf34170-";

    private static Connection connexion;

    public static Connection getInstance(){
        if(connexion == null){
            try{
            	Class.forName(driver);
                connexion = DriverManager.getConnection(url,user,password);
            }catch (SQLException e){
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        return connexion;
    }
}
