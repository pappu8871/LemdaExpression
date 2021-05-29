package com.registration;

import java.util.Scanner;
import java.util.regex.Pattern;
@FunctionalInterface
interface Password2 {  

	void validate_Pass();
	
}
public class RegistrationUC7 {
public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		Password2 myLamda = () -> {
		
		String Regex = "^[a-zA-Z0-9]{8,25}$";
		System.out.println("Enter your Password:");
		String password = scn.next();
		Pattern pt =Pattern.compile(Regex);
		if (Pattern.matches(Regex, password)) {
		System.out.println("valid password");
		} else {
		System.out.println("Invalid password");
		}
		};
		myLamda.validate_Pass();
		}
}
