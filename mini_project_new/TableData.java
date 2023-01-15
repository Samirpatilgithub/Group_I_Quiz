package com.mini_project_new;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class TableData {
	PreparedStatement pst = null;

	Connection con = null;

	public void insertQuizData(String name, int correctAns, int wrongAns, String _class) {
		try {
			ConnectionTest connectionTest = new ConnectionTest();
			
			//establish the connection object
			con = connectionTest.getConnectionDetail();
			
			 //multiple data insert by using prepared statement
			pst = con.prepareStatement("INSERT INTO quiz_Data(Name,Correct_Answer,Wrong_Answer,_Class)VALUES(?,?,?,?)");
			
			
			
			pst.setString(1, name);
			pst.setInt(2, correctAns);
			pst.setInt(3, wrongAns);
			pst.setString(4, _class);

			int i = pst.executeUpdate();
			System.out.println("Record is inserted succesfully...." + i);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	

	

}
