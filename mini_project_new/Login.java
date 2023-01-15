package com.mini_project_new;

import java.util.Scanner;

public class Login {
	
	LoginData logindata=new LoginData();
	Scanner sc;
	
	String username;
	String password;
	
	public Login(Scanner sc) {
		this.sc=sc;
		insertData();
	}
	
	

	public void insertData() {
		System.out.println("Enter Username:");
		username = sc.nextLine();
		
		System.out.println("Enter Password:");
		password=sc.nextLine();
		
		validation();
	}
	
	public void validation () {
		
		if(username.equals("admin")) {
			if(password.equals("admin")) {
				System.out.println("Successfully login welcome to admin...");
				
			}
			else {
				
				System.out.println("Password input invalid please try again...");
				
			}
			
		}	
		else {
			System.out.println("Username input invalid please try again...");
			
		}
		
		logindata.insertLoginData(username, password);
		
		System.out.println();
		System.out.println();
		
	}
	

}
