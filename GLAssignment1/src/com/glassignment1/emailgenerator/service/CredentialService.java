package com.glassignment1.emailgenerator.service;

import com.glassignment1.emailgenerator.model.Employee;

public interface CredentialService {
	public String generateEmailAddress(Employee emp, String department);
	
	public char[] generatePassword();
	
	public void showCredential(Employee emp, String email, char[] generatePassword);
}
