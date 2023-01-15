package com.mini_project_new;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class LoginData {
	PreparedStatement pst = null;

	Connection con = null;

	public void insertLoginData(String username, String password) {
		try {
			ConnectionTest connectionTest = new ConnectionTest();
			
			//establish the connection object
			con = connectionTest.getConnectionDetail();
			
			 //multiple data insert by using prepared statement
			pst = con.prepareStatement("INSERT INTO logindata(UserName,Password_)VALUES(?,?)");
			
			
			
			pst.setString(1, username);
			pst.setString(2, password);

			int i = pst.executeUpdate();
			System.out.println("Record is inserted succesfully...." + i);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	

	



}
