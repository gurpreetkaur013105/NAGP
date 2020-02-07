package com.nagarro.util.validators;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class PasswordValidator {

	public boolean checkIfValidPassword(String inputPass, File file) throws IOException {

		FileInputStream fileStream = new FileInputStream(file);
		InputStreamReader input = new InputStreamReader(fileStream);

		BufferedReader reader = new BufferedReader(input);
		String password;
		boolean ifValidPassword = false;

		while ((password = reader.readLine()) != null) {

			if (inputPass.equalsIgnoreCase(password)) {

				ifValidPassword = true;
			}
		}

		reader.close();

		return ifValidPassword;

	}
}
