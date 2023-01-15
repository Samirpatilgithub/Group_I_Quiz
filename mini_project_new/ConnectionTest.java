package com.mini_project_new;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTest {
	Connection connection = null;

	public Connection getConnectionDetail() {

		try {
			// load the Driver
			Class.forName("com.mysql.jdbc.Driver");
				
			//Establish connection to access the databse
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz", "root", "Srk@725626");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}

}
