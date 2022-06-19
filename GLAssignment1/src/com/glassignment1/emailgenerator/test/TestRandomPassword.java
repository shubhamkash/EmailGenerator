package com.glassignment1.emailgenerator.test;
import java.util.Random;

public class TestRandomPassword {
	public static void main(String args[])
	{
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
    	for (int i=0;i<password.length;i++) {
   		password[i] = values.charAt(random.nextInt(values.length()));
   	}
    	
    }
    System.out.println(password);
	}
}
