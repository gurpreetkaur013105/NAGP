package com.nagarro.service.impl;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import com.nagarro.service.AppService;
import com.nagarro.util.validators.PasswordValidator;

public class AppServiceImpl implements AppService {

	private int attemptNumber = 0;
	private static final String FILE_LOCATION = "C:\\Users\\gauravarora02\\Desktop\\password\\password.txt";

	PasswordValidator validator = new PasswordValidator();

	@Override
	public void startApplication() throws IOException {

		printStaticMessage();

		File file = new File(FILE_LOCATION);
		Scanner sc = new Scanner(System.in);

		boolean isValid = false;

		while (!isValid && attemptNumber < TOTAL_ALLOWED_ATTEMPT) {

			String password = sc.nextLine();

			isValid = validator.checkIfValidPassword(password, file);
			attemptNumber++;

			if (!isValid && attemptNumber < TOTAL_ALLOWED_ATTEMPT) {
				System.out.println("Wrong Password, " + (TOTAL_ALLOWED_ATTEMPT - attemptNumber) + " attempts left!");
			}

		}

		sc.close();

		if (isValid) {
			printAppMenuContent();

		} else {

			System.out.println("Maximun Attempt reached! Closing the application.");
		}

	}

	private void printAppMenuContent() {
		System.out.println("Congratulations! you are successfully logged in.");
		System.out.println();
		System.out.println("Please choose your choice from the below available options : ");
		System.out.println();
		System.out.println("1.Add Student Details");
		System.out.println("2.Remove Student Details");
		System.out.println("3.Add Teacher Details");
		System.out.println("4.Remove Teacher Details");
		System.out.println("5.Query Data");
		System.out.println("6.Exit");
		System.out.println();
	}

	private void printStaticMessage() {
		System.out.println("######################################################");
		System.out.println("Welcome to School Data Simple Query System Application");
		System.out.println("######################################################");

		System.out.println();
		System.out.println("Please enter password to continue!");
		System.out.println();
	}

}
