package com.glassignment1.emailgenerator.app;
import java.util.*;

import com.glassignment1.emailgenerator.service.*;
import com.glassignment1.emailgenerator.model.*;

public class EmailApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CredentialService service = new CredentialServiceImpl();
		String generatedEmail;
		char[] generatedPassword;
		
		System.out.println("Enter first name");
		String firstname = sc.next().toLowerCase();
		System.out.println("Enter last name");
		String lastName = sc.next().toLowerCase();
		Employee emp = new Employee(firstname,lastName);
		
		String department = "";
		
		System.out.println("Please enter department");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. HR");
		System.out.println("4. Legal");
		
		int option = sc.nextInt();
		switch(option) {
		case 0:
			System.out.println("Wrong choice!");
			System.exit(0);
			break;
			
		case 1:
			department = "tech";
			generatedEmail = service.generateEmailAddress(emp, department);
			generatedPassword = service.generatePassword();
			service.showCredential(emp, generatedEmail, generatedPassword);
			break;
			
		case 2:
			department = "admin";
			generatedEmail = service.generateEmailAddress(emp, department);
			generatedPassword = service.generatePassword();
			service.showCredential(emp, generatedEmail, generatedPassword);
			break;
			
		case 3:
			department = "hr";
			generatedEmail = service.generateEmailAddress(emp, department);
			generatedPassword = service.generatePassword();
			service.showCredential(emp, generatedEmail, generatedPassword);
			break;	
			
		case 4:
			department = "legal";
			generatedEmail = service.generateEmailAddress(emp, department);
			generatedPassword = service.generatePassword();
			service.showCredential(emp, generatedEmail, generatedPassword);
			break;	
		}
	}

}
