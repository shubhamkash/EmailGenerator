package com.glassignment1.emailgenerator.service;

import java.util.Random;

import com.glassignment1.emailgenerator.model.Employee;

public class CredentialServiceImpl implements CredentialService {

	@Override
	public String generateEmailAddress(Employee emp, String department) {
		return emp.getFirstName()+emp.getLastName()+"@"+department+".greatlearning.com";
	}

	@Override
	public char[] generatePassword() {
			Random random = new Random();
			String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		    String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		    String specialCharacters = "!@#$^&*()_";
		    String numbers = "1234567890";
		    String values = capitalLetters + smallLetters + specialCharacters + numbers;
			
		    char[] password = new char[8];
		     
		    for (int i=0 ; i<8 ; i++) {
		    	password[i] = values.charAt(random.nextInt(values.length()));
		    }
		    
		    for (int j=0; j< 20; j++) {
		    	for (int i=0 ; i<password.length ; i++) {
		   		password[i] = values.charAt(random.nextInt(values.length()));
		   	}
		    }
		    return password;
		    	
	}

	@Override
	public void showCredential(Employee emp, String email, char[] generatePassword) {
		System.out.println("Hi "+emp.getFirstName()+" "+emp.getLastName());
		System.out.println("Your generated credentials are:");
		System.out.println("Email: "+email);
		System.out.println("Password: "+generatePassword);
		
	}

}
