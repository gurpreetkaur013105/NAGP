package com.nagarro;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class school_data {
	    public static void main(String[] args) throws IOException {
	    	File file = new File("C:\\Users\\gurpreetkaur01\\Desktop\\password\\password.txt"); 
	    	 
		
		    String line;
	        //final String PASSWORD = "Test@12";
	        boolean wrongPass = true;
	        for (int passAttempts = 0; passAttempts <= 4 && wrongPass; passAttempts++) {
	            System.out.print("\nEnter Your Password: ");
	            Scanner input1 = new Scanner(System.in);
	            String inputPass = input1.nextLine();
	            
	            
	            
	            boolean isValid = checkIfValidPassword(inputPass, file);
	            
	            if (!isValid) {
	                System.out.println("\nWrong Password Try Again");
	            } else 
	            {
	                System.out.println("\nWelcome!");
	                wrongPass = false;
	            }
	        }
	        
	    
	}

		private static boolean checkIfValidPassword(String inputPass, File file) throws IOException {

			FileInputStream fileStream = new FileInputStream(file); 
			InputStreamReader input = new InputStreamReader(fileStream);
			
			BufferedReader reader = new BufferedReader(input);
			String password;
			boolean ifValidPassword = false;
			
			while((password = reader.readLine()) != null) {
			
				if(inputPass.equalsIgnoreCase(password)) {
					
					ifValidPassword =  true;
				}
			}
			
			reader.close();
			
			return ifValidPassword;
			
			
		}
}

