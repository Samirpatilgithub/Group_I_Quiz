package com.mini_project_new;

import java.sql.SQLException;
import java.util.Scanner;

public class QuizMain {
	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		Login l=new Login(sc);
		
		Quiz_Question quiz = new Quiz_Question();
		System.out.println("Enter How many Student Conduct Quiz? ");
		int count = sc.nextInt();

		for (int i = 1; i <= count; i++) {
			quiz.logic();
		}
	}

}
