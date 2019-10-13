package com.madtech.superschoolapi.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Database {

	private PropertiesLoader propertiesLoader;
	private Properties databaseProp;
	private Connection conn;

	public Database() {
		this.propertiesLoader = new PropertiesLoader();
		this.databaseProp = this.propertiesLoader.getPersistenceProperties();
	}
	
	public Connection connect() {
		String url = this.databaseProp.getProperty("db.url");
		String userName = this.databaseProp.getProperty("db.userName");
		String password = this.databaseProp.getProperty("db.password");

		try {
			this.conn = DriverManager.getConnection(url, userName, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return this.conn;
	}

}
